plugins {
    idea
    groovy
    signing
    id("java-gradle-plugin")
    id("com.gradle.plugin-publish") version "1.2.1"
}

group = "io.github.yukkuritaku"
val archiveName = "littlemaid-loom"
version = "1.0.2"

val functionalTest = sourceSets.create("functionalTest")

val functionalTestTask = tasks.register<Test>("functionalTest"){
    description = "Runs the functional tests."
    group = "verification"
    testClassesDirs = functionalTest.output.classesDirs
    classpath = functionalTest.runtimeClasspath
    mustRunAfter(tasks.named("test"))
}

tasks.named("check"){
    dependsOn(functionalTestTask)
}

val generateJsonTask = tasks.register<JavaExec>("generateJson"){
    group = "littlemaid json data"
    mainClass = "io.github.yukkuritaku.data.Main"
    classpath(sourceSets.main.get().runtimeClasspath)
}

tasks.named("assemble"){
    dependsOn(generateJsonTask)
}

tasks.withType(JavaCompile::class).configureEach {
    options.release.set(17)
    options.encoding = "UTF-8"
}

tasks.withType(Jar::class).configureEach {
    manifest.attributes(mapOf(
        "Implementation-Version" to version
    ))
}
tasks.withType(Test::class).configureEach {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.neoforged.net/releases/")
}

val loom: Configuration by configurations.creating{
    configurations.compileOnly.get().extendsFrom(this)
}

dependencies {
    implementation(gradleApi())
    loom("net.fabricmc:fabric-loom:1.6-SNAPSHOT")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-compress
    implementation("org.apache.commons:commons-compress:1.26.1")
    implementation("com.google.code.gson:gson:2.10.1")
    "functionalTestImplementation"(platform("org.junit:junit-bom:5.9.1"))
    "functionalTestImplementation"("org.junit.jupiter:junit-jupiter")
    "functionalTestImplementation"(gradleTestKit())
    "functionalTestImplementation"("org.spockframework:spock-core:2.3-groovy-3.0") {
        exclude(module = "groovy-all")
    }
    "functionalTestImplementation"("net.neoforged.trainingwheels:trainingwheels-base:1.0.39")
    "functionalTestImplementation"("net.neoforged.trainingwheels:trainingwheels-gradle-base:1.0.39")
    "functionalTestImplementation"("net.neoforged.trainingwheels:trainingwheels-gradle-functional:1.0.39")
}

gradlePlugin {
    website = "https://github.com/Yukkuritaku/littlemaid-loom"
    vcsUrl = "https://github.com/Yukkuritaku/littlemaid-loom.git"
    plugins {
        register(archiveName){
            id = "io.github.yukkuritaku.${archiveName}"
            displayName = "LittleMaid-Loom"
            description = "Fabric Loom Extension Build Tool for Minecraft Mod, LittleMaidReBirth."
            implementationClass = "io.github.yukkuritaku.loom.bootstrap.LittleMaidLoomPluginBootstrap"
            tags.set(listOf("littlemaid", "littlemaidmob", "modding", "minecraft"))
        }
    }
    testSourceSets(functionalTest)
}

java {
    withSourcesJar()
    withJavadocJar()
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

publishing{
    publications{
        register<MavenPublication>("mavenPublish"){
            from(components["java"])
            groupId = "$group"
            artifactId = archiveName
            version = "${project.version}"
        }
    }
    /*repositories {
        maven("file://${layout.buildDirectory.get().asFile.path}/repo")
    }*/
}

signing{
    useInMemoryPgpKeys(
        providers.gradleProperty("signingKey").orNull,
        providers.gradleProperty("signingPassword").orNull
    )
}

idea{
    module{
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}
