plugins {
    val kotlinVersion = "1.4.21"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.2.2" // mirai-console version
}

mirai {
    coreVersion = "2.2.2" // mirai-core version
}

group = "com.poicraft.bot.v4"
version = "0.1.0"

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}