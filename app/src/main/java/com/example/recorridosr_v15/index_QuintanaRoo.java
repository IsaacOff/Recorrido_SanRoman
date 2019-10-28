package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class index_QuintanaRoo extends AppCompatActivity {

    static File directorio2;
    static File directorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index__quintana_roo);

        this.setTitle(R.string.titulo2);
        //Pantalla en vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        directorio2 = com.example.recorridosr_v15.carpetaempresa_quintanaRoo.GetFile();



    }



    public void Exterior_quintana (View view){
        onClick(view, "Exterior");
        Intent ext = new Intent(this, quintanaroo_SeguridadExterior.class);
        startActivity(ext);
    }

    public void Analisis_quintana (View view){
        onClick(view, "Analisis_de_recursos");
        Intent ext = new Intent(this, index_Yucatan.class);
        startActivity(ext);
    }

    public void Circundantes_quintana (View view){
        onClick(view, "Circundantes");
        Intent ext = new Intent(this, index_Tabasco.class);
        startActivity(ext);
    }
    public void onClick(View v, String nombre){
        //Toast.makeText(this,NombreS, Toast.LENGTH_LONG).show();
        directorio = new File(directorio2.getPath(),nombre);

        directorio.mkdir();
        //File directorio = new File(getFilesDir(), NombreS);
        //File folder = new File(Environment.getExternalStorageDirectory().toString() ,NombreS);getFilesDir()
    }
    static File GetFile (){
        return directorio;
    }

}
