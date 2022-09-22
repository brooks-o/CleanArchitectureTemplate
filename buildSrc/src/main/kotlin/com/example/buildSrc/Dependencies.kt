package com.example.buildSrc

object Versions {
    const val CORE_KTX_VERSION = "1.7.0"
    const val APPCOMPAT_VERSION = "1.5.1"
    const val MATERIAL_VERSRION = "1.6.1"
    const val JUNIT_VERSION = "4.13.2"
    const val TEST_EXT_JUNIT_VERSRION = "1.1.3"
    const val TEST_ESPRESSO_CORE_VERSION = "3.4.0"

    const val ACTIVITY_KTX_VERSION = "1.5.1"
    const val FRAGMENT_KTX_VERSION = "1.5.2"

    const val MOCKITO_VERSION = "4.0.0"

    const val RXKOTLIN_VERSION = "3.0.1"

    const val APOLLO_VERSION = "3.6.0"

    const val GOOGLE_HILT_VERSION = "2.43.2"
    const val ANDROID_HILT_VERSION = "1.0.0-alpha03"

    const val OKHTTP_VERSION = "5.0.0-alpha.2"
}

object Libraries {
    const val CORE_KTX = "androidx.core:core-ktx:1.7.0"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.5.0"
    const val MATERIAL = "com.google.android.material:material:1.6.1"
    const val JUNIT = "junit:junit:4.13.2"
    const val TEST_EXT_JUNIT = "androidx.test.ext:junit:1.1.3"
    const val TEST_ESPRESSO = "androidx.test.espresso:espresso-core:3.4.0"

    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX_VERSION}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX_VERSION}"

    const val MOCKITO = "org.mockito.kotlin:mockito-kotlin:${Versions.MOCKITO_VERSION}"

    const val RXKOTLIN = "io.reactivex.rxjava3:rxkotlin:${Versions.RXKOTLIN_VERSION}"

    const val APOLLO_RUNTIME = "com.apollographql.apollo3:apollo-runtime:${Versions.APOLLO_VERSION}"
    const val APOLLO_RX3_SUPPORT = "com.apollographql.apollo3:apollo-rx3-support:${Versions.APOLLO_VERSION}"
    const val APOLLO_API = "com.apollographql.apollo3:apollo-api:${Versions.APOLLO_VERSION}"

    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.GOOGLE_HILT_VERSION}"
    const val HILT_GOOGLE_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.GOOGLE_HILT_VERSION}"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:${Versions.ANDROID_HILT_VERSION}"
    const val HILT_LIFECYCLE_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.ANDROID_HILT_VERSION}"

    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP_VERSION}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP_VERSION}"

}