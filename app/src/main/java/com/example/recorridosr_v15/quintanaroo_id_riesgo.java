package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class quintanaroo_id_riesgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo);

        this.setTitle("Identificacion de Riesgos");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    public void Riesgos_interno_quintana (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
        startActivity(intent);
    }



    public void Riesgos_externo_quintana (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo.class);
        startActivity(intent);
    }


}
