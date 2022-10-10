package com.example.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listAdapter extends BaseAdapter {
    Context contexto;
    String [] nombres, mensajes, title, horaUltimoMensaje, numeroTelefono, pais;
    int[] idImagen;
    LayoutInflater inflater;
    public  listAdapter (Context contexto, String[] nombres, String[]mensajes, String[] title,
                            String[] horaUltimoMensaje, String[] numeroTelefono, String[]pais, int[] idImagen){
        this.contexto = contexto;
        this.nombres = nombres;
        this.title = title;
        this.mensajes = mensajes;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }
    @Override
    public int getCount() {
        return nombres.length;
    }

    @Override
    public Object getItem(int i) {return null;}

    @Override
    public long getItemId(int i) {return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item, null);
        ImageView imagenPerfil = view.findViewById(R.id.imagenDePerfil);
        TextView nombreUsuario = view.findViewById(R.id.nombre);
        TextView titulo = view.findViewById(R.id.titulo);
        TextView ultimoMensaje = view.findViewById(R.id.ultimoMensaje);
        TextView horaMensaje = view.findViewById(R.id.tv_ultimaHora);
        imagenPerfil.setImageResource(idImagen[i]);
        nombreUsuario.setText(nombres[i]);
        titulo.setText(title[i]);
        ultimoMensaje.setText(mensajes[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);
        return view;
    }
}