package io.github.yukkuritaku.loom

import net.neoforged.trainingwheels.gradle.functional.SimpleTestSpecification
import net.neoforged.trainingwheels.gradle.functional.util.LoggerWriter
import org.gradle.testkit.runner.GradleRunner
import org.slf4j.LoggerFactory

class LittleMaidLoomPluginTests extends SimpleTestSpecification{
    private static final String LITTLEMAID_LOOM_VERSION = "1.0.5"

    protected File readMeFile

    def setup(){
        readMeFile = new File(testProjectDir, "LittleMaidModel_Readme.txt")
    }

    def "applying littlemaid-loom plugin succeeds"() {
        given:
        buildFile << """
            buildscript {
                repositories {
                    maven {
                        name = 'Fabric'
                        url = 'https://maven.fabricmc.net/'
                    }
                    mavenLocal()
                    mavenCentral()
                    gradlePluginPortal()
                }
                dependencies {
                    classpath group: "net.fabricmc", name: "fabric-loom", version: "1.8-SNAPSHOT"
                    classpath group: "io.github.yukkuritaku.littlemaid-loom", name: "io.github.yukkuritaku.littlemaid-loom.gradle.plugin", version: "${LITTLEMAID_LOOM_VERSION}"
                }
            }

            apply plugin: "fabric-loom"
            apply plugin: "io.github.yukkuritaku.littlemaid-loom"

            littlemaidloom {
                minecraftVersion("1.20.2")
                littleMaidModelLoaderVersion("9.0.2")
                littleMaidReBirthVersion("9.1.3")
                readMeFile("LittleMaidModel_Readme.txt")
            }
            
            repositories {
                maven {
                    url = 'https://maven.shedaniel.me/'
                }
            }
            
            dependencies {
                minecraft "com.mojang:minecraft:1.20.2"
                mappings "net.fabricmc:yarn:1.20.2+build.4:v2"
                modImplementation "net.fabricmc:fabric-loader:0.15.10"
                modImplementation "net.fabricmc.fabric-api:fabric-api:0.91.6+1.20.2"
                modApi "dev.architectury:architectury-fabric:10.1.20"
                modApi("me.shedaniel.cloth:cloth-config-fabric:12.0.119") {
                    exclude(group: "net.fabricmc.fabric-api")
                }
            }
            
        """
        when:
        def result = gradleRunner().build()

        then:
        result.output.contains('BUILD SUCCESSFUL')
    }


    @Override
    protected GradleRunner gradleRunner() {
        def logger = LoggerFactory.getLogger('Test')

        def runner = GradleRunner.create()
                .withPluginClasspath()
                .withProjectDir(testProjectDir)
                .withDebug(DEBUG)
                .withGradleVersion('8.10.2')
                .forwardStdOutput(new LoggerWriter(logger, LoggerWriter.Level.INFO))
                .forwardStdError(new LoggerWriter(logger, LoggerWriter.Level.ERROR))

        return runner
    }
}
