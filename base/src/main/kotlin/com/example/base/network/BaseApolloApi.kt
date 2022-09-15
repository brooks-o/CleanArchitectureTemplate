package com.example.base.network

import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.InputObjectType
import com.apollographql.apollo3.api.Operation
import io.reactivex.rxjava3.core.Single

abstract class BaseApolloApi<T : Operation.Data> {

    abstract fun invoke(inputType: InputObjectType): Single<ApolloResponse<T>>

}