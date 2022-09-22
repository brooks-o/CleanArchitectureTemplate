package com.example.presentation.view

import androidx.activity.viewModels
import com.example.base.ui.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainBinding
import com.example.presentation.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {

    private val pokemonViewModel by viewModels<PokemonViewModel>()
    private val adapter by lazy { MainAdapter() }

    override fun setupBinding() {
        // ex) run binding.run { this.viewModel = pokemonViewModel }
        binding.run {
            this.viewModel = pokemonViewModel
            this.rlPokemonList.adapter = adapter
        }
    }

    override fun setupData() {
        // ex) viewModel.getInitData()
    }

    override fun setupClickListener() {
        // ex) binding.imgButton.setOnClickListener { /** **/ }
    }

    override fun setupUI() {
        // ex) binding.textView.text = "text"
    }

    override fun setupObserver() {
        // ex) viewModel.liveData.observer { /** **/ }
    }
}