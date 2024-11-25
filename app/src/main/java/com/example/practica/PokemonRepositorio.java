package com.example.practica;

import java.util.ArrayList;
import java.util.List;

public class PokemonRepositorio {
    public static List<Pokemon> obtenerPokemon() {
        List<Pokemon> lista = new ArrayList<>();
        lista.add(new Pokemon("Pikachu", R.drawable.pikachu, 250, 220, 180, 200, 240));
        lista.add(new Pokemon("Charizard", R.drawable.charizard, 600, 250, 220, 270, 230));
        lista.add(new Pokemon("Bulbasaur", R.drawable.bulbasaur, 550, 240, 200, 250, 230));
        lista.add(new Pokemon("Squirtle", R.drawable.squirtle, 520, 220, 210, 230, 210));
        lista.add(new Pokemon("Eevee", R.drawable.eevee, 600, 180, 160, 200, 190));
        lista.add(new Pokemon("Snorlax", R.drawable.snorlax, 800, 260, 220, 240, 210));
        lista.add(new Pokemon("Dragonite", R.drawable.dragonite, 800, 290, 270, 280, 270));
        return lista;
    }
}
