package com.example.yeialel.siguenumprimo;

import java.util.ArrayList;

public class GeneradorNumeroPrimo {

    private int inicio, fin;
    private ArrayList<Integer> numerosPrimosGuardados;

    //CONSTRUCTOR
    public GeneradorNumeroPrimo(){
        this.inicio = 1;
        this.fin = 999999;
        this.numerosPrimosGuardados =  new ArrayList<>();
    }


    //GETTER
    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public ArrayList<Integer> getNumerosPrimosGuardados() {
        return numerosPrimosGuardados;
    }

    //SETTER
    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setNumerosPrimosGuardados(ArrayList<Integer> numerosPrimosGuardados) {
        this.numerosPrimosGuardados = numerosPrimosGuardados;
    }


    //METODO
    public ArrayList<Integer> generar(){
        // Servira para que el ArrayList sea de este tamaño y se pueda ahorra recursos del sistema
        numerosPrimosGuardados.ensureCapacity(78499);  // numero maximo a poner por ahora solo hasta 78998

        for(int numero = getInicio(); numero < getFin(); numero++){
            boolean salida = false; // si la condicion cambia esto servira para salir del bucle
            int divisor = 2; // sera el divisor para verificar si se cumple la condicion
            // mientras 'salida' sea 'false' y 'divisor' sea menor que 'numero' seguira haciendo el bucle.
            while(salida == false && divisor < numero){  // !salida  ==> (salida == false)
                // Si hay mas de una division que sea igual a cero la condicon cambia y el numero no es primo
                if((numero % divisor) == 0){
                    salida = true;
                }else{ // Si la condicio de arriba no se cumple, el 'divisor' aumenta y se sigue verificando mas numeros
                    divisor++;
                }
            }
            if(salida == false){  // Si la salida es 'false' aqui se agregara ese numero a un ArrayList para luego realizar una busqueda.
                //System.out.println("Numero: " + numero);
                numerosPrimosGuardados.add(numero);
                numerosPrimosGuardados.trimToSize(); // con esto se corta el exceso de memoria si no se usara un espacio libre en el array
            }
        }
        // Averigua el tamaño del ArrayList creado que en este caso sera de 78499
        //System.out.println(numerosPrimosGuardados.size());
        return numerosPrimosGuardados;
    }





}
