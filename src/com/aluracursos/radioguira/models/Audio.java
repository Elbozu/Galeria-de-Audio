package com.aluracursos.radioguira.models;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeLikes;
    private int clasificacion;

    public void Likes(){
        this.totalDeLikes++;
    }

    public void reproduce(){
        this.totalDeReproducciones++;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeLikes() {
        return totalDeLikes;
    }

    public void setTotalDeLikes(int totalDeLikes) {
        this.totalDeLikes = totalDeLikes;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
