package com.example.practica;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class PokemonViewModel extends ViewModel {
    private final MutableLiveData<List<Pokemon>> pokemonLiveData = new MutableLiveData<>();

    public PokemonViewModel() {
        pokemonLiveData.setValue(PokemonRepositorio.obtenerPokemon());
    }

    public LiveData<List<Pokemon>> getPokemon() {
        return pokemonLiveData;
    }
}
