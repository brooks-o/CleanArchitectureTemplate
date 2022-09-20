package com.example.data.datasource

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import io.reactivex.rxjava3.core.Flowable
import kotlinx.coroutines.flow.Flow

interface PokemonDataSource {

    fun getPokemonList(): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>

    fun getPokemonListByCoroutine(): Flow<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>
}