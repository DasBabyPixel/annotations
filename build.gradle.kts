plugins {
    id("java-library")
    id("maven-publish")
}

group = "de.dasbabypixel"
version = "0.1"

java {
    withSourcesJar()
    withJavadocJar()
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "de.dasbabypixel.annotations")
    }
}

publishing {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])
        }
    }
    repositories {
        maven("https://nexus.darkcube.eu/repository/dasbabypixel") {
            name = "DarkCube"
            credentials(PasswordCredentials::class.java)
        }
    }
}

dependencies {
    api("org.jetbrains:annotations:26.0.2")
}
