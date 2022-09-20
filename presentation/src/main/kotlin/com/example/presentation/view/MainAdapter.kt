package com.example.presentation.view

import android.view.ViewGroup
import com.example.base.ui.BaseAdapter
import com.example.base.ui.BaseViewHolder
import com.example.presentation.model.PokemonModel

class MainAdapter : BaseAdapter<PokemonModel>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<PokemonModel, *> = MainViewHolder(parent)
}