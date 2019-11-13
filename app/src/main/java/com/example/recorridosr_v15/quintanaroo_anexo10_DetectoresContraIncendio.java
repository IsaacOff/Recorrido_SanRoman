package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_anexo10_DetectoresContraIncendio extends AppCompatActivity {
    private Spinner spin1;
    private TextView TV1;
    private int numero =1;
    String vector[] =new String[5];
    private EditText  et1, et2,  et3,  et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__detectores_contra_incendio);



        //asigna los espiner del xml a los espiner aqui declarados
        spin1 = (Spinner) findViewById(R.id.spinner1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String[] opciones = {"TIPO DE DETECTOR:", "HUMO", "FUEGO", "GAS", "SENSORES DE HUMO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);

        TV1=(TextView) findViewById(R.id.tv);


        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);



    }



    public void OnClick (View View){
        Boolean bandera=true;



        vector[0]   = spin1.getSelectedItem().toString();

        if (et1.length() == 0) {
             bandera = false;
        }


        if (et2.length() == 0) {
            bandera = false;
        }

        if (et3.length() == 0) {
            bandera = false;
        }

        if (et4.length() == 0) {
            bandera = false;
        }

        if(vector[0]=="TIPO DE DETECTOR:"){
                bandera= false;
        }

        if (bandera){
            numero++;
            TV1.setText(Integer.toString(numero));

            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");

            spin1.setSelection(0);

            Toast.makeText(this, "Agregado con exito", LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }



        vector[1]   = et1.getText().toString();
        vector[2]   = et2.getText().toString();
        vector[3]   = et3.getText().toString();
        vector[4]   = et4.getText().toString();




    }



}
