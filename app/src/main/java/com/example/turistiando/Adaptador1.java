package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador1 extends RecyclerView.Adapter<Adaptador1.viewHolder> {

    //atributos de la clase adaptador
    public ArrayList<Restaurante> listaRestaurantes;

    //constructor


    public Adaptador1(ArrayList<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public Adaptador1.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item1,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador1.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos1(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView precioProductos;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.fotoRestaurante);
            nombreRestaurante=itemView.findViewById(R.id.nombreRestaurante);
            precioProductos=itemView.findViewById(R.id.precioProductos);
        }

        public void actualizarDatos1(Restaurante restaurante) {
            fotoRestaurante.setImageResource(restaurante.getFotografia());
            nombreRestaurante.setText(restaurante.getNombre());
            precioProductos.setText(restaurante.getPrecioProductos());
        }
    }
}
