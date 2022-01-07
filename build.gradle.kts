plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.camilo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    implementation("junit:junit:4.13.2")
}
tasks.withType<Test> {
    useJUnitPlatform()
}