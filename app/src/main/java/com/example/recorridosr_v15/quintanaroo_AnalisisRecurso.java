package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_AnalisisRecurso extends AppCompatActivity {
    private Spinner spin1;
    private String sel;
    private CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22 ;
    private final int top = 12;
    String vector[] = new String[top];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo__analisis_recurso);

        this.setTitle("Analisis de Recurso Quintana Roo");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //asigna los espiner del xml a los espiner aqui declarados
        spin1 = (Spinner) findViewById(R.id.spinner1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String[] opciones = {"Selecione:", "RURAL", "SEMIURBANA", "URBANO", "ZONA DE FACIL ACCESO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);
        rb21 = (RadioButton) findViewById(R.id.rb21);
        rb22 = (RadioButton) findViewById(R.id.rb22);


    }


    public void onClick(View view) {
        Boolean bandera = true;


        //selecciona lo que carga el spinner
        vector[0] = spin1.getSelectedItem().toString();



        if (rb1.isChecked()){
                vector[1]="Si";
        }
        if (rb2.isChecked()){
                vector[1]="No";
        }



        if (rb3.isChecked()){
            vector[2]="Si";
        }
        if (rb4.isChecked()){
            vector[2]="No";
        }




        if (rb5.isChecked()){
            vector[3]="Si";
        }
        if (rb6.isChecked()){
            vector[3]="No";
        }




        if (rb7.isChecked()){
            vector[4]="Si";
        }
        if (rb8.isChecked()){
            vector[4]="No";
        }




        if (rb9.isChecked()){
            vector[5]="Si";
        }
        if (rb10.isChecked()){
            vector[5]="No";
        }



        if (rb11.isChecked()){
            vector[6]="Si";
        }
        if (rb12.isChecked()){
            vector[6]="No";
        }



        if (rb13.isChecked()){
            vector[7]="Si";
        }
        if (rb14.isChecked()){
            vector[7]="No";
        }



        if (rb15.isChecked()){
            vector[8]="Si";
        }
        if (rb16.isChecked()){
            vector[8]="No";
        }



        if (rb17.isChecked()){
            vector[9]="Si";
        }
        if (rb18.isChecked()){
            vector[9]="No";
        }




        if (rb19.isChecked()){
            vector[10]="Si";
        }
        if (rb20.isChecked()){
            vector[10]="No";
        }




        if (rb21.isChecked()){
            vector[11]="Si";
        }
        if (rb22.isChecked()){
            vector[11]="No";
        }



        //////verifica que el vector no este en seleccione para poner enviar///////////////

            if(vector[0]=="Selecione:"){
                bandera= false;
            }

        //////verifica que el vector no este en seleccione para poner enviar///////////////
        for(int i=1;i<top; i++  ){
            if(vector[i]==null){
                bandera= false;
            }
        }



        if (bandera) {
                Toast.makeText(this, "Guardado con exito", LENGTH_SHORT).show();


            } else {
                Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            }


        }
    }


