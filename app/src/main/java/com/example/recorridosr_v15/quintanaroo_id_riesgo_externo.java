package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

public class quintanaroo_id_riesgo_externo extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22;

    private RadioButton rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22;
//Edit text para las observaciones
    private EditText  ett1, ett2,  ett3,  ett4,  ett5,  ett6,  ett7,  ett8,  ett9, ett10, ett11, ett12, ett13, ett14, ett15, ett16, ett17, ett18, ett19, ett20, ett21,ett22;

    static String vector[][] ={{"", "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""}, {"",  "",""} };



    String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_externo);

        this.setTitle("Riesgo Externo_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        directorio2 = new File(quintanaroo_id_riesgo.file());
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "prueba1.pdf");
        }

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

        rg13= (RadioGroup) findViewById(R.id.Rg13);
        rb25 = (RadioButton) findViewById(R.id.rb25);
        rb26 = (RadioButton) findViewById(R.id.rb26);

        rg14= (RadioGroup) findViewById(R.id.Rg14);
        rb27 = (RadioButton) findViewById(R.id.rb27);
        rb28 = (RadioButton) findViewById(R.id.rb28);

        rg15= (RadioGroup) findViewById(R.id.Rg15);
        rb29 = (RadioButton) findViewById(R.id.rb29);
        rb30 = (RadioButton) findViewById(R.id.rb30);

        rg16= (RadioGroup) findViewById(R.id.Rg16);
        rb31 = (RadioButton) findViewById(R.id.rb31);
        rb32 = (RadioButton) findViewById(R.id.rb32);

        rg17= (RadioGroup) findViewById(R.id.Rg17);
        rb33 = (RadioButton) findViewById(R.id.rb33);
        rb34 = (RadioButton) findViewById(R.id.rb34);

        rg18= (RadioGroup) findViewById(R.id.Rg18);
        rb35 = (RadioButton) findViewById(R.id.rb35);
        rb36 = (RadioButton) findViewById(R.id.rb36);

        rg19= (RadioGroup) findViewById(R.id.Rg19);
        rb37 = (RadioButton) findViewById(R.id.rb37);
        rb38 = (RadioButton) findViewById(R.id.rb38);

        rg20= (RadioGroup) findViewById(R.id.Rg20);
        rb39 = (RadioButton) findViewById(R.id.rb39);
        rb40 = (RadioButton) findViewById(R.id.rb40);

        rg21= (RadioGroup) findViewById(R.id.Rg21);
        rb41 = (RadioButton) findViewById(R.id.rb41);
        rb42 = (RadioButton) findViewById(R.id.rb42);

        rg22= (RadioGroup) findViewById(R.id.Rg22);
        rb43 = (RadioButton) findViewById(R.id.rb43);
        rb44 = (RadioButton) findViewById(R.id.rb44);



        //asigna los edit text a los et de aqui Rg 39
        et1 = (EditText) findViewById(R.id.editText1);
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


        //asigna los edit text a los ett de aqui de observaciones
        ett1 = (EditText) findViewById(R.id.et1);
        ett2 = (EditText) findViewById(R.id.et2);
        ett3 = (EditText) findViewById(R.id.et3);
        ett4 = (EditText) findViewById(R.id.et4);
        ett5  = (EditText) findViewById(R.id.et5);
        ett6  = (EditText) findViewById(R.id.et6);
        ett7  = (EditText) findViewById(R.id.et7);
        ett8  = (EditText) findViewById(R.id.et8);
        ett9  = (EditText) findViewById(R.id.et9);
        ett10 = (EditText) findViewById(R.id.et10);
        ett11 = (EditText) findViewById(R.id.et11);
        ett12 = (EditText) findViewById(R.id.et12);
        ett13 = (EditText) findViewById(R.id.et13);
        ett14 = (EditText) findViewById(R.id.et14);
        ett15 = (EditText) findViewById(R.id.et15);
        ett16 = (EditText) findViewById(R.id.et16);
        ett17 = (EditText) findViewById(R.id.et17);
        ett18 = (EditText) findViewById(R.id.et18);
        ett19 = (EditText) findViewById(R.id.et19);
        ett20 = (EditText) findViewById(R.id.et20);
        ett21 = (EditText) findViewById(R.id.et21);
        ett22 = (EditText) findViewById(R.id.et22);




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

        //Ocultar EditText para las observaciones
        ett1.setVisibility(View.GONE);
        ett2.setVisibility(View.GONE);
        ett3.setVisibility(View.GONE);
        ett4.setVisibility(View.GONE);
        ett5.setVisibility(View.GONE);
        ett6.setVisibility(View.GONE);
        ett7.setVisibility(View.GONE);
        ett8.setVisibility(View.GONE);
        ett9.setVisibility(View.GONE);
        ett10.setVisibility(View.GONE);
        ett11.setVisibility(View.GONE);
        ett12.setVisibility(View.GONE);
        ett13.setVisibility(View.GONE);
        ett14.setVisibility(View.GONE);
        ett15.setVisibility(View.GONE);
        ett16.setVisibility(View.GONE);
        ett17.setVisibility(View.GONE);
        ett18.setVisibility(View.GONE);
        ett19.setVisibility(View.GONE);
        ett20.setVisibility(View.GONE);
        ett21.setVisibility(View.GONE);
        ett22.setVisibility(View.GONE);


        //entra la segunda vez para pintar como se quedaron los radiobuttons



        if (vector[0][0].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
            et1.setVisibility(View.VISIBLE);
            ett1.setVisibility(View.VISIBLE);
        } else if (vector[0][0].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[1][0].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
            et2.setVisibility(View.VISIBLE);
            ett2.setVisibility(View.VISIBLE);
        } else if (vector[1][0].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }



        if (vector[2][0].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
            et3.setVisibility(View.VISIBLE);
            ett3.setVisibility(View.VISIBLE);
        } else if (vector[2][0].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[3][0].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
            et4.setVisibility(View.VISIBLE);
            ett4.setVisibility(View.VISIBLE);
        } else if (vector[3][0].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[4][0].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
            et5.setVisibility(View.VISIBLE);
            ett5.setVisibility(View.VISIBLE);
        } else if (vector[4][0].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }


        if (vector[5][0].equals("SI")) {
            rb11.setChecked(true);
            rb12.setChecked(false);
            et6.setVisibility(View.VISIBLE);
            ett6.setVisibility(View.VISIBLE);
        } else if (vector[5][0].equals("NO")) {
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if (vector[6][0].equals("SI")) {
            rb13.setChecked(true);
            rb14.setChecked(false);
            et7.setVisibility(View.VISIBLE);
            ett7.setVisibility(View.VISIBLE);
        } else if (vector[6][0].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[7][0].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
            et8.setVisibility(View.VISIBLE);
            ett8.setVisibility(View.VISIBLE);
        } else if (vector[7][0].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[8][0].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
            et9.setVisibility(View.VISIBLE);
            ett9.setVisibility(View.VISIBLE);
        } else if (vector[8][0].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[9][0].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
            et10.setVisibility(View.VISIBLE);
            ett10.setVisibility(View.VISIBLE);
        } else if (vector[9][0].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[10][0].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et11.setVisibility(View.VISIBLE);
            ett11.setVisibility(View.VISIBLE);
        } else if (vector[10][0].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[11][0].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et12.setVisibility(View.VISIBLE);
            ett12.setVisibility(View.VISIBLE);
        } else if (vector[11][0].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[12][0].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et13.setVisibility(View.VISIBLE);
            ett13.setVisibility(View.VISIBLE);
        } else if (vector[12][0].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[13][0].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et14.setVisibility(View.VISIBLE);
            ett14.setVisibility(View.VISIBLE);
        } else if (vector[13][0].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[14][0].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et15.setVisibility(View.VISIBLE);
            ett15.setVisibility(View.VISIBLE);
        } else if (vector[14][0].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }

        if (vector[15][0].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et16.setVisibility(View.VISIBLE);
            ett16.setVisibility(View.VISIBLE);
        } else if (vector[15][0].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector[16][0].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et17.setVisibility(View.VISIBLE);
            ett17.setVisibility(View.VISIBLE);
        } else if (vector[16][0].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }

        if (vector[17][0].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et18.setVisibility(View.VISIBLE);
            ett18.setVisibility(View.VISIBLE);
        } else if (vector[17][0].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector[18][0].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et19.setVisibility(View.VISIBLE);
            ett19.setVisibility(View.VISIBLE);
        } else if (vector[18][0].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }

        if (vector[19][0].equals("SI")) {
            rb39.setChecked(true);
            rb40.setChecked(false);
            et20.setVisibility(View.VISIBLE);
            ett20.setVisibility(View.VISIBLE);
        } else if (vector[19][0].equals("NO")) {
            rb39.setChecked(false);
            rb40.setChecked(true);
        }

        if (vector[20][0].equals("SI")) {
            rb41.setChecked(true);
            rb42.setChecked(false);
            et21.setVisibility(View.VISIBLE);
            ett21.setVisibility(View.VISIBLE);
        } else if (vector[20][0].equals("NO")) {
            rb41.setChecked(false);
            rb42.setChecked(true);
        }

        if (vector[21][0].equals("SI")) {
            rb43.setChecked(true);
            rb44.setChecked(false);
            et22.setVisibility(View.VISIBLE);
            ett22.setVisibility(View.VISIBLE);
        } else if (vector[21][0].equals("NO")) {
            rb43.setChecked(false);
            rb44.setChecked(true);
        }


        //Verifica que las posiciones no esten vacias o nullas y devuelve lo que el usuario habia escrito
        if(!vector[0][1].equals("") && vector[0][1] != null){
            et1.setText(vector[0][0]);
        }
        if(!vector[1][1].equals("") && vector[1][1] != null){
            et2.setText(vector[1][1]);
        }
        if(!vector[2][1].equals("") && vector[2][1] != null){
            et3.setText(vector[2][1]);
        }
        if(!vector[3][1].equals("") && vector[3][1] != null){
            et4.setText(vector[3][1]);
        }
        if(!vector[4][1].equals("") && vector[4][1] != null){
            et5.setText(vector[4][1]);
        }
        if(!vector[5][1].equals("") && vector[5][1] != null){
            et6.setText(vector[5][1]);
        }
        if(!vector[6][1].equals("") && vector[6][1] != null){
            et7.setText(vector[6][1]);
        }
        if(!vector[7][1].equals("") && vector[7][1] != null){
            et8.setText(vector[7][1]);
        }
        if(!vector[8][1].equals("") && vector[8][1] != null){
            et9.setText(vector[8][1]);
        }
        if(!vector[9][1].equals("") && vector[9][1] != null){
            et10.setText(vector[9][1]);
        }
        if(!vector[10][1].equals("") && vector[10][1] != null){
            et11.setText(vector[10][1]);
        }

        if(!vector[11][1].equals("") && vector[11][1] != null){
            et12.setText(vector[11][1]);
        }
        if(!vector[12][1].equals("") && vector[12][1] != null){
            et13.setText(vector[12][1]);
        }
        if(!vector[13][1].equals("") && vector[13][1] != null){
            et14.setText(vector[13][1]);
        }
        if(!vector[14][1].equals("") && vector[14][1] != null){
            et15.setText(vector[14][1]);
        }
        if(!vector[15][1].equals("") && vector[15][1] != null){
            et16.setText(vector[15][1]);
        }
        if(!vector[16][1].equals("") && vector[16][1] != null){
            et17.setText(vector[17][1]);
        }
        if(!vector[17][1].equals("") && vector[17][1] != null){
            et18.setText(vector[17][1]);
        }
        if(!vector[18][1].equals("") && vector[18][1] != null){
            et19.setText(vector[18][1]);
        }
        if(!vector[19][1].equals("") && vector[19][1] != null){
            et20.setText(vector[19][1]);
        }
        if(!vector[20][1].equals("") && vector[20][1] != null){
            et21.setText(vector[20][1]);
        }
        if(!vector[21][1].equals("") && vector[21][1] != null){
            et22.setText(vector[21][1]);
        }



        //Verifica que los escuchadores de las observaciones hayan guardado los datos para rescatarlos y pintarlos de nuevo
        if(!vector[0][2].equals("") && vector[0][2] != null){
            ett1.setText(vector[0][2]);
        }
        if(!vector[1][2].equals("") && vector[1][2] != null){
            ett2.setText(vector[1][2]);
        }
        if(!vector[2][2].equals("") && vector[2][2] != null){
            ett3.setText(vector[2][2]);
        }



        if(!vector[3][2].equals("") && vector[3][2] != null){
            ett4.setText(vector[3][2]);
        }
        if(!vector[4][2].equals("") && vector[4][2] != null){
            ett5.setText(vector[4][2]);
        }
        if(!vector[5][2].equals("") && vector[5][2] != null){
            ett6.setText(vector[5][2]);
        }
        if(!vector[6][2].equals("") && vector[6][2] != null){
            ett7.setText(vector[6][2]);
        }
        if(!vector[7][2].equals("") && vector[7][2] != null){
            ett8.setText(vector[7][2]);
        }
        if(!vector[8][2].equals("") && vector[8][2] != null){
            ett9.setText(vector[8][2]);
        }
        if(!vector[9][2].equals("") && vector[9][2] != null){
            ett10.setText(vector[9][2]);
        }
        if(!vector[10][2].equals("") && vector[10][2] != null){
            ett11.setText(vector[10][2]);
        }

        if(!vector[11][2].equals("") && vector[11][2] != null){
            ett12.setText(vector[11][2]);
        }
        if(!vector[12][2].equals("") && vector[12][2] != null){
            ett13.setText(vector[12][2]);
        }
        if(!vector[13][2].equals("") && vector[13][2] != null){
            ett14.setText(vector[13][2]);
        }
        if(!vector[14][2].equals("") && vector[14][2] != null){
            ett15.setText(vector[14][2]);
        }
        if(!vector[15][2].equals("") && vector[15][2] != null){
            ett16.setText(vector[15][2]);
        }
        if(!vector[16][2].equals("") && vector[16][2] != null){
            ett17.setText(vector[17][2]);
        }
        if(!vector[17][2].equals("") && vector[17][2] != null){
            ett18.setText(vector[17][2]);
        }
        if(!vector[18][2].equals("") && vector[18][2] != null){
            ett19.setText(vector[18][2]);
        }
        if(!vector[19][2].equals("") && vector[19][2] != null){
            ett20.setText(vector[19][2]);
        }
        if(!vector[20][2].equals("") && vector[20][2] != null){
            ett21.setText(vector[20][2]);
        }
        if(!vector[21][2].equals("") && vector[21][2] != null){
            ett22.setText(vector[21][2]);
        }



        /// Guarda lo que los usuarios introducen al momento de empezar a escribir en el vector correspondiente a la primera posicion d distancia


        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0] [1] = et1.getText().toString();

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
                vector[1] [1] = et2.getText().toString();

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
                vector[2] [1] = et3.getText().toString();

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
                vector[3] [1] = et4.getText().toString();

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
                vector[4] [1] = et5.getText().toString();

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
                vector[5] [1] = et6.getText().toString();

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
                vector[6] [1] = et7.getText().toString();

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
                vector[7] [1] = et8.getText().toString();

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
                vector[8] [1] = et9.getText().toString();

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
                vector[9] [1] = et10.getText().toString();

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
                vector[10][1] = et11.getText().toString();

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
                vector[11][1] = et12.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12][1] = et13.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13][1] = et14.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[14][1] = et15.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[15][1] = et16.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[16][1] = et17.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[17][1] = et18.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[18][1] = et19.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[19][1] = et20.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[20][1] = et21.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[21][1] = et22.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });



        //Escuchadores para observaciones

        ett1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0] [2] = ett1.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[1] [2] = ett2.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[2] [2] = ett3.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[3] [2] = ett4.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[4] [2] = ett5.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[5] [2] = ett6.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[6] [2] = ett7.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[7] [2] = ett8.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[8] [2] = ett9.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9] [2] = ett10.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10][2] = ett11.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[11][2] = ett12.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12][2] = ett13.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13][2] = ett14.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[14][2] = ett15.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[15][2] = ett16.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[16][2] = ett17.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[17][2] = ett18.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[18][2] = ett19.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[19][2] = ett20.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[20][2] = ett21.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        ett22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[21][2] = ett22.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });











        //Verificacion de los radiobutton


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){

                    vector[0][0]="SI";
                    et1.setVisibility(View.VISIBLE);
                    ett1.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb2) {
                    vector[0][0]="NO";
                    et1.setVisibility(View.GONE);
                    ett1.setVisibility(View.GONE);



                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){

                    vector[1][0]="SI";
                    et2.setVisibility(View.VISIBLE);
                    ett2.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb4) {

                    vector[1][0]="NO";
                    et2.setVisibility(View.GONE);
                    ett2.setVisibility(View.GONE);



                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2][0]="SI";
                    et3.setVisibility(View.VISIBLE);
                    ett3.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb6) {

                    vector[2][0]="NO";
                    et3.setVisibility(View.GONE);
                    ett3.setVisibility(View.GONE);


                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3][0]="SI";
                    et4.setVisibility(View.VISIBLE);
                    ett4.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb8) {

                    vector[3][0]="NO";
                    et4.setVisibility(View.GONE);
                    ett4.setVisibility(View.GONE);


                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){

                    vector[4][0]="SI";
                    et5.setVisibility(View.VISIBLE);
                    ett5.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {

                    vector[4][0]="NO";
                    et5.setVisibility(View.GONE);
                    ett5.setVisibility(View.GONE);



                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5][0]="SI";
                    et6.setVisibility(View.VISIBLE);
                    ett6.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb12) {

                    vector[5][0]="NO";
                    et6.setVisibility(View.GONE);
                    ett6.setVisibility(View.GONE);


                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6][0]="SI";
                    et7.setVisibility(View.VISIBLE);
                    ett7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {

                    vector[6][0]="NO";
                    et7.setVisibility(View.GONE);
                    ett7.setVisibility(View.GONE);


                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7][0]="SI";
                    et8.setVisibility(View.VISIBLE);
                    ett8.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb16) {

                    vector[7][0]="NO";
                    et8.setVisibility(View.GONE);
                    ett8.setVisibility(View.GONE);


                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8][0]="SI";
                    et9.setVisibility(View.VISIBLE);
                    ett9.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb18) {

                    vector[8][0]="NO";
                    et9.setVisibility(View.GONE);
                    ett9.setVisibility(View.GONE);



                }

            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9][0]="SI";
                    et10.setVisibility(View.VISIBLE);
                    ett10.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {
                    vector[9][0]="NO";
                    et10.setVisibility(View.GONE);
                    ett10.setVisibility(View.GONE);



                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[10][0]="SI";
                    et11.setVisibility(View.VISIBLE);
                    ett11.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb22) {

                    vector[10][0]="NO";
                    et11.setVisibility(View.GONE);
                    ett11.setVisibility(View.GONE);


                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[11][0]="SI";
                    et12.setVisibility(View.VISIBLE);
                    ett12.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb24) {

                    vector[11][0]="NO";
                    et12.setVisibility(View.GONE);
                    ett12.setVisibility(View.GONE);


                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[12][0]="SI";
                    et13.setVisibility(View.VISIBLE);
                    ett13.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb26) {

                    vector[12][0]="NO";
                    et13.setVisibility(View.GONE);
                    ett13.setVisibility(View.GONE);

                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[13][0]="SI";
                    et14.setVisibility(View.VISIBLE);
                    ett14.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb28) {

                    vector[13][0]="NO";
                    et14.setVisibility(View.GONE);
                    ett14.setVisibility(View.GONE);


                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[14][0]="SI";
                    et15.setVisibility(View.VISIBLE);
                    ett15.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb30) {

                    vector[14][0]="NO";
                    et15.setVisibility(View.GONE);
                    ett15.setVisibility(View.GONE);


                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[15][0]="SI";
                    et16.setVisibility(View.VISIBLE);
                    ett16.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb32) {

                    vector[15][0]="NO";
                    et16.setVisibility(View.GONE);
                    ett16.setVisibility(View.GONE);



                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector[16][0]="SI";
                    et17.setVisibility(View.VISIBLE);
                    ett17.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb34) {

                    vector[16][0]="NO";
                    et17.setVisibility(View.GONE);
                    ett17.setVisibility(View.GONE);


                }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector[17][0]="SI";
                    et18.setVisibility(View.VISIBLE);
                    ett18.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb36) {

                    vector[17][0]="NO";
                    et18.setVisibility(View.GONE);
                    ett18.setVisibility(View.GONE);


                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[18][0]="SI";
                    et19.setVisibility(View.VISIBLE);
                    ett19.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb38) {

                    vector[18][0]="NO";
                    et19.setVisibility(View.GONE);
                    ett19.setVisibility(View.GONE);

                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb39){

                    vector[19][0]="SI";
                    et20.setVisibility(View.VISIBLE);
                    ett20.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb40) {

                    vector[19][0]="NO";
                    et20.setVisibility(View.GONE);
                    ett20.setVisibility(View.GONE);



                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb41){

                    vector[20][0]="SI";
                    et21.setVisibility(View.VISIBLE);
                    ett21.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb42) {

                    vector[20][0]="NO";
                    et21.setVisibility(View.GONE);
                    ett21.setVisibility(View.GONE);

                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb43){

                    vector[21][0]="SI";
                    et22.setVisibility(View.VISIBLE);
                    ett22.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb44) {

                    vector[21][0]="NO";
                    et22.setVisibility(View.GONE);
                    ett22.setVisibility(View.GONE);

                }

            }
        });




    }



    public void externosiguiente1(View view) {
        Boolean bandera = true;


        for(int i=0;i<22; i++  ){
            if( vector[i][0].equals("")){
                bandera= false;
            }
        }




        //Verificar si los editText contienen algo sino no los deja enviar
        if (et1.getVisibility() == View.VISIBLE) {
            if(vector[0][1].equals("")){
                bandera= false;
            }
        }


        if (et2.getVisibility() == View.VISIBLE) {
            if(vector[1][1].equals("")){
                bandera= false;
            }
        }

        if (et3.getVisibility() == View.VISIBLE) {
            if(vector[2][1].equals("")){
                bandera= false;
            }
        }

        if (et4.getVisibility() == View.VISIBLE) {
            if(vector[3][1].equals("")){
                bandera= false;
            }
        }

        if (et5.getVisibility() == View.VISIBLE) {
            if(vector[4][1].equals("")){
                bandera= false;
            }
        }



        if (et6.getVisibility() == View.VISIBLE) {
            if(vector[5][1].equals("")){
                bandera= false;
            }
        }

        if (et7.getVisibility() == View.VISIBLE) {
            if(vector[6][1].equals("")){
                bandera= false;
            }
        }

        if (et8.getVisibility() == View.VISIBLE) {
            if(vector[7][1].equals("")){
                bandera= false;
            }
        }

        if (et9.getVisibility() == View.VISIBLE) {
            if(vector[8][1].equals("")){
                bandera= false;
            }
        }

        if (et10.getVisibility() == View.VISIBLE) {
            if(vector[9][1].equals("")){
                bandera= false;
            }
        }

        if (et11.getVisibility() == View.VISIBLE) {
            if(vector[10][1].equals("")){
                bandera= false;
            }
        }

        if (et12.getVisibility() == View.VISIBLE) {
            if(vector[11][1].equals("")){
                bandera= false;
            }
        }

        if (et13.getVisibility() == View.VISIBLE) {
            if(vector[12][1].equals("")){
                bandera= false;
            }
        }

        if (et14.getVisibility() == View.VISIBLE) {
            if(vector[13][1].equals("")){
                bandera= false;
            }
        }

        if (et15.getVisibility() == View.VISIBLE) {
            if(vector[14][1].equals("")){
                bandera= false;
            }
        }

        if (et16.getVisibility() == View.VISIBLE) {
            if(vector[15][1].equals("")){
                bandera= false;
            }
        }

        if (et17.getVisibility() == View.VISIBLE) {
            if(vector[16][1].equals("")){
                bandera= false;
            }
        }

        if (et18.getVisibility() == View.VISIBLE) {
            if(vector[17][1].equals("")){
                bandera= false;
            }
        }

        if (et19.getVisibility() == View.VISIBLE) {
            if(vector[18][1].equals("")){
                bandera= false;
            }
        }

        if (et20.getVisibility() == View.VISIBLE) {
            if(vector[19][1].equals("")){
                bandera= false;
            }
        }


        if (et21.getVisibility() == View.VISIBLE) {
            if(vector[20][1].equals("")){
                bandera= false;
            }
        }


        if (et22.getVisibility() == View.VISIBLE) {
            if(vector[21][1].equals("")){
                bandera= false;
            }
        }






        if (bandera) {

            //onClick(view);
          //  externo1(view);
            Toast.makeText(this, "Listo vamos al siguiente 1", LENGTH_SHORT).show();



        } else {
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }


    }



    public void externo1 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_1.class);
        startActivity(intent);
    }

    public void onClick (View view){
        try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();

        tablaConcatenacion=
                "<html>" + "<body>" +

                        "<TABLE border=\"1\" WIDTH=\"100%\">"+
                        "<thead>"+
                        "<tr>"+
                        "<th colspan=\"5\" style=\"text-align:center;\">RIESGOS EXTERNOS</th>"+

                        "</tr>"+
                        "<tr>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"13%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"35%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"10%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"10%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"32%\"></th>" +
                        "</tr>" +
                        "</thead>"+
                        "<tbody>"+

                        "<tr>"+
                        "<td colspan=\"5\" >Planos de localización: \n" +
                        "Trazar el plano del entorno del inmueble donde, además de ubicar la instalación objeto de estudio, se indicará la siguiente:\n" +
                        "La presentación se entregara de acuerdo al PLANO P3.\n </td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td>PLANO P3.</td>"+
                        "<td colspan=\"4\">Ubicación del inmueble, indicando sus colindancias, los usos del suelo en un radio de 500 m; las vialidades, vías de acceso y otros predios circundantes, rasgos geográficos predominantes (lagunas, humedales, etc.), rasgos sociales importantes aledaños (escuelas, hospitales, gasolineras, mercados), Áreas Naturales Protegidas, Ordenamientos Ecológicos, Planes Directores y otros  agentes perturbadores de origen natural o humano que signifiquen riesgo para el inmueble y su población señalando claramente los distanciamientos a las mismas.</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"5\">IDENTIFICACIÓN DE RIESGOS EN EL ENTORNO INMEDIATO</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"5\">Se identificará la presencia de elementos de riesgo en el entorno inmediato (500 metros) del inmueble:</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"4\">Elementos a evaluar</td>"+
                        "<td colspan=\"1\">Distancia aproximada</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"2\">Tanques elevados</td>";
                        agregarRenglon(vector[0][0],vector[0][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Postes de energía eléctrica en mal estado</td>";
            agregarRenglon(vector[1][0],vector[1][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Torres con líneas de alta tensión</td>";
            agregarRenglon(vector[2][0],vector[2][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Transformadores de energía eléctrica</td>";
            agregarRenglon(vector[3][0],vector[3][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Inmuebles aledaños dañados</td>";
            agregarRenglon(vector[4][0],vector[4][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Banquetas desniveladas</td>";
            agregarRenglon(vector[5][0],vector[5][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Alcantarillas abiertas</td>";
            agregarRenglon(vector[6][0],vector[6][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Árboles grandes que puedan caer</td>";
            agregarRenglon(vector[7][0],vector[7][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Calles muy transitadas</td>";
            agregarRenglon(vector[8][0],vector[8][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Fábricas con instalaciones de Gas L.P.</td>";
            agregarRenglon(vector[9][0],vector[9][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Tanques de gas L.P.</td>";
            agregarRenglon(vector[10][0],vector[10][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Gasolineras y/o Gaseras</td>";
            agregarRenglon(vector[11][0],vector[11][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Anuncios volados  o espectaculares</td>";
            agregarRenglon(vector[12][0],vector[12][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Almacenes de sustancias peligrosas</td>";
            agregarRenglon(vector[13][0],vector[13][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Fábricas</td>";
            agregarRenglon(vector[14][0],vector[14][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Planta de PEMEX</td>";
            agregarRenglon(vector[15][0],vector[15][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Basureros</td>";
            agregarRenglon(vector[16][0],vector[16][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Vías del ferrocarril</td>";
            agregarRenglon(vector[17][0],vector[17][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Ríos y laderas</td>";
            agregarRenglon(vector[18][0],vector[18][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Costas</td>";
            agregarRenglon(vector[19][0],vector[19][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Presas</td>";
            agregarRenglon(vector[20][0],vector[20][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Otros, especificar</td>";
            agregarRenglon(vector[21][0],vector[21][1]);

            tablaConcatenacion= tablaConcatenacion+
                        "</tbody>"+
                        "</table>"+
                        "</body>" +"</html>" ;



        worker.parseXHtml(pdfWriter, document, new StringReader(tablaConcatenacion));

        document.close();

        Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
        intent.putExtra("File", pdfFile.getPath());
        startActivity(intent);
    } catch (IOException e) {
        Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
        e.printStackTrace();
    } catch (DocumentException e) {
        Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
        e.printStackTrace();
    }


    }

    public void agregarRenglon(String decision, String distancia) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td >"+distancia+"</td>"+
                    "</tr>";

        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "<td ></td>"+
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td ></td>"+
                    "</tr>";
        }

    }

}
