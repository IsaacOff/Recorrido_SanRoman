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

public class quintanaroo_anexo10_RecursosMateriales extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22, rb23, rb24 ;
    private RadioButton rb25, rb26, rb27, rb28, rb29, rb30, rb31, rb32, rb33, rb34, rb35, rb36, rb37, rb38;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9,rg10,rg11,rg12, rg13, rg14, rg15,rg16,rg17,rg18, rg19;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36, et37, et38, et39, et40;
    private EditText et41,et42, et43, et44, et45, et46, et47, et48, et49, et50, et51, et52, et53, et54, et55, et56, et57, et58, et59, et60, et61, et62;
    static private String vector[][] = {{"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}, {"", "", "", ""}};
    static private String vector2[][] = {{"", "", "", "", ""}, {"", "", "", "", ""}, {"", "", "", "", ""}, {"", "", "", "", ""}, {"", "", "", "", ""}};
    private File pdfFile;
    static private String htmlToPDF;
    private File directorio2;
    static private String titulos []={"Botiquin", "Cascos", "Chalecos", "Brazaletes", "Botas", "Banderillas", "Lamparas de emergencia", "Equipo de zapa", "Paro de emergencia", "Hidrantes", "Alarma de emergencia", "Megafono", "Extintores","Camillas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__recursos_materiales);

        this.setTitle("Inventario de recursos materiales");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



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

        rg13= (RadioGroup) findViewById(R.id.Rg13);
        rb25 = (RadioButton) findViewById(R.id.rb25);
        rb26 = (RadioButton) findViewById(R.id.rb26);

        rg14= (RadioGroup) findViewById(R.id.Rg14);
        rb27 = (RadioButton) findViewById(R.id.rb27);
        rb28 = (RadioButton) findViewById(R.id.rb28);


        ///otros

        rg15= (RadioGroup) findViewById(R.id.Rg15);
        rb29 = (RadioButton) findViewById(R.id.rb29);
        rb30 = (RadioButton) findViewById(R.id.rb30);

        /////

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



        //asigna los edit text a los et de aqui
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
        et25 = (EditText) findViewById(R.id.editText25);
        et26 = (EditText) findViewById(R.id.editText26);
        et27 = (EditText) findViewById(R.id.editText27);
        et28 = (EditText) findViewById(R.id.editText28);
        et29 = (EditText) findViewById(R.id.editText29);
        et30 = (EditText) findViewById(R.id.editText30);
        et31 = (EditText) findViewById(R.id.editText31);
        et32 = (EditText) findViewById(R.id.editText32);
        et33 = (EditText) findViewById(R.id.editText33);
        et34 = (EditText) findViewById(R.id.editText34);
        et35 = (EditText) findViewById(R.id.editText35);
        et36 = (EditText) findViewById(R.id.editText36);
        et37 = (EditText) findViewById(R.id.editText37);
        et38 = (EditText) findViewById(R.id.editText38);
        et39 = (EditText) findViewById(R.id.editText39);
        et40 = (EditText) findViewById(R.id.editText40);
        et41 = (EditText) findViewById(R.id.editText41);
        et42 = (EditText) findViewById(R.id.editText42);
        et43 = (EditText) findViewById(R.id.editText43);
        et44 = (EditText) findViewById(R.id.editText44);
        et45 = (EditText) findViewById(R.id.editText45);
        et46 = (EditText) findViewById(R.id.editText46);
        et47 = (EditText) findViewById(R.id.editText47);
        et48 = (EditText) findViewById(R.id.editText48);
        et49 = (EditText) findViewById(R.id.editText49);
        et50 = (EditText) findViewById(R.id.editText50);
        et51 = (EditText) findViewById(R.id.editText51);
        et52 = (EditText) findViewById(R.id.editText52);
        et53 = (EditText) findViewById(R.id.editText53);
        et54 = (EditText) findViewById(R.id.editText54);
        et55 = (EditText) findViewById(R.id.editText55);
        et56 = (EditText) findViewById(R.id.editText56);
        et57 = (EditText) findViewById(R.id.editText57);
        et58 = (EditText) findViewById(R.id.editText58);
        et59 = (EditText) findViewById(R.id.editText59);
        et60 = (EditText) findViewById(R.id.editText60);
        et61 = (EditText) findViewById(R.id.editText61);
        et62 = (EditText) findViewById(R.id.editText62);



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
        et25.setVisibility(View.GONE);
        et26.setVisibility(View.GONE);
        et27.setVisibility(View.GONE);
        et28.setVisibility(View.GONE);
        et29.setVisibility(View.GONE);
        et30.setVisibility(View.GONE);
        et31.setVisibility(View.GONE);
        et32.setVisibility(View.GONE);
        et33.setVisibility(View.GONE);
        et34.setVisibility(View.GONE);
        et35.setVisibility(View.GONE);
        et36.setVisibility(View.GONE);
        et37.setVisibility(View.GONE);
        et38.setVisibility(View.GONE);
        et39.setVisibility(View.GONE);
        et40.setVisibility(View.GONE);
        et41.setVisibility(View.GONE);
        et42.setVisibility(View.GONE);
        et43.setVisibility(View.GONE);
        et44.setVisibility(View.GONE);
        et45.setVisibility(View.GONE);
        et46.setVisibility(View.GONE);
        et47.setVisibility(View.GONE);
        et48.setVisibility(View.GONE);
        et49.setVisibility(View.GONE);
        et50.setVisibility(View.GONE);
        et51.setVisibility(View.GONE);
        et52.setVisibility(View.GONE);
        et53.setVisibility(View.GONE);
        et54.setVisibility(View.GONE);
        et55.setVisibility(View.GONE);
        et56.setVisibility(View.GONE);
        et57.setVisibility(View.GONE);
        et58.setVisibility(View.GONE);
        et59.setVisibility(View.GONE);
        et60.setVisibility(View.GONE);
        et61.setVisibility(View.GONE);
        et62.setVisibility(View.GONE);



        if(!vector[0][1].equals("") && vector[0][1] != null){
            et1.setText(vector[0][1]);
        }

        if(!vector[0][2].equals("") && vector[0][2] != null){
            et2.setText(vector[0][2]);
        }

        if(!vector[0][3].equals("") && vector[0][3] != null){
            et3.setText(vector[0][3]);
        }

        if(!vector[1][1].equals("") && vector[1][1] != null){
            et4.setText(vector[1][1]);
        }

        if(!vector[1][2].equals("") && vector[1][2] != null){
            et5.setText(vector[1][2]);
        }

        if(!vector[1][3].equals("") && vector[1][3] != null){
            et6.setText(vector[1][3]);
        }

        if(!vector[2][1].equals("") && vector[2][1] != null){
            et7.setText(vector[2][1]);
        }

        if(!vector[2][2].equals("") && vector[2][2] != null){
            et8.setText(vector[2][2]);
        }

        if(!vector[2][3].equals("") && vector[2][3] != null){
            et9.setText(vector[2][3]);
        }

        if(!vector[3][1].equals("") && vector[3][1] != null){
            et10.setText(vector[3][1]);
        }

        if(!vector[3][2].equals("") && vector[3][2] != null){
            et11.setText(vector[3][2]);
        }

        if(!vector[3][3].equals("") && vector[3][3] != null){
            et12.setText(vector[3][3]);
        }

        if(!vector[4][1].equals("") && vector[4][1] != null){
            et13.setText(vector[4][1]);
        }

        if(!vector[4][2].equals("") && vector[4][2] != null){
            et14.setText(vector[4][2]);
        }

        if(!vector[4][3].equals("") && vector[4][3] != null){
            et15.setText(vector[4][3]);
        }

        if(!vector[5][1].equals("") && vector[5][1] != null){
            et16.setText(vector[5][1]);
        }

        if(!vector[5][2].equals("") && vector[5][2] != null){
            et17.setText(vector[5][2]);
        }

        if(!vector[5][3].equals("") && vector[5][3] != null){
            et18.setText(vector[5][3]);
        }

        if(!vector[6][1].equals("") && vector[6][1] != null){
            et19.setText(vector[6][1]);
        }

        if(!vector[6][2].equals("") && vector[6][2] != null){
            et20.setText(vector[6][2]);
        }

        if(!vector[6][3].equals("") && vector[6][3] != null){
            et21.setText(vector[6][3]);
        }

        if(!vector[7][1].equals("") && vector[7][1] != null){
            et22.setText(vector[7][1]);
        }

        if(!vector[7][2].equals("") && vector[7][2] != null){
            et23.setText(vector[7][2]);
        }

        if(!vector[7][3].equals("") && vector[7][3] != null){
            et24.setText(vector[7][3]);
        }

        if(!vector[8][1].equals("") && vector[8][1] != null){
            et25.setText(vector[8][1]);
        }

        if(!vector[8][2].equals("") && vector[8][2] != null){
            et26.setText(vector[8][2]);
        }

        if(!vector[8][3].equals("") && vector[8][3] != null){
            et27.setText(vector[8][3]);
        }

        if(!vector[9][1].equals("") && vector[9][1] != null){
            et28.setText(vector[9][1]);
        }

        if(!vector[9][2].equals("") && vector[9][2] != null){
            et29.setText(vector[9][2]);
        }

        if(!vector[9][3].equals("") && vector[9][3] != null){
            et30.setText(vector[9][3]);
        }

        if(!vector[10][1].equals("") && vector[10][1] != null){
            et31.setText(vector[10][1]);
        }

        if(!vector[10][2].equals("") && vector[10][2] != null){
            et32.setText(vector[10][2]);
        }

        if(!vector[10][3].equals("") && vector[10][3] != null){
            et33.setText(vector[10][3]);
        }

        if(!vector[11][1].equals("") && vector[11][1] != null){
            et34.setText(vector[11][1]);
        }

        if(!vector[11][2].equals("") && vector[11][2] != null){
            et35.setText(vector[11][2]);
        }

        if(!vector[11][3].equals("") && vector[11][3] != null){
            et36.setText(vector[11][3]);
        }

        if(!vector[12][1].equals("") && vector[12][1] != null){
            et37.setText(vector[12][1]);
        }

        if(!vector[12][2].equals("") && vector[12][2] != null){
            et38.setText(vector[12][2]);
        }

        if(!vector[12][3].equals("") && vector[12][3] != null){
            et39.setText(vector[12][3]);
        }

        if(!vector[13][1].equals("") && vector[13][1] != null){
            et40.setText(vector[13][1]);
        }

        if(!vector[13][2].equals("") && vector[13][2] != null){
            et41.setText(vector[13][2]);
        }

        if(!vector[13][3].equals("") && vector[13][3] != null){
            et42.setText(vector[13][3]);
        }


        if(!vector2[0][1].equals("") && vector2[0][1] != null){
            et43.setText(vector2[0][1]);
        }

        if(!vector2[0][2].equals("") && vector2[0][2] != null){
            et44.setText(vector2[0][2]);
        }

        if(!vector2[0][3].equals("") && vector2[0][3] != null){
            et45.setText(vector2[0][3]);
        }

        if(!vector2[0][4].equals("") && vector2[0][4] != null){
            et46.setText(vector2[0][4]);
        }

        if(!vector2[1][1].equals("") && vector2[1][1] != null){
            et47.setText(vector2[1][1]);
        }

        if(!vector2[1][2].equals("") && vector2[1][2] != null){
            et48.setText(vector2[1][2]);
        }

        if(!vector2[1][3].equals("") && vector2[1][3] != null){
            et49.setText(vector2[1][3]);
        }

        if(!vector2[1][4].equals("") && vector2[1][4] != null){
            et50.setText(vector2[1][4]);
        }

        if(!vector2[2][1].equals("") && vector2[2][1] != null){
            et51.setText(vector2[2][1]);
        }

        if(!vector2[2][2].equals("") && vector2[2][2] != null){
            et52.setText(vector2[2][2]);
        }

        if(!vector2[2][3].equals("") && vector2[2][3] != null){
            et53.setText(vector2[2][3]);
        }

        if(!vector2[2][4].equals("") && vector2[2][4] != null){
            et54.setText(vector2[2][4]);
        }

        if(!vector2[3][1].equals("") && vector2[3][1] != null){
            et55.setText(vector2[3][1]);
        }

        if(!vector2[3][2].equals("") && vector2[3][2] != null){
            et56.setText(vector2[3][2]);
        }

        if(!vector2[3][3].equals("") && vector2[3][3] != null){
            et57.setText(vector2[3][3]);
        }

        if(!vector2[3][4].equals("") && vector2[3][4] != null){
            et58.setText(vector2[3][4]);
        }

        if(!vector2[4][1].equals("") && vector2[4][1] != null){
            et59.setText(vector2[4][1]);
        }

        if(!vector2[4][2].equals("") && vector2[4][2] != null){
            et60.setText(vector2[4][2]);
        }

        if(!vector2[4][3].equals("") && vector2[4][3] != null){
            et61.setText(vector2[4][3]);
        }

        if(!vector2[4][4].equals("") && vector2[4][4] != null){
            et62.setText(vector2[4][4]);
        }


        if (vector[0][0].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
            et1.setVisibility(View.VISIBLE);
            et2.setVisibility(View.VISIBLE);
            et3.setVisibility(View.VISIBLE);
        } else if (vector[0][0].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[1][0].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
            et4.setVisibility(View.VISIBLE);
            et5.setVisibility(View.VISIBLE);
            et6.setVisibility(View.VISIBLE);
        } else if (vector[1][0].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if (vector[2][0].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
            et7.setVisibility(View.VISIBLE);
            et8.setVisibility(View.VISIBLE);
            et9.setVisibility(View.VISIBLE);
        } else if (vector[2][0].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[3][0].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
            et10.setVisibility(View.VISIBLE);
            et11.setVisibility(View.VISIBLE);
            et12.setVisibility(View.VISIBLE);
        } else if (vector[3][0].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[4][0].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
            et13.setVisibility(View.VISIBLE);
            et14.setVisibility(View.VISIBLE);
            et15.setVisibility(View.VISIBLE);
        } else if (vector[4][0].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }


        if (vector[5][0].equals("SI")) {
            rb11.setChecked(true);
            rb12.setChecked(false);
            et16.setVisibility(View.VISIBLE);
            et17.setVisibility(View.VISIBLE);
            et18.setVisibility(View.VISIBLE);
        } else if (vector[5][0].equals("NO")) {
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if (vector[6][0].equals("SI")) {
            rb13.setChecked(true);
            rb14.setChecked(false);
            et19.setVisibility(View.VISIBLE);
            et20.setVisibility(View.VISIBLE);
            et21.setVisibility(View.VISIBLE);
        } else if (vector[6][0].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[7][0].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
            et22.setVisibility(View.VISIBLE);
            et23.setVisibility(View.VISIBLE);
            et24.setVisibility(View.VISIBLE);
        } else if (vector[7][0].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[8][0].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
            et25.setVisibility(View.VISIBLE);
            et26.setVisibility(View.VISIBLE);
            et27.setVisibility(View.VISIBLE);
        } else if (vector[8][0].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[9][0].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
            et28.setVisibility(View.VISIBLE);
            et29.setVisibility(View.VISIBLE);
            et30.setVisibility(View.VISIBLE);
        } else if (vector[9][0].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[10][0].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et31.setVisibility(View.VISIBLE);
            et32.setVisibility(View.VISIBLE);
            et33.setVisibility(View.VISIBLE);
        } else if (vector[10][0].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[11][0].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et34.setVisibility(View.VISIBLE);
            et35.setVisibility(View.VISIBLE);
            et36.setVisibility(View.VISIBLE);
        } else if (vector[11][0].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[12][0].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et37.setVisibility(View.VISIBLE);
            et38.setVisibility(View.VISIBLE);
            et39.setVisibility(View.VISIBLE);
        } else if (vector[12][0].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[13][0].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et40.setVisibility(View.VISIBLE);
            et41.setVisibility(View.VISIBLE);
            et42.setVisibility(View.VISIBLE);
        } else if (vector[13][0].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }


        if (vector2[0][0].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et43.setVisibility(View.VISIBLE);
            et44.setVisibility(View.VISIBLE);
            et45.setVisibility(View.VISIBLE);
            et46.setVisibility(View.VISIBLE);
        } else if (vector2[0][0].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }

        if (vector2[1][0].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et47.setVisibility(View.VISIBLE);
            et48.setVisibility(View.VISIBLE);
            et49.setVisibility(View.VISIBLE);
            et50.setVisibility(View.VISIBLE);
        } else if (vector2[1][0].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector2[2][0].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et51.setVisibility(View.VISIBLE);
            et52.setVisibility(View.VISIBLE);
            et53.setVisibility(View.VISIBLE);
            et54.setVisibility(View.VISIBLE);
        } else if (vector2[2][0].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }

        if (vector2[3][0].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et55.setVisibility(View.VISIBLE);
            et56.setVisibility(View.VISIBLE);
            et57.setVisibility(View.VISIBLE);
            et58.setVisibility(View.VISIBLE);
        } else if (vector2[3][0].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector2[4][0].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et59.setVisibility(View.VISIBLE);
            et60.setVisibility(View.VISIBLE);
            et61.setVisibility(View.VISIBLE);
            et62.setVisibility(View.VISIBLE);
        } else if (vector2[4][0].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){

                    vector[0][0]="SI";
                    et1.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    et3.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb2) {
                    vector[0][0]="NO";
                    et1.setVisibility(View.GONE);
                    et2.setVisibility(View.GONE);
                    et3.setVisibility(View.GONE);


                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){

                    vector[1][0]="SI";
                    et4.setVisibility(View.VISIBLE);
                    et5.setVisibility(View.VISIBLE);
                    et6.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb4) {

                    vector[1][0]="NO";
                    et4.setVisibility(View.GONE);
                    et5.setVisibility(View.GONE);
                    et6.setVisibility(View.GONE);


                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2][0]="SI";
                    et7.setVisibility(View.VISIBLE);
                    et8.setVisibility(View.VISIBLE);
                    et9.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb6) {

                    vector[2][0]="NO";
                    et7.setVisibility(View.GONE);
                    et8.setVisibility(View.GONE);
                    et9.setVisibility(View.GONE);


                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3][0]="SI";
                    et10.setVisibility(View.VISIBLE);
                    et11.setVisibility(View.VISIBLE);
                    et12.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb8) {

                    vector[3][0]="NO";
                    et10.setVisibility(View.GONE);
                    et11.setVisibility(View.GONE);
                    et12.setVisibility(View.GONE);


                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){

                    vector[4][0]="SI";
                    et13.setVisibility(View.VISIBLE);
                    et14.setVisibility(View.VISIBLE);
                    et15.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {

                    vector[4][0]="NO";
                    et13.setVisibility(View.GONE);
                    et14.setVisibility(View.GONE);
                    et15.setVisibility(View.GONE);


                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5][0]="SI";
                    et16.setVisibility(View.VISIBLE);
                    et17.setVisibility(View.VISIBLE);
                    et18.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb12) {

                    vector[5][0]="NO";
                    et16.setVisibility(View.GONE);
                    et17.setVisibility(View.GONE);
                    et18.setVisibility(View.GONE);


                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6][0]="SI";
                    et19.setVisibility(View.VISIBLE);
                    et20.setVisibility(View.VISIBLE);
                    et21.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {

                    vector[6][0]="NO";
                    et19.setVisibility(View.GONE);
                    et20.setVisibility(View.GONE);
                    et21.setVisibility(View.GONE);


                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7][0]="SI";
                    et22.setVisibility(View.VISIBLE);
                    et23.setVisibility(View.VISIBLE);
                    et24.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb16) {

                    vector[7][0]="NO";
                    et22.setVisibility(View.GONE);
                    et23.setVisibility(View.GONE);
                    et24.setVisibility(View.GONE);


                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8][0]="SI";
                    et25.setVisibility(View.VISIBLE);
                    et26.setVisibility(View.VISIBLE);
                    et27.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb18) {

                    vector[8][0]="NO";
                    et25.setVisibility(View.GONE);
                    et26.setVisibility(View.GONE);
                    et27.setVisibility(View.GONE);


                }

            }
        });





        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9][0]="SI";
                    et28.setVisibility(View.VISIBLE);
                    et29.setVisibility(View.VISIBLE);
                    et30.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {

                    vector[9][0]="NO";
                    et28.setVisibility(View.GONE);
                    et29.setVisibility(View.GONE);
                    et30.setVisibility(View.GONE);


                }

            }
        });




        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[10][0]="SI";
                    et31.setVisibility(View.VISIBLE);
                    et32.setVisibility(View.VISIBLE);
                    et33.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb22) {

                    vector[10][0]="NO";
                    et31.setVisibility(View.GONE);
                    et32.setVisibility(View.GONE);
                    et33.setVisibility(View.GONE);


                }

            }
        });





        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){

                    vector[11][0]="SI";
                    et34.setVisibility(View.VISIBLE);
                    et35.setVisibility(View.VISIBLE);
                    et36.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb24) {

                    vector[11][0]="NO";
                    et34.setVisibility(View.GONE);
                    et35.setVisibility(View.GONE);
                    et36.setVisibility(View.GONE);


                }

            }
        });



        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[12][0]="SI";
                    et37.setVisibility(View.VISIBLE);
                    et38.setVisibility(View.VISIBLE);
                    et39.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb26) {

                    vector[12][0]="NO";
                    et37.setVisibility(View.GONE);
                    et38.setVisibility(View.GONE);
                    et39.setVisibility(View.GONE);


                }

            }
        });







        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[13][0]="SI";
                    et40.setVisibility(View.VISIBLE);
                    et41.setVisibility(View.VISIBLE);
                    et42.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb28) {

                    vector[13][0]="NO";
                    et40.setVisibility(View.GONE);
                    et41.setVisibility(View.GONE);
                    et42.setVisibility(View.GONE);


                }

            }
        });


