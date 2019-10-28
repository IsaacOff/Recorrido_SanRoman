package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    static File directorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //pone el icono en la pantalla del menu
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //bloquea la pantalla en modo vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }



    //metodos para inicializar los index de cada estado
    public void campeche (View view){
        onClick(view, "Campeche");
        Intent ext = new Intent(this, index_Campeche.class);
        startActivity(ext);
    }

    public void yucatan (View view){
        onClick(view, "Yucatan");
        Intent ext = new Intent(this, index_Yucatan.class);
        startActivity(ext);
    }

    public void tabasco (View view){
        onClick(view, "Tabasco");
        Intent ext = new Intent(this, index_Tabasco.class);
        startActivity(ext);
    }

    public void quintanaroo (View view){
        onClick(view, "Quintanaroo");
        Intent ext = new Intent(this, carpetaempresa_quintanaRoo.class);
        startActivity(ext);
    }

    public void onClick(View v, String nombre){
        //Toast.makeText(this,NombreS, Toast.LENGTH_LONG).show();
        directorio = new File(this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS),
                nombre);
        directorio.mkdir();
        //File directorio = new File(getFilesDir(), NombreS);
        //File folder = new File(Environment.getExternalStorageDirectory().toString() ,NombreS);getFilesDir()
    }
    static File GetFile (){
        return directorio;
    }

}
