package com.example.adaptadores;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class recibir extends AppCompatActivity {

    String nombre, titulo, mensaje, hora, telefono, pais;
    TextView textoNombre, textoTitulo, textoMensaje, textoHora, textoTelefono, textoPais;
    int imagen;
    CircleImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibir);
        textoNombre = findViewById(R.id.textoNombre);
        textoTitulo = findViewById(R.id.textoTitulo);
        textoMensaje = findViewById(R.id.textoMensaje);
        textoTelefono = findViewById(R.id.telefono);
        textoPais = findViewById(R.id.pais);
        textoHora = findViewById(R.id.tv_ultimaHora);
        image = findViewById(R.id.imagen);


        Intent datos = getIntent();
        if (datos != null) {
            nombre = datos.getStringExtra("nombre");
            titulo = datos.getStringExtra("titulo");
            mensaje = datos.getStringExtra("mensaje");
            hora = datos.getStringExtra("hora");
            telefono = datos.getStringExtra("telefono");
            pais = datos.getStringExtra("pais");
            imagen = datos.getIntExtra("imagen", R.drawable.carlos);

            textoPais.setText(pais);
            textoNombre.setText(nombre);
            textoTelefono.setText(telefono);
            textoTitulo.setText(titulo);
            textoMensaje.setText(mensaje);
            image.setImageResource(imagen);
        }
    }
}