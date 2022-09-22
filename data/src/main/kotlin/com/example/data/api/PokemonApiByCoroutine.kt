package com.example.data.api

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.InputObjectType
import com.example.base.network.BaseApolloApiByCoroutine
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PokemonApiByCoroutine @Inject constructor(
    private val apolloClient: ApolloClient
) : BaseApolloApiByCoroutine<Pokemon_v2_pokemonQuery.Data>() {

    override fun invoke(inputType: InputObjectType?): Flow<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        apolloClient.query(query = Pokemon_v2_pokemonQuery()).toFlow()
}