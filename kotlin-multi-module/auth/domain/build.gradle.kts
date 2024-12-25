plugins {
    alias(libs.plugins.kotlinMultiModule.jvm.library)
}

dependencies {
    implementation(projects.core.coreDomain)
}