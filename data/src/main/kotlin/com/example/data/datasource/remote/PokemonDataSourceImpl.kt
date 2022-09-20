package com.example.data.datasource.remote

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import com.example.data.api.PokemonApi
import com.example.data.datasource.PokemonDataSource
import io.reactivex.rxjava3.core.Flowable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonDataSourceImpl @Inject constructor(
    private val api: PokemonApi
) : PokemonDataSource {

    override fun getPokemonList(): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        api.invoke(
            inputType = null
        )

    override fun getPokemonListByCoroutine(): Flow<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        api.invoke(
            inputType = null
        ).asFlow()
}