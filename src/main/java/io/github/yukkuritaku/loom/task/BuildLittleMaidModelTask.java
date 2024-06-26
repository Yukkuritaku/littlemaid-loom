package io.github.yukkuritaku.loom.task;

import io.github.yukkuritaku.loom.extension.LittleMaidLoomExtension;
import net.fabricmc.loom.util.gradle.SourceSetHelper;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.io.IOUtils;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.TaskAction;

import javax.inject.Inject;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiPredicate;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;

public abstract class BuildLittleMaidModelTask extends AbstractMaidTask {

    @Input
    public abstract Property<String> getOutputName();

    @OutputDirectory
    public abstract DirectoryProperty getOutputDir();

    private final LittleMaidLoomExtension extension;

    @Inject
    public BuildLittleMaidModelTask() {
        super();
        this.extension = getProject().getExtensions().getByType(LittleMaidLoomExtension.class);
        getOutputName().convention("littleMaidMob-" + getProject().getName() + "-" + getProject().getVersion() + ".zip");
        getOutputDir().convention(getProject().getLayout().getBuildDirectory().dir("littlemaidmodel-build"));
    }

    private void putNtfs(ZipArchiveEntry entry) throws InstantiationException, IllegalAccessException {
        if (this.extension.getZipConfig().getUseNtfs().get()){
            entry.addExtraField(ExtraFieldUtils.createExtraField(X000A_NTFS.HEADER_ID));
        }
        var fileTime = FileTime.from(Instant.now(Clock.systemUTC()));
        entry.setCreationTime(fileTime);
        entry.setTime(fileTime);
        entry.setLastAccessTime(fileTime);
    }

    private void setMethod(File file, ZipArchiveEntry entry) throws IOException {
        CRC32 crc32 = new CRC32();
        if (file.isDirectory()) {
            if (this.extension.getZipConfig().getFolderZipMode().get() == ZipEntry.STORED) {
                BiPredicate<Path, BasicFileAttributes> predicate = (p, a) ->
                        a.isRegularFile();
                AtomicLong size = new AtomicLong();
                try (Stream<Path> stream = Files.find(file.toPath(), Integer.MAX_VALUE, predicate)) {
                    stream.forEach(path -> {
                        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path.toFile()))) {
                            size.addAndGet(Files.size(path));
                            byte[] buf = new byte[1024];
                            int len;
                            while ((len = bis.read(buf)) > 0) {
                                crc32.update(buf, 0, len);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                entry.setMethod(ZipEntry.STORED);
                entry.setSize(size.get());
                entry.setCrc(crc32.getValue());
            }
        } else {
            //pngの場合は無圧縮にする
            if (file.getName().endsWith(".png")) {
                if (this.extension.getZipConfig().getPngZipMode().get() == ZipEntry.STORED) {
                    entry.setMethod(ZipEntry.STORED);
                    entry.setSize(Files.size(file.toPath()));
                    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = bis.read(buf)) > 0) {
                            crc32.update(buf, 0, len);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    entry.setCrc(crc32.getValue());
                }
            }
        }
    }

    /**
     * Taken and modified from <a href="https://qiita.com/ry-s/items/961e295b74edb39768d0">ry-s(R S)'s qiita blog</a>
     *
     * @param rootCount Name count
     * @param path      filePath
     * @param zos       ZipOutputStream
     * @throws IOException if an I/O error occurs when opening the directory and zipping files
     */
    private void zipDirectory(int rootCount, Path path, ZipArchiveOutputStream zos) throws IOException {
        try (Stream<Path> paths = Files.list(path)) {
            paths.forEach(p -> {
                try {
                    var pathName = p.subpath(rootCount, p.getNameCount());
                    if (Files.isDirectory(p)) {
                        ZipArchiveEntry entry = new ZipArchiveEntry(pathName + "/");
                        setMethod(p.toFile(), entry);
                        putNtfs(entry);
                        zos.putArchiveEntry(entry);
                        zos.closeArchiveEntry();
                        zipDirectory(rootCount, p, zos);
                    } else {
                        var zipEntry = new ZipArchiveEntry(pathName.toString());
                        setMethod(p.toFile(), zipEntry);
                        putNtfs(zipEntry);
                        zos.putArchiveEntry(zipEntry);
                        IOUtils.copy(new FileInputStream(p.toFile()), zos);
                        zos.closeArchiveEntry();
                    }
                } catch (IOException | InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private void zip(String outputName, SourceSetOutput sourceSetOutput) {
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(getOutputDir().file(outputName).get().getAsFile())) {
            if (!this.extension.getReadMeFile().isPresent()) {
                throw new NoSuchFileException("Must be set Readme file!/Readmeファイルを指定する必要があります！");
            }
            zos.setLevel(this.extension.getZipConfig().getCompressionLevel().get());
            try {
                ZipArchiveEntry archiveEntry = new ZipArchiveEntry(this.extension.getReadMeFile().get());
                putNtfs(archiveEntry);
                zos.putArchiveEntry(archiveEntry);
                IOUtils.copy(new FileInputStream(getProject().getLayout().getProjectDirectory().file(this.extension.getReadMeFile()).get().getAsFile()), zos);
                zos.closeArchiveEntry();
            }catch (IOException | InstantiationException | IllegalAccessException e){
                throw new RuntimeException(e);
            }
            sourceSetOutput.getFiles().forEach(file -> {
                        if (file.exists()) {
                            if (file.isDirectory()) {
                                try {
                                    zipDirectory(file.toPath().getNameCount(), file.toPath(), zos);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            } else {
                                try {
                                    ZipArchiveEntry archiveEntry = new ZipArchiveEntry(file.toPath().getFileName().toString());
                                    setMethod(file, archiveEntry);
                                    putNtfs(archiveEntry);
                                    zos.putArchiveEntry(archiveEntry);
                                    IOUtils.copy(new FileInputStream(file), zos);
                                    zos.closeArchiveEntry();
                                } catch (IOException | InstantiationException | IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @TaskAction
    public void run() {
        zip(getOutputName().get(), SourceSetHelper.getMainSourceSet(getProject()).getOutput());
    }
}
