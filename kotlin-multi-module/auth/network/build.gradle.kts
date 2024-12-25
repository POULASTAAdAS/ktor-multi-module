plugins {
    alias(libs.plugins.kotlinMultiModule.ktor.library)
}

dependencies {
    implementation(projects.core.coreDomain)
    implementation(projects.auth.authDomain)

    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.auth)
}