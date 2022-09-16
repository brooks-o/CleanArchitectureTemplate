package com.example.base.extensions

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

fun <T : Any> Flowable<T>.notifyApiStatus(
    loading: (() -> Unit)?,
    complete: (() -> Unit)?
): Flowable<T> =
    this.doOnSubscribe { loading?.invoke() }
        .doOnTerminate { complete?.invoke() }

fun Completable.notifyApiStatus(
    loading: (() -> Unit)?,
    complete: (() -> Unit)?
): Completable =
    this.doOnSubscribe { loading?.invoke() }
        .doOnTerminate { complete?.invoke() }
