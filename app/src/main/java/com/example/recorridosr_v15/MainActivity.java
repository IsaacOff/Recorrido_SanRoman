package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
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
        Intent ext = new Intent(this, carpetaempresa_campeche.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void yucatan (View view){
        onClick(view, "Yucatan");
        Intent ext = new Intent(this, carpetaempresa_yucatan.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void tabasco (View view){
        onClick(view, "Tabasco");
        Intent ext = new Intent(this, carpetaempresa_tabasco.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void quintanaroo (View view){
        onClick(view, "Quintanaroo");
        Intent ext = new Intent(this, carpetaempresa_quintanaRoo.class);
        ext.putExtra("File", directorio.getPath());
        startActivity(ext);
    }

    public void onClick(View v, String nombre){
        directorio = new File(this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), nombre);
        directorio.mkdir();
    }

}
