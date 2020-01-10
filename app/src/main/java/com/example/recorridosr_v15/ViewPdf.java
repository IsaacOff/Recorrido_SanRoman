package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.snackbar.Snackbar;

import java.io.File;

public class ViewPdf extends AppCompatActivity {
    LinearLayout layout;
    File pdfFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        pdfFile =  new File(getIntent().getStringExtra("File"));
        PDFView p = (PDFView)findViewById(R.id.pdfView);
        p.fromFile(pdfFile).load();



        this.setTitle("Vista previa PDF");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

         layout = findViewById(R.id.prueba);




        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null

      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setSupportActionBar(toolbar);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void regresar (View view) {
        Intent intent = new Intent(this, index_QuintanaRoo.class);
        startActivity(intent);
    }

    public void compartir (View view) {

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("application/pdf");
        shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(pdfFile));
        startActivity(Intent.createChooser(shareIntent, "Compartir pdf"));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_compartir, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.ayuda) {
            Snackbar snackbar =Snackbar.make(layout, "PDF generado con exito", Snackbar.LENGTH_LONG);
                    snackbar.show();


            return true;
        }
        if (id == R.id.compartir) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("application/pdf");
            shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(pdfFile));
            startActivity(Intent.createChooser(shareIntent, "Compartir pdf"));

            return true;
        }





        return super.onOptionsItemSelected(item);
    }











}
