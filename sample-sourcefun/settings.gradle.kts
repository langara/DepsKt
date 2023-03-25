@file:Suppress("UnstableApiUsage")

rootProject.name = "sample-sourcefun"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
//    includeBuild("..") // deps.kt
}

plugins {
    id("pl.mareklangiewicz.deps.settings") version "0.2.25"
}

include(":sample-lib")
