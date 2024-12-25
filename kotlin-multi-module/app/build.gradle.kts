plugins {
    alias(libs.plugins.kotlinMultiModule.ktor.application)
}

dependencies {
    implementation(projects.core.coreDomain)
    implementation(projects.auth.authDomain)

    implementation(projects.auth.authNetwork)

    implementation(projects.core.coreData)
    implementation(projects.auth.authData)

    implementation(projects.core.coreDatabase)

    implementation(libs.bundles.koin)
}