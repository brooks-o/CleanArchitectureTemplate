package com.example.domain.usecase

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import kotlinx.coroutines.flow.Flow

fun interface GetPokemonListByCoroutineUseCase : () -> Flow<ApolloResponse<Pokemon_v2_pokemonQuery.Data>>