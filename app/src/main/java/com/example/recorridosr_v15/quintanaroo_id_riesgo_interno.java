package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class quintanaroo_id_riesgo_interno extends AppCompatActivity {
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10,et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private String vector[] = new String[17];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno);
        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //asigna los edit text a los et de aqui
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
        et17 = (EditText) findViewById(R.id.editText17);




    }



    public void siguiente1(View view) {
        Boolean bandera = true;



        if (et1.length() == 0) {
            bandera = false;
        }


            if (et2.length() == 0) {

                bandera = false;
            }

            if (et3.length() == 0) {
                bandera = false;
            }


            if (et4.length() == 0) {
                bandera = false;
            }


            if (et5.length() == 0) {
                bandera = false;
            }


            if (et6.length() == 0) {
                bandera = false;
            }


            if (et7.length() == 0) {
                bandera = false;
            }


            if (et8.length() == 0) {
                bandera = false;
            }


            if (et9.length() == 0) {
                bandera = false;
            }


            if (et10.length() == 0) {
                bandera = false;
            }


        if (et11.length() == 0) {
            bandera = false;
        }

        if (et12.length() == 0) {
            bandera = false;
        }

            if (et13.length() == 0) {
                bandera = false;
            }


            if (et14.length() == 0) {
                bandera = false;
            }


            if (et15.length() == 0) {
                bandera = false;
            }


            if (et16.length() == 0) {
                bandera = false;
            }


            if (et17.length() == 0) {
                bandera = false;
            }





        if (bandera) {
            vector[0] = et1.getText().toString();
            vector[1] = et2.getText().toString();
            vector[2] = et3.getText().toString();
            vector[3] = et4.getText().toString();
            vector[4] = et5.getText().toString();
            vector[5] = et6.getText().toString();
            vector[6] = et7.getText().toString();
            vector[7] = et8.getText().toString();
            vector[8] = et9.getText().toString();
            vector[9] = et10.getText().toString();
            vector[10] = et11.getText().toString();
            vector[11] = et12.getText().toString();
            vector[12] = et13.getText().toString();
            vector[13] = et14.getText().toString();
            vector[14] = et15.getText().toString();
            vector[15] = et16.getText().toString();
            vector[16] = et17.getText().toString();

            Toast.makeText(this, "Vamos al siguiente", Toast.LENGTH_LONG).show();
            interno_estructura(view);




        } else {
            Toast.makeText(this, "REVISA LOS DATOS", Toast.LENGTH_LONG).show();
        }


    }



    public void interno_estructura (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_estructura_1.class);
        startActivity(intent);
    }
}
