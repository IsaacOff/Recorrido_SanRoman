package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_RecursosCircundantes extends AppCompatActivity {
    private Spinner spin1, spin2, spin3, spin4, spin5, spin6, spin7, spin8, spin9, spin10, spin11, spin12, spin13, spin14, spin15, spin16;
    private Spinner spin17, spin18, spin19, spin20, spin21, spin22, spin23, spin24, spin25, spin26, spin27, spin28, spin29, spin30, spin31;
    private Spinner spin32, spin33, spin34, spin35, spin36, spin37, spin38;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36, et37, et38;
    private String sel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo__recursos_circundantes);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //asignar EditText a las variables de aqui
        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);


        //Ocultar EditText
        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        et3.setVisibility(View.GONE);
        et4.setVisibility(View.GONE);



        //asigna los espiner del xml a los espiner aqui declarados
        spin1=(Spinner)findViewById(R.id.spinner1);
        spin2=(Spinner)findViewById(R.id.spinner2);
        spin3=(Spinner)findViewById(R.id.spinner3);
        spin4=(Spinner)findViewById(R.id.spinner4);
        spin5=(Spinner)findViewById(R.id.spinner5);
        spin6=(Spinner)findViewById(R.id.spinner6);


        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione:","ACEPTABLE","INTERMEDIO","ALTO","NINGUNO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        String [] opciones1 ={"Tiempo de Respuesta:","0-10 minutos","11-20 minutos","21-30 minutos","31-40 minutos","40-60 minutos"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);

        String [] opciones2 ={"Numero de telefono", "911", "-"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones2);



        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter1);
        spin3.setAdapter(adapter2);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter1);
        spin6.setAdapter(adapter2);

        //Ocultar EditText
        spin2.setVisibility(View.GONE);
        spin3.setVisibility(View.GONE);
        spin5.setVisibility(View.GONE);
        spin6.setVisibility(View.GONE);



        //pasa parametros al spinner para mostrar
        mostrar(spin1, spin2, spin3, et1, et2);

        mostrar(spin4, spin5, spin6, et3, et4);


    }



    public void mostrar(Spinner x, final Spinner mostrar1, final Spinner mostrar2, final EditText o, final EditText E){
        x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(parent.getContext(), "seleccion"+ parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                sel= parent.getItemAtPosition(position).toString();

                switch( sel ) {

                    case "ACEPTABLE":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    case "INTERMEDIO":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    case "ALTO":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    default:
                        o.setVisibility(View.GONE);
                        E.setVisibility(View.GONE);
                        mostrar1.setVisibility(View.GONE);
                        mostrar2.setVisibility(View.GONE);
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}



