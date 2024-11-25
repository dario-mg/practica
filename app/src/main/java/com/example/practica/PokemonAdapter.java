package com.example.practica;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    private final List<Pokemon> pokemonList; // Lista de Pokémon

    public PokemonAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList; // Inicializa la lista
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.nameTextView.setText(pokemon.getNombre());
        holder.imageView.setImageResource(pokemon.getImagenResId());
        holder.hpProgressBar.setProgress(pokemon.getHp());
        holder.attackProgressBar.setProgress(pokemon.getAtaque());
        holder.defenseProgressBar.setProgress(pokemon.getDefensa());
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    static class PokemonViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        ProgressBar hpProgressBar, attackProgressBar, defenseProgressBar;

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagenPokemon);
            nameTextView = itemView.findViewById(R.id.nombrePokemon);
            hpProgressBar = itemView.findViewById(R.id.progressHp);
            attackProgressBar = itemView.findViewById(R.id.progressAtaque);
            defenseProgressBar = itemView.findViewById(R.id.progressDefensa);
        }
    }
}
