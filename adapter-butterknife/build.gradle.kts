import com.android.build.gradle.LibraryExtension

group = "com.github.Azazellj"

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.ANDROID_MAVEN)
}

configure<LibraryExtension> {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(ModuleDependency.ADAPTER))
    implementation(project(ModuleDependency.ADAPTER_COMMON))

    implementation(LibraryDependency.RECYCLER_VIEW)
    implementation(LibraryDependency.ANNOTATION)
    implementation(LibraryDependency.BUTTERKNIFE)

    annotationProcessor(LibraryDependency.BUTTERKNIFE_COMPILER)
}

apply(from = "https://raw.githubusercontent.com/Commit451/gradle-android-javadocs/1.0.0/gradle-android-javadocs.gradle")