///////////otros

        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector2[0][0]="SI";
                    et43.setVisibility(View.VISIBLE);
                    et44.setVisibility(View.VISIBLE);
                    et45.setVisibility(View.VISIBLE);
                    et46.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb30) {

                    vector2[0][0]="NO";
                    et43.setVisibility(View.GONE);
                    et44.setVisibility(View.GONE);
                    et45.setVisibility(View.GONE);
                    et46.setVisibility(View.GONE);


                }

            }
        });


        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector2[1][0]="SI";
                    et47.setVisibility(View.VISIBLE);
                    et48.setVisibility(View.VISIBLE);
                    et49.setVisibility(View.VISIBLE);
                    et50.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb32) {

                    vector2[1][0]="NO";
                    et47.setVisibility(View.GONE);
                    et48.setVisibility(View.GONE);
                    et49.setVisibility(View.GONE);
                    et50.setVisibility(View.GONE);

                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector2[2][0]="SI";
                    et51.setVisibility(View.VISIBLE);
                    et52.setVisibility(View.VISIBLE);
                    et53.setVisibility(View.VISIBLE);
                    et54.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb34) {

                    vector2[2][0]="NO";
                    et51.setVisibility(View.GONE);
                    et52.setVisibility(View.GONE);
                    et53.setVisibility(View.GONE);
                    et54.setVisibility(View.GONE);

                }

            }
        });



        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector2[3][0]="SI";
                    et55.setVisibility(View.VISIBLE);
                    et56.setVisibility(View.VISIBLE);
                    et57.setVisibility(View.VISIBLE);
                    et58.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb36) {

                    vector2[3][0]="NO";
                    et55.setVisibility(View.GONE);
                    et56.setVisibility(View.GONE);
                    et57.setVisibility(View.GONE);
                    et58.setVisibility(View.GONE);

                }

            }
        });



        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector2[4][0]="SI";
                    et59.setVisibility(View.VISIBLE);
                    et60.setVisibility(View.VISIBLE);
                    et61.setVisibility(View.VISIBLE);
                    et62.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb38) {

                    vector2[4][0]="NO";
                    et59.setVisibility(View.GONE);
                    et60.setVisibility(View.GONE);
                    et61.setVisibility(View.GONE);
                    et62.setVisibility(View.GONE);

                }

            }
        });


        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0] [1]  = et1.getText().toString();


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
                vector[0] [2]  = et2.getText().toString();
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
                vector[0] [3]  = et3.getText().toString();
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
                vector[1] [1]  = et4.getText().toString();

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
                vector[1] [2]  = et5.getText().toString();

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
                vector[1] [3]  = et6.getText().toString();
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
                vector[2] [1]  = et7.getText().toString();
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
                vector[2] [2]  = et8.getText().toString();
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
                vector[2] [3]  = et9.getText().toString();
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
                vector[3] [1]  = et10.getText().toString();
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
                vector[3] [2]  = et11.getText().toString();

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
                vector[3] [3]  = et12.getText().toString();
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
                vector[4] [1]  = et13.getText().toString();
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
                vector[4] [2]  = et14.getText().toString();
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
                vector[4] [3]  = et15.getText().toString();
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
                vector[5] [1]  = et16.getText().toString();
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
                vector[5] [2]  = et17.getText().toString();
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
                vector[5] [3]  = et18.getText().toString();
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
                vector[6] [1]  = et19.getText().toString();
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
                vector[6] [2]  = et20.getText().toString();
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
                vector[6] [3]  = et21.getText().toString();
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
                vector[7] [1]  = et22.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[7] [2]  = et23.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et24.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[7] [3]  = et24.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[8] [1]  = et25.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et26.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[8] [2]  = et26.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et27.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[8] [3]  = et27.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et28.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9] [1]  = et28.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et29.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9] [2]  = et29.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et30.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9] [3]  = et30.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10] [1]  = et31.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10] [2]  = et32.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10] [3]  = et33.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et34.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[11] [1]  = et34.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et35.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[11] [2]  = et35.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et36.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[11] [3]  = et36.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et37.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12] [1]  = et37.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et38.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12] [2]  = et38.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et39.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12] [3]  = et39.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et40.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13] [1]  = et40.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et41.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13] [2]  = et41.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et42.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13] [3]  = et42.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et43.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0] [1]  = et43.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et44.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0] [2]  = et44.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et45.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0] [3]  = et45.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et46.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0] [4]  = et46.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et47.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1] [1]  = et47.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et48.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1] [2]  = et48.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et49.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1] [3]  = et49.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1] [4]  = et50.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et51.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2] [1]  = et51.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et52.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2] [2]  = et52.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et53.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2] [3]  = et53.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et54.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2] [4]  = et54.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et55.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3] [1]  = et55.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et56.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3] [2]  = et56.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et57.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3] [3]  = et57.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et58.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3] [4]  = et58.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et59.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4] [1]  = et59.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et60.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4] [2]  = et60.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et61.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4] [3]  = et61.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et62.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4] [4]  = et62.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });



    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recursos_materiales, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.equipovsincendio) {

            Toast.makeText(this, "Equipo de incendio abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_anexo10_EquipoContraIncendio.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.detectoresvsincendio) {
            Toast.makeText(this, "Detectores de incendio abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_anexo10_DetectoresContraIncendio.class);
            startActivity(intent);
            return true;
        }



        if (id == R.id.riesgoexterno) {
            Toast.makeText(this, "Riesgo Externo abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.riesgointerno) {
            Toast.makeText(this, "Riesgo Interno abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.senalitica) {
            Toast.makeText(this, "Señaletica abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, senaletica.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

















    public void OnClick (View view){
        Boolean bandera=true;

        for(int i = 0 ; i<14; i++){
            if( vector[i][0]==""){
                bandera=false;
            }else if( vector[i][0]=="SI"){
                if(vector[i][1]=="" || vector[i][2]=="" || vector[i][3]==""){
                    bandera=false;
                }
            }
        }

        for(int i = 0 ; i<5; i++){
            if( vector2[i][0]=="SI"){
                if(vector2[i][1]=="" || vector2[i][2]=="" || vector2[i][3]=="" || vector2[i][4]==""){
                    bandera=false;
                }
            }
        }
/*

        if( vector[0][0]=="SI"){

            if (et1.length() == 0) {
                bandera = false;
            }


            if (et2.length() == 0) {
                bandera = false;
            }

            if (et3.length() == 0) {
                bandera = false;
            }

        }else if(vector[0][0]==""){
            bandera = false;
        }


        if( vector[1][0]=="SI"){

            if (et4.length() == 0) {
                bandera = false;
            }

            if (et5.length() == 0) {
                bandera = false;
            }

            if (et6.length() == 0) {
                bandera = false;
            }


        }


        if( vector[2][0]=="SI"){
            if (et7.length() == 0) {
                bandera = false;
            }

            if (et8.length() == 0) {
                bandera = false;
            }

            if (et9.length() == 0) {
                bandera = false;
            }

        }

        if( vector[3][0]=="SI"){
            if (et10.length() == 0) {
                bandera = false;
            }


            if (et11.length() == 0) {
                bandera = false;
            }

            if (et12.length() == 0) {
                bandera = false;
            }


        }

        if( vector[4][0]=="SI"){

            if (et13.length() == 0) {
                bandera = false;
            }

            if (et14.length() == 0) {
                bandera = false;
            }

            if (et15.length() == 0) {
                bandera = false;
            }


        }

        if( vector[5][0]=="SI"){
            if (et16.length() == 0) {
                bandera = false;
            }

            if (et17.length() == 0) {
                bandera = false;
            }

            if (et18.length() == 0) {
                bandera = false;
            }


        }

        if( vector[6][0]=="SI"){
            if (et19.length() == 0) {
                bandera = false;
            }

            if (et20.length() == 0) {
                bandera = false;
            }

            if (et21.length() == 0) {
                bandera = false;
            }

        }

        if( vector[7][0]=="SI"){

            if (et22.length() == 0) {
                bandera = false;
            }

            if (et23.length() == 0) {
                bandera = false;
            }

            if (et24.length() == 0) {
                bandera = false;
            }

        }

        if( vector[8][0]=="SI"){
            if (et25.length() == 0) {
                bandera = false;
            }

            if (et26.length() == 0) {
                bandera = false;
            }

            if (et27.length() == 0) {
                bandera = false;
            }
        }

        if( vector[9][0]=="SI"){

            if (et28.length() == 0) {
                bandera = false;
            }

            if (et29.length() == 0) {
                bandera = false;
            }

            if (et30.length() == 0) {
                bandera = false;
            }


        }

        if( vector[10][0]=="SI"){

            if (et31.length() == 0) {
                bandera = false;
            }

            if (et32.length() == 0) {
                bandera = false;
            }

            if (et33.length() == 0) {
                bandera = false;
            }

        }

        if( vector[11][0]=="SI"){

            if (et34.length() == 0) {
                bandera = false;
            }

            if (et35.length() == 0) {
                bandera = false;
            }

            if (et36.length() == 0) {
                bandera = false;
            }



        }



        if( vector[12][0]=="SI"){

            if (et37.length() == 0) {
                bandera = false;
            }

            if (et38.length() == 0) {
                bandera = false;
            }

            if (et39.length() == 0) {
                bandera = false;
            }


        }



        if( vector[13][0]=="SI"){

            if (et40.length() == 0) {
                bandera = false;
            }

            if (et41.length() == 0) {
                bandera = false;
            }

            if (et42.length() == 0) {
                bandera = false;
            }


        }

///otros

        if( vector2[0][0]=="SI"){

            if (et43.length() == 0) {
                bandera = false;
            }

            if (et44.length() == 0) {
                bandera = false;
            }

            if (et45.length() == 0) {
                bandera = false;
            }
            if (et46.length() == 0) {
                bandera = false;
            }


        }



        if( vector2[1][0]=="SI"){

            if (et47.length() == 0) {
                bandera = false;
            }

            if (et48.length() == 0) {
                bandera = false;
            }

            if (et49.length() == 0) {
                bandera = false;
            }
            if (et50.length() == 0) {
                bandera = false;
            }


        }




        if( vector2[2][0]=="SI"){

            if (et51.length() == 0) {
                bandera = false;
            }

            if (et52.length() == 0) {
                bandera = false;
            }

            if (et53.length() == 0) {
                bandera = false;
            }
            if (et54.length() == 0) {
                bandera = false;
            }


        }




        if( vector2[3][0]=="SI"){

            if (et55.length() == 0) {
                bandera = false;
            }

            if (et56.length() == 0) {
                bandera = false;
            }

            if (et57.length() == 0) {
                bandera = false;
            }
            if (et58.length() == 0) {
                bandera = false;
            }


        }



        if( vector2[4][0]=="SI"){

            if (et59.length() == 0) {
                bandera = false;
            }

            if (et60.length() == 0) {
                bandera = false;
            }

            if (et61.length() == 0) {
                bandera = false;
            }
            if (et62.length() == 0) {
                bandera = false;
            }


        }



*/



        if (bandera){

            Reporte();

        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }



    }


    public void Reporte(){
        try {
            directorio2 = new File(index_QuintanaRoo.file());
            if(directorio2 != null) {
                pdfFile = new File(directorio2.getPath(), "Recursos materiales.pdf");
            }

            Document document = new Document(PageSize.LETTER.rotate());
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Recursos materiales</title>" +
                    "</head>" +
                    "<body>" +
                    "Recursos materiales"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th colspan=\"4\">Inventario de recursos materiales</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th WIDTH=\"45%\">Equipo</th>" +
                    "<th WIDTH=\"17%\">Cantidad</th>" +
                    "<th WIDTH=\"18%\">Ubicación</th>" +
                    "<th WIDTH=\"20%\">Observaciones</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>" ;

                    for(int x=0; x<14;x++) {
                        if (vector[x][0].equals("SI")) {
                            agregarRenglon(titulos[x], vector[x][1], vector[x][2], vector[x][3]);
                        }else{
                            agregarRenglon(titulos[x], "0", "", "");
                        }
                    }

                    for(int i=0; i<5;i++) {
                        if (vector2[i][0].equals("SI")) {
                            agregarRenglon(vector2[i][1],vector2[i][2],vector2[i][3],vector2[i][4]);
                        }
                    }

            /*htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Otros, especificar:</th>";
            agregarColumna(vector[38], et39.getText().toString());
            */

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "</body>" + "</html>";

            worker.parseXHtml(pdfWriter, document, new StringReader(htmlToPDF));

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

    void agregarRenglon(String recurso, String cantidad, String ubicacion, String observaciones){
            htmlToPDF=htmlToPDF +
                    "<tr>" +
                    "<td>"+recurso+"</td>"+
                    "<td>"+cantidad+"</td>" +
                    "<td>"+ubicacion+"</td>" +
                    "<td>"+observaciones+"</td>" +
                    "</tr>";
    }


}
