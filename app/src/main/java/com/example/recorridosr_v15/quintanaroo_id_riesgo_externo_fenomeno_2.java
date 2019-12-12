package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_id_riesgo_externo_fenomeno_2 extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23, rg24, rg25;
    private RadioGroup rg26, rg27, rg28, rg29,rg30,rg31,rg32,rg33,rg34, rg35, rg36, rg37,rg38;

    private RadioButton  rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46,rb47,rb48, rb49, rb50, rb51, rb52, rb53,rb54, rb55, rb56, rb57, rb58, rb59, rb60;
    private RadioButton rb61, rb62, rb63, rb64, rb65, rb66,rb67,rb68, rb69, rb70, rb71, rb72, rb73,rb74, rb75, rb76;

    private EditText et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36, et37, et38;
    private EditText  edi1,  edi2,  edi3, edi4,  edi5,  edi6;

    String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;

    //Vector para los sino y observaciones 38 y 38                                                     10                                                                              20                                                                              30       31     32       33      34      35      36      37      38
    static String vector[][]={{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}};
    //Vector para Edit Text
    static String vector2 []= {"","","","","",""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_externo_fenomeno_2);


        this.setTitle("Riesgo Externo_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //  directorio2 = new File(getIntent().getStringExtra("File"));
       // if(directorio2 != null) {
         //   pdfFile = new File(directorio2.getPath(), "prueba1.pdf");
        //}




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



        //asignar EditText para especificar las variables de aqui
        edi1 =(EditText) findViewById(R.id.edi1);
        edi2 =(EditText) findViewById(R.id.edi2);
        edi3 =(EditText) findViewById(R.id.edit3);
        edi4 =(EditText) findViewById(R.id.edi4);
        edi5 =(EditText) findViewById(R.id.edi5);
        edi6 =(EditText) findViewById(R.id.edi6);

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

        //Ocultar EditText
        edi1.setVisibility(View.GONE);
        edi2.setVisibility(View.GONE);
        edi3.setVisibility(View.GONE);
        edi4.setVisibility(View.GONE);
        edi5.setVisibility(View.GONE);
        edi6.setVisibility(View.GONE);



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






       if(!vector[0][1].equals("") && vector[0][1] != null){
            et1.setText(vector[0][1]);
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
            et17.setText(vector[16][1]);
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
        if(!vector[22][1].equals("") && vector[22][1] != null){
            et23.setText(vector[22][1]);
        }
        if(!vector[23][1].equals("") && vector[23][1] != null){
            et24.setText(vector[23][1]);
        }
        if(!vector[24][1].equals("") && vector[24][1] != null){
            et25.setText(vector[24][1]);
        }
        if(!vector[25][1].equals("") && vector[25][1] != null){
            et26.setText(vector[25][1]);
        }
        if(!vector[26][1].equals("") && vector[26][1] != null){
            et27.setText(vector[26][1]);
        }
        if(!vector[27][1].equals("") && vector[27][1] != null){
            et28.setText(vector[27][1]);
        }
        if(!vector[28][1].equals("") && vector[28][1] != null){
            et29.setText(vector[28][1]);
        }
        if(!vector[29][1].equals("") && vector[29][1] != null){
            et30.setText(vector[29][1]);
        }
        if(!vector[30][1].equals("") && vector[30][1] != null){
            et31.setText(vector[30][1]);
        }
        if(!vector[31][1].equals("") && vector[31][1] != null){
            et32.setText(vector[31][1]);
        }
        if(!vector[32][1].equals("") && vector[32][1] != null){
            et33.setText(vector[32][1]);
        }
        if(!vector[33][1].equals("") && vector[33][1] != null){
            et34.setText(vector[33][1]);
        }
        if(!vector[34][1].equals("") && vector[34][1] != null){
            et35.setText(vector[34][1]);
        }
        if(!vector[35][1].equals("") && vector[35][1] != null){
            et36.setText(vector[35][1]);
        }
        if(!vector[36][1].equals("") && vector[36][1] != null){
            et37.setText(vector[36][1]);
        }
        if(!vector[37][1].equals("") && vector[37][1] != null){
            et38.setText(vector[37][1]);
        }



        //

        if (vector[0][0].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
            et1.setVisibility(View.VISIBLE);
        } else if (vector[0][0].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[1][0].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
            et2.setVisibility(View.VISIBLE);
        } else if (vector[1][0].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if (vector[2][0].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
            et3.setVisibility(View.VISIBLE);
        } else if (vector[2].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[3][0].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
            et4.setVisibility(View.VISIBLE);
        } else if (vector[3][0].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[4][0].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
            et5.setVisibility(View.VISIBLE);
        } else if (vector[4][0].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }


        if (vector[5][0].equals("SI")) {
            rb11.setChecked(true);
            rb12.setChecked(false);
            et6.setVisibility(View.VISIBLE);
        } else if (vector[5][0].equals("NO")) {
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if (vector[6][0].equals("SI")) {
            rb13.setChecked(true);
            rb14.setChecked(false);
            et7.setVisibility(View.VISIBLE);
        } else if (vector[6][0].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[7][0].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
            et8.setVisibility(View.VISIBLE);
        } else if (vector[7][0].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[8][0].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
            et9.setVisibility(View.VISIBLE);
        } else if (vector[8][0].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[9][0].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
            et10.setVisibility(View.VISIBLE);
        } else if (vector[9][0].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[10][0].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et11.setVisibility(View.VISIBLE);
        } else if (vector[10][0].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[11][0].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et12.setVisibility(View.VISIBLE);
        } else if (vector[11][0].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[12][0].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et13.setVisibility(View.VISIBLE);
        } else if (vector[12][0].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[13][0].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et14.setVisibility(View.VISIBLE);
        } else if (vector[13][0].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[14][0].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et15.setVisibility(View.VISIBLE);
        } else if (vector[14][0].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }

        if (vector[15][0].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et16.setVisibility(View.VISIBLE);
        } else if (vector[15][0].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector[16][0].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et17.setVisibility(View.VISIBLE);
        } else if (vector[16][0].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }


        if (vector[17][0].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et18.setVisibility(View.VISIBLE);
        } else if (vector[17][0].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector[18][0].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et19.setVisibility(View.VISIBLE);
        } else if (vector[18][0].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }

        if (vector[19][0].equals("SI")) {
            rb39.setChecked(true);
            rb40.setChecked(false);
            et20.setVisibility(View.VISIBLE);
        } else if (vector[19][0].equals("NO")) {
            rb39.setChecked(false);
            rb40.setChecked(true);
        }

        if (vector[20][0].equals("SI")) {
            rb41.setChecked(true);
            rb42.setChecked(false);
            et21.setVisibility(View.VISIBLE);
        } else if (vector[20][0].equals("NO")) {
            rb41.setChecked(false);
            rb42.setChecked(true);
        }

        if (vector[21][0].equals("SI")) {
            rb43.setChecked(true);
            rb44.setChecked(false);
            et22.setVisibility(View.VISIBLE);
        } else if (vector[21][0].equals("NO")) {
            rb43.setChecked(false);
            rb44.setChecked(true);
        }


        if (vector[22][0].equals("SI")) {
            rb45.setChecked(true);
            rb46.setChecked(false);
            et23.setVisibility(View.VISIBLE);
        } else if (vector[22][0].equals("NO")) {
            rb45.setChecked(false);
            rb46.setChecked(true);
        }

        if (vector[23][0].equals("SI")) {
            rb47.setChecked(true);
            rb48.setChecked(false);
            et24.setVisibility(View.VISIBLE);
        } else if (vector[23][0].equals("NO")) {
            rb47.setChecked(false);
            rb48.setChecked(true);
        }

        if (vector[24][0].equals("SI")) {
            rb49.setChecked(true);
            rb50.setChecked(false);
            et25.setVisibility(View.VISIBLE);
        } else if (vector[24][0].equals("NO")) {
            rb49.setChecked(false);
            rb50.setChecked(true);
        }

        if (vector[25][0].equals("SI")) {
            rb51.setChecked(true);
            rb52.setChecked(false);
            et26.setVisibility(View.VISIBLE);
        } else if (vector[25][0].equals("NO")) {
            rb51.setChecked(false);
            rb52.setChecked(true);
        }

        if (vector[26][0].equals("SI")) {
            rb53.setChecked(true);
            rb54.setChecked(false);
            et27.setVisibility(View.VISIBLE);
        } else if (vector[26][0].equals("NO")) {
            rb53.setChecked(false);
            rb54.setChecked(true);
        }

        if (vector[27][0].equals("SI")) {
            rb55.setChecked(true);
            rb56.setChecked(false);
            et28.setVisibility(View.VISIBLE);
        } else if (vector[27][0].equals("NO")) {
            rb55.setChecked(false);
            rb56.setChecked(true);
        }

        if (vector[28][0].equals("SI")) {
            rb57.setChecked(true);
            rb58.setChecked(false);
            et29.setVisibility(View.VISIBLE);
        } else if (vector[28][0].equals("NO")) {
            rb57.setChecked(false);
            rb58.setChecked(true);
        }

        if (vector[29][0].equals("SI")) {
            rb59.setChecked(true);
            rb60.setChecked(false);
            et30.setVisibility(View.VISIBLE);
        } else if (vector[29][0].equals("NO")) {
            rb59.setChecked(false);
            rb60.setChecked(true);
        }


        if (vector[30][0].equals("SI")) {
            rb61.setChecked(true);
            rb62.setChecked(false);
            et31.setVisibility(View.VISIBLE);
        } else if (vector[30][0].equals("NO")) {
            rb61.setChecked(false);
            rb62.setChecked(true);
        }

        if (vector[31][0].equals("SI")) {
            rb63.setChecked(true);
            rb64.setChecked(false);
            et32.setVisibility(View.VISIBLE);
        } else if (vector[31][0].equals("NO")) {
            rb63.setChecked(false);
            rb64.setChecked(true);
        }

        if (vector[32][0].equals("SI")) {
            rb65.setChecked(true);
            rb66.setChecked(false);
            et33.setVisibility(View.VISIBLE);
        } else if (vector[32][0].equals("NO")) {
            rb65.setChecked(false);
            rb66.setChecked(true);
        }

        if (vector[33][0].equals("SI")) {
            rb67.setChecked(true);
            rb68.setChecked(false);
            et34.setVisibility(View.VISIBLE);
        } else if (vector[33][0].equals("NO")) {
            rb67.setChecked(false);
            rb68.setChecked(true);
        }

        if (vector[34][0].equals("SI")) {
            rb69.setChecked(true);
            rb70.setChecked(false);
            et35.setVisibility(View.VISIBLE);
        } else if (vector[34][0].equals("NO")) {
            rb69.setChecked(false);
            rb70.setChecked(true);
        }


        if (vector[35][0].equals("SI")) {
            rb71.setChecked(true);
            rb72.setChecked(false);
            et36.setVisibility(View.VISIBLE);
        } else if (vector[35][0].equals("NO")) {
            rb71.setChecked(false);
            rb72.setChecked(true);
        }

        if (vector[36][0].equals("SI")) {
            rb73.setChecked(true);
            rb74.setChecked(false);
            et37.setVisibility(View.VISIBLE);
        } else if (vector[36][0].equals("NO")) {
            rb73.setChecked(false);
            rb74.setChecked(true);
        }

        if (vector[37][0].equals("SI")) {
            rb75.setChecked(true);
            rb76.setChecked(false);
            et38.setVisibility(View.VISIBLE);
        } else if (vector[37][0].equals("NO")) {
            rb75.setChecked(false);
            rb76.setChecked(true);
        }





        ///

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0][1]= et1.getText().toString();
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
                vector[1][1]= et2.getText().toString();
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
                vector[2][1]= et3.getText().toString();
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
                vector[3][1]= et4.getText().toString();
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
                vector[4][1]= et5.getText().toString();
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
                vector[5][1]= et6.getText().toString();
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
                vector[6][1]= et7.getText().toString();
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
                vector[7][1]= et8.getText().toString();
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
                vector[8][1]= et9.getText().toString();
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
                vector[9][1]= et10.getText().toString();
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
                vector[10][1]= et11.getText().toString();
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
                vector[11][1]= et12.getText().toString();
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
                vector[12][1]= et13.getText().toString();
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
                vector[13][1]= et14.getText().toString();
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
                vector[14][1]= et15.getText().toString();
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
                vector[15][1]= et16.getText().toString();
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
                vector[16][1]= et17.getText().toString();
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
                vector[17][1]= et18.getText().toString();
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
                vector[18][1]= et19.getText().toString();
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
                vector[19][1]= et20.getText().toString();
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
                vector[20][1]= et21.getText().toString();
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
                vector[21][1]= et22.getText().toString();
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
                vector[22][1]= et23.getText().toString();
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
                vector[23][1]= et24.getText().toString();
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
                vector[24][1]= et25.getText().toString();
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
                vector[25][1]= et26.getText().toString();
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
                vector[26][1]= et27.getText().toString();
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
                vector[27][1]= et28.getText().toString();
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
                vector[28][1]= et29.getText().toString();
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
                vector[29][1]= et30.getText().toString();
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
                vector[30][1]= et31.getText().toString();
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
                vector[31][1]= et32.getText().toString();
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
                vector[32][1]= et33.getText().toString();
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
                vector[33][1]= et34.getText().toString();
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
                vector[34][1]= et35.getText().toString();
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
                vector[35][1]= et36.getText().toString();
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
                vector[36][1]= et37.getText().toString();
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
                vector[37][1]= et38.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        //guarda los datos en los edit text del vector 2
        edi1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[0]= edi1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        edi2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[1]= edi2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        edi3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[2]= edi3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        edi4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[3]= edi4.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        edi5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[4]= edi5.getText().toString();
        }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        edi6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[5]= edi6.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });



