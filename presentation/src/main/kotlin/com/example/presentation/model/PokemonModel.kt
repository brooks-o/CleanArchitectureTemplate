package com.example.presentation.model

import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery

data class PokemonModel(
    val id: String,
    val name: String
)

fun Pokemon_v2_pokemonQuery.Pokemon_v2_pokemon.mapIt(): PokemonModel =
    PokemonModel(
        id = id.toString(),
        name = name
    )