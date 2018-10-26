package com.example.yeialel.siguenumprimo;

import java.util.ArrayList;
import java.util.Scanner;

public class Consultar {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    //Este metodo recibira un ArrayList como parametro
    public int consultarNumeros(ArrayList numerosPrimosGuardados) {
        numerosPrimosGuardados.get(getNumero());  //Obtiene el numero buscado en el ArrayList
        // almacena el numero buscado en una variable
        int dato = (int) numerosPrimosGuardados.get(getNumero());
        return dato;  // retorna el numero buscado en el ArrayList
    }
}
