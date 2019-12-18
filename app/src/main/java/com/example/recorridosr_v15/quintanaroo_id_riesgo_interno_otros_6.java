package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
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

public class quintanaroo_id_riesgo_interno_otros_6 extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23, rg24, rg25;
    private RadioGroup rg26, rg27, rg28, rg29,rg30,rg31,rg32,rg33,rg34, rg35, rg36, rg37,rg38, rg39, rg40,rg41,rg42,rg43,rg44,rg45, rg46, rg47, rg48, rg49, rg50;
    private RadioGroup rg51, rg52, rg53, rg54;

    private RadioButton  rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46,rb47,rb48, rb49, rb50, rb51, rb52, rb53,rb54, rb55, rb56, rb57, rb58, rb59, rb60;
    private RadioButton rb61, rb62, rb63, rb64, rb65, rb66,rb67,rb68, rb69, rb70, rb71, rb72, rb73,rb74, rb75, rb76, rb77, rb78, rb79, rb80;
    private RadioButton rb81, rb82, rb83, rb84, rb85, rb86,rb87,rb88, rb89, rb90, rb91, rb92, rb93,rb94, rb95, rb96, rb97, rb98, rb99, rb100;
    private RadioButton rb101,rb102,rb103,rb104,rb105,rb106,rb107,rb108;
    private EditText et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36, et37, et38, et39, et40, et41, et42, et43;
    private EditText  et44,  et45,  et46,  et47,  et48,  et49, et50, et51, et52, et53, et54, edit1;


    static String vector[]={"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    //Vector para Edit Text
    static String vector2 = "";
    static String vector3 [] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static File pdfFile;
    static File directorio2;
    static boolean banderaTotal;
    String tablaConcatenacion="";
   static String aviso = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_otros_6);



        this.setTitle("Riesgo interno 7");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Implementa el menu para que se vea en esta vista en especifico
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


        /*directorio2 = new File(getIntent().getStringExtra("File"));
        temporal = getIntent().getStringExtra("documento");
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Riesgos Internos.pdf");
        }*/

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

        rg23= (RadioGroup) findViewById(R.id.Rg23);
        rb45 = (RadioButton) findViewById(R.id.rb45);
        rb46 = (RadioButton) findViewById(R.id.rb46);

        ///////////modificar desde aqui

        rg24= (RadioGroup) findViewById(R.id.Rg24);
        rb47 = (RadioButton) findViewById(R.id.rb47);
        rb48 = (RadioButton) findViewById(R.id.rb48);

        rg25= (RadioGroup) findViewById(R.id.Rg25);
        rb49 = (RadioButton) findViewById(R.id.rb49);
        rb50 = (RadioButton) findViewById(R.id.rb50);

        rg26= (RadioGroup) findViewById(R.id.Rg26);
        rb51 = (RadioButton) findViewById(R.id.rb51);
        rb52 = (RadioButton) findViewById(R.id.rb52);

        rg27= (RadioGroup) findViewById(R.id.Rg27);
        rb53 = (RadioButton) findViewById(R.id.rb53);
        rb54 = (RadioButton) findViewById(R.id.rb54);

        rg28= (RadioGroup) findViewById(R.id.Rg28);
        rb55 = (RadioButton) findViewById(R.id.rb55);
        rb56 = (RadioButton) findViewById(R.id.rb56);

        rg29= (RadioGroup) findViewById(R.id.Rg29);
        rb57 = (RadioButton) findViewById(R.id.rb57);
        rb58 = (RadioButton) findViewById(R.id.rb58);

        rg30= (RadioGroup) findViewById(R.id.Rg30);
        rb59 = (RadioButton) findViewById(R.id.rb59);
        rb60 = (RadioButton) findViewById(R.id.rb60);

        rg31= (RadioGroup) findViewById(R.id.Rg31);
        rb61 = (RadioButton) findViewById(R.id.rb61);
        rb62 = (RadioButton) findViewById(R.id.rb62);

        rg32= (RadioGroup) findViewById(R.id.Rg32);
        rb63 = (RadioButton) findViewById(R.id.rb63);
        rb64 = (RadioButton) findViewById(R.id.rb64);

        rg33= (RadioGroup) findViewById(R.id.Rg33);
        rb65 = (RadioButton) findViewById(R.id.rb65);
        rb66 = (RadioButton) findViewById(R.id.rb66);

        rg34= (RadioGroup) findViewById(R.id.Rg34);
        rb67 = (RadioButton) findViewById(R.id.rb67);
        rb68 = (RadioButton) findViewById(R.id.rb68);

        rg35= (RadioGroup) findViewById(R.id.Rg35);
        rb69 = (RadioButton) findViewById(R.id.rb69);
        rb70 = (RadioButton) findViewById(R.id.rb70);

        rg36= (RadioGroup) findViewById(R.id.Rg36);
        rb71 = (RadioButton) findViewById(R.id.rb71);
        rb72 = (RadioButton) findViewById(R.id.rb72);

        rg37= (RadioGroup) findViewById(R.id.Rg37);
        rb73 = (RadioButton) findViewById(R.id.rb73);
        rb74 = (RadioButton) findViewById(R.id.rb74);

        rg38 = (RadioGroup) findViewById(R.id.Rg38);
        rb75 = (RadioButton) findViewById(R.id.rb75);
        rb76 = (RadioButton) findViewById(R.id.rb76);

        rg39= (RadioGroup) findViewById(R.id.Rg39);
        rb77 = (RadioButton) findViewById(R.id.rb77);
        rb78 = (RadioButton) findViewById(R.id.rb78);

        rg40= (RadioGroup) findViewById(R.id.Rg40);
        rb79 = (RadioButton) findViewById(R.id.rb79);
        rb80 = (RadioButton) findViewById(R.id.rb80);

        rg41= (RadioGroup) findViewById(R.id.Rg41);
        rb81 = (RadioButton) findViewById(R.id.rb81);
        rb82 = (RadioButton) findViewById(R.id.rb82);

        rg42= (RadioGroup) findViewById(R.id.Rg42);
        rb83 = (RadioButton) findViewById(R.id.rb83);
        rb84 = (RadioButton) findViewById(R.id.rb84);

        rg43= (RadioGroup) findViewById(R.id.Rg43);
        rb85 = (RadioButton) findViewById(R.id.rb85);
        rb86 = (RadioButton) findViewById(R.id.rb86);

        rg44= (RadioGroup) findViewById(R.id.Rg44);
        rb87 = (RadioButton) findViewById(R.id.rb87);
        rb88 = (RadioButton) findViewById(R.id.rb88);

        rg45= (RadioGroup) findViewById(R.id.Rg45);
        rb89 = (RadioButton) findViewById(R.id.rb89);
        rb90 = (RadioButton) findViewById(R.id.rb90);

        rg46= (RadioGroup) findViewById(R.id.Rg46);
        rb91 = (RadioButton) findViewById(R.id.rb91);
        rb92 = (RadioButton) findViewById(R.id.rb92);

        rg47= (RadioGroup) findViewById(R.id.Rg47);
        rb93 = (RadioButton) findViewById(R.id.rb93);
        rb94 = (RadioButton) findViewById(R.id.rb94);

        rg48= (RadioGroup) findViewById(R.id.Rg48);
        rb95 = (RadioButton) findViewById(R.id.rb95);
        rb96 = (RadioButton) findViewById(R.id.rb96);

        rg49= (RadioGroup) findViewById(R.id.Rg49);
        rb97 = (RadioButton) findViewById(R.id.rb97);
        rb98 = (RadioButton) findViewById(R.id.rb98);

        rg50= (RadioGroup) findViewById(R.id.Rg50);
        rb99 = (RadioButton) findViewById(R.id.rb99);
        rb100 = (RadioButton) findViewById(R.id.rb100);

        rg51= (RadioGroup) findViewById(R.id.Rg51);
        rb101 = (RadioButton) findViewById(R.id.rb101);
        rb102 = (RadioButton) findViewById(R.id.rb102);

        rg52= (RadioGroup) findViewById(R.id.Rg52);
        rb103 = (RadioButton) findViewById(R.id.rb103);
        rb104 = (RadioButton) findViewById(R.id.rb104);

        rg53= (RadioGroup) findViewById(R.id.Rg53);
        rb105 = (RadioButton) findViewById(R.id.rb105);
        rb106 = (RadioButton) findViewById(R.id.rb106);

        rg54  = (RadioGroup) findViewById(R.id.Rg54);
        rb107 = (RadioButton) findViewById(R.id.rb107);
        rb108 = (RadioButton) findViewById(R.id.rb108);



        //asignar EditText para especificar las variables de aqui
        edit1 =(EditText) findViewById(R.id.editText);

        //asignar et para observaciones las variables de aqui
        et1  = (EditText) findViewById(R.id.et1);
        et2  = (EditText) findViewById(R.id.et2);
        et3  = (EditText) findViewById(R.id.et3);
        et4  = (EditText) findViewById(R.id.et4);
        et5  = (EditText) findViewById(R.id.et5);
        et6  = (EditText) findViewById(R.id.et6);
        et7  = (EditText) findViewById(R.id.et7);
        et8  = (EditText) findViewById(R.id.et8);
        et9  = (EditText) findViewById(R.id.et9);
        et10 = (EditText) findViewById(R.id.et10);
        et11 = (EditText) findViewById(R.id.et11);
        et12 = (EditText) findViewById(R.id.et12);
        et13 = (EditText) findViewById(R.id.et13);
        et14 = (EditText) findViewById(R.id.et14);
        et15 = (EditText) findViewById(R.id.et15);
        et16 = (EditText) findViewById(R.id.et16);
        et17 = (EditText) findViewById(R.id.et17);
        et18 = (EditText) findViewById(R.id.et18);
        et19 = (EditText) findViewById(R.id.et19);
        et20 = (EditText) findViewById(R.id.et20);
        et21 = (EditText) findViewById(R.id.et21);
        et22 = (EditText) findViewById(R.id.et22);
        et23 = (EditText) findViewById(R.id.et23);
        et24 = (EditText) findViewById(R.id.et24);
        et25 = (EditText) findViewById(R.id.et25);
        et26 = (EditText) findViewById(R.id.et26);
        et27 = (EditText) findViewById(R.id.et27);
        et28 = (EditText) findViewById(R.id.et28);
        et29 = (EditText) findViewById(R.id.et29);
        et30 = (EditText) findViewById(R.id.et30);
        et31 = (EditText) findViewById(R.id.et31);
        et32 = (EditText) findViewById(R.id.et32);
        et33 = (EditText) findViewById(R.id.et33);
        et34 = (EditText) findViewById(R.id.et34);
        et35 = (EditText) findViewById(R.id.et35);
        et36 = (EditText) findViewById(R.id.et36);
        et37 = (EditText) findViewById(R.id.et37);
        et38 = (EditText) findViewById(R.id.et38);
        et39 = (EditText) findViewById(R.id.et39);
        et40 = (EditText) findViewById(R.id.et40);
        et41 = (EditText) findViewById(R.id.et41);
        et42 = (EditText) findViewById(R.id.et42);
        et43 = (EditText) findViewById(R.id.et43);
        et44 = (EditText) findViewById(R.id.et44);
        et45 = (EditText) findViewById(R.id.et45);
        et46 = (EditText) findViewById(R.id.et46);
        et47 = (EditText) findViewById(R.id.et47);
        et48 = (EditText) findViewById(R.id.et48);
        et49 = (EditText) findViewById(R.id.et49);
        et50 = (EditText) findViewById(R.id.et50);
        et51 = (EditText) findViewById(R.id.et51);
        et52 = (EditText) findViewById(R.id.et52);
        et53 = (EditText) findViewById(R.id.et53);
        et54 = (EditText) findViewById(R.id.et54);



        //Ocultar EditText
        edit1.setVisibility(View.GONE);
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


      if(!vector2.equals("") && vector2 != null){
            edit1.setText(vector2);
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
        if(!vector3[10].equals("") && vector3[10] != null){
            et11.setText(vector3[10]);
        }
        if(!vector3[11].equals("") && vector3[11] != null){
            et12.setText(vector3[11]);
        }
        if(!vector3[12].equals("") && vector3[12] != null){
            et13.setText(vector3[12]);
        }
        if(!vector3[13].equals("") && vector3[13] != null){
            et14.setText(vector3[13]);
        }
        if(!vector3[14].equals("") && vector3[14] != null){
            et15.setText(vector3[14]);
        }
        if(!vector3[15].equals("") && vector3[15] != null){
            et16.setText(vector3[15]);
        }
        if(!vector3[16].equals("") && vector3[16] != null){
            et17.setText(vector3[16]);
        }
        if(!vector3[17].equals("") && vector3[17] != null){
            et18.setText(vector3[17]);
        }
        if(!vector3[18].equals("") && vector3[18] != null){
            et19.setText(vector3[18]);
        }
        if(!vector3[19].equals("") && vector3[19] != null){
            et20.setText(vector3[19]);
        }
        if(!vector3[20].equals("") && vector3[20] != null){
            et21.setText(vector3[20]);
        }
        if(!vector3[21].equals("") && vector3[21] != null){
            et22.setText(vector3[21]);
        }
        if(!vector3[22].equals("") && vector3[22] != null){
            et23.setText(vector3[22]);
        }
        if(!vector3[23].equals("") && vector3[23] != null){
            et24.setText(vector3[23]);
        }
        if(!vector3[24].equals("") && vector3[24] != null){
            et25.setText(vector3[24]);
        }
        if(!vector3[25].equals("") && vector3[25] != null){
            et26.setText(vector3[25]);
        }
        if(!vector3[26].equals("") && vector3[26] != null){
            et27.setText(vector3[26]);
        }
        if(!vector3[27].equals("") && vector3[27] != null){
            et28.setText(vector3[27]);
        }
        if(!vector3[28].equals("") && vector3[28] != null){
            et29.setText(vector3[28]);
        }
        if(!vector3[29].equals("") && vector3[29] != null){
            et30.setText(vector3[29]);
        }
        if(!vector3[30].equals("") && vector3[30] != null){
            et31.setText(vector3[30]);
        }
        if(!vector3[31].equals("") && vector3[31] != null){
            et32.setText(vector3[31]);
        }
        if(!vector3[32].equals("") && vector3[32] != null){
            et33.setText(vector3[32]);
        }
        if(!vector3[33].equals("") && vector3[33] != null){
            et34.setText(vector3[33]);
        }
        if(!vector3[34].equals("") && vector3[34] != null){
            et35.setText(vector3[34]);
        }
        if(!vector3[35].equals("") && vector3[35] != null){
            et36.setText(vector3[35]);
        }
        if(!vector3[36].equals("") && vector3[36] != null){
            et37.setText(vector3[36]);
        }
        if(!vector3[37].equals("") && vector3[37] != null){
            et38.setText(vector3[37]);
        }
        if(!vector3[38].equals("") && vector3[38] != null){
            et39.setText(vector3[38]);
        }
        if(!vector3[39].equals("") && vector3[39] != null){
            et40.setText(vector3[39]);
        }
        if(!vector3[40].equals("") && vector3[40] != null){
            et41.setText(vector3[40]);
        }
        if(!vector3[41].equals("") && vector3[41] != null){
            et42.setText(vector3[41]);
        }
        if(!vector3[42].equals("") && vector3[42] != null){
            et43.setText(vector3[42]);
        }
        if(!vector3[43].equals("") && vector3[43] != null){
            et44.setText(vector3[43]);
        }
        if(!vector3[44].equals("") && vector3[44] != null){
            et45.setText(vector3[44]);
        }
        if(!vector3[45].equals("") && vector3[45] != null){
            et46.setText(vector3[45]);
        }
        if(!vector3[46].equals("") && vector3[46] != null){
            et47.setText(vector3[46]);
        }
        if(!vector3[47].equals("") && vector3[47] != null){
            et48.setText(vector3[47]);
        }
        if(!vector3[48].equals("") && vector3[48] != null){
            et49.setText(vector3[48]);
        }
        if(!vector3[49].equals("") && vector3[49] != null){
            et50.setText(vector3[49]);
        }
        if(!vector3[50].equals("") && vector3[50] != null){
            et51.setText(vector3[50]);
        }
        if(!vector3[51].equals("") && vector3[51] != null){
            et52.setText(vector3[51]);
        }
        if(!vector3[52].equals("") && vector3[52] != null){
            et53.setText(vector3[52]);
        }
        if(!vector3[53].equals("") && vector3[53] != null){
            et54.setText(vector3[53]);
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

        if (vector[12].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et13.setVisibility(View.VISIBLE);
        } else if (vector[12].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[13].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et14.setVisibility(View.VISIBLE);
        } else if (vector[13].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[14].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et15.setVisibility(View.VISIBLE);
        } else if (vector[14].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }

        if (vector[15].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et16.setVisibility(View.VISIBLE);
        } else if (vector[15].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector[16].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et17.setVisibility(View.VISIBLE);
        } else if (vector[16].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }


        if (vector[17].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et18.setVisibility(View.VISIBLE);
        } else if (vector[17].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector[18].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et19.setVisibility(View.VISIBLE);
        } else if (vector[18].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }

        if (vector[19].equals("SI")) {
            rb39.setChecked(true);
            rb40.setChecked(false);
            et20.setVisibility(View.VISIBLE);
        } else if (vector[19].equals("NO")) {
            rb39.setChecked(false);
            rb40.setChecked(true);
        }

        if (vector[20].equals("SI")) {
            rb41.setChecked(true);
            rb42.setChecked(false);
            et21.setVisibility(View.VISIBLE);
        } else if (vector[20].equals("NO")) {
            rb41.setChecked(false);
            rb42.setChecked(true);
        }

        if (vector[21].equals("SI")) {
            rb43.setChecked(true);
            rb44.setChecked(false);
            et22.setVisibility(View.VISIBLE);
        } else if (vector[21].equals("NO")) {
            rb43.setChecked(false);
            rb44.setChecked(true);
        }


        if (vector[22].equals("SI")) {
            rb45.setChecked(true);
            rb46.setChecked(false);
            et23.setVisibility(View.VISIBLE);
        } else if (vector[22].equals("NO")) {
            rb45.setChecked(false);
            rb46.setChecked(true);
        }

        if (vector[23].equals("SI")) {
            rb47.setChecked(true);
            rb48.setChecked(false);
            et24.setVisibility(View.VISIBLE);
        } else if (vector[23].equals("NO")) {
            rb47.setChecked(false);
            rb48.setChecked(true);
        }

        if (vector[24].equals("SI")) {
            rb49.setChecked(true);
            rb50.setChecked(false);
            et25.setVisibility(View.VISIBLE);
        } else if (vector[24].equals("NO")) {
            rb49.setChecked(false);
            rb50.setChecked(true);
        }

        if (vector[25].equals("SI")) {
            rb51.setChecked(true);
            rb52.setChecked(false);
            et26.setVisibility(View.VISIBLE);
        } else if (vector[25].equals("NO")) {
            rb51.setChecked(false);
            rb52.setChecked(true);
        }

        if (vector[26].equals("SI")) {
            rb53.setChecked(true);
            rb54.setChecked(false);
            et27.setVisibility(View.VISIBLE);
        } else if (vector[26].equals("NO")) {
            rb53.setChecked(false);
            rb54.setChecked(true);
        }

        if (vector[27].equals("SI")) {
            rb55.setChecked(true);
            rb56.setChecked(false);
            et28.setVisibility(View.VISIBLE);
        } else if (vector[27].equals("NO")) {
            rb55.setChecked(false);
            rb56.setChecked(true);
        }

        if (vector[28].equals("SI")) {
            rb57.setChecked(true);
            rb58.setChecked(false);
            et29.setVisibility(View.VISIBLE);
        } else if (vector[28].equals("NO")) {
            rb57.setChecked(false);
            rb58.setChecked(true);
        }

        if (vector[29].equals("SI")) {
            rb59.setChecked(true);
            rb60.setChecked(false);
            et30.setVisibility(View.VISIBLE);
        } else if (vector[29].equals("NO")) {
            rb59.setChecked(false);
            rb60.setChecked(true);
        }


        if (vector[30].equals("SI")) {
            rb61.setChecked(true);
            rb62.setChecked(false);
            et31.setVisibility(View.VISIBLE);
        } else if (vector[30].equals("NO")) {
            rb61.setChecked(false);
            rb62.setChecked(true);
        }

        if (vector[31].equals("SI")) {
            rb63.setChecked(true);
            rb64.setChecked(false);
            et32.setVisibility(View.VISIBLE);
        } else if (vector[31].equals("NO")) {
            rb63.setChecked(false);
            rb64.setChecked(true);
        }

        if (vector[32].equals("SI")) {
            rb65.setChecked(true);
            rb66.setChecked(false);
            et33.setVisibility(View.VISIBLE);
        } else if (vector[32].equals("NO")) {
            rb65.setChecked(false);
            rb66.setChecked(true);
        }

        if (vector[33].equals("SI")) {
            rb67.setChecked(true);
            rb68.setChecked(false);
            et34.setVisibility(View.VISIBLE);
        } else if (vector[33].equals("NO")) {
            rb67.setChecked(false);
            rb68.setChecked(true);
        }

        if (vector[34].equals("SI")) {
            rb69.setChecked(true);
            rb70.setChecked(false);
            et35.setVisibility(View.VISIBLE);
        } else if (vector[34].equals("NO")) {
            rb69.setChecked(false);
            rb70.setChecked(true);
        }


        if (vector[35].equals("SI")) {
            rb71.setChecked(true);
            rb72.setChecked(false);
            et36.setVisibility(View.VISIBLE);
        } else if (vector[35].equals("NO")) {
            rb71.setChecked(false);
            rb72.setChecked(true);
        }

        if (vector[36].equals("SI")) {
            rb73.setChecked(true);
            rb74.setChecked(false);
            et37.setVisibility(View.VISIBLE);
        } else if (vector[36].equals("NO")) {
            rb73.setChecked(false);
            rb74.setChecked(true);
        }

        if (vector[37].equals("SI")) {
            rb75.setChecked(true);
            rb76.setChecked(false);
            et38.setVisibility(View.VISIBLE);
        } else if (vector[37].equals("NO")) {
            rb75.setChecked(false);
            rb76.setChecked(true);
        }

        if (vector[38].equals("SI")) {
            rb77.setChecked(true);
            rb78.setChecked(false);
            edit1.setVisibility(View.VISIBLE);
            et39.setVisibility(View.VISIBLE);
        } else if (vector[38].equals("NO")) {
            rb77.setChecked(false);
            rb78.setChecked(true);
        }

        if(!vector2.equals("") && vector2 != null){
            et1.setText(vector2);
        }


        if (vector[39].equals("SI")) {
            rb79.setChecked(true);
            rb80.setChecked(false);
            et40.setVisibility(View.VISIBLE);
        } else if (vector[39].equals("NO")) {
            rb79.setChecked(false);
            rb80.setChecked(true);
        }

        if (vector[40].equals("SI")) {
            rb81.setChecked(true);
            rb82.setChecked(false);
            et41.setVisibility(View.VISIBLE);
        } else if (vector[40].equals("NO")) {
            rb81.setChecked(false);
            rb82.setChecked(true);
        }

        if (vector[41].equals("SI")) {
            rb83.setChecked(true);
            rb84.setChecked(false);
            et42.setVisibility(View.VISIBLE);
        } else if (vector[41].equals("NO")) {
            rb83.setChecked(false);
            rb84.setChecked(true);
        }

        if (vector[42].equals("SI")) {
            rb85.setChecked(true);
            rb86.setChecked(false);
            et43.setVisibility(View.VISIBLE);
        } else if (vector[42].equals("NO")) {
            rb85.setChecked(false);
            rb86.setChecked(true);
        }

        if (vector[43].equals("SI")) {
            rb87.setChecked(true);
            rb88.setChecked(false);
            et44.setVisibility(View.VISIBLE);
        } else if (vector[43].equals("NO")) {
            rb87.setChecked(false);
            rb88.setChecked(true);
        }


        if (vector[44].equals("SI")) {
            rb89.setChecked(true);
            rb90.setChecked(false);
            et45.setVisibility(View.VISIBLE);
        } else if (vector[44].equals("NO")) {
            rb89.setChecked(false);
            rb90.setChecked(true);
        }

        if (vector[45].equals("SI")) {
            rb91.setChecked(true);
            rb92.setChecked(false);
            et46.setVisibility(View.VISIBLE);
        } else if (vector[45].equals("NO")) {
            rb91.setChecked(false);
            rb92.setChecked(true);
        }

        if (vector[46].equals("SI")) {
            rb93.setChecked(true);
            rb94.setChecked(false);
            et47.setVisibility(View.VISIBLE);
        } else if (vector[46].equals("NO")) {
            rb93.setChecked(false);
            rb94.setChecked(true);
        }

        if (vector[47].equals("SI")) {
            rb95.setChecked(true);
            rb96.setChecked(false);
            et48.setVisibility(View.VISIBLE);
        } else if (vector[47].equals("NO")) {
            rb95.setChecked(false);
            rb96.setChecked(true);
        }

        if (vector[48].equals("SI")) {
            rb97.setChecked(true);
            rb98.setChecked(false);
            et49.setVisibility(View.VISIBLE);
        } else if (vector[48].equals("NO")) {
            rb97.setChecked(false);
            rb98.setChecked(true);
        }


        if (vector[49].equals("SI")) {
            rb99.setChecked(true);
            rb100.setChecked(false);
            et50.setVisibility(View.VISIBLE);
        } else if (vector[49].equals("NO")) {
            rb99.setChecked(false);
            rb100.setChecked(true);
        }

        if (vector[50].equals("SI")) {
            rb101.setChecked(true);
            rb102.setChecked(false);
            et51.setVisibility(View.VISIBLE);
        } else if (vector[50].equals("NO")) {
            rb101.setChecked(false);
            rb102.setChecked(true);
        }

        if (vector[51].equals("SI")) {
            rb103.setChecked(true);
            rb104.setChecked(false);
            et52.setVisibility(View.VISIBLE);
        } else if (vector[51].equals("NO")) {
            rb103.setChecked(false);
            rb104.setChecked(true);
        }

        if (vector[52].equals("SI")) {
            rb105.setChecked(true);
            rb106.setChecked(false);
            et53.setVisibility(View.VISIBLE);
        } else if (vector[52].equals("NO")) {
            rb105.setChecked(false);
            rb106.setChecked(true);
        }

        if (vector[53].equals("SI")) {
            rb107.setChecked(true);
            rb108.setChecked(false);
            et54.setVisibility(View.VISIBLE);
        } else if (vector[53].equals("NO")) {
            rb107.setChecked(false);
            rb108.setChecked(true);
        }



     /*   et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector=et1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });*/
        //Verificacion de los radiobutton

        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2=edit1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector3[0]= et1.getText().toString();
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
                vector3[1]= et2.getText().toString();
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
                vector3[2]= et3.getText().toString();
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
                vector3[3]= et4.getText().toString();
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
                vector3[4]= et5.getText().toString();
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
                vector3[5]= et6.getText().toString();
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
                vector3[6]= et7.getText().toString();
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
                vector3[7]= et8.getText().toString();
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
                vector3[8]= et9.getText().toString();
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
                vector3[9]= et10.getText().toString();
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
                vector3[10]= et11.getText().toString();
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
                vector3[11]= et12.getText().toString();
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
                vector3[12]= et13.getText().toString();
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
                vector3[13]= et14.getText().toString();
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
                vector3[14]= et15.getText().toString();
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
                vector3[15]= et16.getText().toString();
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
                vector3[16]= et17.getText().toString();
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
                vector3[17]= et18.getText().toString();
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
                vector3[18]= et19.getText().toString();
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
                vector3[19]= et20.getText().toString();
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
                vector3[20]= et21.getText().toString();
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
                vector3[21]= et22.getText().toString();
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
                vector3[22]= et23.getText().toString();
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
                vector3[23]= et24.getText().toString();
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
                vector3[24]= et25.getText().toString();
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
                vector3[25]= et26.getText().toString();
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
                vector3[26]= et27.getText().toString();
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
                vector3[27]= et28.getText().toString();
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
                vector3[28]= et29.getText().toString();
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
                vector3[29]= et30.getText().toString();
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
                vector3[30]= et31.getText().toString();
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
                vector3[31]= et32.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });et33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector3[32]= et33.getText().toString();
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
                vector3[33]= et34.getText().toString();
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
                vector3[34]= et35.getText().toString();
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
                vector3[35]= et36.getText().toString();
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
                vector3[36]= et37.getText().toString();
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
                vector3[37]= et38.getText().toString();
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
                vector3[38]= et39.getText().toString();
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
                vector3[39]= et40.getText().toString();
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
                vector3[40]= et41.getText().toString();
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
                vector3[41]= et42.getText().toString();
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
                vector3[42]= et43.getText().toString();
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
                vector3[43]= et44.getText().toString();
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
                vector3[44]= et45.getText().toString();
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
                vector3[45]= et46.getText().toString();
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
                vector3[46]= et47.getText().toString();
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
                vector3[47]= et48.getText().toString();
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
                vector3[48]= et49.getText().toString();
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
                vector3[49]= et50.getText().toString();
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
                vector3[50]= et51.getText().toString();
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
                vector3[51]= et52.getText().toString();
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
                vector3[52]= et53.getText().toString();
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
                vector3[53]= et54.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });








        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[0].equals("1")) {
                if(checkedId==R.id.rb1){
                    et1.setVisibility(View.VISIBLE);
                    vector[0]="SI";
                    rb1.setChecked(true);

                }else if(checkedId==R.id.rb2) {
                    vector[0]="NO";
                    et1.setVisibility(View.GONE);
                    rb2.setChecked(true);
                }
                    }else{
                        vector[0] = "";
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        et1.setVisibility(View.GONE);
                    }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[1].equals("1")) {

                if(checkedId==R.id.rb3){
                    et2.setVisibility(View.VISIBLE);
                    vector[1]="SI";
                    rb3.setChecked(true);
                }else if(checkedId==R.id.rb4) {

                    vector[1]="NO";
                    et2.setVisibility(View.GONE);
                    rb4.setChecked(true);

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
                if(!vector[2].equals("1")) {

                if(checkedId==R.id.rb5){
                    vector[2]="SI";
                    rb5.setChecked(true);
                    et3.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb6) {

                    vector[2]="NO";
                    et3.setVisibility(View.GONE);
                    rb6.setChecked(true);
                }

                    }else{
                        vector[2] = "";
                        rb5.setChecked(false);
                        rb6.setChecked(false);
                        et3.setVisibility(View.GONE);
                    }
            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[3].equals("1")) {

                if(checkedId==R.id.rb7){
                    et4.setVisibility(View.VISIBLE);
                    vector[3]="SI";

                    rb7.setChecked(true);
                }else if(checkedId==R.id.rb8) {

                    vector[3]="NO";
                    et4.setVisibility(View.GONE);
                    rb8.setChecked(true);
                }
                    }else{
                        vector[3] = "";
                        rb7.setChecked(false);
                        rb8.setChecked(false);
                        et4.setVisibility(View.GONE);
                    }
            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[4].equals("1")) {

                if(checkedId==R.id.rb9){

                    vector[4]="SI";
                    et5.setVisibility(View.VISIBLE);
                    rb9.setChecked(true);
                }else if(checkedId==R.id.rb10) {

                    vector[4]="NO";

                    et5.setVisibility(View.GONE);
                    rb10.setChecked(true);
                }
                    }else{
                        vector[4] = "";
                        rb9.setChecked(false);
                        rb10.setChecked(false);
                        et5.setVisibility(View.GONE);
                    }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[5].equals("1")) {

                if(checkedId==R.id.rb11){

                    vector[5]="SI";
                    et6.setVisibility(View.VISIBLE);
                    rb11.setChecked(true);
                }else if(checkedId==R.id.rb12) {

                    vector[5]="NO";

                    et6.setVisibility(View.GONE);
                    rb12.setChecked(true);
                }
                    }else{
                        vector[5] = "";
                        rb11.setChecked(false);
                        rb12.setChecked(false);
                        et6.setVisibility(View.GONE);
                    }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[6].equals("1")) {

                if(checkedId==R.id.rb13){

                    vector[6]="SI";
                    rb13.setChecked(true);
                    et7.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb14) {

                    vector[6]="NO";
                    rb14.setChecked(true);
                    et7.setVisibility(View.GONE);
                }

                    }else{
                        vector[6] = "";
                        rb13.setChecked(false);
                        rb14.setChecked(false);
                        et7.setVisibility(View.GONE);
                    }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[7].equals("1")) {

                if(checkedId==R.id.rb15){

                    vector[7]="SI";
                    et8.setVisibility(View.VISIBLE);
                    rb15.setChecked(true);
                }else if(checkedId==R.id.rb16) {

                    vector[7]="NO";
                    et8.setVisibility(View.GONE);
                    rb16.setChecked(true);
                }
                    }else{
                        vector[7] = "";
                        rb15.setChecked(false);
                        rb16.setChecked(false);
                        et8.setVisibility(View.GONE);
                    }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[8].equals("1")) {

                if(checkedId==R.id.rb17){

                    vector[8]="SI";

                    et9.setVisibility(View.VISIBLE);
                    rb17.setChecked(true);

                }else if(checkedId==R.id.rb18) {

                    vector[8]="NO";
                    et9.setVisibility(View.GONE);
                    rb18.setChecked(true);

                }
                    }else{
                        vector[8] = "";
                        rb17.setChecked(false);
                        rb18.setChecked(false);
                        et9.setVisibility(View.GONE);
                    }
            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[9].equals("1")) {

                if(checkedId==R.id.rb19){

                    vector[9]="SI";

                    et10.setVisibility(View.VISIBLE);
                    rb19.setChecked(true);
                }else if(checkedId==R.id.rb20) {
                    vector[9]="NO";
                    et10.setVisibility(View.GONE);
                    rb20.setChecked(true);


                }
                    }else{
                        vector[9] = "";
                        rb19.setChecked(false);
                        rb20.setChecked(false);
                        et10.setVisibility(View.GONE);
                    }
            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[10].equals("1")) {

                if(checkedId==R.id.rb21){

                    vector[10]="SI";
                    et11.setVisibility(View.VISIBLE);
                    rb21.setChecked(true);
                }else if(checkedId==R.id.rb22) {

                    vector[10] = "NO";

                    et11.setVisibility(View.GONE);
                    rb22.setChecked(true);
                }
                    }else{
                        vector[10] = "";
                        rb21.setChecked(false);
                        rb22.setChecked(false);
                        et11.setVisibility(View.GONE);
                    }
            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[11].equals("1")) {
                if(checkedId==R.id.rb23){
                    vector[11]="SI";
                    et12.setVisibility(View.VISIBLE);
                    rb23.setChecked(true);

                }else if(checkedId==R.id.rb24) {

                    vector[11]="NO";
                    et12.setVisibility(View.GONE);
                    rb24.setChecked(true);

                }

                    }else{
                        vector[11] = "";
                        rb23.setChecked(false);
                        rb24.setChecked(false);
                        et12.setVisibility(View.GONE);
                    }
            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[12].equals("1")) {

                if(checkedId==R.id.rb25){

                    vector[12]="SI";
                    rb25.setChecked(true);
                    et13.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb26) {
                    rb26.setChecked(true);
                    vector[12]="NO";
                    et13.setVisibility(View.GONE);
                }

                    }else{
                        vector[12] = "";
                        rb25.setChecked(false);
                        rb26.setChecked(false);
                        et13.setVisibility(View.GONE);
                    }
            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[13].equals("1")) {

                if(checkedId==R.id.rb27){
                    rb27.setChecked(true);
                    vector[13]="SI";
                    et14.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb28) {
                    rb28.setChecked(true);
                    vector[13]="NO";
                    et14.setVisibility(View.GONE);


                }

                    }else{
                        vector[13] = "";
                        rb27.setChecked(false);
                        rb28.setChecked(false);
                        et14.setVisibility(View.GONE);
                    }
            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[14].equals("1")) {

                if(checkedId==R.id.rb29){

                    vector[14]="SI";
                    rb29.setChecked(true);
                    et15.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb30) {
                    rb30.setChecked(true);
                    vector[14]="NO";
                    et15.setVisibility(View.GONE);

                }
                    }else{
                        vector[14] = "";
                        rb29.setChecked(false);
                        rb30.setChecked(false);
                        et15.setVisibility(View.GONE);
                    }
            }
        });




        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[15].equals("1")) {

                if(checkedId==R.id.rb31){
                    rb31.setChecked(true);
                    vector[15]="SI";
                    et16.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb32) {
                    rb32.setChecked(true);
                    vector[15]="NO";

                    et16.setVisibility(View.GONE);
                }

                    }else{
                        vector[15] = "";
                        rb31.setChecked(false);
                        rb32.setChecked(false);
                        et16.setVisibility(View.GONE);
                    }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[16].equals("1")) {

                if(checkedId==R.id.rb33){
                    rb33.setChecked(true);
                    vector[16]="SI";
                    et17.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb34) {
                    rb34.setChecked(true);
                    vector[16]="NO";

                    et17.setVisibility(View.GONE);
                }

                    }else{
                        vector[16] = "";
                        rb33.setChecked(false);
                        rb34.setChecked(false);
                        et17.setVisibility(View.GONE);
                    }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[17].equals("1")) {

                if(checkedId==R.id.rb35){
                    rb35.setChecked(true);
                    vector[17]="SI";
                    et18.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb36) {
                    rb36.setChecked(true);
                    vector[17]="NO";
                    et18.setVisibility(View.GONE);

                }

                    }else{
                        vector[17] = "";
                        rb35.setChecked(false);
                        rb36.setChecked(false);
                        et18.setVisibility(View.GONE);
                    }
            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[18].equals("1")) {

                if(checkedId==R.id.rb37){
                    rb37.setChecked(true);
                    vector[18]="SI";
                    et19.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb38) {

                    vector[18]="NO";
                    rb38.setChecked(true);
                    et19.setVisibility(View.GONE);
                }

                    }else{
                        vector[18] = "";
                        rb37.setChecked(false);
                        rb38.setChecked(false);
                        et19.setVisibility(View.GONE);
                    }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[19].equals("1")) {

                if(checkedId==R.id.rb39){
                    rb39.setChecked(true);
                    vector[19]="SI";

                    et20.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb40) {
                    rb40.setChecked(true);
                    vector[19]="NO";
                    et20.setVisibility(View.GONE);


                }

                    }else{
                        vector[19] = "";
                        rb39.setChecked(false);
                        rb40.setChecked(false);
                        et20.setVisibility(View.GONE);
                    }
            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[20].equals("1")) {

                if(checkedId==R.id.rb41){
                    rb41.setChecked(true);
                    vector[20]="SI";
                    et21.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb42) {
                    rb42.setChecked(true);
                    vector[20]="NO";

                    et21.setVisibility(View.GONE);
                }

                    }else{
                        vector[20] = "";
                        rb41.setChecked(false);
                        rb42.setChecked(false);
                        et21.setVisibility(View.GONE);
                    }
            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[21].equals("1")) {

                if(checkedId==R.id.rb43){
                    rb43.setChecked(true);
                    vector[21]="SI";
                    et22.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb44) {
                    rb44.setChecked(true);
                    vector[21]="NO";
                    et22.setVisibility(View.GONE);

                }

                    }else{
                        vector[21] = "";
                        rb43.setChecked(false);
                        rb44.setChecked(false);
                        et22.setVisibility(View.GONE);
                    }
            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[22].equals("1")) {

                if(checkedId==R.id.rb45){
                    rb45.setChecked(true);
                    vector[22]="SI";
                    et23.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb46) {
                    rb46.setChecked(true);
                    vector[22]="NO";

                    et23.setVisibility(View.GONE);

                }

                    }else{
                        vector[22] = "";
                        rb45.setChecked(false);
                        rb46.setChecked(false);
                        et23.setVisibility(View.GONE);
                    }
            }
        });



        //24-46


        //Verificacion de los radiobutton


        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[23].equals("1")) {

                if(checkedId==R.id.rb47){
                    rb47.setChecked(true);
                    vector[23]="SI";
                    et24.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb48) {
                    vector[23]="NO";
                    et24.setVisibility(View.GONE);
                    rb48.setChecked(true);
                }

                    }else{
                        vector[23] = "";
                        rb47.setChecked(false);
                        rb48.setChecked(false);
                        et24.setVisibility(View.GONE);
                    }
            }
        });


        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[24].equals("1")) {

                if(checkedId==R.id.rb49){
                    rb49.setChecked(true);
                    vector[24]="SI";
                    et25.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb50) {

                    vector[24]="NO";
                    rb50.setChecked(true);
                    et25.setVisibility(View.GONE);
                }

                    }else{
                        vector[24] = "";
                        rb49.setChecked(false);
                        rb50.setChecked(false);
                        et25.setVisibility(View.GONE);
                    }
            }
        });


        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[25].equals("1")) {

                if(checkedId==R.id.rb51){
                    vector[25]="SI";
                    et26.setVisibility(View.VISIBLE);
                    rb51.setChecked(true);
                }else if(checkedId==R.id.rb52) {
                    rb52.setChecked(true);
                    vector[25]="NO";
                    et26.setVisibility(View.GONE);

                }

                    }else{
                        vector[25] = "";
                        rb51.setChecked(false);
                        rb52.setChecked(false);
                        et26.setVisibility(View.GONE);
                    }
            }
        });


        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[26].equals("1")) {

                if(checkedId==R.id.rb53){
                    rb53.setChecked(true);
                    vector[26]="SI";
                    et27.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb54) {
                    rb54.setChecked(true);
                    vector[26]="NO";
                    et27.setVisibility(View.GONE);
                }

                    }else{
                        vector[26] = "";
                        rb53.setChecked(false);
                        rb54.setChecked(false);
                        et27.setVisibility(View.GONE);
                    }
            }
        });


        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[27].equals("1")) {

                if(checkedId==R.id.rb55){
                    rb55.setChecked(true);
                    vector[27]="SI";
                    et28.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb56) {
                    rb56.setChecked(true);
                    vector[27]="NO";

                    et28.setVisibility(View.GONE);

                }

                    }else{
                        vector[27] = "";
                        rb55.setChecked(false);
                        rb56.setChecked(false);
                        et28.setVisibility(View.GONE);
                    }

            }
        });


        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[28].equals("1")) {

                if(checkedId==R.id.rb57){
                    rb57.setChecked(true);
                    vector[28]="SI";

                    et29.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb58) {
                    rb58.setChecked(true);
                    vector[28]="NO";

                    et29.setVisibility(View.GONE);
                }

                    }else{
                        vector[28] = "";
                        rb57.setChecked(false);
                        rb58.setChecked(false);
                        et29.setVisibility(View.GONE);
                    }
            }
        });



        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[29].equals("1")) {

                if(checkedId==R.id.rb59){
                    rb59.setChecked(true);
                    vector[29]="SI";
                    et30.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb60) {

                    vector[29]="NO";
                    et30.setVisibility(View.GONE);
                    rb60.setChecked(true);
                }

                    }else{
                        vector[29] = "";
                        rb59.setChecked(false);
                        rb60.setChecked(false);
                        et30.setVisibility(View.GONE);
                    }
            }
        });

