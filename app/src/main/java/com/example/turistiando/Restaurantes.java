package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    //Atributos
    ArrayList<Restaurante> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        crearListaRestaurantes();
        Adaptador1 adaptador1 = new Adaptador1(lista);
        listaLogica.setAdapter(adaptador1);
    }

    public void crearListaRestaurantes(){
        lista.add(new Restaurante(R.drawable.restaurante1,"Restaurante 1","$58000"));
        lista.add(new Restaurante(R.drawable.restaurante2,"Restaurante 2","$58000"));
        lista.add(new Restaurante(R.drawable.restaurante3,"Restaurante 3","$58000"));
        lista.add(new Restaurante(R.drawable.restaurante4,"Restaurante 4","$58000"));
    }
}