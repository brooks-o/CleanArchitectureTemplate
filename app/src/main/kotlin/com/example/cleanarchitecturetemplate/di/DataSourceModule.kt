package com.example.cleanarchitecturetemplate.di

import com.example.data.api.PokemonApi
import com.example.data.api.PokemonApiByCoroutine
import com.example.data.datasource.PokemonDataSource
import com.example.data.datasource.remote.PokemonDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
class DataSourceModule {

    @Provides
    @ViewModelScoped
    fun providePokemonDataSource(
        pokemonApi: PokemonApi,
        pokemonApiByCoroutine: PokemonApiByCoroutine
    ): PokemonDataSource = PokemonDataSourceImpl(api = pokemonApi, apiByCoroutine = pokemonApiByCoroutine)
}