package com.amauryrdz.recyclerviewexpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<Persona> personaList = new ArrayList<>();

        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 1", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 2", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 3", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 4", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 5", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 6", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 7", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 8", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 9", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 10", "Este es un ejemplo de recyclerview "));
        personaList.add(new Persona(R.drawable.ic_launcher_background, "Vaca 11", "Este es un ejemplo de recyclerview "));

        AdaptadorPersona adapter = new AdaptadorPersona(personaList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}