group = "fr.ateastudio.farmersdelight"
version = "1.2.0"

plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.paperweight)
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.xenondevs.xyz/releases")
    maven("https://jitpack.io")
}

dependencies {
    paperweight.paperDevBundle(libs.versions.paper)
    implementation(libs.nova)
    implementation("com.github.Xiao-MoMi:craft-engine:main-SNAPSHOT")
}

