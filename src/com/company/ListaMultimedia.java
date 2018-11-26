package com.company;

import java.util.Arrays;

public class ListaMultimedia {

    protected Multimedia[] lista;
    protected int counter;

    public ListaMultimedia (int maxListSize) {
        this.lista = new Multimedia[maxListSize];
    }

    public int size () {
        return counter;
    }

    public boolean add (Multimedia multimedia) {
        for (int i = 0 ; i < this.lista.length ; i++) {
            if (this.lista[i] == null) this.lista[i] = multimedia;
            counter = i + 1;
            return true;
        }
        return false;
    }

    public Multimedia get (int position) {
        return  this.lista[position];
    }

    @Override
    public String toString() {
        return "ListaMultimedia{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
