plugins {
    alias(libs.plugins.kotlinMultiModule.ktor.exposed)
}

dependencies {
    implementation(projects.core.coreDomain)
    implementation(libs.kotlin.gson)
}