package com.amauryrdz.recyclerviewexpo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.MiHolder> {

    private List<Persona> personaList;

    public AdaptadorPersona(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @NonNull
    @Override
    public AdaptadorPersona.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaPersonas = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MiHolder(vistaPersonas);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPersona.MiHolder holder, int position) {

        holder.setData(personaList.get(position));

    }

    @Override
    public int getItemCount() {

        return personaList.size();

    }

    public class MiHolder extends RecyclerView.ViewHolder {

        private ImageView perfil;
        private TextView titulo;
        private TextView texto;

        public MiHolder(@NonNull View itemView) {
            super(itemView);

            perfil = itemView.findViewById(R.id.perfil);
            titulo = itemView.findViewById(R.id.titulo);
            texto = itemView.findViewById(R.id.texto);

        }

        private void setData(Persona p){

            perfil.setImageResource(p.getPerfil());
            titulo.setText(p.getTitulo());
            texto.setText(p.getTexto());

        }
    }
}
