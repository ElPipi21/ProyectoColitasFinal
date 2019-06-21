package com.example.proyectocolitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grilla=  findViewById(R.id.grilla);

        ArrayList<Datos> datos= new ArrayList<Datos>();
        datos.add(new Datos(R.drawable.mascota1, "Firulais", 1));
        datos.add(new Datos(R.drawable.mascota2, "Nolberto", 2));
        datos.add(new Datos(R.drawable.mascota3, "Sinjuano", 3));
        datos.add(new Datos(R.drawable.mascota4, "Perales", 4));
        datos.add(new Datos(R.drawable.mascota5, "Chistris", 5));
        datos.add(new Datos(R.drawable.mascota6, "Tukhekiere", 6));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), datos);
        grilla.setAdapter(miadaptador);
        grilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj  = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("Objeto",  obj);
                startActivity(paso);
            }
        });
    }
}
