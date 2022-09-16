package com.example.presentation.viewmodel

import com.example.base.viewmodel.BaseViewModel
import com.example.domain.usecase.GetPokemonListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.kotlin.subscribeBy
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonListUseCase: GetPokemonListUseCase
) : BaseViewModel() {

    fun getPokemonList() {
        getPokemonListUseCase.invoke().subscribeBy(
            onNext = {},
            onError = {},
            onComplete = {}
        )
    }
}