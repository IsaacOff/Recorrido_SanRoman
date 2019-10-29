package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class ViewPdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        File pdfFile =  new File(getIntent().getStringExtra("File"));
        PDFView p = (PDFView)findViewById(R.id.pdfView);
        p.fromFile(pdfFile).load();
    }
}
