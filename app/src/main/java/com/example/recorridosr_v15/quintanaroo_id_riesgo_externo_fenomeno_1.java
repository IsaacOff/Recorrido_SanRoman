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

public class quintanaroo_id_riesgo_externo_fenomeno_1 extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23, rg24, rg25;
    private RadioGroup rg26, rg27, rg28, rg29,rg30,rg31,rg32,rg33,rg34, rg35;

    private RadioButton  rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46,rb47,rb48, rb49, rb50, rb51, rb52, rb53,rb54, rb55, rb56, rb57, rb58, rb59, rb60;
    private RadioButton rb61, rb62, rb63, rb64, rb65, rb66,rb67,rb68, rb69, rb70;

    private EditText edt1, edt2, edt3, edt4, et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20, et21, et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35;
//39 y 35
    static String vector[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static String vector3 [] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    static String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_externo_fenomeno_1);


        this.setTitle("Riesgo Externo chetumal");
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





        //asigna los edit text a los et de aqui Rg 39
        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);
        edt4 = (EditText) findViewById(R.id.editText4);

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




        //Ocultar EditText
        edt1.setVisibility(View.GONE);
        edt2.setVisibility(View.GONE);
        edt3.setVisibility(View.GONE);
        edt4.setVisibility(View.GONE);

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

        if(!vector[7].equals("") && vector[7] != null){
            edt1.setText(vector[7]);
        }

        if(!vector[17].equals("") && vector[17] != null){
            edt2.setText(vector[17]);
        }

        if(!vector[23].equals("") && vector[23] != null){
            edt3.setText(vector[23]);
        }

        if(!vector[38].equals("") && vector[38] != null){
            edt4.setText(vector[38]);
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
            edt1.setVisibility(View.VISIBLE);
        } else if (vector[6].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[8].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
            et8.setVisibility(View.VISIBLE);
        } else if (vector[8].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[9].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
            et9.setVisibility(View.VISIBLE);
        } else if (vector[9].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[10].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
            et10.setVisibility(View.VISIBLE);
        } else if (vector[10].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[11].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et11.setVisibility(View.VISIBLE);
        } else if (vector[11].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[12].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et12.setVisibility(View.VISIBLE);
        } else if (vector[12].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[13].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et13.setVisibility(View.VISIBLE);
        } else if (vector[13].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[14].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et14.setVisibility(View.VISIBLE);
        } else if (vector[14].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[15].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et15.setVisibility(View.VISIBLE);
        } else if (vector[15].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }

        if (vector[16].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et16.setVisibility(View.VISIBLE);
            edt2.setVisibility(View.VISIBLE);
        } else if (vector[16].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector[18].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et17.setVisibility(View.VISIBLE);
        } else if (vector[18].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }


        if (vector[19].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et18.setVisibility(View.VISIBLE);
        } else if (vector[19].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector[20].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et19.setVisibility(View.VISIBLE);
        } else if (vector[20].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }

        if (vector[21].equals("SI")) {
            rb39.setChecked(true);
            rb40.setChecked(false);
            et20.setVisibility(View.VISIBLE);
        } else if (vector[21].equals("NO")) {
            rb39.setChecked(false);
            rb40.setChecked(true);
        }

        if (vector[22].equals("SI")) {
            rb41.setChecked(true);
            rb42.setChecked(false);
            et21.setVisibility(View.VISIBLE);
            edt3.setVisibility(View.VISIBLE);
        } else if (vector[22].equals("NO")) {
            rb41.setChecked(false);
            rb42.setChecked(true);
        }

        if (vector[24].equals("SI")) {
            rb43.setChecked(true);
            rb44.setChecked(false);
            et22.setVisibility(View.VISIBLE);
        } else if (vector[24].equals("NO")) {
            rb43.setChecked(false);
            rb44.setChecked(true);
        }


        if (vector[25].equals("SI")) {
            rb45.setChecked(true);
            rb46.setChecked(false);
            et23.setVisibility(View.VISIBLE);
        } else if (vector[25].equals("NO")) {
            rb45.setChecked(false);
            rb46.setChecked(true);
        }

        if (vector[26].equals("SI")) {
            rb47.setChecked(true);
            rb48.setChecked(false);
            et24.setVisibility(View.VISIBLE);
        } else if (vector[26].equals("NO")) {
            rb47.setChecked(false);
            rb48.setChecked(true);
        }

        if (vector[27].equals("SI")) {
            rb49.setChecked(true);
            rb50.setChecked(false);
            et25.setVisibility(View.VISIBLE);
        } else if (vector[27].equals("NO")) {
            rb49.setChecked(false);
            rb50.setChecked(true);
        }

        if (vector[28].equals("SI")) {
            rb51.setChecked(true);
            rb52.setChecked(false);
            et26.setVisibility(View.VISIBLE);
        } else if (vector[28].equals("NO")) {
            rb51.setChecked(false);
            rb52.setChecked(true);
        }

        if (vector[29].equals("SI")) {
            rb53.setChecked(true);
            rb54.setChecked(false);
            et27.setVisibility(View.VISIBLE);
        } else if (vector[29].equals("NO")) {
            rb53.setChecked(false);
            rb54.setChecked(true);
        }

        if (vector[30].equals("SI")) {
            rb55.setChecked(true);
            rb56.setChecked(false);
            et28.setVisibility(View.VISIBLE);
        } else if (vector[30].equals("NO")) {
            rb55.setChecked(false);
            rb56.setChecked(true);
        }

        if (vector[31].equals("SI")) {
            rb57.setChecked(true);
            rb58.setChecked(false);
            et29.setVisibility(View.VISIBLE);
        } else if (vector[31].equals("NO")) {
            rb57.setChecked(false);
            rb58.setChecked(true);
        }

        if (vector[32].equals("SI")) {
            rb59.setChecked(true);
            rb60.setChecked(false);
            et30.setVisibility(View.VISIBLE);
        } else if (vector[32].equals("NO")) {
            rb59.setChecked(false);
            rb60.setChecked(true);
        }


        if (vector[33].equals("SI")) {
            rb61.setChecked(true);
            rb62.setChecked(false);
            et31.setVisibility(View.VISIBLE);
        } else if (vector[33].equals("NO")) {
            rb61.setChecked(false);
            rb62.setChecked(true);
        }

        if (vector[34].equals("SI")) {
            rb63.setChecked(true);
            rb64.setChecked(false);
            et32.setVisibility(View.VISIBLE);
        } else if (vector[34].equals("NO")) {
            rb63.setChecked(false);
            rb64.setChecked(true);
        }

        if (vector[35].equals("SI")) {
            rb65.setChecked(true);
            rb66.setChecked(false);
            et33.setVisibility(View.VISIBLE);
        } else if (vector[35].equals("NO")) {
            rb65.setChecked(false);
            rb66.setChecked(true);
        }

        if (vector[36].equals("SI")) {
            rb67.setChecked(true);
            rb68.setChecked(false);
            et34.setVisibility(View.VISIBLE);
        } else if (vector[36].equals("NO")) {
            rb67.setChecked(false);
            rb68.setChecked(true);
        }

        if (vector[37].equals("SI")) {
            rb69.setChecked(true);
            rb70.setChecked(false);
            et35.setVisibility(View.VISIBLE);
            edt4.setVisibility(View.VISIBLE);
        } else if (vector[37].equals("NO")) {
            rb69.setChecked(false);
            rb70.setChecked(true);
        }




        //Verificacion de los radiobutton


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
                if(checkedId==R.id.rb3){

                    vector[1]="SI";
                    et2.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb4) {

                    vector[1]="NO";
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
                    edt1.setVisibility(View.VISIBLE);
                    et7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {

                    vector[6]="NO";
                    edt1.setVisibility(View.GONE);

                    et7.setVisibility(View.GONE);
                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[8]="SI";
                    et8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {

                    vector[8]="NO";
                    et8.setVisibility(View.GONE);

                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[9]="SI";
                    et9.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb18) {

                    vector[9]="NO";
                    et9.setVisibility(View.GONE);


                }

            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[10]="SI";

                    et10.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb20) {
                    vector[10]="NO";

                    et10.setVisibility(View.GONE);

                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[11]="SI";
                    et11.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb22) {

                    vector[11]="NO";

                    et11.setVisibility(View.GONE);
                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[12]="SI";
                    et12.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb24) {

                    vector[12]="NO";

                    et12.setVisibility(View.GONE);
                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[13]="SI";
                    et13.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb26) {

                    vector[13]="NO";
                    et13.setVisibility(View.GONE);
                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[14]="SI";
                    et14.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb28) {

                    vector[14]="NO";
                    et14.setVisibility(View.GONE);


                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[15]="SI";
                    et15.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb30) {

                    vector[15]="NO";
                    et15.setVisibility(View.GONE);

                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[16]="SI";
                    edt2.setVisibility(View.VISIBLE);
                    et16.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb32) {

                    vector[16]="NO";
                    edt2.setVisibility(View.GONE);

                    et16.setVisibility(View.GONE);
                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector[18]="SI";
                    et17.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb34) {

                    vector[18]="NO";
                    et17.setVisibility(View.GONE);

                }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector[19]="SI";
                    et18.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb36) {

                    vector[19]="NO";
                    et18.setVisibility(View.GONE);

                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[20]="SI";
                    et19.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb38) {

                    vector[20]="NO";
                    et19.setVisibility(View.GONE);
                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb39){

                    vector[21]="SI";

                    et20.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb40) {

                    vector[21]="NO";

                    et20.setVisibility(View.GONE);

                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb41){

                    vector[22]="SI";
                    edt3.setVisibility(View.VISIBLE);
                    et21.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb42) {

                    vector[22]="NO";
                    edt3.setVisibility(View.GONE);
                    et21.setVisibility(View.GONE);

                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb43){

                    vector[24]="SI";

                    et22.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb44) {

                    vector[24]="NO";
                    et22.setVisibility(View.GONE);

                }

            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb45){

                    vector[25]="SI";


                    et23.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb46) {

                    vector[25]="NO";

                    et23.setVisibility(View.GONE);

                }

            }
        });



        //24-46


        //Verificacion de los radiobutton


        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb47){

                    vector[26]="SI";
                    et24.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb48) {
                    vector[26]="NO";
                    et24.setVisibility(View.GONE);

                }

            }
        });


        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb49){

                    vector[27]="SI";
                    et25.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb50) {

                    vector[27]="NO";
                    et25.setVisibility(View.GONE);

                }

            }
        });


        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb51){
                    vector[28]="SI";
                    et26.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb52) {

                    vector[28]="NO";

                    et26.setVisibility(View.GONE);
                }

            }
        });


        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb53){

                    vector[29]="SI";
                    et27.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb54) {

                    vector[29]="NO";
                    et27.setVisibility(View.GONE);
                }

            }
        });


        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb55){

                    vector[30]="SI";
                    et28.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb56) {

                    vector[30]="NO";

                    et28.setVisibility(View.GONE);

                }

            }
        });


        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb57){

                    vector[31]="SI";

                    et29.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb58) {

                    vector[31]="NO";
                    et29.setVisibility(View.GONE);

                }

            }
        });



        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb59){

                    vector[32]="SI";
                    et30.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb60) {

                    vector[32]="NO";

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
                if(checkedId==R.id.rb61){

                    vector[33]="SI";
                    et31.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb62) {

                    vector[33]="NO";

                    et31.setVisibility(View.GONE);
                }

            }
        });


        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb63){

                    vector[34]="SI";


                    et32.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb64) {

                    vector[34]="NO";
                    et32.setVisibility(View.GONE);


                }

            }
        });






        ///otro9-18


        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb65){

                    vector[35]="SI";

                    et33.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb66) {
                    vector[35]="NO";

                    et33.setVisibility(View.GONE);

                }

            }
        });


        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb67){

                    vector[36]="SI";

                    et34.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb68) {

                    vector[36]="NO";
                    et34.setVisibility(View.GONE);

                }

            }
        });

        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb69){

                    vector[37]="SI";
                    edt4.setVisibility(View.VISIBLE);
                    et35.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb70) {

                    vector[37]="NO";
                    edt4.setVisibility(View.GONE);
                    et35.setVisibility(View.GONE);

                }

            }
        });

        edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[7] = edt1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        edt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[17] = edt2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        edt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[23] = edt3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        edt4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[38] = edt4.getText().toString();
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
                vector[38] = edt4.getText().toString();
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

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_externo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion1) {
            Toast.makeText(this, "Actividad 1 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo.class);
            startActivity(intent);


            return true;
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Actividad 2 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_1.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Actividad 3 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    public static boolean externo_siguiente2() {
        boolean bandera = true;


        for(int i=0;i<7; i++){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }


        for(int i=8;i<17; i++){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }

        for(int i=18;i<23; i++){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }
        for(int i=24;i<38; i++){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }



        if( vector[6]=="SI"){

            if (vector[7].equals("")) {
                bandera = false;
            }

        }

        if( vector[16]=="SI"){

            if (vector[17].equals("")) {
                bandera = false;
            }

        }


        if( vector[22]=="SI"){

            if (vector[23].equals("")) {
                bandera = false;
            }

        }


        if( vector[37]=="SI"){

            if (vector[38].equals("")) {
                bandera = false;
            }

        }


        if (bandera) {


            return true;
            //externo2(view);



        } else {
           return false;
        }


    }



    public void externo2 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_2.class);
        startActivity(intent);
    }

    public static String onClick (){

            tablaConcatenacion=
                    //"<html>" + "<body>" +

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">FENÓMENOS PERTURBADORES</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">De origen Socio-Organizativo</td>"+
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

                            "<tr>"+
                            "<td colspan=\"4\" style=\"text-align:center;\" >Elementos a evaluar</td>"+
                            "<td colspan=\"1\" style=\"text-align:center;\">Observaciones</td>"+
                            "</tr>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Accidentes aéreos, terrestres y fluviales</td>";
            agregarRenglon(vector[0], vector3[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes de vehículos que transportan materiales químicos peligrosos (explosiones, gas, cloro, gasolina, solventes, otros).</td>";
            agregarRenglon(vector[1], vector3[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos terrestres de transporte de       pasajeros.</td>";
            agregarRenglon(vector[2], vector3[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos aéreos.</td>";
            agregarRenglon(vector[3], vector3[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transporte de carga.</td>";
            agregarRenglon(vector[4], vector3[4]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transportes de       pasajeros.</td>";
            agregarRenglon(vector[5], vector3[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[6], vector3[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"4\">"+vector[7]+"</td>"+
                    "</tr>";


//_------------------------------------ VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Terrorismo y sabotaje</td>";
            agregarRenglon(vector[8], vector3[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo</td>";
            agregarRenglon(vector[9], vector3[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo con violencia</td>";
            agregarRenglon(vector[10], vector3[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Secuestro</td>";
            agregarRenglon(vector[11], vector3[10]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Invasión de bienes inmuebles</td>";
            agregarRenglon(vector[12], vector3[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Interrupción de vialidades</td>";
            agregarRenglon(vector[13], vector3[12]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios públicos</td>";
            agregarRenglon(vector[14], vector3[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios privados</td>";
            agregarRenglon(vector[15], vector3[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[16], vector3[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"4\">"+vector[17]+"</td>"+
                    "</tr>";


            //-------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Concentraciones masivas</td>";
            agregarRenglon(vector[18], vector3[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Marchas y manifestaciones</td>";
            agregarRenglon(vector[19], vector3[17]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Plantones y mítines</td>";
            agregarRenglon(vector[20], vector3[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Actos vandálicos</td>";
            agregarRenglon(vector[21], vector3[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[22], vector3[20]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"4\">"+vector[23]+"</td>"+
                    "</tr>";

            //-----------------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Interrupción de servicios</td>";
            agregarRenglon(vector[24], vector3[21]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">De origen Geológico</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Agrietamiento</td>";
            agregarRenglon(vector[25], vector3[22]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Hundimiento de terreno</td>";
            agregarRenglon(vector[26], vector3[23]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Deslave</td>";
            agregarRenglon(vector[27], vector3[24]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Deslizamiento de alud</td>";
            agregarRenglon(vector[28], vector3[25]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Erosión del suelo productivo</td>";
            agregarRenglon(vector[29], vector3[26]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Sobre explotación de fuentes de agua</td>";
            agregarRenglon(vector[30], vector3[27]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>11</td>"+
                    "<td>Sobre explotación de mantos freáticos</td>";
            agregarRenglon(vector[31], vector3[28]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>12</td>"+
                    "<td>Sismos o Terremotos</td>";
            agregarRenglon(vector[32], vector3[29]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Derrumbes de edificios aledaños</td>";
            agregarRenglon(vector[33], vector3[30]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Caída de torres de alta tensión</td>";
            agregarRenglon(vector[34], vector3[31]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td> Maremotos o Tsunamis</td>";
            agregarRenglon(vector[35], vector3[32]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Vulcanismo (lluvia de cenisa, afectaciones por lava, afectacion por flujos piroclasticos, afectaciones por flujos de lodo)</td>";
            agregarRenglon(vector[36], vector3[33]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[37], vector3[34]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"4\">"+vector[38]+"</td>"+
                    "</tr>";

            tablaConcatenacion= tablaConcatenacion+
                    "</tbody>"+
                    "</table>";
                    //"</body>" +"</html>" ;

        return tablaConcatenacion;
    }

    public static void agregarRenglon(String decision, String observaciones) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td>"+observaciones+"</td>" +
                    "</tr>";

        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }

    }

}
