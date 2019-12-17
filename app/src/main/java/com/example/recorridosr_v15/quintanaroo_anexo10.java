package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import java.io.File;


public class quintanaroo_anexo10 extends AppCompatActivity {

    static File directorio;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10);
        this.setTitle("Anexo 10");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //directorio2 = new File(index_QuintanaRoo.file());
    }

    public void Equipo_Incendio (View view){
       // onClick(view, "Equipo contra incendios");
        Intent intent = new Intent(this, quintanaroo_anexo10_EquipoContraIncendio.class);
        startActivity(intent);
    }


    public void Detectores_Incendio (View view){
        //onClick(view, "Dectectores de incendio");
        Intent intent = new Intent(this, quintanaroo_anexo10_DetectoresContraIncendio.class);
        startActivity(intent);
    }



    public void RecursosMateriales (View view){
        //onClick(view, "Recursos materiales");
        Intent intent = new Intent(this, quintanaroo_anexo10_RecursosMateriales.class);
        startActivity(intent);
    }

    //public void onClick(View v, String nombre){
    //    directorio = new File(directorio2.getPath(),nombre);
    //    directorio.mkdir();
    //}


    //static public String file(){
      //  return directorio.getPath();
    //}

}
