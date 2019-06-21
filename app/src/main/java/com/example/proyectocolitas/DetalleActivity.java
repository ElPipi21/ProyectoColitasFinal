package com.example.proyectocolitas;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView imagen;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imagen =  findViewById(R.id.img_picture);
        titulo =  findViewById(R.id.txt_titulo);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("Objeto");
        imagen.setImageResource(obj.getImagen());
        titulo.setText(obj.getTitulo());

    }
}
