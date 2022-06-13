package com.example.listasproductos;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import  android.widget.BaseAdapter;

import com.example.listasproductos.databinding.ProductoItemBinding;

import java.util.ArrayList;

public class ListaAdapter extends BaseAdapter {
        //se necesita 3 datos importantes para ello
    //sin estos datos no se puede
    //ingredientes
    // 1la fuente de informacion que quieres llevar
    private ArrayList<Producto>productos;

    //2 se necesita los datos que quieres poner a estos datos
    private int layout;

    //3 el contexto de la pantalla donde se va a mostrar cada uno de esos
    //las tarjetas o rectangulo
    private Context contex;

    //indica la cantidad de elementos que tiene que dibujar
    //apartir de la fuente de datos
    @Override
    public int getCount() {
        return productos.size();
    }
    //para configuracion en la clase padre
    //lo podras usar si quieres un elemento en particular de un array

    @Override
    public Object getItem(int position) {
        return productos.get(position);
    }
    //para fines de funcionamiento de la libreria
    //transforma un entero a long
    // refiere a la possicion un elemento
    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parentView) {
        //para configurar view holder
        //una clase interna (una clase dentro de otra clase)
        return null;
    }

    public static class ViewHolder{
        //mapeo memorizar atributos y valores de esos atributos
        private ProductoItemBinding binding;
        private View view;

        public ViewHolder(ProductoItemBinding binding){
            this.binding=binding;
            this.view=binding.getRoot();
        }
    }
}

