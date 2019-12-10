package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class quintanaroo_id_riesgo_interno_equiposyservicios_5 extends AppCompatActivity {
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20;
    private RadioButton rb21, rb22, rb23, rb24;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12;
    static String vector[]= {"", "", "", "", "", "", "", "", "", "", "", ""};
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12;
    static String vector2[]= {"", "", "", "", "", "", "", "", "", "", "", ""};
    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_equiposyservicios_5);


        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Implementa el menu para que se vea en esta vista en especifico
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);



        //Asigna los Rg y rb del xml a los de aqui
        rg1= (RadioGroup) findViewById(R.id.Rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);

        rg2= (RadioGroup) findViewById(R.id.Rg2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        rg3= (RadioGroup) findViewById(R.id.Rg3);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);

        rg4= (RadioGroup) findViewById(R.id.Rg4);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);

        rg5= (RadioGroup) findViewById(R.id.Rg5);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);

        rg6= (RadioGroup) findViewById(R.id.Rg6);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);

        rg7= (RadioGroup) findViewById(R.id.Rg7);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);

        rg8= (RadioGroup) findViewById(R.id.Rg8);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);

        rg9= (RadioGroup) findViewById(R.id.Rg9);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);

        rg10= (RadioGroup) findViewById(R.id.Rg10);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);

        rg11= (RadioGroup) findViewById(R.id.Rg11);
        rb21 = (RadioButton) findViewById(R.id.rb21);
        rb22 = (RadioButton) findViewById(R.id.rb22);

        rg12= (RadioGroup) findViewById(R.id.Rg12);
        rb23 = (RadioButton) findViewById(R.id.rb23);
        rb24 = (RadioButton) findViewById(R.id.rb24);


        //edit text codigo listo office
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
        et8 = (EditText) findViewById(R.id.et8);
        et9 = (EditText) findViewById(R.id.et9);
        et10 = (EditText) findViewById(R.id.et10);
        et11 = (EditText) findViewById(R.id.et11);
        et12 = (EditText) findViewById(R.id.et12);

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


        if(!vector2[0].equals("") && vector2[0] != null){
            et1.setText(vector2[0]);
        }
        if(!vector2[1].equals("") && vector2[1] != null){
            et2.setText(vector2[1]);
        }
        if(!vector2[2].equals("") && vector2[2] != null){
            et3.setText(vector2[2]);
        }
        if(!vector2[3].equals("") && vector2[3] != null){
            et4.setText(vector2[3]);
        }
        if(!vector2[4].equals("") && vector2[4] != null){
            et5.setText(vector2[4]);
        }
        if(!vector2[5].equals("") && vector2[5] != null){
            et6.setText(vector2[5]);
        }
        if(!vector2[6].equals("") && vector2[6] != null){
            et7.setText(vector2[6]);
        }
        if(!vector2[7].equals("") && vector2[7] != null){
            et8.setText(vector2[7]);
        }
        if(!vector2[8].equals("") && vector2[8] != null){
            et9.setText(vector2[8]);
        }
        if(!vector2[9].equals("") && vector2[9] != null){
            et10.setText(vector2[9]);
        }
        if(!vector2[10].equals("") && vector2[10] != null){
            et11.setText(vector2[10]);
        }
        if(!vector2[11].equals("") && vector2[11] != null){
            et12.setText(vector2[11]);
        }



        if (vector[0].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
            et1.setVisibility(View.VISIBLE);
        } else if (vector[0].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[1].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
            et2.setVisibility(View.VISIBLE);
        } else if (vector[1].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if (vector[2].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
            et3.setVisibility(View.VISIBLE);
        } else if (vector[2].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[3].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
            et4.setVisibility(View.VISIBLE);
        } else if (vector[3].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[4].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
            et5.setVisibility(View.VISIBLE);
        } else if (vector[4].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }


        if (vector[5].equals("SI")) {
            rb11.setChecked(true);
            rb12.setChecked(false);
            et6.setVisibility(View.VISIBLE);
        } else if (vector[5].equals("NO")) {
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if (vector[6].equals("SI")) {
            rb13.setChecked(true);
            rb14.setChecked(false);
            et7.setVisibility(View.VISIBLE);
        } else if (vector[6].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[7].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
            et8.setVisibility(View.VISIBLE);
        } else if (vector[7].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[8].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
            et9.setVisibility(View.VISIBLE);
        } else if (vector[8].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[9].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
            et10.setVisibility(View.VISIBLE);
        } else if (vector[9].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[10].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et11.setVisibility(View.VISIBLE);
        } else if (vector[10].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[11].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et12.setVisibility(View.VISIBLE);
        } else if (vector[11].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }


        //Escuchadores agrupados por radios grups que contienen por par a las radio buttons

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){

                    vector[0]="SI";
                    et1.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb2) {
                    vector[0]="NO";

                    et1.setVisibility(View.GONE);
                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               if(!vector[1].equals("1")) {
                   if (checkedId == R.id.rb3) {

                       vector[1] = "SI";
                       rb3.setChecked(true);
                       et2.setVisibility(View.VISIBLE);

                   } else if (checkedId == R.id.rb4) {

                       vector[1] = "NO";
                       rb4.setChecked(true);
                       et2.setVisibility(View.GONE);

                   }
               }else{
                   vector[1] = "";
                   rb3.setChecked(false);
                   rb4.setChecked(false);
                   et2.setVisibility(View.GONE);
               }
            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2]="SI";
                    et3.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb6) {

                    vector[2]="NO";

                    et3.setVisibility(View.GONE);
                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3]="SI";

                    et4.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb8) {

                    vector[3]="NO";
                    et4.setVisibility(View.GONE);
                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){

                    vector[4]="SI";
                    et5.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {

                    vector[4]="NO";
                    et5.setVisibility(View.GONE);


                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5]="SI";
                    et6.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb12) {

                    vector[5]="NO";
                    et6.setVisibility(View.GONE);

                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6]="SI";
                    et7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {

                    vector[6]="NO";
                    et7.setVisibility(View.GONE);

                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7]="SI";
                    et8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {

                    vector[7]="NO";
                    et8.setVisibility(View.GONE);

                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8]="SI";
                    et9.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb18) {

                    vector[8]="NO";

                    et9.setVisibility(View.GONE);

                }

            }
        });


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9]="SI";
                    et10.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb20) {
                    vector[9]="NO";
                    et10.setVisibility(View.GONE);

                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[10]="SI";
                    et11.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb22) {

                    vector[10]="NO";

                    et11.setVisibility(View.GONE);
                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[11]="SI";

                    et12.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb24) {

                    vector[11]="NO";
                    et12.setVisibility(View.GONE);

                }

            }
        });


        //Escuchador de un edit text para ir guardando los datos mientras escribe el usuario
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0]= et1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1]= et2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2]= et3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3]= et4.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4]= et5.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[5]= et6.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[6]= et7.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[7]= et8.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[8]= et9.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[9]= et10.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[10]= et11.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[11]= et12.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion1) {
            Toast.makeText(this, "Actividad 1 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
            startActivity(intent);


            return true;
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Actividad 2 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_estructura_1.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Actividad 3 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_escaleraservicio_2.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion4) {
            Toast.makeText(this, "Actividad 4 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_instalaciones_3.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion5) {
            Toast.makeText(this, "Actividad 5 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_noEstructurales_4.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion6) {
            Toast.makeText(this, "Actividad 6 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_equiposyservicios_5.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion7) {
            Toast.makeText(this, "Actividad 7 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_otros_6.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void eventtext2 (View view){
        System.out.println("eventext2");
        vector[1]= "1";
        rb3.setChecked(false);
        rb4.setChecked(false);


        vector2[1]="";
        et2.setVisibility(View.GONE);
        et2.setText("");

        if(vector[1]=="1"){
            System.out.println("cambio");
            vector[1]="";
        }
    }



    public static boolean siguiente6() {
        boolean bandera = true;
        boolean banderanula = true;

        if(vector[0]==null || vector[0].equals("")){
            bandera= false;
        }

        if(vector[1]==null || vector[1].equals("")){
            vector[1]="N/P";
            banderanula= false;
        }

        for(int i=2;i<12; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }


        if (bandera) {

            return true;
            //Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();
            //onClick(view);
            //interno_siguiente6(view);



        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            return false;
        }


    }




    public void interno_siguiente6 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_otros_6.class);
        startActivity(intent);
    }


    public static String onClick (){

            tablaConcatenacion=

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">RIESGO POR DEFICIENCIAS EN LOS EQUIPOS Y SERVICIOS DE EMERGENCIA</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">Evaluación del riesgo por la <b><u>carencia, insuficiencia o inoperancia</u></b> de los equipos y servicios de emergencia en el inmueble.</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"4%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"66%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                                    "<th style=\"border: inset 0pt\" WIDTH=\"20%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Sistema de alertamiento</td>";
            agregarRenglon(vector[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Sistema contra incendio</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Extintores</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Equipo de protección personal para atención de emergencia</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Material y equipo para atención de emergencia</td>";
            agregarRenglon(vector[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Rutas de evacuación</td>";
            agregarRenglon(vector[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Salidas de emergencia</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Señalización</td>";
            agregarRenglon(vector[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Brigadas de emergencia</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Sistemas de comunicación de emergencia</td>";
            agregarRenglon(vector[9]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>11</td>"+
                    "<td>Zonas de seguridad y de conteo</td>";
            agregarRenglon(vector[10]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>12</td>"+
                    "<td>Servicios médicos o de primeros auxilios</td>";
            agregarRenglon(vector[11]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b> Si respondió afirmativo en alguna de las cuestiones 1 a la 12, se requiere implementar medidas correctivas <b>inmediatas.</b></td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>";

            return tablaConcatenacion;
    }
    public static void agregarRenglon(String decision) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td>"+""+"</td>" +
                    "</tr>";
        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }else if(decision.equals("N/P")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td colspan=\"2\" style=\"text-align:center; background-color:Yellow;\">No aplica</td>" +
                    "<td></td>" +
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td >SI</td>" +
                    "<td>NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }

    }

}
