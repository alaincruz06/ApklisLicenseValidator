// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

tasks.register("publishToMavenLocal") {
    dependsOn(":apklis_license_validator:publishToMavenLocal")
}
