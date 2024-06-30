package io.github.yukkuritaku.loom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.github.yukkuritaku.loom.extension.LittleMaidLoomExtension;
import io.github.yukkuritaku.loom.task.BuildLittleMaidModelTask;
import io.github.yukkuritaku.loom.task.DownloadLittleMaidJarTask;
import io.github.yukkuritaku.loom.util.MaidConstants;
import io.github.yukkuritaku.loom.util.Utils;
import net.fabricmc.loom.LoomGradleExtension;
import net.fabricmc.loom.api.RemapConfigurationSettings;
import net.fabricmc.loom.bootstrap.BootstrappedPlugin;
import net.fabricmc.loom.configuration.LoomDependencyManager;
import net.fabricmc.loom.util.Checksum;
import net.fabricmc.loom.util.ExceptionUtil;
import net.fabricmc.loom.util.ProcessUtil;
import net.fabricmc.loom.util.download.DownloadException;
import net.fabricmc.loom.util.gradle.GradleUtils;
import net.fabricmc.loom.util.gradle.SourceSetHelper;
import net.fabricmc.loom.util.service.ScopedSharedServiceManager;
import net.fabricmc.loom.util.service.SharedServiceManager;
import org.apache.commons.io.IOUtils;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.plugins.BasePlugin;
import org.gradle.api.plugins.PluginAware;
import org.gradle.api.tasks.TaskContainer;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class LittleMaidLoomPlugin implements BootstrappedPlugin {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();


    public static final String MAID_GRADLE_VERSION = Objects.requireNonNullElse(LittleMaidLoomPlugin.class.getPackage().getImplementationVersion(), "0.0.0+unknown");

    @Override
    public void apply(PluginAware pluginAware) {
        if (pluginAware instanceof Project project) {
            project.getLogger().lifecycle("LittleMaid Loom: {}", MAID_GRADLE_VERSION);
            final LittleMaidLoomExtension littleMaidLoomExtension = project.getExtensions().create("littlemaidloom", LittleMaidLoomExtension.class, project);
            final TaskContainer tasks = project.getTasks();
            //Tasks
            var buildLittleMaidModel = tasks.register("buildLittleMaidModel", BuildLittleMaidModelTask.class, task -> {
                task.dependsOn(tasks.named("jar"));
                task.setDescription("Build LittleMaid Model.");
            });
            project.getTasks().named(BasePlugin.ASSEMBLE_TASK_NAME).configure(task -> task.dependsOn(buildLittleMaidModel));
            var downloadLittleMaidJars = tasks.register("downloadLittleMaidJars", DownloadLittleMaidJarTask.class,
                    task -> task.setDescription("Download LittleMaid Jar from dropbox. (This task is automatically runs in gradle configuration)"));
            downloadLittleMaidJars.configure(downloadLittleMaidJarTask -> {
                downloadLittleMaidJarTask.getMinecraftVersion().set(littleMaidLoomExtension.getMinecraftVersion());
                downloadLittleMaidJarTask.getLittleMaidModelLoaderVersion().set(littleMaidLoomExtension.getLittleMaidModelLoaderVersion());
                downloadLittleMaidJarTask.getLittleMaidReBirthVersion().set(littleMaidLoomExtension.getLittleMaidReBirthVersion());
                downloadLittleMaidJarTask.getDownloadThreads().set(Math.min(Runtime.getRuntime().availableProcessors(), 6));
            });

            String projectDir = project.getLayout().getProjectDirectory().getAsFile().getAbsolutePath().replace("\\", "/") + "/";
            String lmmlOutputDir = littleMaidLoomExtension.getLMMLOutputDirectory().get().getAsFile().getAbsolutePath().replace("\\", "/");
            String lmrbOutputDir = littleMaidLoomExtension.getLMRBOutputDirectory().get().getAsFile().getAbsolutePath().replace("\\", "/");
            //githubからバージョンのデータをダウンロード
            try {
                project.getLogger().lifecycle("read littlemaid-modelloader-url.json from github");
                String lmmlJson = littleMaidLoomExtension
                        .download("https://raw.githubusercontent.com/Yukkuritaku/littlemaid-loom/master/src/main/resources/littlemaid-modelloader-url.json")
                        .downloadString();
                MaidConstants.LittleMaidJarFileUrls.setLmmlJarUrlMapping(GSON.fromJson(lmmlJson, new TypeToken<>() {
                }));

            } catch (DownloadException e) {
                project.getLogger().warn("failed to download littlemaid-modelloader-url.json from github, loading from resources");
                try (var is = LittleMaidLoomPlugin.class.getResourceAsStream("/littlemaid-modelloader-url.json")) {
                    if (is == null) {
                        throw new NullPointerException("Cannot found littlemaid-modelloader-url.json");
                    }
                    String result = IOUtils.toString(is, StandardCharsets.UTF_8);
                    MaidConstants.LittleMaidJarFileUrls.setLmmlJarUrlMapping(GSON.fromJson(result, new TypeToken<>() {
                    }));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            try {
                project.getLogger().lifecycle("read littlemaid-rebirth-url.json from github");
                String lmrbJson = littleMaidLoomExtension
                        .download("https://raw.githubusercontent.com/Yukkuritaku/littlemaid-loom/master/src/main/resources/littlemaid-rebirth-url.json")
                        .downloadString();
                MaidConstants.LittleMaidJarFileUrls.setLmrbJarUrlMapping(GSON.fromJson(lmrbJson, new TypeToken<>() {
                }));
            } catch (DownloadException e) {
                project.getLogger().warn("failed to download littlemaid-rebirth-url.json from github, loading from resources");
                try (var is = LittleMaidLoomPlugin.class.getResourceAsStream("/littlemaid-rebirth-url.json")) {
                    if (is == null) {
                        throw new NullPointerException("Cannot found littlemaid-rebirth-url.json");
                    }
                    String result = IOUtils.toString(is, StandardCharsets.UTF_8);
                    MaidConstants.LittleMaidJarFileUrls.setLmrbJarUrlMapping(GSON.fromJson(result, new TypeToken<>() {
                    }));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

            //ファイルがない場合に新しく作る
            if (!littleMaidLoomExtension.getLMMLOutputDirectory().get().getAsFile().exists()) {
                if(littleMaidLoomExtension.getLMMLOutputDirectory().get().getAsFile().mkdir()){
                    project.getLogger().lifecycle("LMML jar Output Directory created in {}", littleMaidLoomExtension.getLMMLOutputDirectory().get().getAsFile().toString());
                }
            }
            if (!littleMaidLoomExtension.getLMRBOutputDirectory().get().getAsFile().exists()) {
                if(littleMaidLoomExtension.getLMRBOutputDirectory().get().getAsFile().mkdir()){
                    project.getLogger().lifecycle("LMRB jar Output Directory created in {}", littleMaidLoomExtension.getLMRBOutputDirectory().get().getAsFile().toString());
                }
            }

            afterEvaluationWithService(project, sharedServiceManager -> {
                final LoomGradleExtension extension = LoomGradleExtension.get(project);
                project.getLogger().lifecycle(":setting up littlemaid dependencies");
                //メイドさんのJarファイルをダウンロード
                try {
                    downloadLittleMaidJars.get().downloadJars();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //Register configurations
                project.getConfigurations().register(MaidConstants.Configurations.LITTLE_MAID_MODEL_LOADER, c -> {
                    c.setCanBeConsumed(false);
                    c.setCanBeResolved(true);
                });
                project.getConfigurations().register(MaidConstants.Configurations.LITTLE_MAID_REBIRTH, c -> {
                    c.setCanBeConsumed(false);
                    c.setCanBeResolved(true);
                });
                extendsFrom(project, SourceSetHelper.getMainSourceSet(project).getImplementationConfigurationName(), MaidConstants.Configurations.LITTLE_MAID_MODEL_LOADER);
                extendsFrom(project, SourceSetHelper.getMainSourceSet(project).getImplementationConfigurationName(), MaidConstants.Configurations.LITTLE_MAID_REBIRTH);
                //modApiと同じ
                extension.addRemapConfiguration(MaidConstants.Configurations.MOD_LITTLE_MAID_MODEL_LOADER, remapConfigurationSettings -> {
                    remapConfigurationSettings.getSourceSet().convention(SourceSetHelper.getMainSourceSet(project));
                    remapConfigurationSettings.getTargetConfigurationName().convention(MaidConstants.Configurations.LITTLE_MAID_MODEL_LOADER);
                    remapConfigurationSettings.getOnCompileClasspath().convention(true);
                    remapConfigurationSettings.getOnRuntimeClasspath().convention(true);
                    remapConfigurationSettings.getPublishingMode().convention(RemapConfigurationSettings.PublishingMode.COMPILE_AND_RUNTIME);
                });
                //modImplementationと同じ
                extension.addRemapConfiguration(MaidConstants.Configurations.MOD_LITTLE_MAID_REBIRTH, remapConfigurationSettings -> {
                    remapConfigurationSettings.getSourceSet().convention(SourceSetHelper.getMainSourceSet(project));
                    remapConfigurationSettings.getTargetConfigurationName().convention(MaidConstants.Configurations.LITTLE_MAID_REBIRTH);
                    remapConfigurationSettings.getOnCompileClasspath().convention(true);
                    remapConfigurationSettings.getOnRuntimeClasspath().convention(true);
                    remapConfigurationSettings.getPublishingMode().convention(RemapConfigurationSettings.PublishingMode.RUNTIME_ONLY);
                });
                final boolean previousRefreshDeps = extension.refreshDeps();
                final LockResult lockResult = acquireProcessLockWaiting(project, getLockFile(project));
                if (lockResult != LockResult.ACQUIRED_CLEAN) {
                    project.getLogger().lifecycle("Found existing cache lock file ({}), rebuilding loom cache. This may have been caused by a failed or canceled build.", lockResult);
                    extension.setRefreshDeps(true);
                }
                project.getRepositories().add(project.getRepositories().flatDir(flatDirectoryArtifactRepository -> {
                            flatDirectoryArtifactRepository.dir(lmmlOutputDir.replace(projectDir, ""));
                            flatDirectoryArtifactRepository.dir(lmrbOutputDir.replace(projectDir, ""));
                        }
                ));
                //devファイルはどうやってfabricに入れればいいのかわからん
                //今の所はremapされたjarをプロジェクトに入れるようにする
                try {
                    String lmmlFileName = Utils.lastStr("/", Objects.requireNonNull(MaidConstants.LittleMaidJarFileUrls
                                    .getLMMLDownloadUrl(littleMaidLoomExtension.getMinecraftVersion().get(),
                                            littleMaidLoomExtension.getLittleMaidModelLoaderVersion().get())))
                            .replace("?dl=1", "");
                    String lmrbFileName = Utils.lastStr("/", Objects.requireNonNull(MaidConstants.LittleMaidJarFileUrls
                                    .getLMRBDownloadUrl(littleMaidLoomExtension.getMinecraftVersion().get(),
                                            littleMaidLoomExtension.getLittleMaidReBirthVersion().get())))
                            .replace("?dl=1", "");
                    if (project.file(lmmlOutputDir + "/" + lmmlFileName).exists()) {
                        project.getDependencies().add(MaidConstants.Configurations.MOD_LITTLE_MAID_MODEL_LOADER, MaidConstants.Dependencies.getLittleMaidModelLoader(project));
                    }
                    if (project.file(lmrbOutputDir + "/" + lmrbFileName).exists()) {
                        project.getDependencies().add(MaidConstants.Configurations.MOD_LITTLE_MAID_REBIRTH, MaidConstants.Dependencies.getLittleMaidReBirth(project));
                    }
                } catch (Exception e) {
                    ExceptionUtil.processException(e, project);
                    disownLock(project);
                    throw ExceptionUtil.createDescriptiveWrapper(RuntimeException::new, "Failed to setup LittleMaid Dependencies", e);
                }
                LoomDependencyManager dependencyManager = new LoomDependencyManager();
                extension.setDependencyManager(dependencyManager);
                dependencyManager.handleDependencies(project, sharedServiceManager);
                releaseLock(project);
                extension.setRefreshDeps(previousRefreshDeps);
                // LittleMaidModelDevelopment用に環境変数を追加
                extension.getRuns().forEach(
                        runConfigSettings -> {
                            runConfigSettings.property("lmmd.dev.classes",
                                    SourceSetHelper.getMainSourceSet(project).getOutput().getClassesDirs().getAsPath());
                            runConfigSettings.property("lmmd.dev.resources",
                                    SourceSetHelper.getMainSourceSet(project).getOutput().getResourcesDir().getAbsolutePath());

                        }
                );
            });
        }
    }

    public void extendsFrom(Project project, String a, String b) {
        project.getConfigurations().getByName(a, configuration -> configuration.extendsFrom(project.getConfigurations().getByName(b)));
    }

    //
    // these below codes are copied from net.fabricmc.loom.configuration.CompileConfiguration
    //

    private LockFile getLockFile(Project project) {
        final LoomGradleExtension extension = LoomGradleExtension.get(project);
        final Path cacheDirectory = extension.getFiles().getUserCache().toPath();
        final String pathHash = Checksum.projectHash(project);
        return new LockFile(
                cacheDirectory.resolve("." + pathHash + "_littlemaid-loom" + ".lock"),
                "Lock for cache='%s', project='%s'".formatted(
                        cacheDirectory, project.absoluteProjectPath(project.getPath())
                )
        );
    }

    record LockFile(Path file, String description) {
        @Override
        public String toString() {
            return this.description;
        }
    }

    enum LockResult {
        // acquired immediately or after waiting for another process to release
        ACQUIRED_CLEAN,
        // already owned by current pid
        ACQUIRED_ALREADY_OWNED,
        // acquired due to current owner not existing
        ACQUIRED_PREVIOUS_OWNER_MISSING,
        // acquired due to previous owner disowning the lock
        ACQUIRED_PREVIOUS_OWNER_DISOWNED
    }

    private LockResult acquireProcessLockWaiting(Project project, LockFile lockFile) {
        // one hour
        return this.acquireProcessLockWaiting(project, lockFile, getDefaultTimeout());
    }

    private LockResult acquireProcessLockWaiting(Project project, LockFile lockFile, Duration timeout) {
        try {
            return this.acquireProcessLockWaiting_(project, lockFile, timeout);
        } catch (final IOException e) {
            throw new RuntimeException("Exception acquiring lock " + lockFile, e);
        }
    }

    // Returns true if our process already owns the lock
    @SuppressWarnings("BusyWait")
    private LockResult acquireProcessLockWaiting_(Project project, LockFile lockFile, Duration timeout) throws IOException {
        final long timeoutMs = timeout.toMillis();
        final Logger logger = Logging.getLogger("loom_acquireProcessLockWaiting");
        final long currentPid = ProcessHandle.current().pid();
        boolean abrupt = false;
        boolean disowned = false;

        if (Files.exists(lockFile.file)) {
            long lockingProcessId = -1;

            try {
                String lockValue = Files.readString(lockFile.file);

                if ("disowned".equals(lockValue)) {
                    disowned = true;
                } else {
                    lockingProcessId = Long.parseLong(lockValue);
                    logger.lifecycle("\"{}\" is currently held by pid '{}'.", lockFile, lockingProcessId);
                }
            } catch (final Exception ignored) {
                // ignored
            }

            if (lockingProcessId == currentPid) {
                return LockResult.ACQUIRED_ALREADY_OWNED;
            }

            Optional<ProcessHandle> handle = ProcessHandle.of(lockingProcessId);

            if (disowned) {
                logger.lifecycle("Previous process has disowned the lock due to abrupt termination.");
                Files.deleteIfExists(lockFile.file);
            } else if (handle.isEmpty()) {
                logger.lifecycle("Locking process does not exist, assuming abrupt termination and deleting lock file.");
                Files.deleteIfExists(lockFile.file);
                abrupt = true;
            } else {
                ProcessUtil processUtil = ProcessUtil.create(project);
                logger.lifecycle(processUtil.printWithParents(handle.get()));
                logger.lifecycle("Waiting for lock to be released...");
                long sleptMs = 0;

                while (Files.exists(lockFile.file)) {
                    try {
                        Thread.sleep(100);
                    } catch (final InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    sleptMs += 100;

                    if (sleptMs >= 1000 * 60 && sleptMs % (1000 * 60) == 0L) {
                        logger.lifecycle(
                                """
                                        Have been waiting on "{}" held by pid '{}' for {} minute(s).
                                        If this persists for an unreasonable length of time, kill this process, run './gradlew --stop' and then try again.""",
                                lockFile, lockingProcessId, sleptMs / 1000 / 60
                        );
                    }

                    if (sleptMs >= timeoutMs) {
                        throw new GradleException("Have been waiting on lock file '%s' for %s ms. Giving up as timeout is %s ms."
                                .formatted(lockFile, sleptMs, timeoutMs));
                    }
                }
            }
        }

        if (!Files.exists(lockFile.file.getParent())) {
            Files.createDirectories(lockFile.file.getParent());
        }

        Files.writeString(lockFile.file, String.valueOf(currentPid));

        if (disowned) {
            return LockResult.ACQUIRED_PREVIOUS_OWNER_DISOWNED;
        } else if (abrupt) {
            return LockResult.ACQUIRED_PREVIOUS_OWNER_MISSING;
        }

        return LockResult.ACQUIRED_CLEAN;
    }

    private static Duration getDefaultTimeout() {
        if (System.getenv("CI") != null) {
            // Set a small timeout on CI, as it's unlikely going to unlock.
            return Duration.ofMinutes(1);
        }

        return Duration.ofHours(1);
    }

    // When we fail to configure, write "disowned" to the lock file to release it from this process
    // This allows the next run to rebuild without waiting for this process to exit
    private void disownLock(Project project) {
        final Path lock = getLockFile(project).file;

        try {
            Files.writeString(lock, "disowned");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void releaseLock(Project project) {
        final Path lock = getLockFile(project).file;


        if (!Files.exists(lock)) {
            return;
        }

        try {
            Files.delete(lock);
        } catch (IOException e1) {
            try {
                // If we failed to delete the lock file, moving it before trying to delete it may help.
                final Path del = lock.resolveSibling(lock.getFileName() + ".del");
                Files.move(lock, del);
                Files.delete(del);
            } catch (IOException e2) {
                var exception = new UncheckedIOException("Failed to release getProject() configuration lock", e2);
                exception.addSuppressed(e1);
                throw exception;
            }
        }
    }

    private void finalizedBy(Project project, String a, String b) {
        project.getTasks().named(a).configure(task -> task.finalizedBy(project.getTasks().named(b)));
    }

    private void afterEvaluationWithService(Project project, Consumer<SharedServiceManager> consumer) {
        GradleUtils.afterSuccessfulEvaluation(project, () -> {
            try (var serviceManager = new ScopedSharedServiceManager()) {
                consumer.accept(serviceManager);
            }
        });
    }
}
