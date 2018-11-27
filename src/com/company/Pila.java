package com.company;

public class Pila implements ColeccionInterfaz {

    Object[] array1;
    int contador;

    public Pila(Object[] array1, int contador) {
        this.array1 = array1;
        this.contador = contador;
    }

    public Object[] getArray1() {
        return array1;
    }

    public void setArray1(Object[] array1) {
        this.array1 = array1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }



    @Override
    public boolean estaVacia() {
        if (this.array1[0] == null) {
                return true;
            }

       else return false;
    }

    @Override
    public Object extraer() {

        Object primer = array1[0];
        array1[0] = null;
        for (int i = 1 ; i < array1.length ; i++) {
          array1[i - 1] = array1[i];
           if ( i == array1.length -1) array1[i] = null;
        }
          return primer;
    }

    @Override
    public Object primero() {

        Object primero = array1[0];

        return primero;
    }

    @Override
    public boolean añadir(Object a) {

        for (int i = 0 ; i < array1.length; i++) {
            if (null == array1[i]) {
                array1[i] = a;
                return true;
            }
        }
        return false;
    }
}
