rootProject.name = "bubble-framework"
include("bubble-api")
include("bubble-example-quarkus")
include("bubble-example-spring")

pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
