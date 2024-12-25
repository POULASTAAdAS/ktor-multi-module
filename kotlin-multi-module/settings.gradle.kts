pluginManagement {
    includeBuild("build-logic")

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kotlin-multi-module"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("core:domain")
findProject(":core:domain")?.name = "core-domain"
include("core:data")
findProject(":core:data")?.name = "core-data"
include("core:database")
findProject(":core:database")?.name = "core-database"
include("auth:domain")
findProject(":auth:domain")?.name = "auth-domain"
include("auth:data")
findProject(":auth:data")?.name = "auth-data"
include("auth:network")
findProject(":auth:network")?.name = "auth-network"
include("app")
