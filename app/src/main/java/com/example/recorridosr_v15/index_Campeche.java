package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class index_Campeche extends AppCompatActivity {

    static File directorio2;
    static File directorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_campeche);

        this.setTitle(R.string.titulo);

        //Pantalla en vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        directorio2 = new File(getIntent().getStringExtra("File"));

    }
    public void Anexo10 (View view){
        onClick(view, "Anexo10");
        Intent ext = new Intent(this, quintanaroo_anexo10.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void onClick(View v, String nombre){
        directorio = new File(directorio2.getPath(),nombre);
        directorio.mkdir();
    }
}
