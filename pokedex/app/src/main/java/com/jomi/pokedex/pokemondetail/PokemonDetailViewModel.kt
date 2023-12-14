package com.jomi.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.jomi.pokedex.repository.PokemonRepository
import com.jomi.pokedex.util.Resource
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> =
        repository.getPokemonInfo(pokemonName)
}
