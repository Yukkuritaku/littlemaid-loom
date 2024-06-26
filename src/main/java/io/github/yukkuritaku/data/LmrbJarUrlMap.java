package io.github.yukkuritaku.data;

import io.github.yukkuritaku.loom.data.JarMetadata;

import java.util.Map;

public class LmrbJarUrlMap {

    private static final Map<String, Map<String, JarMetadata>> LMRB_JAR_URL_MAP =
            Map.ofEntries(
                    e("1.16",
                            Map.of(
                                    "2.0.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADRKZzTPZAIyZ3Anlo-B8H1a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16-2.0.0.jar"),
                                    "2.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABrLp-1xlX4lijQFGVjCpboa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16-2.0.1.jar"),
                                    "2.0.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACge7dxQ2z1h_eNuS0Xkk60a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16-2.0.2.jar"),
                                    "2.0.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAABuztZGLbJVaS9jsE-V9gqa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16-2.0.3.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD1MOpabu5M5chDQWA6hI9Ta/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16-2.0.3-dev.jar")
                            )
                    ),
                    //fabric版初期バージョン
                    e("1.16.3", Map.of("1.0.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABlP6lsFJldFO06vS9AFggFa/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.3-1.0.0.jar"))),
                    e("1.16.4", Map.of(
                            "1.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABD4I4WqR10mMn4ayU2r8qSa/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.0.1.jar"),
                            "1.0.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACdDwgtjQ1K59deNObasxc0a/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.0.2.jar"),
                            "1.0.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABRUuuZ4is-GhomKBekY6o8a/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.0.3.jar"),
                            "1.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADZVxjGkV_hFyNAPBCj4aACa/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.0.4.jar"),
                            "1.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA7mjHDKLGhqIotZ5e9xaBha/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.1.0.jar"),
                            "1.1.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADGcT_acERKLCDk51Xa53MHa/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.4-1.1.2.jar")
                    )),
                    e("1.16.5",
                            Map.ofEntries(
                                    e("1.2.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC-q776MWTpDNRgzw_HI-mva/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.5-1.2.0.jar")),
                                    e("1.2.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB889U-TWq4ZfQqTxEeDUSQa/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.5-1.2.1.jar")),
                                    e("1.2.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABjxH4U0Vg8b9-4BHys4wwja/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.5-1.2.2.jar")),
                                    e("1.2.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAKCIzuuu1mHrdawwTEk0e5a/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.5-1.2.3.jar")),
                                    e("1.2.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAbmrWJ-CK6gAbnX6FFMJTha/LittleMaidReBirth/old/LMRB-Fabric-1.16.x/LMRB-Fabric-1.16.5-1.2.4.jar")),
                                    e("2.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADpM2OOwzLLj3Spcz5SjyZCa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.0.4.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACABuIzxreaNzML3peCYpgsa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.0.4-dev.jar")),
                                    e("2.0.5", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADDecUbczlrIZ63FfjeduMya/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.0.5.jar")),
                                    e("2.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADWOYLZVXjbsRpC3WLMwcH6a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.0.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADgD828TtdtJDYTs8n90W7aa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.0-dev.jar")),
                                    e("2.1.2", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADfrC37qgJQWe2m_Nmcoonqa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.2.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACkMQw7jjS5Gl8coRWcRKAoa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.2-dev-shadow.jar")),
                                    e("2.1.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACTt657oSqxVUjYoOABeYe2a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.3.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADhsAgvQ6RkQHohvscY85LHa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.3-dev-shadow.jar")),
                                    e("2.1.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADU5q__zpeLtRGmacEF15lya/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-Fa-Arc-1.16.5-2.1.4.jar")),
                                    e("2.2.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABPo3NhsOf9oLDbDcs_zKP0a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.2.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAACWmfuckz2F5S6VA1uW6pka/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.2.0-fabric-dev.jar")),
                                    e("2.3.0", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD7kYfgXaSbDkhKqnx5KiX8a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADWYbwUyup12c_uPqvuJikea/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.0-fabric-dev.jar")),
                                    e("2.3.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAANJUpq17Mpgp0L26aTI_KRa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADYyJMHyfZ9n_du-QXFG8yDa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.2-fabric-dev.jar")),
                                    e("2.3.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACu2UdSF-6RA_FshpuwPgOCa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAVDUFnVSTPQ-Prs8gpCQL5a/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.3-fabric-dev.jar")),
                                    e("2.3.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACFBgtdZQ5zn9sequbXZU_na/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.4-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADXD0hCl_U9FbqNAmIj7tAga/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.3.4-fabric-dev.jar")),
                                    e("2.5.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABhmbXpw7neW-TbyZ28dpyVa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADMRAtUyxQ6J3OzIMojodyMa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.0-fabric-dev.jar")),
                                    //2.5.1が2個あるけどどっちが正しいのかわからん...
                                    e("2.5.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAlWZN1mQ1EBastrhdNAAQoa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.1-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAgvsaYvSn3XVwHb8qtEPQEa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.1-fabric-dev.jar")),
                                    e("2.5.1-1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADEPIvBGC4FX4IIcJJYQNEba/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.1-Fabric%20(1).jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACA1hHLpSiw9oNbiJMsSsxUa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.1-fabric-dev%20(1).jar")),
                                    e("2.5.2", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAqa5X3Sv8Q3vYwnl5rF02da/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADiicUgFgpkld08zrpR56KQa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.5.2-fabric-dev.jar")),
                                    e("2.5.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA97deABFPqwiU7lg2Fnci_a/LittleMaidReBirth/Fabric/1.16.x/LMRB-1.16.5-2.5.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAArwgeIGXjDFiRfLTlTUtPza/LittleMaidReBirth/Fabric/1.16.x/LMRB-1.16.5-2.5.3-fabric-dev.jar")),
                                    e("2.6.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADMI2h9WmB-FRQmx4dD_2sQa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.6.2-Fabric.jar")),
                                    e("2.6.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAPfu8PLAq2BZHKRbJVcfBAa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.6.3-Fabric.jar")),
                                    e("2.6.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABGElkeHbL4PbBfjs-pSrVJa/LittleMaidReBirth/Fabric/1.16.x/old/LMRB-1.16.5-2.6.4-Fabric.jar")),
                                    e("2.6.5", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACJl54eh-il4-QfpdzBkHqQa/LittleMaidReBirth/Fabric/1.16.x/LMRB-1.16.5-2.6.5-Fabric.jar"))
                            )
                    ),
                    e("1.17", Map.of(
                                    "3.0.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADt5QZRPIvLhqy1wfw6HhTOa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17-3.0.0.jar"),
                                    "3.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACrTL5tlZRm8B651w598lTwa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17-3.0.1.jar")
                            )
                    ),
                    e("1.17.1",
                            Map.ofEntries(
                                    e("3.0.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABHf478bMhnTWYgjubtsC2Ba/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.2.jar")),
                                    e("3.0.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABKtC41hiib-FTCyjGa9bwFa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.3.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADNaZwPAelaR0LmvBvABx-Oa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.3-dev.jar")
                                    ),
                                    e("3.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB9QwDPotA5f-Fy-uYOmBe0a/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.4.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACj_QIsNaU-4Vq77_x4DjZEa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.4-dev.jar")),
                                    e("3.0.5", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABTiCkel_C9_CSP2ZEBegcNa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.0.5.jar")),
                                    e("3.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACR_1WLXMOqkjc_MLVDUlxGa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.0.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACR_1WLXMOqkjc_MLVDUlxGa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.0.jar")),
                                    e("3.1.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAChprMzrmL3Pmv5ZXrStl-Ta/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.1.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACYclkcOGUQbH4n87h1ycFna/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.1-dev-shadow.jar")
                                    ),
                                    e("3.1.2", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAb9SjjTedNW_Zss6hdGsNha/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.2.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACQ_K_z7QdugrQYj0SW55vpa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.2-dev-shadow.jar")
                                    ),
                                    e("3.1.3", JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC6u5N6vT5pFYz9YIOFFwdLa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-Fa-Arc-1.17.1-3.1.3.jar"
                                            )
                                    ),
                                    e("3.2.0", JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABZh_n3_Wp8E4b3DMsbQKZfa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACB4lX4difwhH7AOCZ_wbwMa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.0-fabric-dev.jar"
                                            )
                                    ),
                                    e("3.2.2", JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABiCPBe3EnRVIZ9dGHnHt2ja/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.2-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAu1w48Tsvmzbjb83fV6Y2pa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.2-fabric-dev.jar"
                                            )
                                    ),
                                    e("3.2.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAChgo9dSoGoBjmxBxZ7TK5da/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADH1Lra1JUv19UvtspcPuQra/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.3-fabric-dev.jar")
                                    ),
                                    e("3.2.4", JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC3CMIOfhFX5qSTXR7ASfuXa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.4-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABJHmDL0Oq0N-vsRoC5tTzPa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.2.4-fabric-dev.jar"
                                            )
                                    ),
                                    e("3.3.0", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADnSPdBvy5KwV1xwjKBFgiea/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAkZeA4VpmYgBZEr_NNY9IMa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.0-fabric-dev.jar")
                                    ),
                                    e("3.3.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADcfD1f34MHOpuZxkSPEM8Za/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.1-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACN63arZEt3OdLNqBamO_Uca/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.1-fabric-dev.jar")
                                    ),
                                    e("3.3.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACSaScA4rDp1pPo6Vi0ExhJa/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAL-KNRd3TFuoM6BUz92GDda/LittleMaidReBirth/Fabric/1.17.x/old/LMRB-1.17.1-3.3.2-fabric-dev.jar")
                                    ),
                                    e("3.3.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB2aKhD6rx6ymMvnEWOMs1ma/LittleMaidReBirth/Fabric/1.17.x/LMRB-1.17.1-3.3.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAM8nrqDHiPk5L5GNkMaDnoa/LittleMaidReBirth/Fabric/1.17.x/LMRB-1.17.1-3.3.3-fabric-dev.jar"))
                            )
                    ),
                    e("1.18",
                            Map.of("4.0.0", JarMetadata.create(
                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACivBzB6Vhtmct6nzuFhkFca/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18-4.0.0.jar",
                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAngSY_asUqUQKlcLogjGn-a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18-4.0.0-dev.jar"
                            ))
                    ),
                    e("1.18.1",
                            Map.of(
                                    "4.0.1", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABWEq9gwsOl3coPaLG1cEU5a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.1.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB3lvxpP-SdSif6O1l-pFgZa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.1-dev-shadow.jar"
                                    ),
                                    "4.0.2", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABfkw-cI0M2OIMgYCKvyfTEa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.2.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADiHjwh1JnH02W7yaXLojGJa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.2-dev-shadow.jar"),
                                    "4.0.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB3Z0GLHoD74uiqnfBBAk2na/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.3.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABIr8Nbl3Nh2kPaxVpRTHSja/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.3-dev-shadow.jar"),
                                    "4.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC3TJKhHKyU3ET3ly_Z3Oexa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-Fa-Arc-1.18.1-4.0.4.jar")
                            )
                    ),
                    e("1.18.2",
                            Map.ofEntries(
                                    e("4.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAktI32XvUXZuq9lj5fKD3-a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.1.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAy569WTinl_JuemgACk3IQa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.1.0-fabric-dev.jar")),
                                    e("4.2.0", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD2Y5auQtuUmXePyFtqtCyia/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACjfmJOCzD7o0g0LlphgzY-a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.0-fabric-dev.jar")),
                                    e("4.2.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADz3G6zDOIDl8VWe6klhJB6a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABJQdlb0jxcnDI7EhywtqYua/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.2-fabric-dev.jar")
                                    ),
                                    e("4.2.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB2vwCL0j1a3R-QBZw6odP4a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAW8sE5XSWIvbuVkOcqBTUja/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.3-fabric-dev.jar")),
                                    e("4.2.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABH_hayKrzGxU6pvt7byHZRa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.4-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADji8gZlq2HgZihYOYJg3KFa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.2.4-fabric-dev.jar")),
                                    e("4.3.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB3YsGDU893DWfY1WUPSQGUa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABtQIMQtRa3W0FjZfaixnFoa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.0-fabric-dev.jar")),
                                    e("4.3.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACc6yYXCTvedxRgGJNxovb7a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.1-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA1jwG_cGlIvsgSdA_Ki995a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.1-fabric-dev.jar")),
                                    e("4.3.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABd1uWgeWZLaDF_izK34EWZa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABVyJ3NYn9uQL2J83XEAN5oa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.2-fabric-dev.jar")),
                                    e("4.3.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADE8UG4EnG_GrXVdiA6kiWOa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABcYkBFjZwNVyOCtHepsAr8a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.3-fabric-dev.jar"
                                    )),
                                    e("4.3.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADJF7-BXppf3YU8EmuDiUGfa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.4-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAHAZl6iYFQU9KT7vI7ztd8a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.3.4-fabric-dev.jar")
                                    ),
                                    e("4.4.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAEHAFzxe6RzfiEV22T6TIWa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADJ8n9YltvLfVK_iuU5GBAfa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.0-fabric-dev.jar")
                                    ),
                                    e("4.4.1", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADMYrkJtY_iy_Utsp2Cy4yza/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.1-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABVR0g6S-Mls1c3mXaaWjEQa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.1-fabric-dev.jar")
                                    ),
                                    e("4.4.2", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACJ04hfKAUD7Z23rzmLIyAYa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADK1VU7yvHYmyQDlsb2JFMya/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.2-fabric-dev.jar")),
                                    e("4.4.3", JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABepU6ewS2bHLqcRnqYl942a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABbZeoIl4G7rr_MKAhj4kbKa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.3-fabric-dev.jar")),
                                    e("4.4.4",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADA00LArfq4UbXc8A3BL6K2a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.4-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACL6P9dqle0Pd4vs0BFl_bWa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.4.4-fabric-dev.jar")),
                                    e("4.5.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACMNcxUFYqntflzsmwY1f7ia/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.5.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAC9dsbSvUibJb1sStjMcSda/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.5.0-fabric-dev.jar"
                                            )
                                    ),
                                    e("4.5.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADjXt1wwtblcPefXvRrz52na/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.5.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD9_mHmZxJ36W_Y8_-Ip9tta/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.5.1-fabric-dev.jar")
                                    ),
                                    e("4.6.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABDyr14UcGrghWse76VTbPka/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAGzFzBcZzl8BcKqgQny4Aya/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.0-fabric-dev.jar")),
                                    e("4.6.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACN7vZogfzUaOOukFh-UHEfa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABEyCGsHSSQNBcnHwDmkT4va/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.1-fabric-dev.jar"
                                            )),
                                    e("4.6.2",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD56__blo3yIP1rQzL9j7psa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.2-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACcr5G5oKrO0aHrGhUVti0Oa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.2-fabric-dev.jar")),
                                    e("4.6.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADvyBBpbIsAMh8vvZAZWfhja/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADkfQla_YnRrfi_qAYGbxL2a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.3-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACxy5hEgKRKv2FqCwwK2-gza/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.6.3-sources.jar"
                                            )),
                                    e("4.7.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADXA7q1GPVnlRf676ZVMk3Ma/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB2CPoncexOXExMU5ClqN7Qa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.0-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACDbWqC4OPHcO1-a1VhA__Va/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.0-sources.jar"
                                            )
                                    ),
                                    e("4.7.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADG5HVABa19H2wmqhfmKjyxa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABcSzLZyTqV2ilip2WIr22Xa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.1-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABoFLopnChgtEUA7_53GqwMa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.1-sources.jar")),
                                    e("4.7.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADQwFZ9OrFNDZYFZdLQWrxka/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACowa7-9UOskJKsMqTLexJ8a/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.3-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC2hxpmNMRSUPqN0ApdOSLoa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.3-sources.jar")),
                                    e("4.7.4",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACJSBRLpQ_cIrHR2yhLNw3ga/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.4-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADB0HrIoezfV7nnDBpw7Vpka/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.4-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA1CdYJiR0x5QRzN9Z1fNZUa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.4-sources.jar")),
                                    e("4.7.5",
                                            //何故かdevとsourceだけoldに入ってる
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC44TDYH5qFNtm7APTMWZjta/LittleMaidReBirth/Fabric/1.18.x/LMRB-1.18.2-4.7.5-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADP4gKVjF1_KPJVacbDu2Gka/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.5-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADP-nrLeVm4PJgg65DxSE8la/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.7.5-sources.jar")
                                    ),
                                    e("4.8.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACu9vV2rq5zCeUskwyiOAQea/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.8.1-Fabric.jar")),
                                    e("4.8.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACUUtAPnA7wrNsOb0FQNsPda/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.8.2-Fabric.jar")),
                                    e("4.8.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACXgFLzFYDQn5xs9rzcM7Vwa/LittleMaidReBirth/Fabric/1.18.x/old/LMRB-1.18.2-4.8.3-Fabric.jar")),
                                    //latest
                                    e("4.8.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAhtybHrTzDuTa1IEcJ_GRza/LittleMaidReBirth/Fabric/1.18.x/LMRB-1.18.2-4.8.4-Fabric.jar"))

                            )
                    ),
                    e("1.19.2",
                            Map.ofEntries(
                                    e("5.0.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB1ZaYX4eX69pMfHLzb1hCya/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABt7z_cAbioGzfoqpvkWQ74a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.0-fabric-dev.jar")),
                                    e("5.0.2",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB3R1S19NaG1f8YcAOvuKM8a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.2-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABed5oaVW5GWiF7WzMbGgcha/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.2-fabric-dev.jar")
                                    ),
                                    e("5.0.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABUppXO7wdKyyAuJh9ItnFua/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB9jXXLGDTG4F32ZBgFirtYa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.3-fabric-dev.jar")
                                    ),
                                    e("5.0.4",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADq-3BcDqTHzZYGXTZ2tsTpa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.4-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAKvSTp0h2GV6cjiy62UXT6a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19-5.0.4-fabric-dev.jar"
                                            )
                                    ),
                                    e("5.0.5",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADEJkykU6jHPgS2j96mNkOla/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.0.5-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADEJuanct1AhpClVP84X4g_a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.0.5-fabric-dev.jar")
                                    ),
                                    e("5.1.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABcwi1MAAijRNXqL8mxjreMa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.1.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABCIBEV8GSKNwRlppduLrE_a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.1.0-fabric-dev.jar"
                                            )
                                    ),
                                    e("5.1.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABbGu-5n6V7QhnzNXAJbLUVa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.1.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACr1va6EhoKECiB4xq8Yqica/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.1.1-fabric-dev.jar"
                                            )
                                    ),
                                    e("5.2.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACw8r_pTbLw64IVwKrt02Upa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.2.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABjKJxbKiTQBC5S29ynE8g-a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.2.0-fabric-dev.jar")
                                    ),
                                    e("5.2.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAACQny9w61Gkx6u3OzOBEQva/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.2.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC-UAU57aZC-0ZYCXXKAF7Ha/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.2.3-fabric-dev.jar")
                                    ),
                                    e("5.3.0",
                                            JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACeN-XjEnu3eo_kp20W2AqJa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABM1TQr6aRlU87ODgjiynqra/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.0-fabric-dev.jar")
                                    ),
                                    e("5.3.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB_wqLzM2NISj5lPDLWh_-Ha/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACCd21mcRRmOcJpQtIHW3d9a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.1-fabric-dev.jar")
                                    ),
                                    e("5.3.2",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAc_XRfWeBavtC8PoR69jMya/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.2-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADaUDy9I5L6fI8Iow9er-OBa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.2-fabric-dev.jar"
                                            )),
                                    e("5.3.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC0KEyomiaWxSoGUsmPO76la/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAZ23hLvEnqQiwcEED8fW92a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.3-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACitGkV4x9EhSDbfEzHvnWda/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.3.3-sources.jar")
                                    ),
                                    e("5.4.0",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB530-Ubj-qQghj21Gffziya/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.0-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAY55-yGg7Ha2-ibnuzdy33a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.0-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADeGe2PsOHEi1Ygu3N2CNIta/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.0-sources.jar")
                                    ),
                                    e("5.4.1",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA8T7T7gLOo5XbifVvhxldaa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.1-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAP5hG4BDVGMkIEwm0c1hspa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.1-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACt_o7poo66F31MAnTZDY9va/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.1-sources.jar")
                                    ),
                                    e("5.4.3",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAdVOP5CAPAI8qmjoC4Lx57a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.3-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADQCrpZzUwN7K5CC9MwMlLIa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.3-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABDkF1KVgwjoZ6lL2qWyw-Qa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.3-sources.jar"
                                            )),
                                    e("5.4.4",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAT7tdngQHs9AHkLJZJJuALa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.4-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC8HEBp7FkRnMIKTlOFC09Ha/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.4-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACzcSkrSFfR046MSDWdOsv5a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.4-sources.jar")
                                    ),
                                    e("5.4.5",
                                            JarMetadata.create(
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAArYeKkAvzxn4nU9ayWOGs0a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.5-Fabric.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADFxWAzgaUPDb7cBU_o3KG3a/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.5-fabric-dev.jar",
                                                    "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADEeW0TjrYJjJcaf8RgX5uAa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.4.5-sources.jar")
                                            ),
                                    e("5.5.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADUjC4dXqkjg58WW8iIoF7ia/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.5.0-Fabric.jar")),
                                    e("5.6.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADpC2R3Dq3sWsQCBglQGEyPa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.6.0-Fabric.jar")),
                                    e("5.6.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABf90qiGH7mv5SpGagmvJvpa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.6.1-Fabric.jar")),
                                    e("5.6.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABlpqo4Y3eJgY0soYm323kWa/LittleMaidReBirth/Fabric/1.19.2/old/LMRB-1.19.2-5.6.2-Fabric.jar")),
                                    //latest
                                    e("5.6.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAiHZz63SkbOO6TwAJFNKBJa/LittleMaidReBirth/Fabric/1.19.2/LMRB-1.19.2-5.6.3-Fabric.jar"))
                            )
                    ),
                    e("1.19.3",
                            Map.of("6.0.0",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABgkBp8A2jfBjiLkd-ga8fga/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADDapOMb5TwYwsDPCfTh_vqa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.0-fabric-dev.jar"),
                                    "6.0.1",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAWCeWzC7JrEfZabcnNsuKYa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.1-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAD8eNZDI8SIiqcapRUxinAa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.1-fabric-dev.jar"),
                                    "6.0.2",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACZjAgulUQ9HlcCelC7pcmKa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.2-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAJgB6BwxN6vf0l8CwBL4x1a/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.2-fabric-dev.jar"),
                                    "6.0.3",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACeYysF7Dz-ulBbzed5slxOa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.3-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAD0jxPZerauajN50W6WUumIa/LittleMaidReBirth/Fabric/1.19.3/old/LMRB-1.19.3-6.0.3-fabric-dev.jar"),
                                    "6.0.4",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AADF8ORh9ZWADPyNY0mFZpHha/LittleMaidReBirth/Fabric/1.19.3/LMRB-1.19.3-6.0.4-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AACLsGf3Vgk9yBJc8JtR9loYa/LittleMaidReBirth/Fabric/1.19.3/LMRB-1.19.3-6.0.4-fabric-dev.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABTKzqaPQFLkfntR05BUtgDa/LittleMaidReBirth/Fabric/1.19.3/LMRB-1.19.3-6.0.4-sources.jar"))
                    ),
                    e("1.19.4",
                            Map.of("7.0.0",
                                    JarMetadata.create(
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABeSrMcSLT4zFZoPINvF1Y9a/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.0.0-Fabric.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAC-Qjlot7dXpxU-TUJK7YHa/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.0.0-fabric-dev.jar",
                                            "https://www.dropbox.com/sh/tzkdz46y67tuohx/AABA042Ri1hnAd-MIHpavmwVa/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.0.0-sources.jar"
                                    ),
                                    "7.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADrZTwbv9CXMRtJoTHj-EG3a/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.1.0-Fabric.jar"),
                                    "7.2.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAADr81-nejeDHjcZJiQIXcLa/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.2.0-Fabric.jar"),
                                    "7.2.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAqXJYcBoxg6KmhFbdsUiBPa/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.2.1-Fabric.jar"),
                                    "7.2.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAzJADY1Z8R4iGvyF0kfkc1a/LittleMaidReBirth/Fabric/1.19.4/old/LMRB-1.19.4-7.2.2-Fabric.jar"),
                                    //latest
                                    "7.2.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AADoggUNNs-PLwlxJPF_dTZxa/LittleMaidReBirth/Fabric/1.19.4/LMRB-1.19.4-7.2.3-Fabric.jar")
                            )
                    ),
                    e("1.20", Map.ofEntries(
                                    e("8.0.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABaiDs0fP8zHmuYTQmwYgX3a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.0-Fabric.jar")),
                                    e("8.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABBiAiRY_99UDkmDx3f1rq7a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.1-Fabric.jar")),
                                    e("8.0.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACsplhy-BYaFkmZxpH7W6nGa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.2-Fabric.jar")),
                                    e("8.0.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAWcxUXZyAZWwYXxtIXwGe0a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.3-Fabric.jar")),
                                    e("8.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABW-6Ew_yJuOx2Te6GLVkt7a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.4-Fabric.jar")),
                                    e("8.0.5", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAA95Ypjn5CBue-6qnaf-3Qa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.5-Fabric.jar")),
                                    e("8.0.6", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACGwVad1wMb7wN8xsdIw-j_a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.6-Fabric.jar")),
                                    e("8.0.7", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAEJCAOm-eo7TkSh-Omfs84a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.7-Fabric.jar")),
                                    e("8.0.8", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAW_Ug8Db8DtOqXYy6a0rD9a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.8-Fabric.jar")),
                                    e("8.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACRpzpND2D3afG-1h0QKs18a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.1.0-Fabric.jar")),
                                    e("8.2.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABA4ccS8qddt3zEvNjDitSWa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.0-Fabric.jar")),
                                    e("8.2.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC1wMrQODvws4934aOqVyS0a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.1-Fabric.jar")),
                                    e("8.2.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB2_q-eNOjg2LW85-grlOlva/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.2-Fabric.jar")),
                            //latest
                                    e("8.2.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAbCFSyXIvosjCaod84-gWna/LittleMaidReBirth/Fabric/1.20-1.20.1/LMRB-1.20.1-8.2.3-Fabric.jar"))
                            )),
                    e("1.20.1", Map.ofEntries(
                            e("8.0.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABaiDs0fP8zHmuYTQmwYgX3a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.0-Fabric.jar")),
                            e("8.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABBiAiRY_99UDkmDx3f1rq7a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.1-Fabric.jar")),
                            e("8.0.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACsplhy-BYaFkmZxpH7W6nGa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.2-Fabric.jar")),
                            e("8.0.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAWcxUXZyAZWwYXxtIXwGe0a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.3-Fabric.jar")),
                            e("8.0.4", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABW-6Ew_yJuOx2Te6GLVkt7a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.4-Fabric.jar")),
                            e("8.0.5", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAA95Ypjn5CBue-6qnaf-3Qa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.5-Fabric.jar")),
                            e("8.0.6", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACGwVad1wMb7wN8xsdIw-j_a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.6-Fabric.jar")),
                            e("8.0.7", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAEJCAOm-eo7TkSh-Omfs84a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.7-Fabric.jar")),
                            e("8.0.8", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAW_Ug8Db8DtOqXYy6a0rD9a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.0.8-Fabric.jar")),
                            e("8.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACRpzpND2D3afG-1h0QKs18a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.1.0-Fabric.jar")),
                            e("8.2.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AABA4ccS8qddt3zEvNjDitSWa/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.0-Fabric.jar")),
                            e("8.2.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAC1wMrQODvws4934aOqVyS0a/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.1-Fabric.jar")),
                            e("8.2.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAB2_q-eNOjg2LW85-grlOlva/LittleMaidReBirth/Fabric/1.20-1.20.1/old/LMRB-1.20.1-8.2.2-Fabric.jar")),
                            //latest
                            e("8.2.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAbCFSyXIvosjCaod84-gWna/LittleMaidReBirth/Fabric/1.20-1.20.1/LMRB-1.20.1-8.2.3-Fabric.jar"))
                    )),
                    e("1.20.2", Map.ofEntries(
                            e("9.0.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AACmsWRfWScICTrK8mMSDW9Va/LittleMaidReBirth/Fabric/1.20.2/old/LMRB-1.20.2-9.0.1-Fabric.jar")),
                            e("9.1.0", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA9upSrsNzn0XwVrYT7fTi4a/LittleMaidReBirth/Fabric/1.20.2/old/LMRB-1.20.2-9.1.0-Fabric.jar")),
                            e("9.1.1", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAAinlj8zCQ4AWflLETb7pLra/LittleMaidReBirth/Fabric/1.20.2/old/LMRB-1.20.2-9.1.1-Fabric.jar")),
                            e("9.1.2", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA-1Z6Rfdu_5ybHSs6lRa1Ma/LittleMaidReBirth/Fabric/1.20.2/old/LMRB-1.20.2-9.1.2-Fabric.jar")),
                            //latest
                            e("9.1.3", JarMetadata.create("https://www.dropbox.com/sh/tzkdz46y67tuohx/AAA62B03CD3388thzngd9EM_a/LittleMaidReBirth/Fabric/1.20.2/LMRB-1.20.2-9.1.3-Fabric.jar"))
                    ))
            );

    private static <K, V> Map.Entry<K, V> e(K key, V value) {
        return Map.entry(key, value);
    }

    public static Map<String, Map<String, JarMetadata>> getLmrbJarUrlMap() {
        return LMRB_JAR_URL_MAP;
    }
}