///









        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if(checkedId==R.id.rb1){
                        et1.setVisibility(View.VISIBLE);
                        vector[0][0]="SI";
                        rb1.setChecked(true);

                    }else if(checkedId==R.id.rb2) {
                        vector[0][0]="NO";
                        et1.setVisibility(View.GONE);
                        rb2.setChecked(true);
                    }


            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                    if(checkedId==R.id.rb3){
                        et2.setVisibility(View.VISIBLE);
                        vector[1][0]="SI";
                        rb3.setChecked(true);
                    }else if(checkedId==R.id.rb4) {

                        vector[1][0]="NO";
                        et2.setVisibility(View.GONE);
                        rb4.setChecked(true);

                    }


            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                    if(checkedId==R.id.rb5){
                        vector[2][0]="SI";
                        rb5.setChecked(true);
                        et3.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb6) {

                        vector[2][0]="NO";
                        et3.setVisibility(View.GONE);
                        rb6.setChecked(true);
                    }


            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb7){
                        et4.setVisibility(View.VISIBLE);
                        vector[3][0]="SI";

                        rb7.setChecked(true);
                    }else if(checkedId==R.id.rb8) {

                        vector[3][0]="NO";
                        et4.setVisibility(View.GONE);
                        rb8.setChecked(true);
                    }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb9){

                        vector[4][0]="SI";
                        et5.setVisibility(View.VISIBLE);
                        rb9.setChecked(true);
                    }else if(checkedId==R.id.rb10) {

                        vector[4][0]="NO";

                        et5.setVisibility(View.GONE);
                        rb10.setChecked(true);
                    }


            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb11){

                        vector[5][0]="SI";
                        et6.setVisibility(View.VISIBLE);
                        rb11.setChecked(true);
                    }else if(checkedId==R.id.rb12) {

                        vector[5][0]="NO";

                        et6.setVisibility(View.GONE);
                        rb12.setChecked(true);
                    }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                    if(checkedId==R.id.rb13){

                        vector[6][0]="SI";
                        rb13.setChecked(true);
                        et7.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb14) {

                        vector[6][0]="NO";
                        rb14.setChecked(true);
                        et7.setVisibility(View.GONE);
                    }


            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                    if(checkedId==R.id.rb15){

                        vector[7][0]="SI";
                        et8.setVisibility(View.VISIBLE);
                        rb15.setChecked(true);
                    }else if(checkedId==R.id.rb16) {

                        vector[7][0]="NO";
                        et8.setVisibility(View.GONE);
                        rb16.setChecked(true);
                    }


            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb17){

                        vector[8][0]="SI";

                        et9.setVisibility(View.VISIBLE);
                        edi1.setVisibility(View.VISIBLE);

                        rb17.setChecked(true);

                    }else if(checkedId==R.id.rb18) {

                        vector[8][0]="NO";
                        et9.setVisibility(View.GONE);
                        edi1.setVisibility(View.GONE);
                        rb18.setChecked(true);

                    }

            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb19){

                        vector[9][0]="SI";

                        et10.setVisibility(View.VISIBLE);
                        edi2.setVisibility(View.VISIBLE);
                        edi3.setVisibility(View.VISIBLE);


                        rb19.setChecked(true);
                    }else if(checkedId==R.id.rb20) {
                        vector[9][0]="NO";
                        et10.setVisibility(View.GONE);
                        edi2.setVisibility(View.GONE);
                        edi3.setVisibility(View.GONE);

                        rb20.setChecked(true);


                    }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb21){

                        vector[10][0]="SI";
                        et11.setVisibility(View.VISIBLE);
                        rb21.setChecked(true);
                    }else if(checkedId==R.id.rb22) {

                        vector[10][0] = "NO";

                        et11.setVisibility(View.GONE);
                        rb22.setChecked(true);
                    }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if(checkedId==R.id.rb23){
                        vector[11][0]="SI";
                        et12.setVisibility(View.VISIBLE);
                        rb23.setChecked(true);

                    }else if(checkedId==R.id.rb24) {

                        vector[11][0]="NO";
                        et12.setVisibility(View.GONE);
                        rb24.setChecked(true);

                    }


            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                    if(checkedId==R.id.rb25){

                        vector[12][0]="SI";
                        rb25.setChecked(true);
                        et13.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb26) {
                        rb26.setChecked(true);
                        vector[12][0]="NO";
                        et13.setVisibility(View.GONE);
                    }


            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb27){
                        rb27.setChecked(true);
                        vector[13][0]="SI";
                        et14.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb28) {
                        rb28.setChecked(true);
                        vector[13][0]="NO";
                        et14.setVisibility(View.GONE);


                    }


            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb29){

                        vector[14][0]="SI";
                        rb29.setChecked(true);
                        et15.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb30) {
                        rb30.setChecked(true);
                        vector[14][0]="NO";
                        et15.setVisibility(View.GONE);

                    }

            }
        });




        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb31){
                        rb31.setChecked(true);
                        vector[15][0]="SI";
                        et16.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb32) {
                        rb32.setChecked(true);
                        vector[15][0]="NO";

                        et16.setVisibility(View.GONE);
                    }



            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb33){
                        rb33.setChecked(true);
                        vector[16][0]="SI";
                        et17.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb34) {
                        rb34.setChecked(true);
                        vector[16][0]="NO";

                        et17.setVisibility(View.GONE);
                    }



            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb35){
                        rb35.setChecked(true);
                        vector[17][0]="SI";
                        et18.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb36) {
                        rb36.setChecked(true);
                        vector[17][0]="NO";
                        et18.setVisibility(View.GONE);

                    }


            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb37){
                        rb37.setChecked(true);
                        vector[18][0]="SI";
                        et19.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb38) {

                        vector[18][0]="NO";
                        rb38.setChecked(true);
                        et19.setVisibility(View.GONE);
                    }



            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb39){
                        rb39.setChecked(true);
                        vector[19][0]="SI";

                        et20.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb40) {
                        rb40.setChecked(true);
                        vector[19][0]="NO";
                        et20.setVisibility(View.GONE);


                    }


            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb41){
                        rb41.setChecked(true);
                        vector[20][0]="SI";
                        et21.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb42) {
                        rb42.setChecked(true);
                        vector[20][0]="NO";

                        et21.setVisibility(View.GONE);
                    }


            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb43){
                        rb43.setChecked(true);
                        vector[21][0]="SI";
                        et22.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb44) {
                        rb44.setChecked(true);
                        vector[21][0]="NO";
                        et22.setVisibility(View.GONE);

                    }


            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb45){
                        rb45.setChecked(true);
                        vector[22][0]="SI";
                        et23.setVisibility(View.VISIBLE);


                    }else if(checkedId==R.id.rb46) {
                        rb46.setChecked(true);
                        vector[22][0]="NO";

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
                        rb47.setChecked(true);
                        vector[23][0]="SI";
                        et24.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb48) {
                        vector[23][0]="NO";
                        et24.setVisibility(View.GONE);
                        rb48.setChecked(true);
                    }


            }
        });


        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb49){
                        rb49.setChecked(true);
                        vector[24][0]="SI";
                        et25.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb50) {

                        vector[24][0]="NO";
                        rb50.setChecked(true);
                        et25.setVisibility(View.GONE);
                    }


            }
        });


        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb51){
                        vector[25][0]="SI";
                        et26.setVisibility(View.VISIBLE);
                        rb51.setChecked(true);
                    }else if(checkedId==R.id.rb52) {
                        rb52.setChecked(true);
                        vector[25][0]="NO";
                        et26.setVisibility(View.GONE);

                    }


            }
        });


        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb53){
                        rb53.setChecked(true);
                        vector[26][0]="SI";
                        et27.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb54) {
                        rb54.setChecked(true);
                        vector[26][0]="NO";
                        et27.setVisibility(View.GONE);
                    }


            }
        });


        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb55){
                        rb55.setChecked(true);
                        vector[27][0]="SI";
                        et28.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb56) {
                        rb56.setChecked(true);
                        vector[27][0]="NO";

                        et28.setVisibility(View.GONE);

                    }



            }
        });


        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb57){
                        rb57.setChecked(true);
                        vector[28][0]="SI";

                        et29.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb58) {
                        rb58.setChecked(true);
                        vector[28][0]="NO";

                        et29.setVisibility(View.GONE);
                    }


            }
        });



        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb59){
                        rb59.setChecked(true);
                        vector[29][0]="SI";
                        et30.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb60) {

                        vector[29][0]="NO";
                        et30.setVisibility(View.GONE);
                        rb60.setChecked(true);
                    }


            }
        });


        rg31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb61){
                        rb61.setChecked(true);
                        vector[30][0]="SI";
                        et31.setVisibility(View.VISIBLE);
                        edi4.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb62) {
                        rb62.setChecked(true);
                        vector[30][0]="NO";
                        et31.setVisibility(View.GONE);
                        edi4.setVisibility(View.GONE);

                    }


            }
        });


        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb63){
                        rb63.setChecked(true);
                        vector[31][0]="SI";

                        et32.setVisibility(View.VISIBLE);
                        edi5.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb64) {
                        rb64.setChecked(true);
                        vector[31][0]="NO";

                        et32.setVisibility(View.GONE);
                        edi5.setVisibility(View.GONE);


                    }


            }
        });






        ///otro9-18


        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb65){
                        rb65.setChecked(true);
                        vector[32][0]="SI";
                        et33.setVisibility(View.VISIBLE);
                        edi6.setVisibility(View.VISIBLE);


                    }else if(checkedId==R.id.rb66) {
                        vector[32][0]="NO";
                        rb66.setChecked(true);
                        et33.setVisibility(View.GONE);
                        edi6.setVisibility(View.GONE);


                    }

            }
        });


        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb67){
                        rb67.setChecked(true);
                        vector[33][0]="SI";
                        et34.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb68) {
                        rb68.setChecked(true);
                        vector[33][0]="NO";

                        et34.setVisibility(View.GONE);
                    }

            }
        });


        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb69){
                        vector[34][0]="SI";
                        rb69.setChecked(true);
                        et35.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb70) {
                        rb70.setChecked(true);
                        vector[34][0]="NO";

                        et35.setVisibility(View.GONE);
                    }

            }
        });


        rg36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb71){
                        rb71.setChecked(true);
                        vector[35][0]="SI";
                        et36.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb72) {
                        rb72.setChecked(true);
                        vector[35][0]="NO";
                        et36.setVisibility(View.GONE);
                    }



            }
        });


        rg37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb73){
                        rb73.setChecked(true);
                        vector[36][0]="SI";

                        et37.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb74) {
                        rb74.setChecked(true);
                        vector[36][0]="NO";
                        et37.setVisibility(View.GONE);


                    }


            }
        });


        rg38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb75){
                        rb75.setChecked(true);
                        vector[37][0]="SI";
                        et38.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb76) {
                        rb76.setChecked(true);
                        vector[37][0]="NO";
                        et38.setVisibility(View.GONE);

                    }


            }
        });









    }




    public void final_externo(View view) {
        boolean bandera = true;




        for (int i = 0; i < 38; i++) {
            if (vector[i][0] == null || vector[i][0].equals("")) {
                bandera = false;
            }
        }


            if (vector[8][0].equals("SI")) {
                vector2[0]="";
                bandera = false;
            }



        if (vector[9][0].equals("SI")) {
            vector2[1]="";
            vector2[2]="";
            bandera = false;
        }


        if (vector[30][0].equals("SI")) {
            vector2[3]="";
            bandera = false;
        }

        if (vector[31][0].equals("SI")) {
            vector2[4]="";
            bandera = false;
        }

        if (vector[32][0].equals("SI")) {
            vector2[5]="";
            bandera = false;
        }




        if(bandera){

            Toast.makeText(this, "listo generando PDF ", LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "revisa las paginas ", LENGTH_SHORT).show();
        }
    }











