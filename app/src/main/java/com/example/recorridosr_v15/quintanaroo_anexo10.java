package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;


public class quintanaroo_anexo10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10);
        this.setTitle("Anexo 10_ Quintana Roo");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void Equipo_Incendio (View view){
        Intent ext = new Intent(this, quintanaroo_anexo10_EquipoContraIncendio.class);
        startActivity(ext);
    }


    public void Detectores_Incendio (View view){
        Intent ext = new Intent(this, quintanaroo_anexo10_DetectoresContraIncendio.class);
        startActivity(ext);
    }



    public void RecursosMateriales (View view){
        Intent ext = new Intent(this, quintanaroo_anexo10_RecursosMateriales.class);
        startActivity(ext);
    }




}
