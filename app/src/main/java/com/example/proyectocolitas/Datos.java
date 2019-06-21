package com.example.proyectocolitas;

import java.io.Serializable;

public class Datos implements Serializable {


    public Integer Imagen;
    public String Titulo;
    public Integer Id;

    public Integer getImagen() {
        return Imagen;
    }

    public void setImagen(Integer imagen) {
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Datos(Integer imagen, String titulo, Integer id) {
        Imagen = imagen;
        Titulo = titulo;
        Id = id;
    }
}




