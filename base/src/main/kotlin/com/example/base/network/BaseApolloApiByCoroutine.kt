package com.example.base.network

import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.InputObjectType
import com.apollographql.apollo3.api.Operation
import kotlinx.coroutines.flow.Flow

abstract class BaseApolloApiByCoroutine<T : Operation.Data> {

    abstract fun invoke(inputType: InputObjectType?): Flow<ApolloResponse<T>>

}