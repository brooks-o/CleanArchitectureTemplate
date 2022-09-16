package com.example.domain.repository

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import io.reactivex.rxjava3.core.Flowable

interface PokemonRepository {
    fun getPokemonList(): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>
}