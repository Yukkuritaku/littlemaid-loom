日本語の方のREADMEは[こちら](https://github.com/Yukkuritaku/littlemaid-loom/blob/master/README_JP.md)

# LittleMaid Loom
This project is gradle plugin extension of [Fabric Loom](https://github.com/FabricMC/fabric-loom).

Currently, implemented task is zip building and download jar.

## Tasks
Task groups are included in `littlemaid loom`.

- `buildLittleMaidModel`: build the LittleMaid model. (create zip file with included build/classes and build/resources.)
- `downloadLittleMaidJars`: Download LittleMaid jar file. (this task is auto executing in reload the gradle.)
Downloaded Jar file are placed in build directory.

## All LittleMaid Loom settings

```gradle
littlemaidloom {
    // Minecraft version (mandatory)
    minecraftVersion("(Minecraft version)")
    
    // LittleMaidModelLoader version (mandatory)
    littleMaidModelLoaderVersion("(LittleMaidModelLoader version)")
    
    // LittleMaidReBirth version (mandatory)
    littleMaidReBirthVersion("(LittleMaidReBirth version)")
   
    // Readme file (mandatory)
    readMeFile("Your Readme file")
    
    // buildLittleMaidModel zip settings (optional)
    zipConfig {
       /*
        * File, Folder into zip with ntfs
        * default value is true
        */
        useNtfs.set(true)
       /*
        * Compression Level, settings value are 0 to 9, 
        * default value is Deflater.DEFAULT_COMPRESSION (-1)
        */
        compressionLevel.set(Deflater.DEFAULT_COMPRESSION)
        /*
         * Compression settings when zipping png.
         * setting values are ZipEntry.STORED (0, No compression) or ZipEntry.DEFLATED (8, Lossless Compression)
         * default value is ZipEntry.STORED (0)
         */
        pngZipMode.set(ZipEntry.STORED)
        /*
         * Compression settings when zipping folder.
         * setting values are ZipEntry.STORED (0, No compression) or ZipEntry.DEFLATED (8, Lossless Compression)
         * default value is ZipEntry.STORED (0)
         */
        folderZipMode.set(ZipEntry.STORED)
    }
}
```