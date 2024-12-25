plugins {
    alias(libs.plugins.kotlinMultiModule.jvm.library)
}

dependencies {
    implementation(projects.core.coreDomain)

    implementation(libs.bundles.koin)
    implementation(libs.kotlin.gson)
}