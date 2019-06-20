package com.example.proyectocolitas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    private List<Datos> lista;

    public Adaptador(Context contexto, List<Datos> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

           LayoutInflater inflate = LayoutInflater.from(contexto);
           convertView= inflate.inflate(R.layout.griditem, null);

           ImageView imagen = (ImageView) convertView.findViewById(R.id.img_picture);
           TextView titulo = (TextView) convertView.findViewById(R.id.txt_titulo);

           titulo.setText(lista.get(position).getTitulo().toString());
           imagen.setImageResource(lista.get(position).getImagen());

           return convertView;

    }
}
