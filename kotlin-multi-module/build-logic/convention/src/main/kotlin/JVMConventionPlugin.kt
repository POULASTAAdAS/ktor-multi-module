import com.poulastaa.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories

class JVMConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            repositories {
                mavenCentral()
            }

            group = "com.poulastaa.kotlin-multi-module"
            version = "1.0"

            dependencies {
                "implementation"(libs.findBundle("kotlin").get())
            }
        }
    }
}