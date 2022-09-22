import com.example.buildSrc.Configuration
import com.example.buildSrc.Libraries

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")

}

android {
    compileSdk = Configuration.compileSdk

    defaultConfig {
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":base"))
    implementation(project(":domain"))

    implementation(Libraries.CORE_KTX)
    implementation(Libraries.APPCOMPAT)
    implementation(Libraries.MATERIAL)
    testImplementation(Libraries.JUNIT)
    androidTestImplementation(Libraries.TEST_EXT_JUNIT)
    androidTestImplementation(Libraries.TEST_ESPRESSO)

    implementation(Libraries.RXKOTLIN)

    implementation(Libraries.APOLLO_RUNTIME)
    implementation(Libraries.APOLLO_API)
    implementation(Libraries.APOLLO_RX3_SUPPORT)

    implementation(Libraries.HILT_ANDROID)
    kapt(Libraries.HILT_GOOGLE_COMPILER)
    kapt(Libraries.HILT_COMPILER)
}