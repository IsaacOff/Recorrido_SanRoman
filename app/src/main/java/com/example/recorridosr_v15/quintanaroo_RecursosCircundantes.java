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

        this.setTitle("Recursos Circundantes Quintana Roo");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //asignar EditText a las variables de aqui
        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);
        et5  = (EditText) findViewById(R.id.editText5);
        et6  = (EditText) findViewById(R.id.editText6);
        et7  = (EditText) findViewById(R.id.editText7);
        et8  = (EditText) findViewById(R.id.editText8);
        et9  = (EditText) findViewById(R.id.editText9);
        et10 = (EditText) findViewById(R.id.editText10);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        et14 = (EditText) findViewById(R.id.editText14);
        et15 = (EditText) findViewById(R.id.editText15);
        et16 = (EditText) findViewById(R.id.editText16);
        et17 = (EditText) findViewById(R.id.editText17);
        et18 = (EditText) findViewById(R.id.editText18);
        et19 = (EditText) findViewById(R.id.editText19);
        et20 = (EditText) findViewById(R.id.editText20);
        et21 = (EditText) findViewById(R.id.editText21);
        et22 = (EditText) findViewById(R.id.editText22);
        et23 = (EditText) findViewById(R.id.editText23);
        et24 = (EditText) findViewById(R.id.editText24);



        //Ocultar EditText
        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        et3.setVisibility(View.GONE);
        et4.setVisibility(View.GONE);
        et5.setVisibility(View.GONE);
        et6.setVisibility(View.GONE);
        et7.setVisibility(View.GONE);
        et8.setVisibility(View.GONE);
        et9.setVisibility(View.GONE);
        et10.setVisibility(View.GONE);
        et11.setVisibility(View.GONE);
        et12.setVisibility(View.GONE);
        et13.setVisibility(View.GONE);
        et14.setVisibility(View.GONE);
        et15.setVisibility(View.GONE);
        et16.setVisibility(View.GONE);
        et17.setVisibility(View.GONE);
        et18.setVisibility(View.GONE);
        et19.setVisibility(View.GONE);
        et20.setVisibility(View.GONE);
        et21.setVisibility(View.GONE);
        et22.setVisibility(View.GONE);
        et23.setVisibility(View.GONE);
        et24.setVisibility(View.GONE);





        //asigna los espiner del xml a los espiner aqui declarados
        spin1 =(Spinner)findViewById(R.id.spinner1);
        spin2 =(Spinner)findViewById(R.id.spinner2);
        spin3 =(Spinner)findViewById(R.id.spinner3);
        spin4 =(Spinner)findViewById(R.id.spinner4);
        spin5 =(Spinner)findViewById(R.id.spinner5);
        spin6 =(Spinner)findViewById(R.id.spinner6);
        spin7 =(Spinner)findViewById(R.id.spinner7);
        spin8 =(Spinner)findViewById(R.id.spinner8);
        spin9 =(Spinner)findViewById(R.id.spinner9);
        spin10=(Spinner)findViewById(R.id.spinner10);
        spin11=(Spinner)findViewById(R.id.spinner11);
        spin12=(Spinner)findViewById(R.id.spinner12);
        spin13=(Spinner)findViewById(R.id.spinner13);
        spin14=(Spinner)findViewById(R.id.spinner14);
        spin15=(Spinner)findViewById(R.id.spinner15);
        spin16=(Spinner)findViewById(R.id.spinner16);
        spin17=(Spinner)findViewById(R.id.spinner17);
        spin18=(Spinner)findViewById(R.id.spinner18);
        spin19=(Spinner)findViewById(R.id.spinner19);
        spin20=(Spinner)findViewById(R.id.spinner20);
        spin21=(Spinner)findViewById(R.id.spinner21);
        spin22=(Spinner)findViewById(R.id.spinner22);
        spin23=(Spinner)findViewById(R.id.spinner23);
        spin24=(Spinner)findViewById(R.id.spinner24);
        spin25=(Spinner)findViewById(R.id.spinner25);
        spin26=(Spinner)findViewById(R.id.spinner26);
        spin27=(Spinner)findViewById(R.id.spinner27);
        spin28=(Spinner)findViewById(R.id.spinner28);
        spin29=(Spinner)findViewById(R.id.spinner29);
        spin30=(Spinner)findViewById(R.id.spinner30);
        spin31=(Spinner)findViewById(R.id.spinner31);
        spin32=(Spinner)findViewById(R.id.spinner32);
        spin33=(Spinner)findViewById(R.id.spinner33);
        spin34=(Spinner)findViewById(R.id.spinner34);
        spin35=(Spinner)findViewById(R.id.spinner35);
        spin36=(Spinner)findViewById(R.id.spinner36);



        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione:","ACEPTABLE","INTERMEDIO","ALTO","NINGUNO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        String [] opciones1 ={"Tiempo de Respuesta:","0-10 minutos","11-20 minutos","21-30 minutos","31-40 minutos","40-60 minutos"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);

        String [] opciones2 ={"Numero de telefono:", "911", "-"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones2);



        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter1);
        spin3.setAdapter(adapter2);

        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter1);
        spin6.setAdapter(adapter2);

        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter1);
        spin9.setAdapter(adapter2);

        spin10.setAdapter(adapter);
        spin11.setAdapter(adapter1);
        spin12.setAdapter(adapter2);

        spin13.setAdapter(adapter);
        spin14.setAdapter(adapter1);
        spin15.setAdapter(adapter2);

        spin16.setAdapter(adapter);
        spin17.setAdapter(adapter1);
        spin18.setAdapter(adapter2);

        spin19.setAdapter(adapter);
        spin20.setAdapter(adapter1);
        spin21.setAdapter(adapter2);

        spin22.setAdapter(adapter);
        spin23.setAdapter(adapter1);
        spin24.setAdapter(adapter2);

        spin25.setAdapter(adapter);
        spin26.setAdapter(adapter1);
        spin27.setAdapter(adapter2);

        spin28.setAdapter(adapter);
        spin29.setAdapter(adapter1);
        spin30.setAdapter(adapter2);

        spin31.setAdapter(adapter);
        spin32.setAdapter(adapter1);
        spin33.setAdapter(adapter2);

        spin34.setAdapter(adapter);
        spin35.setAdapter(adapter1);
        spin36.setAdapter(adapter2);




        //Ocultar EditText
        spin2.setVisibility(View.GONE);
        spin3.setVisibility(View.GONE);

        spin5.setVisibility(View.GONE);
        spin6.setVisibility(View.GONE);

        spin8.setVisibility(View.GONE);
        spin9.setVisibility(View.GONE);

        spin11.setVisibility(View.GONE);
        spin12.setVisibility(View.GONE);

        spin14.setVisibility(View.GONE);
        spin15.setVisibility(View.GONE);

        spin17.setVisibility(View.GONE);
        spin18.setVisibility(View.GONE);

        spin20.setVisibility(View.GONE);
        spin21.setVisibility(View.GONE);

        spin23.setVisibility(View.GONE);
        spin24.setVisibility(View.GONE);

        spin26.setVisibility(View.GONE);
        spin27.setVisibility(View.GONE);

        spin29.setVisibility(View.GONE);
        spin30.setVisibility(View.GONE);

        spin32.setVisibility(View.GONE);
        spin33.setVisibility(View.GONE);

        spin35.setVisibility(View.GONE);
        spin36.setVisibility(View.GONE);



        //pasa parametros al spinner para mostrar
        mostrar(spin1, spin2, spin3, et1, et2);
        mostrar(spin4, spin5, spin6, et3, et4);

        mostrar(spin7, spin8, spin9, et5, et6);
        mostrar(spin10, spin11, spin12, et7, et8);
        mostrar(spin13, spin14, spin15, et9, et10);
        mostrar(spin16, spin17, spin18, et11, et12);
        mostrar(spin19, spin20, spin21, et13, et14);
        mostrar(spin22, spin23, spin24, et15, et16);
        mostrar(spin25, spin26, spin27, et17, et18);
        mostrar(spin28, spin29, spin30, et19, et20);
        mostrar(spin31, spin32, spin33, et21, et22);
        mostrar(spin34, spin35, spin36, et23, et24);


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



