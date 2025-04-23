package com.aluracursos.radioguira.models;

public class Cancion extends Audio{
    private String album;
    private String Artista;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeLikes() > 6000){
            return 8;
        } else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
