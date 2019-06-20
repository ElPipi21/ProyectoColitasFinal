package com.example.proyectocolitas;

public class Datos {


    private Integer Imagen;
    private String Titulo;
    private Integer Id;

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




