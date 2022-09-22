package com.example.buildSrc

object Configuration {
    const val compileSdk = 32
    const val targetSdk = 32
    const val minSdk = 26
    const val majorVersion = 1
    const val minorVersion = 0
    const val patchVersion = 0
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val versionCode = 1000000
    const val snapshotVersionName = "$majorVersion.$minorVersion.${patchVersion + 1}-SNAPSHOT"
    const val artifactGroup = "com.example.cleanarchitecturetemplate"
}