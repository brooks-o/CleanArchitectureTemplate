package com.example.cleanarchitecturetemplate

import timber.log.Timber

class TimberDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        return "Timber ${element.fileName}:${element.lineNumber} ${element.methodName}"
    }
}