package com.example.base.network

sealed class BaseNetworkState<out T> {

    class Complete : BaseNetworkState<Nothing>()

    class Loading : BaseNetworkState<Nothing>()

    class Success<out T>(val item: T) : BaseNetworkState<T>()

    class ApiError(val errorMessage: String) : BaseNetworkState<Nothing>()

    class NetworkError(
        val throwable: Throwable,
        val retryFunction: Unit? = null
    ) : BaseNetworkState<Nothing>()
}