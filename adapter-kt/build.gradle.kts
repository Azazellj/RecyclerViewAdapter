import com.android.build.gradle.LibraryExtension

group = "com.github.Azazellj"

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.ANDROID_MAVEN)
    id(GradlePluginId.ANDROID_KOTLIN)
}

configure<LibraryExtension> {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)

        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }
}

dependencies {
    implementation(project(ModuleDependency.ADAPTER_COMMON))

    implementation(LibraryDependency.ANNOTATION)
    implementation(LibraryDependency.RECYCLER_VIEW)
    implementation(LibraryDependency.KOTLIN)
}

apply(from = "https://raw.githubusercontent.com/Commit451/gradle-android-javadocs/1.0.0/gradle-android-javadocs.gradle")