package com.example.cleanarchitecturetemplate.di

import com.example.domain.repository.PokemonRepository
import com.example.domain.usecase.GetPokemonListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
class UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideGetPokemonListUseCase(
        pokemonRepository: PokemonRepository
    ): GetPokemonListUseCase = GetPokemonListUseCase(pokemonRepository::getPokemonList)
}