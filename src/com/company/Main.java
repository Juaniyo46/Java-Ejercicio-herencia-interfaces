package com.company;

import com.sun.javaws.progress.PreloaderPostEventListener;

public class Main {

    public static void main(String[] args) {

        ListaMultimedia objetc1 = new ListaMultimedia(10);

        Película pelicula1 = new Película("Las siete maravillas", "Pedro Jimenez", Multimedia.formato.avi, 150, "Jonny Depp", "Jenifer Lopez");
        Película pelicula2 = new Película("Los Vengadores", "Joseph Hill", Multimedia.formato.dvd,150, "Donal Junior", "Scarlett Johansson");
        Película pelicula3 = new Película("Casi 300", "Gonzalo Lopez", Multimedia.formato.mpg, 120, "Rodrigo Liebana", "Josefa Hernandez");

        objetc1.add(pelicula1);
        objetc1.add(pelicula2);
        objetc1.add(pelicula3);

        System.out.println(objetc1);

        ListaMultimedia objetc2 = new ListaMultimedia(20);

        Disco disco1 = new Disco("Munay", "Vanesa Martin", Multimedia.formato.mp3, 60, "pop");
        Disco disco2 = new Disco("Un alumno más", "Melendi", Multimedia.formato.mp3, 70, "pop");
        Disco disco3 = new Disco("Mi Princesa", "David Bisbal", Multimedia.formato.mp3, 80, "pop");

        objetc2.add(disco1);
        objetc2.add(disco2);
        objetc2.add(disco3);

        System.out.println(objetc2);


    }
}