/*
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
                            "<td colspan=\"4\">FENÓMENOS PERTURBADORES</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"4\">De origen Socio-Organizativo</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"3%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"87%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>"+
                            "<td colspan=\"4\" style=\"text-align:center;\" >Elementos a evaluar</td>"+
                            "</tr>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Accidentes aéreos, terrestres y fluviales</td>";
            agregarRenglon(vector[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes de vehículos que transportan materiales químicos peligrosos (explosiones, gas, cloro, gasolina, solventes, otros).</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos terrestres de transporte de       pasajeros.</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos aéreos.</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transporte de carga.</td>";
            agregarRenglon(vector[4]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transportes de       pasajeros.</td>";
            agregarRenglon(vector[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[7]+"</td>"+
                    "</tr>";


//_------------------------------------ VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Terrorismo y sabotaje</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo</td>";
            agregarRenglon(vector[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo con violencia</td>";
            agregarRenglon(vector[10]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Secuestro</td>";
            agregarRenglon(vector[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Invasión de bienes inmuebles</td>";
            agregarRenglon(vector[12]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Interrupción de vialidades</td>";
            agregarRenglon(vector[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios públicos</td>";
            agregarRenglon(vector[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios privados</td>";
            agregarRenglon(vector[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[17]+"</td>"+
                    "</tr>";


            //-------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Concentraciones masivas</td>";
            agregarRenglon(vector[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Marchas y manifestaciones</td>";
            agregarRenglon(vector[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Plantones y mítines</td>";
            agregarRenglon(vector[20]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Actos vandálicos</td>";
            agregarRenglon(vector[21]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[22]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[23]+"</td>"+
                    "</tr>";

            //-----------------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Interrupción de servicios</td>";
            agregarRenglon(vector[24]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"4\">De origen Geológico</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Agrietamiento</td>";
            agregarRenglon(vector[25]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Hundimiento de terreno</td>";
            agregarRenglon(vector[26]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Deslave</td>";
            agregarRenglon(vector[27]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Deslizamiento de alud</td>";
            agregarRenglon(vector[28]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Erosión del suelo productivo</td>";
            agregarRenglon(vector[29]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Sobre explotación de fuentes de agua</td>";
            agregarRenglon(vector[30]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>11</td>"+
                    "<td>Sobre explotación de mantos freáticos</td>";
            agregarRenglon(vector[31]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>12</td>"+
                    "<td>Sismos o Terremotos</td>";
            agregarRenglon(vector[32]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Derrumbes de edificios aledaños</td>";
            agregarRenglon(vector[33]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Caída de torres de alta tensión</td>";
            agregarRenglon(vector[34]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td> Maremotos o Tsunamis</td>";
            agregarRenglon(vector[35]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[36]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[37]+"</td>"+
                    "</tr>";


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

    public void agregarRenglon(String decision) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "</tr>";

        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "</tr>";
        }

    }
*/

}
