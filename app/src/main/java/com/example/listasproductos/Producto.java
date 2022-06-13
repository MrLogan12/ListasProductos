package com.example.listasproductos;

import android.media.Image;

public class Producto {
    private int id;
    private String denominator; //Leche
    private String categoria; //Lacteo
    private float precio; //6.99
    private String marca; //PIL
    private String detalle; //Leche deslactosada baja en calorias
    private int Imagen;

    public Producto(int id, String denominator, String categoria, float precio, String marca, String detalle, int imagen) {
        this.id = id;
        this.denominator = denominator;
        this.categoria = categoria;
        this.precio = precio;
        this.marca = marca;
        this.detalle = detalle;
        Imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", denominator='" + denominator + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", detalle='" + detalle + '\'' +
                ", Imagen=" + Imagen +
                '}';
    }
}
