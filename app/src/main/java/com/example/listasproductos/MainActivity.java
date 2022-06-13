package com.example.listasproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.listasproductos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ///Definir el objeto Binding
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inicializar su binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        usarVistas();
    }

    private void usarVistas() {
        binding.btnCalcular.setOnClickListener(view -> {
            int numero1 = Integer.parseInt(binding.etNumero1.getText().toString());
            int numero2 = Integer.parseInt(binding.etNumero2.getText().toString());
            int resultado = numero1 + numero2;
            binding.txtResultado.setText("Resultado: " + resultado);
        });
    }
}