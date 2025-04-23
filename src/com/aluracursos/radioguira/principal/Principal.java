package com.aluracursos.radioguira.principal;

import com.aluracursos.radioguira.models.Audio;
import com.aluracursos.radioguira.models.Cancion;
import com.aluracursos.radioguira.models.MisFavoritos;
import com.aluracursos.radioguira.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        // canción
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("El encuentro");
        miCancion.setArtista("Residente");
        miCancion.setGenero("Hip Hop");

        // podcast
        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("ConspiraTV");
        miPodcast.setPresentador("Miloch Jojic");
        miPodcast.setDescripcion("Teorías conspirativas");

        // Aqui nos imaginamos los likes y las reproducciones
        simularActividad(miCancion, 2000, 5000);
        simularActividad(miPodcast, 100, 3000);

        // Mostrar información de cada contenido
        mostrarInformacion(miCancion);
        mostrarInformacion(miPodcast);

        // aqui checamos los favoritos
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agregar(miCancion);
        favoritos.agregar(miPodcast);
    }

    private static void simularActividad(Audio audio, int likes, int reproducciones) {
        for (int i = 0; i < likes; i++) {
            audio.Likes();
        }
        for (int i = 0; i < reproducciones; i++) {
            audio.reproduce();
        }
    }

    // Imprimiendo los resultados
    private static void mostrarInformacion(Audio audio) {
        System.out.println("\n-------------------------");
        System.out.println("Título: " + audio.getTitulo());
        System.out.println("Reproducciones: " + audio.getTotalDeReproducciones());
        System.out.println("Likes: " + audio.getTotalDeLikes());
        System.out.println("Clasificación: " + audio.getClasificacion());

        if (audio instanceof Cancion) {
            Cancion c = (Cancion) audio;
            System.out.println("Artista: " + c.getArtista());
            System.out.println("Género: " + c.getGenero());
        } else if (audio instanceof Podcast) {
            Podcast p = (Podcast) audio;
            System.out.println("Presentador: " + p.getPresentador());
            System.out.println("Descripción: " + p.getDescripcion());
        }
        System.out.println("-------------------------");
    }
}

