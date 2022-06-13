package com.example.listasproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listasproductos.databinding.ActivityListaBinding;
import com.example.listasproductos.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {
    //Binding -> crear cvlase por cada latout que tengan
    //          asocia las  vistas de cada layout como atributos de eso
    private ActivityListaBinding binding;
    //fuente de datos que sea una estructura que su lenguaje pueda manejar
    private ArrayList<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_lista);
        setContentView(binding.getRoot());
        popularListaProducto();
        String listaProductos = "";
        for (int i=0;i<productos.size();i++) {
            listaProductos += productos.get(i).toString() + "\n";
        }
        binding.txtListaProductos.setText(listaProductos);
    }

    private void popularListaProducto() {
        //TODO poblar el array con 7 registros
        productos = new ArrayList<Producto>(7);
        Producto prod1 = new Producto(1,"Leche","Lacteo",6.99f,"PIL","Leche deslactosada baja en calorias",1);
        Producto prod2 = new Producto(2,"CocaCola","Gaseosa",7.5f,"CocaCola","Gaseosa de 2 litros",2);
        Producto prod3 = new Producto(3,"Fanta","Gaseosa",7.5f,"CocaCola","Gaseosa de 2 litros",3);
        Producto prod4 = new Producto(4,"Sprite","Gaseosa",7.5f,"CocaCola","Gaseosa de 2 litros",4);
        Producto prod5 = new Producto(5,"Sublime","Chocolate",3,"PIL","Chocolate de 100g",5);
        Producto prod6 = new Producto(6,"Breik","Chocolate",7,"Breik","Chocolate de 50g",6);
        Producto prod7 = new Producto(7,"Frac","Galleta",2.5f,"PIL","Galleta de 20g",7);

        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        productos.add(prod4);
        productos.add(prod5);
        productos.add(prod6);
        productos.add(prod7);
    }
}