package com.example.yeialel.siguenumprimo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     public ArrayList<Integer> numerosPrimosGuardados = new ArrayList<>();

     EditText ingresoNumerosBuscar;
     TextView resultadoBusqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresoNumerosBuscar = (EditText) findViewById(R.id.posicion); // esto es el ingreso del los numeros.
        resultadoBusqueda = (TextView) findViewById(R.id.resultado); // aqui se muestra el resultado de la busqueda.


        // aqui se estan generando los numeros primos.  --> SOLUCIONAR PORQUE TARDA MUCHO EN CARGAR.
       GeneradorNumeroPrimo numerosPrimos = new GeneradorNumeroPrimo();
       numerosPrimosGuardados = numerosPrimos.generar();

    }

    public void buscarNumeroPrimo(View view){

        // Aqui se guardara el dato obtenido del EditText 'ingresoNumerosBuscar'  --> 'posicion'
        int numero = Integer.parseInt(ingresoNumerosBuscar.getText().toString());

        Consultar consulta = new Consultar();  // se implementa la clase de busqueda
        consulta.setNumero(numero);  // se ingresa el numero de posicion del numero primo.

        // Recibe el ArrayList y devolvera el numero primo ubicado en la posicion dada y se comvierte en texto.
        resultadoBusqueda.setText(String.valueOf(consulta.consultarNumeros(numerosPrimosGuardados)));
    }


}
