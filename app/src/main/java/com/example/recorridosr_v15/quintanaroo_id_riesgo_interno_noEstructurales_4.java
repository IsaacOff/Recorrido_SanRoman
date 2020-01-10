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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
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

public class quintanaroo_id_riesgo_interno_noEstructurales_4 extends AppCompatActivity {
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26, rb27, rb28, rb29, rb30, rb31, rb32;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16;
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16;
    static String vector[]= {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static String vector2[]= {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";
    LinearLayout layout4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_no_estructurales_4);



        this.setTitle("Riesgo interno 5");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        // Implementa el menu para que se vea en esta vista en especifico
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


        //instancia para saber donde poner el snackbar
        layout4 = findViewById(R.id.interno4);




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
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        et14 = (EditText) findViewById(R.id.editText14);
        et15 = (EditText) findViewById(R.id.editText15);
        et16 = (EditText) findViewById(R.id.editText16);

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

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[0].equals("1")) {
                if(checkedId==R.id.rb1){
                    rb1.setChecked(true);
                    vector[0]="SI";
                    et1.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb2) {
                    vector[0]="NO";
                    rb2.setChecked(true);
                    et1.setVisibility(View.GONE);
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
                    rb3.setChecked(true);
                    vector[1]="SI";
                    et2.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb4) {
                    rb4.setChecked(true);
                    vector[1]="NO";
                    et2.setVisibility(View.GONE);

                }

                    }else {
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
                    et3.setVisibility(View.VISIBLE);
                    rb5.setChecked(true);
                }else if(checkedId==R.id.rb6) {

                    vector[2]="NO";
                    rb6.setChecked(true);
                    et3.setVisibility(View.GONE);
                }
                        }else {
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

                    vector[3]="SI";
                    rb7.setChecked(true);
                    et4.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb8) {
                    rb8.setChecked(true);
                    vector[3]="NO";
                    et4.setVisibility(View.GONE);
                }
                        }else {
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
                    rb9.setChecked(true);
                    vector[4]="SI";
                    et5.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb10) {

                    vector[4]="NO";
                    et5.setVisibility(View.GONE);
                    rb10.setChecked(true);

                }

                        }else {
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
                    rb11.setChecked(true);
                    vector[5]="SI";
                    et6.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb12) {
                    rb12.setChecked(true);
                    vector[5]="NO";
                    et6.setVisibility(View.GONE);

                }
                    }else {
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
                    rb13.setChecked(true);
                    vector[6]="SI";
                    et7.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb14) {
                    rb14.setChecked(true);
                    vector[6]="NO";
                    et7.setVisibility(View.GONE);

                }
                    }else {
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
                    rb15.setChecked(true);
                    vector[7]="SI";
                    et8.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb16) {
                    rb16.setChecked(true);
                    vector[7]="NO";
                    et8.setVisibility(View.GONE);

                }
                    }else {
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
                    rb17.setChecked(true);
                    vector[8]="SI";
                    et9.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb18) {
                    rb18.setChecked(true);
                    vector[8]="NO";

                    et9.setVisibility(View.GONE);

                }
                    }else {
                        vector[8] = "";
                        rb17.setChecked(false);
                        rb18.setChecked(false);
                        et9.setVisibility(View.GONE);
                    }
            }
        });






        ///otro9-18


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(!vector[9].equals("1")) {

                if(checkedId==R.id.rb19){
                    rb19.setChecked(true);
                    vector[9]="SI";
                    et10.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb20) {
                    vector[9]="NO";
                    et10.setVisibility(View.GONE);
                    rb20.setChecked(true);
                }
                    }else {
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
                    rb21.setChecked(true);
                    vector[10]="SI";
                    et11.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb22) {
                    rb22.setChecked(true);
                    vector[10]="NO";

                    et11.setVisibility(View.GONE);
                }

                    }else {
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
                    rb23.setChecked(true);
                    et12.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb24) {

                    vector[11]="NO";
                    et12.setVisibility(View.GONE);
                    rb24.setChecked(true);
                }
                    }else {
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
                    rb25.setChecked(true);
                    vector[12]="SI";

                    et13.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb26) {
                    rb26.setChecked(true);
                    vector[12]="NO";
                    et13.setVisibility(View.GONE);
                }
                    }else {
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
                    }else {
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
                    rb29.setChecked(true);
                    vector[14]="SI";
                    et15.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb30) {
                    rb30.setChecked(true);
                    vector[14]="NO";
                    et15.setVisibility(View.GONE);

                }
                    }else {
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

                    vector[15]="SI";
                    rb31.setChecked(true);
                    et16.setVisibility(View.VISIBLE);
                }else if(checkedId==R.id.rb32) {
                    rb32.setChecked(true);
                    vector[15]="NO";
                    et16.setVisibility(View.GONE);

                }
                    }else {
                        vector[15] = "";
                        rb31.setChecked(false);
                        rb32.setChecked(false);
                        et16.setVisibility(View.GONE);
                    }
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



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.ayuda) {
            Snackbar snackbar =Snackbar.make(layout4, "Para los campos de '(N/A)': 'Presiona sobre los campos de color naranja' o solo 'deja vacios esos campos'", Snackbar.LENGTH_LONG);
            snackbar.show();


            return true;
        }
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
        if (id == R.id.opcion8) {
            quintanaroo_id_riesgo_interno_otros_6.revisar(getApplicationContext());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void eventtext1 (View view){
        System.out.println("eventext2");
        vector[0]= "1";
        rb1.setChecked(false);
        rb2.setChecked(false);

        vector2[0]= "";
        et1.setVisibility(View.GONE);
        et1.setText("");

        if(vector[0]=="1"){
            vector[0]="";
        }
    }

    public void eventtext2 (View view){
        System.out.println("eventext2");
        vector[1]= "1";
        rb3.setChecked(false);
        rb4.setChecked(false);

        vector2[1]= "";
        et2.setVisibility(View.GONE);
        et2.setText("");

        if(vector[1]=="1"){
            vector[1]="";
        }
    }
    public void eventtext3 (View view){
        System.out.println("eventext2");
        vector[2]= "1";
        rb5.setChecked(false);
        rb6.setChecked(false);

        vector2[2]= "";
        et3.setVisibility(View.GONE);
        et3.setText("");

        if(vector[2]=="1"){
            vector[2]="";
        }
    }
    public void eventtext4 (View view){
        System.out.println("eventext2");
        vector[3]= "1";
        rb7.setChecked(false);
        rb8.setChecked(false);

        vector2[3]= "";
        et4.setVisibility(View.GONE);
        et4.setText("");

        if(vector[3]=="1"){
            vector[3]="";
        }
    }
    public void eventtext5 (View view){
        System.out.println("eventext2");
        vector[4]= "1";
        rb9.setChecked(false);
        rb10.setChecked(false);

        vector2[4]= "";
        et5.setVisibility(View.GONE);
        et5.setText("");

        if(vector[4]=="1"){
            vector[4]="";
        }
    }
    public void eventtext6 (View view){
        System.out.println("eventext2");
        vector[5]= "1";
        rb11.setChecked(false);
        rb12.setChecked(false);

        vector2[5]= "";
        et6.setVisibility(View.GONE);
        et6.setText("");

        if(vector[5]=="1"){
            vector[5]="";
        }
    }
    public void eventtext7 (View view){
        System.out.println("eventext2");
        vector[6]= "1";
        rb13.setChecked(false);
        rb14.setChecked(false);

        vector2[6]= "";
        et7.setVisibility(View.GONE);
        et7.setText("");

        if(vector[6]=="1"){
            vector[6]="";
        }
    }
    public void eventtext8 (View view){
        System.out.println("eventext2");
        vector[7]= "1";
        rb15.setChecked(false);
        rb16.setChecked(false);

        vector2[7]= "";
        et8.setVisibility(View.GONE);
        et8.setText("");

        if(vector[7]=="1"){
            vector[7]="";
        }
    }
    public void eventtext9 (View view){
        System.out.println("eventext2");
        vector[8]= "1";
        rb17.setChecked(false);
        rb18.setChecked(false);

        vector2[8]= "";
        et9.setVisibility(View.GONE);
        et9.setText("");

        if(vector[8]=="1"){
            vector[8]="";
        }
    }
    public void eventtext10 (View view){
        System.out.println("eventext2");
        vector[9]= "1";
        rb19.setChecked(false);
        rb20.setChecked(false);

        vector2[9]= "";
        et10.setVisibility(View.GONE);
        et10.setText("");

        if(vector[9]=="1"){
            vector[9]="";
        }
    }
    public void eventtext11 (View view){
        System.out.println("eventext2");
        vector[10]= "1";
        rb21.setChecked(false);
        rb22.setChecked(false);

        vector2[10]= "";
        et11.setVisibility(View.GONE);
        et11.setText("");

        if(vector[10]=="1"){
            vector[10]="";
        }
    }
    public void eventtext12 (View view){
        System.out.println("eventext2");
        vector[11]= "1";
        rb23.setChecked(false);
        rb24.setChecked(false);

        vector2[11]= "";
        et12.setVisibility(View.GONE);
        et12.setText("");

        if(vector[11]=="1"){
            vector[11]="";
        }
    }
    public void eventtext13 (View view){
        System.out.println("eventext2");
        vector[12]= "1";
        rb25.setChecked(false);
        rb26.setChecked(false);

        vector2[12]= "";
        et13.setVisibility(View.GONE);
        et13.setText("");

        if(vector[12]=="1"){
            vector[12]="";
        }
    }
    public void eventtext14 (View view){
        System.out.println("eventext2");
        vector[13]= "1";
        rb27.setChecked(false);
        rb28.setChecked(false);

        vector2[13]= "";
        et14.setVisibility(View.GONE);
        et14.setText("");

        if(vector[13]=="1"){
            vector[13]="";
        }
    }
    public void eventtext15 (View view){
        System.out.println("eventext2");
        vector[14]= "1";
        rb29.setChecked(false);
        rb30.setChecked(false);

        vector2[14]= "";
        et15.setVisibility(View.GONE);
        et15.setText("");

        if(vector[14]=="1"){
            vector[14]="";
        }
    }
    public void eventtext16 (View view){
        System.out.println("eventext2");
        vector[15]= "1";
        rb31.setChecked(false);
        rb32.setChecked(false);

        vector2[15]= "";
        et16.setVisibility(View.GONE);
        et16.setText("");

        if(vector[15]=="1"){
            vector[15]="";
        }
    }



    public static boolean siguiente5() {


        for(int i=0;i<16; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                vector[i]="N/P";
            }
        }
        System.out.println(vector.toString());

        return true;
    }



    public void interno_siguiente5 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_equiposyservicios_5.class);
        startActivity(intent);
    }

    public static String onClick (){


            tablaConcatenacion=

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">RIESGOS POR ELEMENTOS NO ESTRUCTURALES</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">Riesgo por las <b>condiciones de inseguridad</b> que existe en :</td>"+
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
                            "<td>Anaqueles y/o estantería</td>";
            agregarRenglon(vector[0], vector2[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Vidrios</td>";
            agregarRenglon(vector[1], vector2[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Antenas</td>";
            agregarRenglon(vector[2], vector2[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Plafones</td>";
            agregarRenglon(vector[3], vector2[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Lámparas</td>";
            agregarRenglon(vector[4], vector2[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Elevadores</td>";
            agregarRenglon(vector[5], vector2[5]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 1 a la 6, se requiere implementar medidas correctivas.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Cancelería</td>";
            agregarRenglon(vector[6], vector2[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Puertas y ventanas</td>";
            agregarRenglon(vector[7], vector2[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Elementos suspendidos</td>";
            agregarRenglon(vector[8], vector2[8]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Muros falsos</td>";
            agregarRenglon(vector[9], vector2[9]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 7 a la 10, se requiere implementar medidas preventivas.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">RIESGOS POR ACABADOS DEL INMUEBLE</td>"+
                    "</tr>"+
                    "<tr>"+
                    "<td colspan=\"5\">Riesgo por las <b>condiciones de inseguridad</b> que presentan los acabados del inmueble :</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Lambrines</td>";
            agregarRenglon(vector[10], vector2[10]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Recubrimiento de material incombustible</td>";
            agregarRenglon(vector[11], vector2[11]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 1 y  2, se requiere implementar medidas preventivas.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Recubrimiento de material combustible</td>";
            agregarRenglon(vector[12], vector2[12]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Pisos y desniveles</td>";
            agregarRenglon(vector[13], vector2[13]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Pisos falsos</td>";
            agregarRenglon(vector[14], vector2[14]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Losetas y azulejos</td>";
            agregarRenglon(vector[15], vector2[15]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 3 a la 6, se requiere implementar medidas correctivas.</td>"+
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
