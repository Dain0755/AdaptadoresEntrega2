package com.example.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] idImagen = {
              R.drawable.carlos,
              R.drawable.facebook,
              R.drawable.gmail,
              R.drawable.picap,
              R.drawable.chevrolet,
              R.drawable.rappi,
              R.drawable.olx,
        };
        String[] nombres = {
                "Carlos", "Facebook", "Gmail", "Picap", "ChevyPlan", "Rappi", "Olx"
        };
        String[] title ={
                "Nuevo mensaje de Carlos", "Solicitud", "Nuevo inicio de sesión", "Nueva promoción", "Promo ChevyPlan", "Bonos diarios", "Tu publicacion es exitosa"
        };
        String[] mensajes = {
                "Hola, por favor enviar la información...", "Tienes una nueva notificación", "Intentaste acceder a tu cuenta...", "Por referir a un amigo reclama 5000", "Adquiere tu nuevo vehículo", "Que quieres comer hoy?", "Nuevo mensaje de usuario..."
        };

        String[] horaUltimoMensaje ={
                "7:25", "10:15", "22:36", "11:55", "10:05", "21:20", "8:45"
        };
        String[] numeroTelefon ={
                "3058546977", "3156954872", "3056968162", "3156984756", "3056985463", "3115694873", "3204568971"
        };
        String[] pais = {
                "Noruega", "USA", "USA", "Colombia", "Colombia", "Colombia", "Colombia"
        };

        listAdapter listAdapter = new listAdapter(MainActivity.this, nombres, title, mensajes,  horaUltimoMensaje, numeroTelefon,pais, idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent irAinformacion = new Intent(MainActivity.this, recibir.class)
                        .putExtra("nombre", nombres[position])
                        .putExtra("titulo", title[position])
                        .putExtra("mensaje", mensajes[position])
                        .putExtra("hora", horaUltimoMensaje[position])
                        .putExtra("telefono", numeroTelefon[position])
                        .putExtra("pais", pais[position])
                        .putExtra("imagen", idImagen[position]);

                startActivity(irAinformacion);
            }
        });
    }
}