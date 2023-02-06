package com.example.turistiando;

public class Restaurante {

    private int fotografia;
    private String nombre;
    private String precioProductos;

    public Restaurante(int fotografia, String nombre, String precioProductos) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.precioProductos = precioProductos;
    }

    public int getFotografia() {
        return fotografia;
    }

    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioProductos() {
        return precioProductos;
    }

    public void setPrecioProductos(String precioProductos) {
        this.precioProductos = precioProductos;
    }
}
