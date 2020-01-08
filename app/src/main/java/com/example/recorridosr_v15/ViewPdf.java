package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class ViewPdf extends AppCompatActivity {
    File pdfFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        pdfFile =  new File(getIntent().getStringExtra("File"));
        PDFView p = (PDFView)findViewById(R.id.pdfView);
        p.fromFile(pdfFile).load();
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
}
