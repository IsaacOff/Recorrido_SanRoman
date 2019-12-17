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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class quintanaroo_id_riesgo_interno_escaleraservicio_2 extends AppCompatActivity {
    private Spinner spin1, spin2, spin3, spin4, spin5, spin6, spin7, spin8, spin9, spin10;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22, rb23, rb24;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12;
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10;
    static String vector[][] = {{"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}};
    static String vector2[] = {"", ""};
    static String vector3[] = {"", "", "", "", "", "", "", "", "", ""};
    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_escaleraservicio_2);

        this.setTitle("Riesgo interno 3");
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

        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        et6 = (EditText) findViewById(R.id.editText6);
        et7 = (EditText) findViewById(R.id.editText7);
        et8 = (EditText) findViewById(R.id.editText8);
        et9 = (EditText) findViewById(R.id.editText9);
        et10 = (EditText) findViewById(R.id.editText10);

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

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione el estado actual:","BUENO","REGULAR","MALO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);
        spin3.setAdapter(adapter);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter);
        spin6.setAdapter(adapter);
        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter);
        spin9.setAdapter(adapter);
        spin10.setAdapter(adapter);



        //Ocultar SPINNER
        spin1.setVisibility(View.GONE);
        spin2.setVisibility(View.GONE);
        spin3.setVisibility(View.GONE);
        spin4.setVisibility(View.GONE);
        spin5.setVisibility(View.GONE);
        spin6.setVisibility(View.GONE);
        spin7.setVisibility(View.GONE);
        spin8.setVisibility(View.GONE);
        spin9.setVisibility(View.GONE);
        spin10.setVisibility(View.GONE);

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

        if(vector2[0].equals("SI")){
            rb21.setChecked(true);
            rb22.setChecked(false);


        }else if(vector2[0].equals("NO")){
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if(vector2[1].equals("SI")){
            rb23.setChecked(true);
            rb24.setChecked(false);
        }else if(vector2[1].equals("NO")){
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if(!vector3[0].equals("") && vector3[0] != null){
            et1.setText(vector3[0]);
        }

        if(!vector3[1].equals("") && vector3[1] != null){
            et2.setText(vector3[1]);
        }

        if(!vector3[2].equals("") && vector3[2] != null){
            et3.setText(vector3[2]);
        }

        if(!vector3[3].equals("") && vector3[3] != null){
            et4.setText(vector3[3]);
        }

        if(!vector3[4].equals("") && vector3[4] != null){
            et5.setText(vector3[4]);
        }

        if(!vector3[5].equals("") && vector3[5] != null){
            et6.setText(vector3[5]);
        }

        if(!vector3[6].equals("") && vector3[6] != null){
            et7.setText(vector3[6]);
        }

        if(!vector3[7].equals("") && vector3[7] != null){
            et8.setText(vector3[7]);
        }

        if(!vector3[8].equals("") && vector3[8] != null){
            et9.setText(vector3[8]);
        }

        if(!vector3[9].equals("") && vector3[9] != null){
            et10.setText(vector3[9]);
        }

        if(vector[0][1].equals("Selecione el estado actual:")){
            spin1.setSelection(0);
        }else if(vector[0][1].equals("BUENO")) {
            spin1.setSelection(1);
        }else if (vector[0][1].equals("REGULAR")){
            spin1.setSelection(2);
        }else if (vector[0][1].equals("MALO")){
            spin1.setSelection(3);
        }

        if(vector[1][1].equals("Selecione el estado actual:")){
            spin2.setSelection(0);
        }else if(vector[1][1].equals("BUENO")) {
            spin2.setSelection(1);
        }else if (vector[1][1].equals("REGULAR")){
            spin2.setSelection(2);
        }else if (vector[1][1].equals("MALO")){
            spin2.setSelection(3);
        }

        if(vector[2][1].equals("Selecione el estado actual:")){
            spin3.setSelection(0);
        }else if(vector[2][1].equals("BUENO")) {
            spin3.setSelection(1);
        }else if (vector[2][1].equals("REGULAR")){
            spin3.setSelection(2);
        }else if (vector[2][1].equals("MALO")){
            spin3.setSelection(3);
        }

        if(vector[3][1].equals("Selecione el estado actual:")){
            spin4.setSelection(0);
        }else if(vector[3][1].equals("BUENO")) {
            spin4.setSelection(1);
        }else if (vector[3][1].equals("REGULAR")){
            spin4.setSelection(2);
        }else if (vector[3][1].equals("MALO")){
            spin4.setSelection(3);
        }

        if(vector[4][1].equals("Selecione el estado actual:")){
            spin5.setSelection(0);
        }else if(vector[4][1].equals("BUENO")) {
            spin5.setSelection(1);
        }else if (vector[4][1].equals("REGULAR")){
            spin5.setSelection(2);
        }else if (vector[4][1].equals("MALO")){
            spin5.setSelection(3);
        }

        if(vector[5][1].equals("Selecione el estado actual:")){
            spin6.setSelection(0);
        }else if(vector[5][1].equals("BUENO")) {
            spin6.setSelection(1);
        }else if (vector[5][1].equals("REGULAR")){
            spin6.setSelection(2);
        }else if (vector[5][1].equals("MALO")){
            spin6.setSelection(3);
        }

        if(vector[6][1].equals("Selecione el estado actual:")){
            spin7.setSelection(0);
        }else if(vector[6][1].equals("BUENO")) {
            spin7.setSelection(1);
        }else if (vector[6][1].equals("REGULAR")){
            spin7.setSelection(2);
        }else if (vector[6][1].equals("MALO")){
            spin7.setSelection(3);
        }

        if(vector[7][1].equals("Selecione el estado actual:")){
            spin8.setSelection(0);
        }else if(vector[7][1].equals("BUENO")) {
            spin8.setSelection(1);
        }else if (vector[7][1].equals("REGULAR")){
            spin8.setSelection(2);
        }else if (vector[7][1].equals("MALO")){
            spin8.setSelection(3);
        }

        if(vector[8][1].equals("Selecione el estado actual:")){
            spin9.setSelection(0);
        }else if(vector[8][1].equals("BUENO")) {
            spin9.setSelection(1);
        }else if (vector[8][1].equals("REGULAR")){
            spin9.setSelection(2);
        }else if (vector[8][1].equals("MALO")){
            spin9.setSelection(3);
        }

        if(vector[9][1].equals("Selecione el estado actual:")){
            spin10.setSelection(0);
        }else if(vector[9][1].equals("BUENO")) {
            spin10.setSelection(1);
        }else if (vector[9][1].equals("REGULAR")){
            spin10.setSelection(2);
        }else if (vector[9][1].equals("MALO")){
            spin10.setSelection(3);
        }

        if(vector2[0].equals("SI")) {
            System.out.println("cambio 4");
            if (vector[0][0].equals("SI")) {
                rb1.setChecked(true);
                rb2.setChecked(false);
                et1.setVisibility(View.VISIBLE);
                spin1.setVisibility(View.VISIBLE);
            } else if (vector[0][0].equals("NO")) {
                rb1.setChecked(false);
                rb2.setChecked(true);
            }

            if (vector[1][0].equals("SI")) {
                rb3.setChecked(true);
                rb4.setChecked(false);
                et2.setVisibility(View.VISIBLE);
                spin2.setVisibility(View.VISIBLE);
            } else if (vector[1][0].equals("NO")) {
                rb3.setChecked(false);
                rb4.setChecked(true);
            }

            if (vector[2][0].equals("SI")) {
                rb5.setChecked(true);
                rb6.setChecked(false);
                et3.setVisibility(View.VISIBLE);
                spin3.setVisibility(View.VISIBLE);
            } else if (vector[2][0].equals("NO")) {
                rb5.setChecked(false);
                rb6.setChecked(true);
            }

            if (vector[3][0].equals("SI")) {
                rb7.setChecked(true);
                rb8.setChecked(false);
                et4.setVisibility(View.VISIBLE);
                spin4.setVisibility(View.VISIBLE);
            } else if (vector[3][0].equals("NO")) {
                rb7.setChecked(false);
                rb8.setChecked(true);
            }

            if (vector[4][0].equals("SI")) {
                rb9.setChecked(true);
                rb10.setChecked(false);
                et5.setVisibility(View.VISIBLE);
                spin5.setVisibility(View.VISIBLE);
            } else if (vector[4][0].equals("NO")) {
                rb9.setChecked(false);
                rb10.setChecked(true);
            }
        }

        if(vector2[1].equals("SI")) {
            if (vector[5][0].equals("SI")) {
                rb11.setChecked(true);
                rb12.setChecked(false);
                et6.setVisibility(View.VISIBLE);
                spin6.setVisibility(View.VISIBLE);
            } else if (vector[5][0].equals("NO")) {
                rb11.setChecked(false);
                rb12.setChecked(true);
            }

            if (vector[6][0].equals("SI")) {
                rb13.setChecked(true);
                rb14.setChecked(false);
                et7.setVisibility(View.VISIBLE);
                spin7.setVisibility(View.VISIBLE);
            } else if (vector[6][0].equals("NO")) {
                rb13.setChecked(false);
                rb14.setChecked(true);
            }

            if (vector[7][0].equals("SI")) {
                rb15.setChecked(true);
                rb16.setChecked(false);
                et8.setVisibility(View.VISIBLE);
                spin8.setVisibility(View.VISIBLE);
            } else if (vector[7][0].equals("NO")) {
                rb15.setChecked(false);
                rb16.setChecked(true);
            }

            if (vector[8][0].equals("SI")) {
                rb17.setChecked(true);
                rb18.setChecked(false);
                et9.setVisibility(View.VISIBLE);
                spin9.setVisibility(View.VISIBLE);
            } else if (vector[8][0].equals("NO")) {
                rb17.setChecked(false);
                rb18.setChecked(true);
            }

            if (vector[9][0].equals("SI")) {
                rb19.setChecked(true);
                rb20.setChecked(false);
                et10.setVisibility(View.VISIBLE);
                spin10.setVisibility(View.VISIBLE);
            } else if (vector[9][0].equals("NO")) {
                rb19.setChecked(false);
                rb20.setChecked(true);
            }
        }



        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){
                    vector2[0]="SI";


                    if(vector[0][1].equals("Selecione el estado actual:")){
                        spin1.setSelection(0);
                    }else if(vector[0][1].equals("BUENO")) {
                        spin1.setSelection(1);
                    }else if (vector[0][1].equals("REGULAR")){
                        spin1.setSelection(2);
                    }else if (vector[0][1].equals("MALO")){
                        spin1.setSelection(3);
                    }else{
                        spin1.setSelection(0);
                    }

                    if(vector[1][1].equals("Selecione el estado actual:")){
                        spin2.setSelection(0);
                    }else if(vector[1][1].equals("BUENO")) {
                        spin2.setSelection(1);
                    }else if (vector[1][1].equals("REGULAR")){
                        spin2.setSelection(2);
                    }else if (vector[1][1].equals("MALO")){
                        spin2.setSelection(3);
                    }else{
                        spin2.setSelection(0);
                    }

                    if(vector[2][1].equals("Selecione el estado actual:")){
                        spin3.setSelection(0);
                    }else if(vector[2][1].equals("BUENO")) {
                        spin3.setSelection(1);
                    }else if (vector[2][1].equals("REGULAR")){
                        spin3.setSelection(2);
                    }else if (vector[2][1].equals("MALO")){
                        spin3.setSelection(3);
                    }else{
                        spin3.setSelection(0);
                    }

                    if(vector[3][1].equals("Selecione el estado actual:")){
                        spin4.setSelection(0);
                    }else if(vector[3][1].equals("BUENO")) {
                        spin4.setSelection(1);
                    }else if (vector[3][1].equals("REGULAR")){
                        spin4.setSelection(2);
                    }else if (vector[3][1].equals("MALO")){
                        spin4.setSelection(3);
                    }else{
                        spin4.setSelection(0);
                    }

                    if(vector[4][1].equals("Selecione el estado actual:")){
                        spin5.setSelection(0);
                    }else if(vector[4][1].equals("BUENO")) {
                        spin5.setSelection(1);
                    }else if (vector[4][1].equals("REGULAR")){
                        spin5.setSelection(2);
                    }else if (vector[4][1].equals("MALO")){
                        spin5.setSelection(3);
                    }else{
                        spin5.setSelection(0);
                    }

                    /*et6.setText(vector3[5]);
                    et7.setText(vector3[6]);
                    et8.setText(vector3[7]);
                    et9.setText(vector3[8]);
                    et10.setText(vector3[9]);
*/

                    et1.setText(vector3[0]);
                    et2.setText(vector3[1]);
                    et3.setText(vector3[2]);
                    et4.setText(vector3[3]);
                    et5.setText(vector3[4]);


                    if (vector[0][0].equals("SI")) {
                        //rb1.setChecked(true);
                        rb1.setChecked(true);
                        rb2.setChecked(false);
                        et1.setVisibility(View.VISIBLE);
                        spin1.setVisibility(View.VISIBLE);
                    } else if (vector[0][0].equals("NO")) {
                        System.out.println("cambio 1");
                        rb1.setChecked(false);
                        rb2.setChecked(true);
                    }

                    if (vector[1][0].equals("SI")) {
                        rb3.setChecked(true);
                        rb4.setChecked(false);
                        et2.setVisibility(View.VISIBLE);
                        spin2.setVisibility(View.VISIBLE);
                    } else if (vector[1][0].equals("NO")) {
                        rb3.setChecked(false);
                        rb4.setChecked(true);
                    }

                    if (vector[2][0].equals("SI")) {
                        rb5.setChecked(true);
                        rb6.setChecked(false);
                        et3.setVisibility(View.VISIBLE);
                        spin3.setVisibility(View.VISIBLE);
                    } else if (vector[2][0].equals("NO")) {
                        rb5.setChecked(false);
                        rb6.setChecked(true);
                    }

                    if (vector[3][0].equals("SI")) {
                        rb7.setChecked(true);
                        rb8.setChecked(false);
                        et4.setVisibility(View.VISIBLE);
                        spin4.setVisibility(View.VISIBLE);
                    } else if (vector[3][0].equals("NO")) {
                        rb7.setChecked(false);
                        rb8.setChecked(true);
                    }

                    if (vector[4][0].equals("SI")) {
                        rb9.setChecked(true);
                        rb10.setChecked(false);
                        et5.setVisibility(View.VISIBLE);
                        spin5.setVisibility(View.VISIBLE);
                    } else if (vector[4][0].equals("NO")) {
                        rb9.setChecked(false);
                        rb10.setChecked(true);
                    }


                }else if(checkedId==R.id.rb22) {
                    vector2[0]="NO";

                    System.out.println("cambio 2");
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                    rb3.setChecked(false);
                    rb4.setChecked(false);
                    rb5.setChecked(false);
                    rb6.setChecked(false);
                    rb7.setChecked(false);
                    rb8.setChecked(false);
                    rb9.setChecked(false);
                    rb10.setChecked(false);


                    spin1.setVisibility(View.GONE);
                    spin2.setVisibility(View.GONE);
                    spin3.setVisibility(View.GONE);
                    spin4.setVisibility(View.GONE);
                    spin5.setVisibility(View.GONE);

                    et1.setVisibility(View.GONE);
                    et2.setVisibility(View.GONE);
                    et3.setVisibility(View.GONE);
                    et4.setVisibility(View.GONE);
                    et5.setVisibility(View.GONE);

                    spin1.setSelection(0);
                    spin2.setSelection(0);
                    spin3.setSelection(0);
                    spin4.setSelection(0);
                    spin5.setSelection(0);

                    for(int i = 0 ; i< 5;i++) {
                        for(int x = 0 ; x< vector[i].length;x++) {
                            vector[i][x]="";
                        }
                    }
                    for(int i = 0 ; i< 5;i++) {
                            vector3[i]="";
                    }


                }

            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb1){
                    rb1.setChecked(true);
                    vector[0][0]="SI";
                    et1.setVisibility(View.VISIBLE);
                    spin1.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb2) {
                    rb2.setChecked(true);
                    vector[0][0]="NO";
                    et1.setVisibility(View.GONE);
                    spin1.setVisibility(View.GONE);
                }else{
                    vector[0][0]="";
                }
                }else{
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                    if(!vector[1][0].equals("1")) {
                        if (checkedId == R.id.rb3) {
                            //if(){
                            System.out.println("si");
                            rb3.setChecked(true);
                            vector[1][0] = "SI";
                            spin2.setVisibility(View.VISIBLE);
                            et2.setVisibility(View.VISIBLE);
                        } else if (checkedId == R.id.rb4) {
                            System.out.println("no");
                            rb4.setChecked(true);
                            vector[1][0] = "NO";
                            spin2.setVisibility(View.GONE);
                            et2.setVisibility(View.GONE);


                        }
                    }else {
                        System.out.println("else1");
                        rb3.setChecked(false);
                        rb4.setChecked(false);
                        vector[1][0] = "";
                    }
            }else{
                    System.out.println("else2");
                    rb3.setChecked(false);
                    rb4.setChecked(false);
            }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                    if(!vector[2][0].equals("1")) {
                if(checkedId==R.id.rb5){
                    rb5.setChecked(true);
                    vector[2][0]="SI";
                    spin3.setVisibility(View.VISIBLE);
                    et3.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb6) {
                    rb6.setChecked(true);
                    vector[2][0] = "NO";
                    spin3.setVisibility(View.GONE);
                    et3.setVisibility(View.GONE);

                }
                }else {
                    System.out.println("else1");
                    rb5.setChecked(false);
                    rb6.setChecked(false);
                    vector[2][0] = "";
                }
            }else{
               rb5.setChecked(false);
               rb6.setChecked(false);
            }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                    if(!vector[3][0].equals("1")) {
                    if(checkedId==R.id.rb7){
                    rb7.setChecked(true);
                    vector[3][0]="SI";
                    spin4.setVisibility(View.VISIBLE);
                    et4.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb8) {
                    rb8.setChecked(true);
                    vector[3][0]="NO";
                    spin4.setVisibility(View.GONE);
                    et4.setVisibility(View.GONE);
                }
                    }else {
                        System.out.println("else1");
                        rb7.setChecked(false);
                        rb8.setChecked(false);
                        vector[3][0] = "";
                    }
                }else{
                    rb7.setChecked(false);
                    rb8.setChecked(false);
                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                    if(!vector[4][0].equals("1")) {
                    if(checkedId==R.id.rb9){
                    rb9.setChecked(true);
                    vector[4][0]="SI";
                    spin5.setVisibility(View.VISIBLE);
                    et5.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb10) {
                    rb10.setChecked(true);
                    vector[4][0]="NO";
                    spin5.setVisibility(View.GONE);
                    et5.setVisibility(View.GONE);
                }
                    }else {
                        System.out.println("else1");
                        rb9.setChecked(false);
                        rb10.setChecked(false);
                        vector[4][0] = "";
                    }
            }else{
                rb9.setChecked(false);
                rb10.setChecked(false);
            }

            }
        });



        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector2[1]="SI";

                    if(vector[5][1].equals("Selecione el estado actual:")){
                        spin6.setSelection(0);
                    }else if(vector[5][1].equals("BUENO")) {
                        spin6.setSelection(1);
                    }else if (vector[5][1].equals("REGULAR")){
                        spin6.setSelection(2);
                    }else if (vector[5][1].equals("MALO")){
                        spin6.setSelection(3);
                    }else{
                        spin6.setSelection(0);
                    }

                    if(vector[6][1].equals("Selecione el estado actual:")){
                        spin7.setSelection(0);
                    }else if(vector[6][1].equals("BUENO")) {
                        spin7.setSelection(1);
                    }else if (vector[6][1].equals("REGULAR")){
                        spin7.setSelection(2);
                    }else if (vector[6][1].equals("MALO")){
                        spin7.setSelection(3);
                    }else{
                        spin7.setSelection(0);
                    }

                    if(vector[7][1].equals("Selecione el estado actual:")){
                        spin8.setSelection(0);
                    }else if(vector[7][1].equals("BUENO")) {
                        spin8.setSelection(1);
                    }else if (vector[7][1].equals("REGULAR")){
                        spin8.setSelection(2);
                    }else if (vector[7][1].equals("MALO")){
                        spin8.setSelection(3);
                    }else{
                        spin8.setSelection(0);
                    }

                    if(vector[8][1].equals("Selecione el estado actual:")){
                        spin9.setSelection(0);
                    }else if(vector[8][1].equals("BUENO")) {
                        spin9.setSelection(1);
                    }else if (vector[8][1].equals("REGULAR")){
                        spin9.setSelection(2);
                    }else if (vector[8][1].equals("MALO")){
                        spin9.setSelection(3);
                    }else{
                        spin9.setSelection(0);
                    }

                    if(vector[9][1].equals("Selecione el estado actual:")){
                        spin10.setSelection(0);
                    }else if(vector[9][1].equals("BUENO")) {
                        spin10.setSelection(1);
                    }else if (vector[9][1].equals("REGULAR")){
                        spin10.setSelection(2);
                    }else if (vector[9][1].equals("MALO")){
                        spin10.setSelection(3);
                    }else{
                        spin10.setSelection(0);
                    }

                        et6.setText(vector3[5]);
                        et7.setText(vector3[6]);
                        et8.setText(vector3[7]);
                        et9.setText(vector3[8]);
                        et10.setText(vector3[9]);

                    if (vector[5][0].equals("SI")) {
                        rb11.setChecked(true);
                        rb12.setChecked(false);
                        et6.setVisibility(View.VISIBLE);
                        spin6.setVisibility(View.VISIBLE);
                    } else if (vector[5][0].equals("NO")) {
                        rb11.setChecked(false);
                        rb12.setChecked(true);
                    }

                    if (vector[6][0].equals("SI")) {
                        rb13.setChecked(true);
                        rb14.setChecked(false);
                        et7.setVisibility(View.VISIBLE);
                        spin7.setVisibility(View.VISIBLE);
                    } else if (vector[6][0].equals("NO")) {
                        rb13.setChecked(false);
                        rb14.setChecked(true);
                    }

                    if (vector[7][0].equals("SI")) {
                        rb15.setChecked(true);
                        rb16.setChecked(false);
                        et8.setVisibility(View.VISIBLE);
                        spin8.setVisibility(View.VISIBLE);
                    } else if (vector[7][0].equals("NO")) {
                        rb15.setChecked(false);
                        rb16.setChecked(true);
                    }

                    if (vector[8][0].equals("SI")) {
                        rb17.setChecked(true);
                        rb18.setChecked(false);
                        et9.setVisibility(View.VISIBLE);
                        spin9.setVisibility(View.VISIBLE);
                    } else if (vector[8][0].equals("NO")) {
                        rb17.setChecked(false);
                        rb18.setChecked(true);
                    }

                    if (vector[9][0].equals("SI")) {
                        rb19.setChecked(true);
                        rb20.setChecked(false);
                        et10.setVisibility(View.VISIBLE);
                        spin10.setVisibility(View.VISIBLE);
                    } else if (vector[9][0].equals("NO")) {
                        rb19.setChecked(false);
                        rb20.setChecked(true);
                    }

                }else if(checkedId==R.id.rb24) {
                    vector2[1]="NO";


                    rb11.setChecked(false);
                    rb12.setChecked(false);
                    rb13.setChecked(false);
                    rb14.setChecked(false);
                    rb15.setChecked(false);
                    rb16.setChecked(false);
                    rb17.setChecked(false);
                    rb18.setChecked(false);
                    rb19.setChecked(false);
                    rb20.setChecked(false);

                    spin6.setVisibility(View.GONE);
                    spin7.setVisibility(View.GONE);
                    spin8.setVisibility(View.GONE);
                    spin9.setVisibility(View.GONE);
                    spin10.setVisibility(View.GONE);

                    et6.setVisibility(View.GONE);
                    et7.setVisibility(View.GONE);
                    et8.setVisibility(View.GONE);
                    et9.setVisibility(View.GONE);
                    et10.setVisibility(View.GONE);

                    spin6.setSelection(0);
                    spin7.setSelection(0);
                    spin8.setSelection(0);
                    spin9.setSelection(0);
                    spin10.setSelection(0);

                    for(int i = 5 ; i< 10;i++) {
                        for(int x = 0 ; x< vector[i].length;x++) {
                            vector[i][x]="";
                        }
                    }

                    for(int x = 5 ; x<10;x++) {
                        vector3[x]="";
                    }

                }

            }
        });




        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[1].equals("SI")){
                if(checkedId==R.id.rb11){
                    rb11.setChecked(true);
                    vector[5][0]="SI";
                    spin6.setVisibility(View.VISIBLE);
                    et6.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb12) {
                    rb12.setChecked(true);
                    vector[5][0]="NO";
                    spin6.setVisibility(View.GONE);
                    et6.setVisibility(View.GONE);

                }else{
                    vector[0][0]="";
                }
                }else{
                    ((RadioButton) findViewById(R.id.rb11)).setChecked(false);
                    ((RadioButton) findViewById(R.id.rb12)).setChecked(false);
                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[1].equals("SI")){
                    if(!vector[6][0].equals("1")) {
                if(checkedId==R.id.rb13){
                    rb13.setChecked(true);
                    vector[6][0]="SI";
                    spin7.setVisibility(View.VISIBLE);
                    et7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {
                    rb14.setChecked(true);
                    vector[6][0]="NO";
                    spin7.setVisibility(View.GONE);
                    et7.setVisibility(View.GONE);

                }
                    }else {
                        System.out.println("else1");
                        rb13.setChecked(false);
                        rb14.setChecked(false);
                        vector[6][0] = "";
                    }
            }else{
                ((RadioButton) findViewById(R.id.rb13)).setChecked(false);
                ((RadioButton) findViewById(R.id.rb14)).setChecked(false);
            }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[1].equals("SI")){
                    if(!vector[7][0].equals("1")) {
                if(checkedId==R.id.rb15){
                    rb15.setChecked(true);
                    vector[7][0]="SI";
                    spin8.setVisibility(View.VISIBLE);
                    et8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {
                    rb16.setChecked(true);
                    vector[7][0]="NO";
                    spin8.setVisibility(View.GONE);
                    et8.setVisibility(View.GONE);

                }
                    }else {
                        System.out.println("else1");
                        rb15.setChecked(false);
                        rb16.setChecked(false);
                        vector[7][0] = "";
                    }
                }else{
                    ((RadioButton) findViewById(R.id.rb15)).setChecked(false);
                    ((RadioButton) findViewById(R.id.rb16)).setChecked(false);
                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[1].equals("SI")){
                    if(!vector[8][0].equals("1")) {
                if(checkedId==R.id.rb17){
                    rb17.setChecked(true);
                    vector[8][0]="SI";
                    spin9.setVisibility(View.VISIBLE);
                    et9.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb18) {
                    rb18.setChecked(true);
                    vector[8][0]="NO";
                    spin9.setVisibility(View.GONE);
                    et9.setVisibility(View.GONE);


                }
                    }else {
                        System.out.println("else1");
                        rb17.setChecked(false);
                        rb18.setChecked(false);
                        vector[8][0] = "";
                    }
            }else{
                ((RadioButton) findViewById(R.id.rb17)).setChecked(false);
                ((RadioButton) findViewById(R.id.rb18)).setChecked(false);
            }

            }
        });


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[1].equals("SI")){
                    if(!vector[9][0].equals("1")) {
                if(checkedId==R.id.rb19){
                    rb19.setChecked(true);
                    vector[9][0]="SI";
                    spin10.setVisibility(View.VISIBLE);
                    et10.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {
                    rb20.setChecked(true);
                    vector[9][0]="NO";
                    spin10.setVisibility(View.GONE);
                    et10.setVisibility(View.GONE);


                }
                    }else {
                        System.out.println("else1");
                        rb19.setChecked(false);
                        rb20.setChecked(false);
                        vector[9][0] = "";
                    }
                }else{
                    ((RadioButton) findViewById(R.id.rb19)).setChecked(false);
                    ((RadioButton) findViewById(R.id.rb20)).setChecked(false);
                }


            }
        });


        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[0][1] = spin1.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[1][1] = spin2.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[2][1] = spin3.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[3][1] = spin4.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[4][1] = spin5.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[5][1] = spin6.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[6][1] = spin7.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[7][1] = spin8.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[8][1] = spin9.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        spin10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[9][1] = spin10.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector3[0]=et1.getText().toString();
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
                vector3[1]=et2.getText().toString();
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
                vector3[2]=et3.getText().toString();
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
                vector3[3]=et4.getText().toString();
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
                vector3[4]=et5.getText().toString();
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
                vector3[5]=et6.getText().toString();
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
                vector3[6]=et7.getText().toString();
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
                vector3[7]=et8.getText().toString();
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
                vector3[8]=et9.getText().toString();
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
                vector3[9]=et10.getText().toString();
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



    public static boolean siguiente3(){
        boolean bandera = true;
        boolean banderanulo = true;

/*
        //selecciona lo que carga el spinner
        vector[0][1] = spin1.getSelectedItem().toString();
        vector[1][1] = spin2.getSelectedItem().toString();
        vector[2][1] = spin3.getSelectedItem().toString();
        vector[3][1] = spin4.getSelectedItem().toString();
        vector[4][1] = spin5.getSelectedItem().toString();
        vector[5][1] = spin6.getSelectedItem().toString();
        vector[6][1] = spin7.getSelectedItem().toString();
        vector[7][1] = spin8.getSelectedItem().toString();
        vector[8][1] = spin9.getSelectedItem().toString();
        vector[9][1] = spin10.getSelectedItem().toString();
*/

        if(vector2[0].equals("SI")) {
            if (vector[0][0] == "SI") {
                if (vector[0][1] == "Selecione el estado actual:") {
                    bandera = false;
                }
            }


            if (vector[1][0] == "SI") {
                if (vector[1][1] == "Selecione el estado actual:") {
                    bandera = false;
                }
            }


            if (vector[2][0] == "SI") {
                if (vector[2][1] == "Selecione el estado actual:") {
                    bandera = false;
                }
            }

            if (vector[3][0] == "SI") {
                if (vector[3][1] == "Selecione el estado actual:") {
                    bandera = false;
                }


            }

            if (vector[4][0] == "SI") {
                if (vector[4][1] == "Selecione el estado actual:") {
                    bandera = false;
                }
            }

            if (vector[0][0] == null || vector[0][0].equals("")) {
                bandera = false;
            }

            for (int i = 1; i < 5; i++) {
                if (vector[i][0] == null || vector[i][0].equals("")) {
                    banderanulo = false;
                    vector[i][0]="N/P";
                    System.out.println(i);
                }
            }

        }

            if (vector2[1].equals("SI")) {

                if (vector[5][0] == "SI") {
                    if (vector[5][1] == "Selecione el estado actual:") {
                        bandera = false;
                    }

                }


            if (vector[6][0] == "SI") {
                if (vector[6][1] == "Selecione el estado actual:") {
                    bandera = false;
                }

            }

            if (vector[7][0] == "SI") {
                if (vector[7][1] == "Selecione el estado actual:") {
                    bandera = false;
                }


            }

            if (vector[8][0] == "SI") {
                if (vector[8][1] == "Selecione el estado actual:") {
                    bandera = false;
                }


            }

            if (vector[9][0] == "SI") {
                if (vector[9][1] == "Selecione el estado actual:") {
                    bandera = false;
                }


            }


                if (vector[5][0] == null || vector[5][0].equals("")) {
                    bandera = false;
                }

                for (int i = 6; i < 10; i++) {
                    if (vector[i][0] == null || vector[i][0].equals("")) {
                        banderanulo = false;
                        vector[i][0]="N/P";
                    }
                }

        }

        if(vector2[0].equals("")){
            bandera=false;
        }

        if(vector2[1].equals("")){
            bandera=false;
        }


        if (bandera) {
            //Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();
            //onClick(view);
            //interno_siguiente3(view);
            return true;

        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            return false;
        }



    }


    public void eventtext2 (View view){
        System.out.println("eventext2");
            vector[1][0] = "1";
        rb3.setChecked(false);
        rb4.setChecked(false);


        vector[1][1]="Selecione el estado actual:";
        spin2.setVisibility(View.GONE);
        spin2.setSelection(0);

        vector3[1]="";
        et2.setVisibility(View.GONE);
        et2.setText("");

        if(vector[1][0]=="1"){
            System.out.println("cambio");
            vector[1][0]="";
        }
    }

    public void eventtext3 (View view){
        System.out.println("eventext2");
        vector[2][0]="1";
        rb5.setChecked(false);
        rb6.setChecked(false);


        vector[2][1]="Selecione el estado actual:";
        spin3.setVisibility(View.GONE);
        spin3.setSelection(0);

        vector3[2]="";
        et3.setVisibility(View.GONE);
        et3.setText("");

        if(vector[2][0]=="1"){
            System.out.println("cambio");
            vector[2][0]="";
        }
    }

    public void eventtext4 (View view){
        System.out.println("eventext2");
        vector[3][0]="1";
        rb7.setChecked(false);
        rb8.setChecked(false);


        vector[3][1]="Selecione el estado actual:";
        spin4.setVisibility(View.GONE);
        spin4.setSelection(0);

        vector3[3]="";
        et4.setVisibility(View.GONE);
        et4.setText("");

        if(vector[3][0]=="1"){
            System.out.println("cambio");
            vector[3][0]="";
        }
    }

    public void eventtext5 (View view){
        System.out.println("eventext2");
        vector[4][0]="1";
        rb9.setChecked(false);
        rb10.setChecked(false);


        vector[4][1]="Selecione el estado actual:";
        spin5.setVisibility(View.GONE);
        spin5.setSelection(0);

        vector3[4]="";
        et5.setVisibility(View.GONE);
        et5.setText("");

        if(vector[4][0]=="1"){
            System.out.println("cambio");
            vector[4][0]="";
        }
    }

    public void eventtext7 (View view){
        System.out.println("eventext2");
        vector[6][0]="1";
        rb13.setChecked(false);
        rb14.setChecked(false);


        vector[6][1]="Selecione el estado actual:";
        spin7.setVisibility(View.GONE);
        spin7.setSelection(0);

        vector3[6]="";
        et7.setVisibility(View.GONE);
        et7.setText("");

        if(vector[6][0]=="1"){
            System.out.println("cambio");
            vector[6][0]="";
        }
    }

    public void eventtext8 (View view){
        System.out.println("eventext2");
        vector[7][0]="1";
        rb15.setChecked(false);
        rb16.setChecked(false);


        vector[7][1]="Selecione el estado actual:";
        spin8.setVisibility(View.GONE);
        spin8.setSelection(0);

        vector3[7]="";
        et8.setVisibility(View.GONE);
        et8.setText("");

        if(vector[7][0]=="1"){
            System.out.println("cambio");
            vector[7][0]="";
        }
    }

    public void eventtext9 (View view){
        System.out.println("eventext2");
        vector[8][0]="1";
        rb17.setChecked(false);
        rb18.setChecked(false);


        vector[8][1]="Selecione el estado actual:";
        spin9.setVisibility(View.GONE);
        spin9.setSelection(0);

        vector3[8]="";
        et9.setVisibility(View.GONE);
        et9.setText("");

        if(vector[8][0]=="1"){
            System.out.println("cambio");
            vector[8][0]="";
        }
    }

    public void eventtext10 (View view){
        System.out.println("eventext2");
        vector[9][0]="1";
        rb19.setChecked(false);
        rb20.setChecked(false);


        vector[9][1]="Selecione el estado actual:";
        spin10.setVisibility(View.GONE);
        spin10.setSelection(0);

        vector3[9]="";
        et10.setVisibility(View.GONE);
        et10.setText("");

        if(vector[9][0]=="1"){
            System.out.println("cambio");
            vector[9][0]="";
        }
    }


    public void interno_siguiente3 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_instalaciones_3.class);
        startActivity(intent);
    }

    public static String onClick (){

            tablaConcatenacion=

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+

                            "<tr>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"46%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"6%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"6%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"8%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"10%\"></th>" +
                                    "<th style=\"border: inset 0pt\" WIDTH=\"8%\"></th>" +
                                    "<th style=\"border: inset 0pt\" WIDTH=\"16%\"></th>" +
                            "</tr>" +
                            "</thead>"+
                            "<tbody>";

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<th>Descripción de las escaleras de servicio</th>" ;
                        if(vector2[0].equals("SI")){
                            tablaConcatenacion= tablaConcatenacion +
                                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                                    "<td style=\"text-align:center;\">NO</td>" ;
                        }else if(vector2[0].equals("NO")){
                            tablaConcatenacion= tablaConcatenacion +
                                    "<td style=\"text-align:center;\">SI</td>" +
                                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" ;
                        }else{
                            tablaConcatenacion= tablaConcatenacion +
                                    "<td >SI</td>" +
                                    "<td>NO</td>" ;
                        }
                        tablaConcatenacion= tablaConcatenacion +
                                "<td colspan=\"4\"></td>"+
                                "</tr>";

                        tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td rowspan=\"2\" style=\"text-align:center;\" >Descripcion</td>" +
                        "<td rowspan=\"2\" colspan=\"2\" style=\"text-align:center;\" >Respuesta</td>" +
                        "<td colspan=\"3\" style=\"text-align:center;\">Estado actual</td>" +
                        "<td rowspan=\"2\" style=\"text-align:center;\" >Observaciones</td>" +
                        "</tr>" +

                        "<tr>" +
                        "<td style=\"text-align:center;\">Bueno</td>" +
                        "<td style=\"text-align:center;\">Regular</td>" +
                        "<td style=\"text-align:center;\">Malo</td>" +
                        "</tr>";

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Escaleras homogéneas</td>";
                agregarRenglon(vector[0][0], vector[0][1], vector3[0]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con barandal</td>";
                agregarRenglon(vector[1][0], vector[1][1], vector3[1]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con pasamanos</td>";
                agregarRenglon(vector[2][0], vector[2][1], vector3[2]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con cinta antiderrapante</td>";
                agregarRenglon(vector[3][0], vector[3][1], vector3[3]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Iluminación artificial</td>";
                agregarRenglon(vector[4][0], vector[4][1], vector3[4]);


        tablaConcatenacion = tablaConcatenacion +
                "<tr>" +
                "<th>Descripción de las escaleras de servicio</th>" ;
        if(vector2[1].equals("SI")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" ;
        }else if(vector2[1].equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" ;
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td >SI</td>" +
                    "<td>NO</td>" ;
        }
        tablaConcatenacion= tablaConcatenacion +
                "<td colspan=\"4\"></td>"+
                "</tr>";

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td rowspan=\"2\" style=\"text-align:center;\">Descripcion</td>" +
                    "<td rowspan=\"2\" colspan=\"2\" style=\"text-align:center;\">Respuesta</td>" +
                    "<td colspan=\"3\" style=\"text-align:center;\">Estado actual</td>" +
                    "<td rowspan=\"2\" style=\"text-align:center;\" >Observaciones</td>" +
                    "</tr>" +

                    "<tr>" +
                    "<td style=\"text-align:center;\">Bueno</td>" +
                    "<td style=\"text-align:center;\">Regular</td>" +
                    "<td style=\"text-align:center;\">Malo</td>" +
                    "</tr>" +

                    "<tr>" +
                    "<td>Escaleras homogéneas</td>";
            agregarRenglon(vector[5][0], vector[5][1], vector3[5]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con barandal</td>";
            agregarRenglon(vector[6][0], vector[6][1], vector3[6]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con pasamanos</td>";
            agregarRenglon(vector[7][0], vector[7][1], vector3[7]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con cinta antiderrapante</td>";
            agregarRenglon(vector[8][0], vector[8][1], vector3[8]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Iluminación artificial</td>";
            agregarRenglon(vector[9][0], vector[9][1], vector3[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>";
        return tablaConcatenacion;

    }
    public static void agregarRenglon(String decision, String estado, String observaciones) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" ;
        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" ;
        }else if(decision.equals("N/P")){
            tablaConcatenacion= tablaConcatenacion +
            "<td colspan=\"2\" style=\"text-align:center; background-color:Yellow;\">No aplica</td>" ;
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td></td>"+
                    "<td></td>";
        }

        if (estado.equals("BUENO") && decision.equals("SI")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">X</td>"+
                    "<td></td>"+
                    "<td></td>";
        } else if(estado.equals("REGULAR") && decision.equals("SI")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td></td>"+
                    "<td style=\"text-align:center;\">X</td>"+
                    "<td></td>";
        } else if(estado.equals("MALO") && decision.equals("SI")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td></td>"+
                    "<td></td>"+
                    "<td style=\"text-align:center;\">X</td>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td></td>"+
                    "<td></td>"+
                    "<td></td>"+
                    "<td></td>"+
                    "</tr>";
        }

        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td >"+observaciones+"</td>" +
                    "</tr>";
        }

    }

}