///////////////////////////////////////////////////////
        ///////////////////////
        ///////////////////
        ///////////////
        ///////////
        ///////////

        rg31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[30].equals("1")) {

                if(checkedId==R.id.rb61){
                    rb61.setChecked(true);
                    vector[30]="SI";
                    et31.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb62) {
                    rb62.setChecked(true);
                    vector[30]="NO";

                    et31.setVisibility(View.GONE);
                }

                    }else{
                        vector[30] = "";
                        rb61.setChecked(false);
                        rb62.setChecked(false);
                        et31.setVisibility(View.GONE);
                    }
            }
        });


        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[31].equals("1")) {

                if(checkedId==R.id.rb63){
                    rb63.setChecked(true);
                    vector[31]="SI";

                    et32.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb64) {
                    rb64.setChecked(true);
                    vector[31]="NO";

                    et32.setVisibility(View.GONE);

                }

                    }else{
                        vector[31] = "";
                        rb63.setChecked(false);
                        rb64.setChecked(false);
                        et32.setVisibility(View.GONE);
                    }
            }
        });






        ///otro9-18


        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[32].equals("1")) {

                if(checkedId==R.id.rb65){
                    rb65.setChecked(true);
                    vector[32]="SI";
                    et33.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb66) {
                    vector[32]="NO";
                    rb66.setChecked(true);
                    et33.setVisibility(View.GONE);

                }

                    }else{
                        vector[32] = "";
                        rb65.setChecked(false);
                        rb66.setChecked(false);
                        et33.setVisibility(View.GONE);
                    }
            }
        });


        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[33].equals("1")) {

                if(checkedId==R.id.rb67){
                    rb67.setChecked(true);
                    vector[33]="SI";
                    et34.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb68) {
                    rb68.setChecked(true);
                    vector[33]="NO";

                    et34.setVisibility(View.GONE);
                }

                    }else{
                        vector[33] = "";
                        rb67.setChecked(false);
                        rb68.setChecked(false);
                        et34.setVisibility(View.GONE);
                    }

            }
        });


        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[34].equals("1")) {

                if(checkedId==R.id.rb69){
                    vector[34]="SI";
                    rb69.setChecked(true);
                    et35.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb70) {
                    rb70.setChecked(true);
                    vector[34]="NO";

                    et35.setVisibility(View.GONE);
                }
                    }else{
                        vector[34] = "";
                        rb69.setChecked(false);
                        rb70.setChecked(false);
                        et35.setVisibility(View.GONE);
                    }
            }
        });


        rg36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[35].equals("1")) {

                if(checkedId==R.id.rb71){
                    rb71.setChecked(true);
                    vector[35]="SI";
                    et36.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb72) {
                    rb72.setChecked(true);
                    vector[35]="NO";
                    et36.setVisibility(View.GONE);
                }

                    }else{
                        vector[35] = "";
                        rb71.setChecked(false);
                        rb72.setChecked(false);
                        et36.setVisibility(View.GONE);
                    }

            }
        });


        rg37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[36].equals("1")) {

                if(checkedId==R.id.rb73){
                    rb73.setChecked(true);
                    vector[36]="SI";

                    et37.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb74) {
                    rb74.setChecked(true);
                    vector[36]="NO";
                    et37.setVisibility(View.GONE);


                }

                    }else{
                        vector[36] = "";
                        rb73.setChecked(false);
                        rb74.setChecked(false);
                        et37.setVisibility(View.GONE);
                    }
            }
        });


        rg38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[37].equals("1")) {

                if(checkedId==R.id.rb75){
                    rb75.setChecked(true);
                    vector[37]="SI";
                    et38.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb76) {
                    rb76.setChecked(true);
                    vector[37]="NO";
                    et38.setVisibility(View.GONE);

                }

                    }else{
                        vector[37] = "";
                        rb75.setChecked(false);
                        rb76.setChecked(false);
                        et38.setVisibility(View.GONE);
                    }
            }
        });



        rg39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[38].equals("1")) {

                if(checkedId==R.id.rb77){
                    rb77.setChecked(true);
                    vector[38]="SI";
                    edit1.setVisibility(View.VISIBLE);
                    et39.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb78) {
                    rb78.setChecked(true);
                    vector[38]="NO";
                    edit1.setVisibility(View.GONE);
                    et39.setVisibility(View.GONE);


                }

                    }else{
                        vector[38] = "";
                        rb77.setChecked(false);
                        rb78.setChecked(false);
                        edit1.setVisibility(View.GONE);
                        et39.setVisibility(View.GONE);
                    }
            }
        });


        rg40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[39].equals("1")) {

                if(checkedId==R.id.rb79){
                    rb79.setChecked(true);
                    vector[39]="SI";
                    et40.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb80) {
                    rb80.setChecked(true);
                    vector[39]="NO";
                    et40.setVisibility(View.GONE);

                }

                    }else{
                        vector[39] = "";
                        rb79.setChecked(false);
                        rb80.setChecked(false);
                        et40.setVisibility(View.GONE);
                    }
            }
        });

