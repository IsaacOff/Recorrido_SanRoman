package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class quintanaroo_id_riesgo extends AppCompatActivity {

    static File directorio2;
    static File directorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo);

        this.setTitle("Identificacion de Riesgos");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        directorio2 = new File(getIntent().getStringExtra("File"));
    }


    public void Riesgos_interno_quintana (View view){
        onClick(view, "Riesgo interno");
        //Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
        startActivity(intent);
    }



    public void Riesgos_externo_quintana (View view){
        //onClick(view, "Riesgo Externo");
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_2.class);
        startActivity(intent);
    }

    public void onClick(View v, String nombre){
        directorio = new File(directorio2.getPath(), nombre);
        directorio.mkdir();
    }

    public static String file (){
        return directorio.getPath();
    }

}
