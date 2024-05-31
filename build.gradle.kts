plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
//    testImplementation("org.mockito:mockito-core:4.6.1")
//    testImplementation("org.mockito:mockito-junit-jupiter:4.6.1")
    testImplementation("org.assertj:assertj-core:3.23.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}