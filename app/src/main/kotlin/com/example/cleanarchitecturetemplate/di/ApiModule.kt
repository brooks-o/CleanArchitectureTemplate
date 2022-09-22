package com.example.cleanarchitecturetemplate.di

import com.apollographql.apollo3.ApolloClient
import com.example.data.api.PokemonApi
import com.example.data.api.PokemonApiByCoroutine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun providePokemonApi(apolloClient: ApolloClient): PokemonApi =
        PokemonApi(apolloClient = apolloClient)

    @Provides
    @Singleton
    fun providePokemonApiByCoroutine(apolloClient: ApolloClient): PokemonApiByCoroutine =
        PokemonApiByCoroutine(apolloClient = apolloClient)
}