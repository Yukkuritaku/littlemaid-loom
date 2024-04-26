English version of Readme is [here](https://github.com/Yukkuritaku/littlemaid-loom/blob/master/README.md).

# Little Maid Loom

このプロジェクトは[Fabric Loom](https://github.com/FabricMC/fabric-loom)の拡張プラグインです。

現在導入しているタスクはメイドさんのjarダウンロードと、zipビルドです。

## タスク紹介
タスクグループは`littlemaid loom`にあります。

- `buildLittleMaidModel`: メイドさんのモデルをビルドします。(build/classesの中にあるファイルとbuild/resourcesの中にあるファイルをzip化します。)
- `downloadLittleMaidJars`: リトルメイドModのJarファイルをダウンロードします。
ダウンロードしたJarファイルはbuildディレクトリのlmml-dirとlmrb-dirにあります。
(このタスクはプロジェクトをリロードした時に自動で実行されます。)

## 導入方法
作成中...

## LittleMaid Loomの全体設定

```gradle
littlemaidloom {
    // マイクラバージョン (必須)
    minecraftVersion("(使用したいマイクラバージョン)")
    
    // LittleMaidModelLoaderのバージョン (必須)
    littleMaidModelLoaderVersion("(使用したいLittleMaidModelLoaderのバージョン)")
    
    // LittleMaidReBirthのバージョン (必須)
    littleMaidReBirthVersion("(使用したいLittleMaidReBirthのバージョン)")
    
    // りーどみーファイルの指定(拡張子まで一致させる必要があるよ) (必須)
    // ファイルが見つからないとbuildLittleMaidModelを実行したときにエラーになります。
    readMeFile("LittleMaidModel_Readme.txt")
    
    // buildLittleMaidModelのzip設定 (任意)
    zipConfig {
       /*
        * ファイル、フォルダーをntfsでzip化するか
        * デフォルト値はtrue
        */
        useNtfs.set(true)
       /*
        * 圧縮レベル 0から9までのレベルを指定可能で、デフォルト値はDeflater.DEFAULT_COMPRESSION (-1)
        * 整数でもおっけー
        */
        compressionLevel.set(Deflater.DEFAULT_COMPRESSION)
        /*
         * pngをzip化する時の圧縮設定
         * 設定できる値は ZipEntry.STORED (0、無圧縮) か ZipEntry.DEFLATED (8、可逆圧縮)
         * 整数でもおっけー
         * デフォルト値はZipEntry.STORED (0)
         */
        pngZipMode.set(ZipEntry.STORED)
        /*
         * フォルダーをzip化する時の圧縮設定
         * 設定できる値は ZipEntry.STORED (0、無圧縮) か ZipEntry.DEFLATED (8、可逆圧縮)
         * 整数でもおっけー
         * デフォルト値はZipEntry.STORED (0)
         */
        folderZipMode.set(ZipEntry.STORED)
    }
}
```