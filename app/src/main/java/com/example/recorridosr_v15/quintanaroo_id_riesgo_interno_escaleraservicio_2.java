package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
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
    static String vector[][] = {{"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}};
    static String vector2[] = {"", ""};
    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_escaleraservicio_2);

        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


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
                spin1.setVisibility(View.VISIBLE);
            } else if (vector[0][0].equals("NO")) {
                rb1.setChecked(false);
                rb2.setChecked(true);
            }

            if (vector[1][0].equals("SI")) {
                rb3.setChecked(true);
                rb4.setChecked(false);
                spin2.setVisibility(View.VISIBLE);
            } else if (vector[1][0].equals("NO")) {
                rb3.setChecked(false);
                rb4.setChecked(true);
            }

            if (vector[2][0].equals("SI")) {
                rb5.setChecked(true);
                rb6.setChecked(false);
                spin3.setVisibility(View.VISIBLE);
            } else if (vector[2][0].equals("NO")) {
                rb5.setChecked(false);
                rb6.setChecked(true);
            }

            if (vector[3][0].equals("SI")) {
                rb7.setChecked(true);
                rb8.setChecked(false);
                spin4.setVisibility(View.VISIBLE);
            } else if (vector[3][0].equals("NO")) {
                rb7.setChecked(false);
                rb8.setChecked(true);
            }

            if (vector[4][0].equals("SI")) {
                rb9.setChecked(true);
                rb10.setChecked(false);
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
                spin6.setVisibility(View.VISIBLE);
            } else if (vector[5][0].equals("NO")) {
                rb11.setChecked(false);
                rb12.setChecked(true);
            }

            if (vector[6][0].equals("SI")) {
                rb13.setChecked(true);
                rb14.setChecked(false);
                spin7.setVisibility(View.VISIBLE);
            } else if (vector[6][0].equals("NO")) {
                rb13.setChecked(false);
                rb14.setChecked(true);
            }

            if (vector[7][0].equals("SI")) {
                rb15.setChecked(true);
                rb16.setChecked(false);
                spin8.setVisibility(View.VISIBLE);
            } else if (vector[7][0].equals("NO")) {
                rb15.setChecked(false);
                rb16.setChecked(true);
            }

            if (vector[8][0].equals("SI")) {
                rb17.setChecked(true);
                rb18.setChecked(false);
                spin9.setVisibility(View.VISIBLE);
            } else if (vector[8][0].equals("NO")) {
                rb17.setChecked(false);
                rb18.setChecked(true);
            }

            if (vector[9][0].equals("SI")) {
                rb19.setChecked(true);
                rb20.setChecked(false);
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


                    if (vector[0][0].equals("SI")) {
                        //rb1.setChecked(true);
                        rb1.setChecked(true);
                        rb2.setChecked(false);
                        spin1.setVisibility(View.VISIBLE);
                    } else if (vector[0][0].equals("NO")) {
                        System.out.println("cambio 1");
                        rb1.setChecked(false);
                        rb2.setChecked(true);
                    }

                    if (vector[1][0].equals("SI")) {
                        rb3.setChecked(true);
                        rb4.setChecked(false);
                        spin2.setVisibility(View.VISIBLE);
                    } else if (vector[1][0].equals("NO")) {
                        rb3.setChecked(false);
                        rb4.setChecked(true);
                    }

                    if (vector[2][0].equals("SI")) {
                        rb5.setChecked(true);
                        rb6.setChecked(false);
                        spin3.setVisibility(View.VISIBLE);
                    } else if (vector[2][0].equals("NO")) {
                        rb5.setChecked(false);
                        rb6.setChecked(true);
                    }

                    if (vector[3][0].equals("SI")) {
                        rb7.setChecked(true);
                        rb8.setChecked(false);
                        spin4.setVisibility(View.VISIBLE);
                    } else if (vector[3][0].equals("NO")) {
                        rb7.setChecked(false);
                        rb8.setChecked(true);
                    }

                    if (vector[4][0].equals("SI")) {
                        rb9.setChecked(true);
                        rb10.setChecked(false);
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


                }

            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb1){
                    //System.out.println("entre 1");
                    rb1.setChecked(true);
                    vector[0][0]="SI";
                    spin1.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb2) {
                    rb2.setChecked(true);
                    System.out.println("entre 2");
                    vector[0][0]="NO";
                    spin1.setVisibility(View.GONE);
                }else{
                    System.out.println("no entre");
                    vector[0][0]="";
                }
                }else{
                    System.out.println("cambio 3");
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb3){
                    rb3.setChecked(true);
                    vector[1][0]="SI";
                    spin2.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb4) {
                    rb4.setChecked(true);
                    vector[1][0]="NO";
                    spin2.setVisibility(View.GONE);


                }else{
                    vector[0][0]="";
                }
            }else{
                ((RadioButton) findViewById(R.id.rb3)).setChecked(false);
                ((RadioButton) findViewById(R.id.rb4)).setChecked(false);
            }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb5){
                    rb5.setChecked(true);
                    vector[2][0]="SI";
                    spin3.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb6) {
                    rb6.setChecked(true);
                    vector[2][0]="NO";
                    spin3.setVisibility(View.GONE);


                }else{
                    vector[0][0]="";
                }
            }else{
                ((RadioButton) findViewById(R.id.rb5)).setChecked(false);
                ((RadioButton) findViewById(R.id.rb6)).setChecked(false);
            }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb7){
                    rb7.setChecked(true);
                    vector[3][0]="SI";
                    spin4.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb8) {
                    rb8.setChecked(true);
                    vector[3][0]="NO";
                    spin4.setVisibility(View.GONE);
                }else{
                    vector[0][0]="";
                }
                }else{
                    ((RadioButton) findViewById(R.id.rb7)).setChecked(false);
                    ((RadioButton) findViewById(R.id.rb8)).setChecked(false);
                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (vector2[0].equals("SI")){
                if(checkedId==R.id.rb9){
                    rb9.setChecked(true);
                    vector[4][0]="SI";
                    spin5.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {
                    rb10.setChecked(true);
                    vector[4][0]="NO";
                    spin5.setVisibility(View.GONE);

                }else{
                    vector[0][0]="";
                }
            }else{
                ((RadioButton) findViewById(R.id.rb9)).setChecked(false);
                ((RadioButton) findViewById(R.id.rb10)).setChecked(false);
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

                    if (vector[5][0].equals("SI")) {
                        rb11.setChecked(true);
                        rb12.setChecked(false);
                        spin6.setVisibility(View.VISIBLE);
                    } else if (vector[5][0].equals("NO")) {
                        rb11.setChecked(false);
                        rb12.setChecked(true);
                    }

                    if (vector[6][0].equals("SI")) {
                        rb13.setChecked(true);
                        rb14.setChecked(false);
                        spin7.setVisibility(View.VISIBLE);
                    } else if (vector[6][0].equals("NO")) {
                        rb13.setChecked(false);
                        rb14.setChecked(true);
                    }

                    if (vector[7][0].equals("SI")) {
                        rb15.setChecked(true);
                        rb16.setChecked(false);
                        spin8.setVisibility(View.VISIBLE);
                    } else if (vector[7][0].equals("NO")) {
                        rb15.setChecked(false);
                        rb16.setChecked(true);
                    }

                    if (vector[8][0].equals("SI")) {
                        rb17.setChecked(true);
                        rb18.setChecked(false);
                        spin9.setVisibility(View.VISIBLE);
                    } else if (vector[8][0].equals("NO")) {
                        rb17.setChecked(false);
                        rb18.setChecked(true);
                    }

                    if (vector[9][0].equals("SI")) {
                        rb19.setChecked(true);
                        rb20.setChecked(false);
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

                }else if(checkedId==R.id.rb12) {
                    rb12.setChecked(true);
                    vector[5][0]="NO";
                    spin6.setVisibility(View.GONE);

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
                if(checkedId==R.id.rb13){
                    rb13.setChecked(true);
                    vector[6][0]="SI";
                    spin7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {
                    rb14.setChecked(true);
                    vector[6][0]="NO";
                    spin7.setVisibility(View.GONE);

                }else{
                    vector[0][0]="";
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
                if(checkedId==R.id.rb15){
                    rb15.setChecked(true);
                    vector[7][0]="SI";
                    spin8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {
                    rb16.setChecked(true);
                    vector[7][0]="NO";
                    spin8.setVisibility(View.GONE);

                }else{
                    vector[0][0]="";
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
                if(checkedId==R.id.rb17){
                    rb17.setChecked(true);
                    vector[8][0]="SI";
                    spin9.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb18) {
                    rb18.setChecked(true);
                    vector[8][0]="NO";
                    spin9.setVisibility(View.GONE);


                }else{
                    vector[0][0]="";
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
                if(checkedId==R.id.rb19){
                    rb19.setChecked(true);
                    vector[9][0]="SI";
                    spin10.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {
                    rb20.setChecked(true);
                    vector[9][0]="NO";
                    spin10.setVisibility(View.GONE);


                }else{
                    vector[0][0]="";
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
                agregarRenglon(vector[0][0], vector[0][1]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con barandal</td>";
                agregarRenglon(vector[1][0], vector[1][1]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con pasamanos</td>";
                agregarRenglon(vector[2][0], vector[2][1]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Cuenta con cinta antiderrapante</td>";
                agregarRenglon(vector[3][0], vector[3][1]);

                tablaConcatenacion = tablaConcatenacion +
                        "<tr>" +
                        "<td>Iluminación artificial</td>";
                agregarRenglon(vector[4][0], vector[4][1]);


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
            agregarRenglon(vector[5][0], vector[5][1]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con barandal</td>";
            agregarRenglon(vector[6][0], vector[6][1]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con pasamanos</td>";
            agregarRenglon(vector[7][0], vector[7][1]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Cuenta con cinta antiderrapante</td>";
            agregarRenglon(vector[8][0], vector[8][1]);

            tablaConcatenacion = tablaConcatenacion +
                    "<tr>" +
                    "<td>Iluminación artificial</td>";
            agregarRenglon(vector[9][0], vector[9][1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>";
        return tablaConcatenacion;

    }
    public static void agregarRenglon(String decision, String estado) {
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
                    "<td style=\"text-align:center;\">"+""+"</td>" +
                    "</tr>";
        }

    }

}
