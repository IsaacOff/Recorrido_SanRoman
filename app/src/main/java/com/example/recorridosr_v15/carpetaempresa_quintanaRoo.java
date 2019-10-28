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

import static android.widget.Toast.LENGTH_SHORT;

public class carpetaempresa_quintanaRoo extends AppCompatActivity {
    private EditText et1;
    static File directorio2;
    static File directorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        directorio2 = com.example.recorridosr_v15.MainActivity.GetFile();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carpetaempresa_quintana_roo);

        this.setTitle(R.string.titulo2);
        //Pantalla en vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        et1  = (EditText) findViewById(R.id.editText);





    }
    public void inicio_quintana_roo (View view){


        if (et1.length() == 0) {
            Toast.makeText(this, "REVISA LOS DATOS E INTENTA DE NUEVO", LENGTH_SHORT).show();
        }else{
            onClick(view, et1.getText().toString());
            Intent ext = new Intent(this, index_QuintanaRoo.class);
            startActivity(ext);
        }

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
