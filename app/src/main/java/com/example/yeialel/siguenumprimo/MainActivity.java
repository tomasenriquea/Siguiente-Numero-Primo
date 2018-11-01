package com.example.yeialel.siguenumprimo;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

     public ArrayList<Integer> numerosPrimosGuardados = new ArrayList<>();

     private EditText ingresoNumerosBuscar;  // esto es el ingreso del los numeros.
     private TextView resultadoBusqueda;  // aqui se muestra el resultado de la busqueda.
     private TextView detalle;  // aqui se mostrara la informacion de lo rque hace la App


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        //Aqui ponemos el titulo de la App y la centramos usando lo siguente:
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.texto_centrado_titulo);  // Esto es el archivo XML creado


        ingresoNumerosBuscar = (EditText) findViewById(R.id.posicion); // esto es el ingreso del los numeros.
        resultadoBusqueda = (TextView) findViewById(R.id.resultado); // aqui se muestra el resultado de la busqueda.


        // aqui se mostrara la informacion de lo rque hace la App
        detalle = (TextView) findViewById(R.id.textDetalleApp);
        /** Esto de aqui sirve para justificar el texto en donde:
         * @param JUSTIFICATION_MODE_INTER_WORD devuelve un valor entero = 1
         *
         * El otro valor y es por defecto es 'JUSTIFICATION_MODE_NONE' = 0   */
        detalle.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

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
