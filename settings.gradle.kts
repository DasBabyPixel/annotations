import org.gradle.api.initialization.resolve.RepositoriesMode

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
}

rootProject.name = "annotations"
