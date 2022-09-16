package com.example.data.datasource

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import io.reactivex.rxjava3.core.Flowable

interface PokemonDataSource {
    fun getPokemonList(): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>
}