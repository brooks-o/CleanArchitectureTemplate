package com.example.cleanarchitecturetemplate.di

import com.example.data.datasource.PokemonDataSource
import com.example.data.repository.PokemonRepositoryImpl
import com.example.domain.repository.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
class RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providePokemonRepository(
        dataSource: PokemonDataSource
    ): PokemonRepository = PokemonRepositoryImpl(remoteDataSource = dataSource)
}