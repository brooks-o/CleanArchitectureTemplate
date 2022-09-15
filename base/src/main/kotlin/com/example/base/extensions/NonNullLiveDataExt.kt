package com.example.base.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

open class NonNullLiveData<T : Any>(defaultValue: T) : LiveData<T>(defaultValue) {
    override fun getValue(): T {
        return super.getValue() as T
    }

    inline fun observe(owner: LifecycleOwner, crossinline observer: (t: T) -> Unit) {
        this.observe(owner, Observer { it?.let(observer) })
    }
}

class NonNullMutableLiveData<T : Any>(defaultValue: T) : NonNullLiveData<T>(defaultValue) {
    public override fun setValue(value: T) {
        super.setValue(value)
    }

    public override fun postValue(value: T) {
        super.postValue(value)
    }
}
