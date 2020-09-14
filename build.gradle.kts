import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"

    id("application")
    id("org.openjfx.javafxplugin") version "0.0.9"
}

group = "ru.chori"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()

javafx {
    version = "11.0.2"
    modules = listOf("javafx.controls", "javafx.graphics", "javafx.web")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("script-runtime"))

    implementation("no.tornado:tornadofx:1.7.20")
}
