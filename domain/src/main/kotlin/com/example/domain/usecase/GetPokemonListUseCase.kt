package com.example.domain.usecase

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import io.reactivex.rxjava3.core.Flowable

fun interface GetPokemonListUseCase : () -> Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>