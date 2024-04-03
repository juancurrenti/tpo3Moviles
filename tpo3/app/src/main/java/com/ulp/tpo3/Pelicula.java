package com.ulp.tpo3;

public class Pelicula {
    private String titulo;
    private int imagenId;
    private String descripcion;
    private String actoresPrincipales;
    private String director;

    public Pelicula(String titulo, int imagenId, String descripcion, String actoresPrincipales, String director) {
        this.titulo = titulo;
        this.imagenId = imagenId;
        this.descripcion = descripcion;
        this.actoresPrincipales = actoresPrincipales;
        this.director = director;
    }

    public String getTitulo() { return titulo; }
    public int getImagenId() { return imagenId; }
    public String getDescripcion() { return descripcion; }
    public String getActoresPrincipales() { return actoresPrincipales; }
    public String getDirector() { return director; }
}

