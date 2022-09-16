package com.example.data.api

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.InputObjectType
import com.apollographql.apollo3.rx3.rxFlowable
import com.example.base.network.BaseApolloApi
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import io.reactivex.rxjava3.core.Flowable
import javax.inject.Inject

class PokemonApi @Inject constructor(
    private val apolloClient: ApolloClient
) : BaseApolloApi<Pokemon_v2_pokemonQuery.Data>() {

    override fun invoke(inputType: InputObjectType?): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        apolloClient.query(query = Pokemon_v2_pokemonQuery()).rxFlowable()
}