//----------------------------------------------------------------------
        rg41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[40].equals("1")) {

                if(checkedId==R.id.rb81){
                    rb81.setChecked(true);
                    vector[40]="SI";
                    et41.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb82) {
                    rb82.setChecked(true);
                    vector[40]="NO";
                    et41.setVisibility(View.GONE);

                }

                    }else{
                        vector[40] = "";
                        rb81.setChecked(false);
                        rb82.setChecked(false);
                        et41.setVisibility(View.GONE);
                    }
            }
        });

        rg42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[41].equals("1")) {

                if(checkedId==R.id.rb83){
                    rb83.setChecked(true);
                    vector[41]="SI";
                    et42.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb84) {
                    rb84.setChecked(true);
                    vector[41]="NO";
                    et42.setVisibility(View.GONE);

                }

                    }else{
                        vector[41] = "";
                        rb83.setChecked(false);
                        rb84.setChecked(false);
                        et42.setVisibility(View.GONE);
                    }
            }
        });

        rg43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[42].equals("1")) {

                if(checkedId==R.id.rb85){
                    rb85.setChecked(true);
                    vector[42]="SI";
                    et43.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb86) {
                    rb86.setChecked(true);
                    vector[42]="NO";

                    et43.setVisibility(View.GONE);

                }

                    }else{
                        vector[42] = "";
                        rb85.setChecked(false);
                        rb86.setChecked(false);
                        et43.setVisibility(View.GONE);
                    }
            }
        });


        rg44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[43].equals("1")) {

                if(checkedId==R.id.rb87){
                    rb87.setChecked(true);
                    vector[43]="SI";

                    et44.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb88) {
                    rb88.setChecked(true);
                    vector[43]="NO";
                    et44.setVisibility(View.GONE);

                }

                    }else{
                        vector[43] = "";
                        rb87.setChecked(false);
                        rb88.setChecked(false);
                        et44.setVisibility(View.GONE);
                    }
            }
        });

        rg45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[44].equals("1")) {

                if(checkedId==R.id.rb89){
                    rb89.setChecked(true);
                    vector[44]="SI";

                    et45.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb90) {
                    rb90.setChecked(true);
                    vector[44]="NO";
                    et45.setVisibility(View.GONE);

                }

                    }else{
                        vector[44] = "";
                        rb89.setChecked(false);
                        rb90.setChecked(false);
                        et45.setVisibility(View.GONE);
                    }
            }
        });

        rg46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[45].equals("1")) {

                if(checkedId==R.id.rb91){
                    rb91.setChecked(true);
                    vector[45]="SI";

                    et46.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb92) {
                    rb92.setChecked(true);
                    vector[45]="NO";

                    et46.setVisibility(View.GONE);

                }

                    }else{
                        vector[45] = "";
                        rb91.setChecked(false);
                        rb92.setChecked(false);
                        et46.setVisibility(View.GONE);
                    }
            }
        });


        //47-54

        rg47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[46].equals("1")) {

                if(checkedId==R.id.rb93){
                    rb93.setChecked(true);
                    vector[46]="SI";
                    et47.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb94) {
                    rb94.setChecked(true);
                    vector[46]="NO";

                    et47.setVisibility(View.GONE);

                }

                    }else{
                        vector[46] = "";
                        rb93.setChecked(false);
                        rb94.setChecked(false);
                        et47.setVisibility(View.GONE);
                    }
            }
        });

        rg48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[47].equals("1")) {

                if(checkedId==R.id.rb95){
                    rb95.setChecked(true);
                    vector[47]="SI";

                    et48.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb96) {
                    rb96.setChecked(true);
                    vector[47]="NO";
                    et48.setVisibility(View.GONE);


                }
                    }else{
                        vector[47] = "";
                        rb95.setChecked(false);
                        rb96.setChecked(false);
                        et48.setVisibility(View.GONE);
                    }
            }
        });

        rg49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[48].equals("1")) {

                if(checkedId==R.id.rb97){
                    rb97.setChecked(true);
                    vector[48]="SI";
                    et49.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb98) {
                    rb98.setChecked(true);
                    vector[48] = "NO";


                    et49.setVisibility(View.GONE);
                }
                    }else{
                        vector[48] = "";
                        rb97.setChecked(false);
                        rb98.setChecked(false);
                        et49.setVisibility(View.GONE);
                    }
            }
        });

        rg50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[49].equals("1")) {

                if(checkedId==R.id.rb99){
                    rb99.setChecked(true);
                    vector[49]="SI";

                    et50.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb100) {
                    rb100.setChecked(true);
                    vector[49]="NO";

                    et50.setVisibility(View.GONE);

                }
                    }else{
                        vector[49] = "";
                        rb99.setChecked(false);
                        rb100.setChecked(false);
                        et50.setVisibility(View.GONE);
                    }
            }
        });

        rg51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[50].equals("1")) {

                if(checkedId==R.id.rb101){
                    rb101.setChecked(true);
                    vector[50]="SI";

                    et51.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb102) {
                    rb102.setChecked(true);
                    vector[50]="NO";

                    et51.setVisibility(View.GONE);

                }

                    }else{
                        vector[50] = "";
                        rb101.setChecked(false);
                        rb102.setChecked(false);
                        et51.setVisibility(View.GONE);
                    }
            }
        });

        rg52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[51].equals("1")) {

                if(checkedId==R.id.rb103){
                    rb103.setChecked(true);
                    vector[51]="SI";
                    et52.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb104) {
                    rb104.setChecked(true);
                    vector[51]="NO";
                    et52.setVisibility(View.GONE);


                }
                    }else{
                        vector[51] = "";
                        rb103.setChecked(false);
                        rb104.setChecked(false);
                        et52.setVisibility(View.GONE);
                    }
            }
        });

        rg53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[52].equals("1")) {

                if(checkedId==R.id.rb105){
                    rb105.setChecked(true);
                    vector[52]="SI";

                    et53.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb106) {
                    rb106.setChecked(true);
                    vector[52]="NO";

                    et53.setVisibility(View.GONE);

                }
                    }else{
                        vector[52] = "";
                        rb105.setChecked(false);
                        rb106.setChecked(false);
                        et53.setVisibility(View.GONE);
                    }
            }
        });

        rg54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[53].equals("1")) {

                if(checkedId==R.id.rb107){
                    rb107.setChecked(true);
                    vector[53]="SI";
                    et54.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb108) {
                    rb108.setChecked(true);
                    vector[53] = "NO";

                    et54.setVisibility(View.GONE);

                }
                    }else{
                        vector[53] = "";
                        rb107.setChecked(false);
                        rb108.setChecked(false);
                        et54.setVisibility(View.GONE);
                    }
            }
        });

    }

    public void eventtext1 (View view){
        System.out.println("eventext2");
        vector[0]= "1";
        rb1.setChecked(false);
        rb2.setChecked(false);

        vector3[0]="";
        et1.setVisibility(View.GONE);
        et1.setText("");

        if(vector[0]=="1"){
            System.out.println("cambio");
            vector[0]="";
        }
    }

    public void eventtext2 (View view){
        System.out.println("eventext2");
        vector[1]= "1";
        rb3.setChecked(false);
        rb4.setChecked(false);

        vector3[1]="";
        et2.setVisibility(View.GONE);
        et2.setText("");

        if(vector[1]=="1"){
            System.out.println("cambio");
            vector[1]="";
        }
    }

    public void eventtext3 (View view){
        System.out.println("eventext2");
        vector[2]= "1";
        rb5.setChecked(false);
        rb6.setChecked(false);

        vector3[2]="";
        et3.setVisibility(View.GONE);
        et3.setText("");

        if(vector[2]=="1"){
            System.out.println("cambio");
            vector[2]="";
        }
    }

    public void eventtext4 (View view){
        System.out.println("eventext2");
        vector[3]= "1";
        rb7.setChecked(false);
        rb8.setChecked(false);

        vector3[3]="";
        et4.setVisibility(View.GONE);
        et4.setText("");

        if(vector[3]=="1"){
            System.out.println("cambio");
            vector[3]="";
        }
    }

    public void eventtext5 (View view){
        System.out.println("eventext2");
        vector[4]= "1";
        rb9.setChecked(false);
        rb10.setChecked(false);

        vector3[4]="";
        et5.setVisibility(View.GONE);
        et5.setText("");

        if(vector[4]=="1"){
            System.out.println("cambio");
            vector[4]="";
        }
    }

    public void eventtext6 (View view){
        System.out.println("eventext2");
        vector[5]= "1";
        rb11.setChecked(false);
        rb12.setChecked(false);

        vector3[5]="";
        et6.setVisibility(View.GONE);
        et6.setText("");

        if(vector[5]=="1"){
            System.out.println("cambio");
            vector[5]="";
        }
    }

    public void eventtext7 (View view){
        System.out.println("eventext2");
        vector[6]= "1";
        rb13.setChecked(false);
        rb14.setChecked(false);

        vector3[6]="";
        et7.setVisibility(View.GONE);
        et7.setText("");

        if(vector[6]=="1"){
            System.out.println("cambio");
            vector[6]="";
        }
    }


    public void eventtext8 (View view){
        System.out.println("eventext2");
        vector[7]= "1";
        rb15.setChecked(false);
        rb16.setChecked(false);

        vector3[7]="";
        et8.setVisibility(View.GONE);
        et8.setText("");

        if(vector[7]=="1"){
            System.out.println("cambio");
            vector[7]="";
        }
    }

    public void eventtext9 (View view){
        System.out.println("eventext2");
        vector[8]= "1";
        rb17.setChecked(false);
        rb18.setChecked(false);

        vector3[8]="";
        et9.setVisibility(View.GONE);
        et9.setText("");

        if(vector[8]=="1"){
            System.out.println("cambio");
            vector[8]="";
        }
    }

    public void eventtext10 (View view){
        System.out.println("eventext2");
        vector[9]= "1";
        rb19.setChecked(false);
        rb20.setChecked(false);

        vector3[9]="";
        et10.setVisibility(View.GONE);
        et10.setText("");

        if(vector[9]=="1"){
            System.out.println("cambio");
            vector[9]="";
        }
    }

    public void eventtext11 (View view){
        System.out.println("eventext2");
        vector[10]= "1";
        rb21.setChecked(false);
        rb22.setChecked(false);

        vector3[10]="";
        et11.setVisibility(View.GONE);
        et11.setText("");

        if(vector[10]=="1"){
            System.out.println("cambio");
            vector[10]="";
        }
    }

    public void eventtext12 (View view){
        System.out.println("eventext2");
        vector[11]= "1";
        rb23.setChecked(false);
        rb24.setChecked(false);

        vector3[11]="";
        et12.setVisibility(View.GONE);
        et12.setText("");

        if(vector[11]=="1"){
            System.out.println("cambio");
            vector[11]="";
        }
    }

    public void eventtext13 (View view){
        System.out.println("eventext2");
        vector[12]= "1";
        rb25.setChecked(false);
        rb26.setChecked(false);

        vector3[12]="";
        et13.setVisibility(View.GONE);
        et13.setText("");

        if(vector[12]=="1"){
            System.out.println("cambio");
            vector[12]="";
        }
    }

    public void eventtext14 (View view){
        System.out.println("eventext2");
        vector[13]= "1";
        rb27.setChecked(false);
        rb28.setChecked(false);

        vector3[13]="";
        et14.setVisibility(View.GONE);
        et14.setText("");

        if(vector[13]=="1"){
            System.out.println("cambio");
            vector[13]="";
        }
    }

    public void eventtext15 (View view){
        System.out.println("eventext2");
        vector[14]= "1";
        rb29.setChecked(false);
        rb30.setChecked(false);

        vector3[14]="";
        et15.setVisibility(View.GONE);
        et15.setText("");

        if(vector[14]=="1"){
            System.out.println("cambio");
            vector[14]="";
        }
    }

    public void eventtext16 (View view){
        System.out.println("eventext2");
        vector[15]= "1";
        rb31.setChecked(false);
        rb32.setChecked(false);

        vector3[15]="";
        et16.setVisibility(View.GONE);
        et16.setText("");

        if(vector[15]=="1"){
            System.out.println("cambio");
            vector[15]="";
        }
    }

    public void eventtext17 (View view){
        System.out.println("eventext2");
        vector[16]= "1";
        rb33.setChecked(false);
        rb34.setChecked(false);

        vector3[16]="";
        et17.setVisibility(View.GONE);
        et17.setText("");

        if(vector[16]=="1"){
            System.out.println("cambio");
            vector[16]="";
        }
    }


    public void eventtext18 (View view){
        System.out.println("eventext2");
        vector[17]= "1";
        rb35.setChecked(false);
        rb36.setChecked(false);

        vector3[17]="";
        et18.setVisibility(View.GONE);
        et18.setText("");

        if(vector[17]=="1"){
            System.out.println("cambio");
            vector[17]="";
        }
    }

    public void eventtext19 (View view){
        System.out.println("eventext2");
        vector[18]= "1";
        rb37.setChecked(false);
        rb38.setChecked(false);

        vector3[18]="";
        et19.setVisibility(View.GONE);
        et19.setText("");

        if(vector[18]=="1"){
            System.out.println("cambio");
            vector[18]="";
        }
    }

    public void eventtext20 (View view){
        System.out.println("eventext2");
        vector[19]= "1";
        rb39.setChecked(false);
        rb40.setChecked(false);

        vector3[19]="";
        et20.setVisibility(View.GONE);
        et20.setText("");

        if(vector[19]=="1"){
            System.out.println("cambio");
            vector[19]="";
        }
    }

    public void eventtext21 (View view){
        System.out.println("eventext2");
        vector[20]= "1";
        rb41.setChecked(false);
        rb42.setChecked(false);

        vector3[20]="";
        et21.setVisibility(View.GONE);
        et21.setText("");

        if(vector[20]=="1"){
            System.out.println("cambio");
            vector[20]="";
        }
    }

    public void eventtext22 (View view){
        System.out.println("eventext2");
        vector[21]= "1";
        rb43.setChecked(false);
        rb44.setChecked(false);

        vector3[21]="";
        et22.setVisibility(View.GONE);
        et22.setText("");

        if(vector[21]=="1"){
            System.out.println("cambio");
            vector[21]="";
        }
    }

    public void eventtext23 (View view){
        System.out.println("eventext2");
        vector[22]= "1";
        rb45.setChecked(false);
        rb46.setChecked(false);

        vector3[22]="";
        et23.setVisibility(View.GONE);
        et23.setText("");

        if(vector[22]=="1"){
            System.out.println("cambio");
            vector[22]="";
        }
    }

    public void eventtext24 (View view){
        System.out.println("eventext2");
        vector[23]= "1";
        rb47.setChecked(false);
        rb48.setChecked(false);

        vector3[23]="";
        et24.setVisibility(View.GONE);
        et24.setText("");

        if(vector[23]=="1"){
            System.out.println("cambio");
            vector[23]="";
        }
    }

    public void eventtext25 (View view){
        System.out.println("eventext2");
        vector[24]= "1";
        rb49.setChecked(false);
        rb50.setChecked(false);

        vector3[24]="";
        et25.setVisibility(View.GONE);
        et25.setText("");

        if(vector[24]=="1"){
            System.out.println("cambio");
            vector[24]="";
        }
    }

    public void eventtext26 (View view){
        System.out.println("eventext2");
        vector[25]= "1";
        rb51.setChecked(false);
        rb52.setChecked(false);

        vector3[25]="";
        et26.setVisibility(View.GONE);
        et26.setText("");

        if(vector[25]=="1"){
            System.out.println("cambio");
            vector[25]="";
        }
    }

    public void eventtext27 (View view){
        System.out.println("eventext2");
        vector[26]= "1";
        rb53.setChecked(false);
        rb54.setChecked(false);

        vector3[26]="";
        et27.setVisibility(View.GONE);
        et27.setText("");

        if(vector[26]=="1"){
            System.out.println("cambio");
            vector[26]="";
        }
    }

    public void eventtext28 (View view){
        System.out.println("eventext2");
        vector[27]= "1";
        rb55.setChecked(false);
        rb56.setChecked(false);

        vector3[27]="";
        et28.setVisibility(View.GONE);
        et28.setText("");

        if(vector[27]=="1"){
            System.out.println("cambio");
            vector[27]="";
        }
    }

    public void eventtext29 (View view){
        System.out.println("eventext2");
        vector[28]= "1";
        rb57.setChecked(false);
        rb58.setChecked(false);

        vector3[28]="";
        et29.setVisibility(View.GONE);
        et29.setText("");

        if(vector[28]=="1"){
            System.out.println("cambio");
            vector[28]="";
        }
    }

    public void eventtext30 (View view){
        System.out.println("eventext2");
        vector[29]= "1";
        rb59.setChecked(false);
        rb60.setChecked(false);

        vector3[29]="";
        et30.setVisibility(View.GONE);
        et30.setText("");

        if(vector[29]=="1"){
            System.out.println("cambio");
            vector[29]="";
        }
    }

    public void eventtext31 (View view){
        System.out.println("eventext2");
        vector[30]= "1";
        rb61.setChecked(false);
        rb62.setChecked(false);

        vector3[30]="";
        et31.setVisibility(View.GONE);
        et31.setText("");

        if(vector[30]=="1"){
            System.out.println("cambio");
            vector[30]="";
        }
    }

    public void eventtext32 (View view){
        System.out.println("eventext2");
        vector[31]= "1";
        rb63.setChecked(false);
        rb64.setChecked(false);

        vector3[31]="";
        et32.setVisibility(View.GONE);
        et32.setText("");

        if(vector[31]=="1"){
            System.out.println("cambio");
            vector[31]="";
        }
    }

    public void eventtext33 (View view){
        System.out.println("eventext2");
        vector[32]= "1";
        rb65.setChecked(false);
        rb66.setChecked(false);

        vector3[32]="";
        et33.setVisibility(View.GONE);
        et33.setText("");

        if(vector[32]=="1"){
            System.out.println("cambio");
            vector[32]="";
        }
    }

    public void eventtext34 (View view){
        System.out.println("eventext2");
        vector[33]= "1";
        rb67.setChecked(false);
        rb68.setChecked(false);

        vector3[33]="";
        et34.setVisibility(View.GONE);
        et34.setText("");

        if(vector[33]=="1"){
            System.out.println("cambio");
            vector[33]="";
        }
    }

    public void eventtext35 (View view){
        System.out.println("eventext2");
        vector[34]= "1";
        rb69.setChecked(false);
        rb70.setChecked(false);

        vector3[34]="";
        et35.setVisibility(View.GONE);
        et35.setText("");

        if(vector[34]=="1"){
            System.out.println("cambio");
            vector[34]="";
        }
    }

    public void eventtext36 (View view){
        System.out.println("eventext2");
        vector[35]= "1";
        rb71.setChecked(false);
        rb72.setChecked(false);

        vector3[35]="";
        et36.setVisibility(View.GONE);
        et36.setText("");

        if(vector[35]=="1"){
            System.out.println("cambio");
            vector[35]="";
        }
    }

    public void eventtext37 (View view){
        System.out.println("eventext2");
        vector[36]= "1";
        rb73.setChecked(false);
        rb74.setChecked(false);

        vector3[36]="";
        et37.setVisibility(View.GONE);
        et37.setText("");

        if(vector[36]=="1"){
            System.out.println("cambio");
            vector[36]="";
        }
    }

    public void eventtext38 (View view){
        System.out.println("eventext2");
        vector[37]= "1";
        rb75.setChecked(false);
        rb76.setChecked(false);

        vector3[37]="";
        et38.setVisibility(View.GONE);
        et38.setText("");

        if(vector[37]=="1"){
            System.out.println("cambio");
            vector[37]="";
        }
    }

    public void eventtext39 (View view){
        System.out.println("eventext2");
        vector[38]= "1";
        rb77.setChecked(false);
        rb78.setChecked(false);

        vector3[38]="";
        et39.setVisibility(View.GONE);
        et39.setText("");

        if(vector[38]=="1"){
            System.out.println("cambio");
            vector[38]="";
        }
    }

    public void eventtext40 (View view){
        System.out.println("eventext2");
        vector[39]= "1";
        rb79.setChecked(false);
        rb80.setChecked(false);

        vector3[39]="";
        et40.setVisibility(View.GONE);
        et40.setText("");

        if(vector[39]=="1"){
            System.out.println("cambio");
            vector[39]="";
        }
    }

    public void eventtext41 (View view){
        System.out.println("eventext2");
        vector[40]= "1";
        rb81.setChecked(false);
        rb82.setChecked(false);

        vector3[40]="";
        et41.setVisibility(View.GONE);
        et41.setText("");

        if(vector[40]=="1"){
            System.out.println("cambio");
            vector[40]="";
        }
    }

    public void eventtext42 (View view){
        System.out.println("eventext2");
        vector[41]= "1";
        rb83.setChecked(false);
        rb84.setChecked(false);

        vector3[41]="";
        et42.setVisibility(View.GONE);
        et42.setText("");

        if(vector[41]=="1"){
            System.out.println("cambio");
            vector[41]="";
        }
    }

    public void eventtext43 (View view){
        System.out.println("eventext2");
        vector[42]= "1";
        rb85.setChecked(false);
        rb86.setChecked(false);

        vector3[42]="";
        et43.setVisibility(View.GONE);
        et43.setText("");

        if(vector[42]=="1"){
            System.out.println("cambio");
            vector[42]="";
        }
    }

    public void eventtext44 (View view){
        System.out.println("eventext2");
        vector[43]= "1";
        rb87.setChecked(false);
        rb88.setChecked(false);

        vector3[43]="";
        et44.setVisibility(View.GONE);
        et44.setText("");

        if(vector[43]=="1"){
            System.out.println("cambio");
            vector[43]="";
        }
    }

    public void eventtext45 (View view){
        System.out.println("eventext2");
        vector[44]= "1";
        rb89.setChecked(false);
        rb90.setChecked(false);

        vector3[44]="";
        et45.setVisibility(View.GONE);
        et45.setText("");

        if(vector[44]=="1"){
            System.out.println("cambio");
            vector[44]="";
        }
    }

    public void eventtext46 (View view){
        System.out.println("eventext2");
        vector[45]= "1";
        rb91.setChecked(false);
        rb92.setChecked(false);

        vector3[45]="";
        et46.setVisibility(View.GONE);
        et46.setText("");

        if(vector[45]=="1"){
            System.out.println("cambio");
            vector[45]="";
        }
    }

    public void eventtext47 (View view){
        System.out.println("eventext2");
        vector[46]= "1";
        rb93.setChecked(false);
        rb94.setChecked(false);

        vector3[46]="";
        et47.setVisibility(View.GONE);
        et47.setText("");

        if(vector[46]=="1"){
            System.out.println("cambio");
            vector[46]="";
        }
    }

    public void eventtext48 (View view){
        System.out.println("eventext2");
        vector[47]= "1";
        rb95.setChecked(false);
        rb96.setChecked(false);

        vector3[47]="";
        et48.setVisibility(View.GONE);
        et48.setText("");

        if(vector[47]=="1"){
            System.out.println("cambio");
            vector[47]="";
        }
    }

    public void eventtext49 (View view){
        System.out.println("eventext2");
        vector[48]= "1";
        rb97.setChecked(false);
        rb98.setChecked(false);

        vector3[48]="";
        et49.setVisibility(View.GONE);
        et49.setText("");

        if(vector[48]=="1"){
            System.out.println("cambio");
            vector[48]="";
        }
    }

    public void eventtext50 (View view){
        System.out.println("eventext2");
        vector[49]= "1";
        rb99.setChecked(false);
        rb100.setChecked(false);

        vector3[49]="";
        et50.setVisibility(View.GONE);
        et50.setText("");

        if(vector[49]=="1"){
            System.out.println("cambio");
            vector[49]="";
        }
    }

    public void eventtext51 (View view){
        System.out.println("eventext2");
        vector[50]= "1";
        rb101.setChecked(false);
        rb102.setChecked(false);

        vector3[50]="";
        et51.setVisibility(View.GONE);
        et51.setText("");

        if(vector[50]=="1"){
            System.out.println("cambio");
            vector[50]="";
        }
    }

    public void eventtext52 (View view){
        System.out.println("eventext2");
        vector[51]= "1";
        rb103.setChecked(false);
        rb104.setChecked(false);

        vector3[51]="";
        et52.setVisibility(View.GONE);
        et52.setText("");

        if(vector[51]=="1"){
            System.out.println("cambio");
            vector[51]="";
        }
    }

    public void eventtext53 (View view){
        System.out.println("eventext2");
        vector[52]= "1";
        rb105.setChecked(false);
        rb106.setChecked(false);

        vector3[52]="";
        et53.setVisibility(View.GONE);
        et53.setText("");

        if(vector[52]=="1"){
            System.out.println("cambio");
            vector[52]="";
        }
    }

    public void eventtext54 (View view){
        System.out.println("eventext2");
        vector[53]= "1";
        rb107.setChecked(false);
        rb108.setChecked(false);

        vector3[53]="";
        et54.setVisibility(View.GONE);
        et54.setText("");

        if(vector[53]=="1"){
            System.out.println("cambio");
            vector[53]="";
        }
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

    static public boolean revisar(Context context){
        aviso ="";
        boolean bandera = true;
        boolean banderanula=true;
        banderaTotal = true;


        for (int i = 0; i < 54; i++) {
            if (vector[i] == null || vector[i].equals("")) {
                vector[i] = "N/P";
                banderanula = false;
            }
        }

        if (vector[38] == "SI") {

            if (vector2.equals("")) {
                bandera = false;
            }
        }

        if (!quintanaroo_id_riesgo_interno.siguiente1()) {
            aviso = aviso +"1";
            banderaTotal = false;
        }

        if(!quintanaroo_id_riesgo_interno_estructura_1.siguiente2()){
            aviso = aviso +", 2";
            banderaTotal = false;
        }

        if(!quintanaroo_id_riesgo_interno_escaleraservicio_2.siguiente3()){
            aviso = aviso +", 3";
            banderaTotal = false;
        }


        if(!quintanaroo_id_riesgo_interno_instalaciones_3.siguiente4()){
            aviso = aviso +", 4";
            banderaTotal = false;
        }

       // if(!quintanaroo_id_riesgo_interno_noEstructurales_4.siguiente5()){
         //   aviso = aviso +", 5";
           // banderaTotal = false;
        //}

        if(!quintanaroo_id_riesgo_interno_equiposyservicios_5.siguiente6()){
            aviso = aviso +", 6";
            banderaTotal = false;
        }

       // if(!bandera){

            //aviso = aviso +", 7";
          //  banderaTotal = false;
        //}

        if(banderaTotal){

            return true;


        }else{

            Toast.makeText(context,"Revisa las actividades " +aviso, Toast.LENGTH_LONG).show();
            return false;

        }

    }


    public void final_interno(View view) {


        if(revisar(getApplicationContext())){

            onClick(view);

        }else{
            Toast.makeText(this, "revisa las paginas " + aviso, LENGTH_SHORT).show();
        }
    }


    public void onClick (View view){



        try {
            directorio2 = new File(index_QuintanaRoo.file());
            if(directorio2 != null) {
                pdfFile = new File(directorio2.getPath(), "Riesgos Internos.pdf");
            }

            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();


            tablaConcatenacion= quintanaroo_id_riesgo_interno.onClick() +
                    quintanaroo_id_riesgo_interno_estructura_1.onClick()+
                    quintanaroo_id_riesgo_interno_escaleraservicio_2.onClick()+
                    quintanaroo_id_riesgo_interno_instalaciones_3.onClick()+
                    quintanaroo_id_riesgo_interno_noEstructurales_4.onClick()+
                    quintanaroo_id_riesgo_interno_equiposyservicios_5.onClick()+

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">OTROS RIESGOS INTERNOS</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">Objetos que pueden caer:</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"3%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"67%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"20%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Lámparas</td>";
            agregarRenglon(vector[0], vector3[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Candiles</td>";
            agregarRenglon(vector[1], vector3[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Bocinas</td>";
            agregarRenglon(vector[2], vector3[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Rejillas</td>";
            agregarRenglon(vector[3], vector3[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Aparadores de Vidrio</td>";
            agregarRenglon(vector[4], vector3[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Canceles de vidrio</td>";
            agregarRenglon(vector[5], vector3[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Candelabros</td>";
            agregarRenglon(vector[6], vector3[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Plafones</td>";
            agregarRenglon(vector[7], vector3[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Entrepaños o repisas</td>";
            agregarRenglon(vector[8], vector3[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Cuadros</td>";
            agregarRenglon(vector[9], vector3[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>11</td>"+
                    "<td>Espejos</td>";
            agregarRenglon(vector[10], vector3[10]);


            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>12</td>"+
                    "<td>Líquidos tóxicos o inflamables</td>";
            agregarRenglon(vector[11], vector3[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>13</td>"+
                    "<td>Macetas y otros objetos colgantes</td>";
            agregarRenglon(vector[12], vector3[12]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">Objetos que pueden deslizarse:</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Escritorios</td>";
            agregarRenglon(vector[13], vector3[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Mesas</td>";
            agregarRenglon(vector[14], vector3[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Sillas</td>";
            agregarRenglon(vector[15], vector3[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Refrigeradores</td>";
            agregarRenglon(vector[16], vector3[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Cunas</td>";
            agregarRenglon(vector[17], vector3[17]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Camas</td>";
            agregarRenglon(vector[18], vector3[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Corralitos</td>";
            agregarRenglon(vector[19], vector3[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Sillas de ruedas</td>";
            agregarRenglon(vector[20], vector3[20]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Mobiliario y equipo para trasladar usuarios</td>";
            agregarRenglon(vector[21], vector3[21]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Y todos aquellos con ruedas</td>";
            agregarRenglon(vector[22], vector3[22]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">Objetos que pueden volcar:</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Equipo de computo</td>";
            agregarRenglon(vector[23], vector3[23]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Libreros</td>";
            agregarRenglon(vector[24], vector3[24]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Roperos</td>";
            agregarRenglon(vector[25], vector3[25]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Lockers</td>";
            agregarRenglon(vector[26], vector3[26]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Archiveros</td>";
            agregarRenglon(vector[27], vector3[27]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Estantes no anclados</td>";
            agregarRenglon(vector[28], vector3[28]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Vitrinas</td>";
            agregarRenglon(vector[29], vector3[29]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Tanques de gas</td>";
            agregarRenglon(vector[30], vector3[30]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Subdivisiones de espacios no ligados al techo y piso</td>";
            agregarRenglon(vector[31], vector3[31]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">Objetos que pueden ser tóxicos, inflamar y/o explotar:</td>" +
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Recipientes o tanques con combustible</td>";
            agregarRenglon(vector[32], vector3[32]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Solventes (thiner, aguarrás) y otras semejantes</td>";
            agregarRenglon(vector[33], vector3[33]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Almacén de papel, cartón, entre otros</td>";
            agregarRenglon(vector[34], vector3[34]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Pinturas</td>";
            agregarRenglon(vector[35], vector3[35]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Líquidos para el control de fauna nociva</td>";
            agregarRenglon(vector[36], vector3[36]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Líquidos de limpieza</td>";
            agregarRenglon(vector[37], vector3[37]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Otros</td>";
            agregarRenglon(vector[38], vector3[38]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td ></td>"+
                    "<td colspan=\"4\">Especificar: <b>"+vector2+"</b></td>"+
                    "</tr>";

            //_------------------------------


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"5\"> Objetos que pueden propiciar un incendio:</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Recipientes e instalaciones de gas</td>";
            agregarRenglon(vector[39], vector3[39]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Hornillas o parrillas eléctricas</td>";
            agregarRenglon(vector[40], vector3[40]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Cafeteras</td>";
            agregarRenglon(vector[41], vector3[41]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Contactos, apagadores, clavijas y cables en mal estado</td>";
            agregarRenglon(vector[42], vector3[42]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Hornos de microondas sin base o plato protector</td>";
            agregarRenglon(vector[43], vector3[43]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Velas y veladoras</td>";
            agregarRenglon(vector[44], vector3[44]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Aromatizantes eléctricos</td>";
            agregarRenglon(vector[45], vector3[45]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"5\">Objetos que pueden obstaculizar una evacuación:</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Tapetes</td>";
            agregarRenglon(vector[46], vector3[46]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Macetas</td>";
            agregarRenglon(vector[47], vector3[47]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Archiveros</td>";
            agregarRenglon(vector[48], vector3[48]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Pizarrones portátiles</td>";
            agregarRenglon(vector[49], vector3[49]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Muebles</td>";
            agregarRenglon(vector[50], vector3[50]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Cubetas, trapeadores, escobas, y todos aquellos que son dejados fuera de su lugar</td>";
            agregarRenglon(vector[51], vector3[51]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Juguetes</td>";
            agregarRenglon(vector[52], vector3[52]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Equipo y mobiliario</td>";
            agregarRenglon(vector[53], vector3[53]);

            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>"+

                    "</body>" + "</html>";


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
    public void agregarRenglon(String decision, String Observaciones) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td>"+Observaciones+"</td>" +
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
