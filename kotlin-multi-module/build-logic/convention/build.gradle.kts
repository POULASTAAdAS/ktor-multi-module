plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("jvmLibrary") {
            id = "kotlinMultiModule.jvm.library"
            implementationClass = "JVMConventionPlugin"
        }

        register("ktorExposed") {
            id = "kotlinMultiModule.ktor.exposed"
            implementationClass = "ExposedConventionPlugin"
        }

        register("ktorApplication") {
            id = "kotlinMultiModule.ktor.application"
            implementationClass = "KtorConventionPlugin"
        }

        register("ktorKoin") {
            id = "kotlinMultiModule.ktor.koin"
            implementationClass = "KoinConventionPlugin"
        }

        register("ktorLibrary") {
            id = "kotlinMultiModule.ktor.library"
            implementationClass = "KtorLibraryConventionPlugin"
        }
    }
}