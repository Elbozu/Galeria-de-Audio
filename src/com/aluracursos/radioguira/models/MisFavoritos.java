package com.aluracursos.radioguira.models;

public class MisFavoritos {
     public void agregar(Audio audio){
        if (audio.getClasificacion() >= 9){
            System.out.println(audio.getTitulo() + " es uno de los favoritos!!");

        }else {
            System.out.println(audio.getTitulo() + " es el favorito de otras personas, ¡podría ser el tuyo también!");
        }
    }
}
