package com.example.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.base.viewmodel.BaseViewModel
import com.example.cleanarchitecturetemplate.Pokemon_v2_pokemonQuery
import com.example.domain.usecase.GetPokemonListUseCase
import com.example.presentation.model.PokemonModel
import com.example.presentation.model.mapIt
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.kotlin.subscribeBy
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonListUseCase: GetPokemonListUseCase
) : BaseViewModel() {

    private val _livePokemonList = MutableLiveData<List<PokemonModel>>()
    val livePokemonList: LiveData<List<PokemonModel>> get() = _livePokemonList

    fun getPokemonList() {
        getPokemonListUseCase.invoke().subscribeBy(
            onNext = {
                it.data?.let {
                    _livePokemonList.postValue(it.pokemon_v2_pokemon.map(Pokemon_v2_pokemonQuery.Pokemon_v2_pokemon::mapIt))
                }
            },
            onError = {},
            onComplete = {}
        )
    }
}