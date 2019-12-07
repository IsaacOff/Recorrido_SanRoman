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

import java.io.File;

public class quintanaroo_id_riesgo_interno_instalaciones_3 extends AppCompatActivity {
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26, rb27, rb28, rb29, rb30, rb31, rb32, rb33, rb34, rb35, rb36, rb37, rb38,rb39,rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23;
    private EditText edt1, edt2, edt3;
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;


    static String vector[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static String vector2[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_instalaciones_3);

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

        //asigna los edit text a los et de aqui
        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);


        //Ocultar EditText
        edt1.setVisibility(View.GONE);
        edt2.setVisibility(View.GONE);
        edt3.setVisibility(View.GONE);

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
        if(!vector2[12].equals("") && vector2[12] != null){
            et13.setText(vector2[12]);
        }
        if(!vector2[13].equals("") && vector2[13] != null){
            et14.setText(vector2[13]);
        }
        if(!vector2[14].equals("") && vector2[14] != null){
            et15.setText(vector2[14]);
        }
        if(!vector2[15].equals("") && vector2[15] != null){
            et16.setText(vector2[15]);
        }
        if(!vector2[16].equals("") && vector2[16] != null){
            et17.setText(vector2[16]);
        }
        if(!vector2[17].equals("") && vector2[17] != null){
            et18.setText(vector2[17]);
        }
        if(!vector2[18].equals("") && vector2[18] != null){
            et19.setText(vector2[18]);
        }
        if(!vector2[19].equals("") && vector2[19] != null){
            et20.setText(vector2[19]);
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
            edt1.setVisibility(View.VISIBLE);
        } else if (vector[9].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }

        if(!vector[10].equals("") && vector[10] != null){
            edt1.setText(vector[10]);
        }

        if (vector[11].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
            et10.setVisibility(View.VISIBLE);
        } else if (vector[11].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[12].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
            et11.setVisibility(View.VISIBLE);
        } else if (vector[12].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[13].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
            et12.setVisibility(View.VISIBLE);
        } else if (vector[13].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[14].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
            et13.setVisibility(View.VISIBLE);
        } else if (vector[14].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[15].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
            et14.setVisibility(View.VISIBLE);
        } else if (vector[15].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }


