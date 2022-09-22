package com.example.presentation.view

import android.util.Log
import android.view.ViewGroup
import com.example.base.ui.BaseViewHolder
import com.example.presentation.R
import com.example.presentation.databinding.ItemPokemonBinding
import com.example.presentation.model.PokemonModel

class MainViewHolder(
    parent: ViewGroup
) : BaseViewHolder<PokemonModel, ItemPokemonBinding>(
    R.layout.item_pokemon, parent = parent
) {
    override fun bind(data: PokemonModel, position: Int) {
        binding.data = data
    }
}