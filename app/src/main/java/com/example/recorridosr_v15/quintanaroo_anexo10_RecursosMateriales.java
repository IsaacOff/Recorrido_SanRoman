package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_anexo10_RecursosMateriales extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22, rb23, rb24 ;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9,rg10,rg11,rg12;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36;
    String vector[][] = new String[12][4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__recursos_materiales);


        this.setTitle("Inventario de recursos materiales");
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







    }


    public void OnClick (View view){
        Boolean bandera=true;


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









        if (bandera){
            vector[0] [1]  = et1.getText().toString();
            vector[0] [2]  = et2.getText().toString();
            vector[0] [3]  = et3.getText().toString();

            vector[1] [1]  = et4.getText().toString();
            vector[1] [2]  = et5.getText().toString();
            vector[1] [3]  = et6.getText().toString();

            vector[2] [1]  = et7.getText().toString();
            vector[2] [2]  = et8.getText().toString();
            vector[2] [3]  = et9.getText().toString();

            vector[3] [1]  = et10.getText().toString();
            vector[3] [2]  = et11.getText().toString();
            vector[3] [3]  = et12.getText().toString();

            vector[4] [1]  = et13.getText().toString();
            vector[4] [2]  = et14.getText().toString();
            vector[4] [3]  = et15.getText().toString();

            vector[5] [1]  = et16.getText().toString();
            vector[5] [2]  = et17.getText().toString();
            vector[5] [3]  = et18.getText().toString();

            vector[6] [1]  = et19.getText().toString();
            vector[6] [2]  = et20.getText().toString();
            vector[6] [3]  = et21.getText().toString();

            vector[7] [1]  = et22.getText().toString();
            vector[7] [2]  = et23.getText().toString();
            vector[7] [3]  = et24.getText().toString();

            vector[8] [1]  = et25.getText().toString();
            vector[8] [2]  = et26.getText().toString();
            vector[8] [3]  = et27.getText().toString();

            vector[9] [1]  = et28.getText().toString();
            vector[9] [2]  = et29.getText().toString();
            vector[9] [3]  = et30.getText().toString();

            vector[10] [1]  = et31.getText().toString();
            vector[10] [2]  = et32.getText().toString();
            vector[10] [3]  = et33.getText().toString();

            vector[11] [1]  = et34.getText().toString();
            vector[11] [2]  = et35.getText().toString();
            vector[11] [3]  = et36.getText().toString();


            Toast.makeText(this, "Agregado con exito", LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }



    }






}