        if (vector[16].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
            et15.setVisibility(View.VISIBLE);
        } else if (vector[16].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

        if (vector[17].equals("SI")) {
            rb33.setChecked(true);
            rb34.setChecked(false);
            et16.setVisibility(View.VISIBLE);
        } else if (vector[17].equals("NO")) {
            rb33.setChecked(false);
            rb34.setChecked(true);
        }

        if (vector[18].equals("SI")) {
            rb35.setChecked(true);
            rb36.setChecked(false);
            et17.setVisibility(View.VISIBLE);
        } else if (vector[18].equals("NO")) {
            rb35.setChecked(false);
            rb36.setChecked(true);
        }

        if (vector[19].equals("SI")) {
            rb37.setChecked(true);
            rb38.setChecked(false);
            et18.setVisibility(View.VISIBLE);
        } else if (vector[19].equals("NO")) {
            rb37.setChecked(false);
            rb38.setChecked(true);
        }

        if (vector[20].equals("SI")) {
            rb39.setChecked(true);
            rb40.setChecked(false);
            edt2.setVisibility(View.VISIBLE);
        } else if (vector[20].equals("NO")) {
            rb39.setChecked(false);
            rb40.setChecked(true);
        }

        if(!vector[21].equals("") && vector[21] != null){
            edt2.setText(vector[21]);
        }

        if (vector[22].equals("SI")) {
            rb41.setChecked(true);
            rb42.setChecked(false);
            et19.setVisibility(View.VISIBLE);
        } else if (vector[22].equals("NO")) {
            rb41.setChecked(false);
            rb42.setChecked(true);
        }

        if (vector[23].equals("SI")) {
            rb43.setChecked(true);
            rb44.setChecked(false);
            et20.setVisibility(View.VISIBLE);
        } else if (vector[23].equals("NO")) {
            rb43.setChecked(false);
            rb44.setChecked(true);
        }

        if (vector[24].equals("SI")) {
            rb45.setChecked(true);
            rb46.setChecked(false);
            edt3.setVisibility(View.VISIBLE);
        } else if (vector[24].equals("NO")) {
            rb45.setChecked(false);
            rb46.setChecked(true);
        }

        if(!vector[25].equals("") && vector[25] != null){
            edt3.setText(vector[25]);
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
                if(!vector[4].equals("1")) {
                    if(checkedId==R.id.rb9){

                        vector[4]="SI";
                        rb9.setChecked(true);

                        et5.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb10) {

                        vector[4]="NO";
                        rb10.setChecked(true);
                        et5.setVisibility(View.GONE);


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
                        rb11.setChecked(true);
                        et6.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb12) {

                        vector[5]="NO";
                        rb12.setChecked(true);
                        et6.setVisibility(View.GONE);

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
                        rb15.setChecked(true);
                        et8.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb16) {

                        vector[7]="NO";
                        rb16.setChecked(true);
                        et8.setVisibility(View.GONE);

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
                        rb17.setChecked(true);
                        et9.setVisibility(View.VISIBLE);


                    }else if(checkedId==R.id.rb18) {

                        vector[8]="NO";
                        rb18.setChecked(true);
                        et9.setVisibility(View.GONE);


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
                if(checkedId==R.id.rb19){

                    vector[9]="SI";
                    edt1.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb20) {
                    vector[9]="NO";
                    edt1.setVisibility(View.GONE);


                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[11].equals("1")) {
                    if(checkedId==R.id.rb21){

                        vector[11]="SI";
                        rb21.setChecked(true);
                        et10.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb22) {

                        vector[11]="NO";
                        rb22.setChecked(true);
                        et10.setVisibility(View.GONE);

                    }

                }else{
                    vector[11] = "";
                    rb21.setChecked(false);
                    rb22.setChecked(false);
                    et10.setVisibility(View.GONE);

                }


            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[12]="SI";
                    et11.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb24) {

                    vector[12]="NO";
                    et11.setVisibility(View.GONE);

                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[13]="SI";
                    et12.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb26) {

                    vector[13]="NO";
                    et12.setVisibility(View.GONE);
                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[14]="SI";
                    et13.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb28) {

                    vector[14]="NO";
                    et13.setVisibility(View.GONE);


                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[15]="SI";
                    et14.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb30) {

                    vector[15]="NO";
                    et14.setVisibility(View.GONE);

                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[16]="SI";
                    et15.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb32) {

                    vector[16]="NO";
                    et15.setVisibility(View.GONE);

                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if(checkedId==R.id.rb33){
                        vector[17]="SI";
                        rb33.setChecked(true);
                        et16.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb34) {

                        vector[17]="NO";
                        rb34.setChecked(true);
                        et16.setVisibility(View.GONE);

                    }



            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[18].equals("1")) {

                    if(checkedId==R.id.rb35){

                        vector[18]="SI";
                        rb35.setChecked(true);
                        et17.setVisibility(View.VISIBLE);
                    }else if(checkedId==R.id.rb36) {

                        vector[18]="NO";
                        rb36.setChecked(true);
                        et17.setVisibility(View.GONE);
                    }

                }else{
                    vector[17] = "";
                    rb35.setChecked(false);
                    rb36.setChecked(false);
                    et17.setVisibility(View.GONE);

                }




            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[19]="SI";
                    et18.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb38) {

                    vector[19]="NO";

                    et18.setVisibility(View.GONE);
                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId==R.id.rb39){

                    vector[20]="SI";
                    edt2.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb40) {

                    vector[20]="NO";
                    edt2.setVisibility(View.GONE);


                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[22].equals("1")) {
                    if(checkedId==R.id.rb41){

                        vector[22]="SI";
                        rb41.setChecked(true);
                        et19.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb42) {

                        vector[22]="NO";
                        rb42.setChecked(true);
                        et19.setVisibility(View.GONE);

                    }

                }else{
                    vector[22] = "";
                    rb41.setChecked(false);
                    rb42.setChecked(false);
                    et19.setVisibility(View.GONE);


                }



            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[23].equals("1")) {
                    if(checkedId==R.id.rb43){

                        vector[23]="SI";
                        rb43.setChecked(true);
                        et20.setVisibility(View.VISIBLE);

                    }else if(checkedId==R.id.rb44) {

                        vector[23]="NO";
                        rb44.setChecked(true);
                        et20.setVisibility(View.GONE);
                    }

                }else{
                    vector[23] = "";
                    rb43.setChecked(false);
                    rb44.setChecked(false);
                    et20.setVisibility(View.GONE);


                }

            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[24].equals("1")) {
                    if(checkedId==R.id.rb45){
                        vector[24]="SI";
                        rb45.setChecked(true);
                        edt3.setVisibility(View.VISIBLE);


                    }else if(checkedId==R.id.rb46) {

                        vector[24]="NO";
                        rb46.setChecked(true);
                        edt3.setVisibility(View.GONE);


                    }
                }else{
                    vector[23] = "";
                    rb45.setChecked(false);
                    rb46.setChecked(false);
                    edt3.setVisibility(View.GONE);


                }


            }
        });

        edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10]= edt1.getText().toString();
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
                vector[21]= edt2.getText().toString();
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
                vector[25]= edt3.getText().toString();
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

        et13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector2[12]= et13.getText().toString();
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
                vector2[13]= et14.getText().toString();
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
                vector2[14]= et15.getText().toString();
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
                vector2[15]= et16.getText().toString();
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
                vector2[16]= et17.getText().toString();
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
                vector2[17]= et18.getText().toString();
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
                vector2[18]= et19.getText().toString();
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
                vector2[19]= et20.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }



    public void eventtext5 (View view){
        System.out.println("eventext5");
        vector[4]= "1";
        rb9.setChecked(false);
        rb10.setChecked(false);


        vector2[4]="";
        et5.setVisibility(View.GONE);
        et5.setText("");

        if(vector[4]=="1"){
           // System.out.println("cambio");
            vector[4]="";
        }
    }

    public void eventtext6 (View view){
        System.out.println("eventext6");
        vector[5]= "1";
        rb11.setChecked(false);
        rb12.setChecked(false);


        vector2[5]="";
        et6.setVisibility(View.GONE);
        et6.setText("");

        if(vector[5]=="1"){
          //  System.out.println("cambio");
            vector[5]="";
        }
    }


    public void event_text7 (View view){
        System.out.println("eventext7");
        vector[6]= "1";
        rb13.setChecked(false);
        rb14.setChecked(false);


        vector2[6]="";
        et7.setVisibility(View.GONE);
        et7.setText("");

        if(vector[6]=="1"){
           // System.out.println("cambio");
            vector[6]="";
        }
    }

    public void event_text8 (View view){
        System.out.println("eventext8");
        vector[7]= "1";
        rb15.setChecked(false);
        rb16.setChecked(false);


        vector2[7]="";
        et8.setVisibility(View.GONE);
        et8.setText("");

        if(vector[7]=="1"){
            // System.out.println("cambio");
            vector[7]="";
        }
    }

    public void event_text9 (View view){
        System.out.println("eventext9");
        vector[8]= "1";
        rb17.setChecked(false);
        rb18.setChecked(false);


        vector2[8]="";
        et9.setVisibility(View.GONE);
        et9.setText("");

        if(vector[8]=="1"){
            // System.out.println("cambio");
            vector[8]="";
        }
    }

    public void event_text11 (View view){
       // System.out.println("eventext9");
        vector[11]= "1";
        rb21.setChecked(false);
        rb22.setChecked(false);


        vector2[9]="";
        et10.setVisibility(View.GONE);
        et10.setText("");

        if(vector[11]=="1"){
            // System.out.println("cambio");
            vector[11]="";
        }
    }


    public void event_text18 (View view){
        // System.out.println("eventext9");
        vector[18]= "1";
        rb35.setChecked(false);
        rb36.setChecked(false);


        vector2[16]="";
        et17.setVisibility(View.GONE);
        et17.setText("");

        if(vector[18]=="1"){
            // System.out.println("cambio");
            vector[18]="";
        }
    }


    public void event_text21 (View view){
        // System.out.println("eventext9");
        vector[22]= "1";
        rb41.setChecked(false);
        rb42.setChecked(false);


        vector2[18]="";
        et19.setVisibility(View.GONE);
        et19.setText("");

        if(vector[22]=="1"){
            // System.out.println("cambio");
            vector[22]="";
        }
    }


    public void event_text22 (View view){
        // System.out.println("eventext9");
        vector[23]= "1";
        rb43.setChecked(false);
        rb44.setChecked(false);


        vector2[19]="";
        et20.setVisibility(View.GONE);
        et20.setText("");

        if(vector[23]=="1"){
            // System.out.println("cambio");
            vector[23]="";
        }
    }

    public void event_text23 (View view){
        // System.out.println("eventext9");
        vector[24]= "1";
        rb45.setChecked(false);
        rb46.setChecked(false);


        vector[25]="";
        edt3.setVisibility(View.GONE);
        edt3.setText("");

        if(vector[24]=="1"){
            // System.out.println("cambio");
            vector[24]="";
        }
    }


    public static boolean siguiente4() {
        Boolean bandera = true;
        boolean banderanulo = true;

        for(int i=0;i<4; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }

        for(int i=4;i<10; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                banderanulo= false;
                vector[i]="N/P";
            }
        }



        if(vector[11]==null || vector[11].equals("")){
            banderanulo= false;
            vector[11]="N/P";
        }

        for(int i=12;i<18; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }

        if(vector[18]==null || vector[18].equals("")){
            banderanulo= false;
            vector[18]="N/P";
        }

        for(int i=19;i<21; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }

        for(int i=22;i<25; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                banderanulo= false;
                vector[i]="N/P";
            }
        }

        if( vector[9]=="SI"){

            if (vector[10].equals("")) {
                bandera = false;
            }

        }

        if( vector[20]=="SI"){

            if (vector[21].equals("")) {
                bandera = false;
            }

        }


        if( vector[24]=="SI"){

            if (vector[25].equals("")) {
                bandera = false;
            }

        }




        if (bandera) {
            //vector[10] = edt1.getText().toString();
            //vector[21] = edt2.getText().toString();
            //vector[25] = edt3.getText().toString();


            //Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();
            //onClick(view);
            //interno_siguiente4(view);
            return true;


        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            return false;
        }


    }

    public void interno_siguiente4 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_noEstructurales_4.class);
        startActivity(intent);
    }

    public static String onClick (){


            tablaConcatenacion=


                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">RIESGOS POR DEFICIENCIA EN LAS INSTALACIONES DE SERVICIO DEL INMUEBLE</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">Medición de <b>deficiencias</b> en los servicios del inmueble</td>"+
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
                            "<td>1.</td>"+
                            "<td colspan=\"4\" >Instalación hidrosanitaria</td>"+
                            "</tr>"+

                            "<tr>" +
                            "<td></td>"+
                            "<td>Presenta fugas</td>";
            agregarRenglon(vector[0], vector2[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Daños en cisterna</td>";
            agregarRenglon(vector[1], vector2[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Daños en tuberías</td>";
            agregarRenglon(vector[2], vector2[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Fuga de agua en sanitarios y baños</td>";
            agregarRenglon(vector[3], vector2[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Fuga de agua en cocina</td>";
            agregarRenglon(vector[4], vector2[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td>2.</td>"+
                    "<td colspan=\"4\" >Instalación de gas</td>"+
                    "</tr>"+
                    "<tr>" +
                    "<td></td>"+
                    "<td>Presenta fugas</td>";
            agregarRenglon(vector[5], vector2[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en el tanque</td>";
            agregarRenglon(vector[6], vector2[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en tuberías</td>";
            agregarRenglon(vector[7], vector2[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en la instalación del suministro de gas: Estufa, calentador de agua</td>";
            agregarRenglon(vector[8], vector2[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con dictamen técnico de instalación gas</td>";
            agregarRenglon(vector[9], "De qué fecha: <b>"+vector[10]+"</b>");

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" ;

            if(vector[9].equals("SI")) {
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"5\" >De qué fecha: <b>"+vector[10]+"</b></td>";
            }else{
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"5\" >De qué fecha:</td>";
            }

            tablaConcatenacion=  tablaConcatenacion +
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b> Si respondió afirmativo presentar copia del dictamen técnico.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td>3.</td>"+
                    "<td colspan=\"4\" >Instalación eléctrica</td>"+
                    "</tr>"+

                    "<tr>" +
                    "<td></td>"+
                    "<td>Subestación (protegida y señalada)</td>";
            agregarRenglon(vector[11], vector2[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Tablero (con tapa y señalado)</td>";
            agregarRenglon(vector[12], vector2[10]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cableado (entubado o empotrado)</td>";
            agregarRenglon(vector[13], vector2[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Contactos (protegidos)</td>";
            agregarRenglon(vector[14], vector2[12]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Interruptores (con tapa protectora)</td>";
            agregarRenglon(vector[15], vector2[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Lámparas (funcionando)</td>";
            agregarRenglon(vector[16], vector2[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Lámparas de emergencia (funcionando)</td>";
            agregarRenglon(vector[17], vector2[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Planta de emergencia</td>";
            agregarRenglon(vector[18], vector2[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cajas de distribución</td>";
            agregarRenglon(vector[19], vector2[17]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con dictamen técnico de instalación eléctrica</td>";
            agregarRenglon(vector[20] , "De qué fecha: <b>"+vector[21]+"</b>");


            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b> Si respondió afirmativo presentar copia del dictamen técnico.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td>4.</td>"+
                    "<td colspan=\"4\" >Instalación de aire acondicionado</td>"+
                    "</tr>"+

                    "<tr>" +
                    "<td></td>"+
                    "<td>La instalación eléctrica se encuentra protegida</td>";
            agregarRenglon(vector[22], vector2[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con tierra física</td>";
            agregarRenglon(vector[23], vector2[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Instalaciones especiales</td>";
            agregarRenglon(vector[24], "Especifique: <b>" + vector[25] + "</b>");

                    tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>\n" +
                    "Si respondió afirmativo en alguna de las opciones de la cuestión 1., se requiere implementar medidas preventivas.\n" +
                    "Si respondió afirmativo en alguna de las opciones de las cuestiones 2 a la 4, se requiere implementar medidas correctivas, además de los dictámenes técnicos correspondientes elaborados por una Unidad de Verificación o Perito Autorizado en la materia.\n</td>"+
                    "</tr>";


            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>";

            return tablaConcatenacion;

    }
    public static void agregarRenglon(String decision, String observacion) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td>"+observacion+"</td>" +
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
