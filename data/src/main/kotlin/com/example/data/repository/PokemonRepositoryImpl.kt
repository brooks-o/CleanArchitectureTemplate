package com.example.data.repository

import com.apollographql.apollo3.api.ApolloResponse
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import com.example.data.datasource.PokemonDataSource
import com.example.domain.repository.PokemonRepository
import io.reactivex.rxjava3.core.Flowable
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow

@Singleton
class PokemonRepositoryImpl @Inject constructor(
    private val remoteDataSource: PokemonDataSource
) : PokemonRepository {

    override fun getPokemonList(): Flowable<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        remoteDataSource.getPokemonList()

    override fun getPokemonListByCoroutine(): Flow<ApolloResponse<Pokemon_v2_pokemonQuery.Data>> =
        remoteDataSource.getPokemonListByCoroutine()
}