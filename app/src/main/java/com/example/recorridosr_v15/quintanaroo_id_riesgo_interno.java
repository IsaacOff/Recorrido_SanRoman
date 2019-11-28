package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

public class quintanaroo_id_riesgo_interno extends AppCompatActivity {
    private EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private String vector[] = new String[17];
    String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno);
        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        directorio2 = new File(getIntent().getStringExtra("File"));

        //asigna los edit text a los et de aqui
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        et6 = (EditText) findViewById(R.id.editText6);
        et7 = (EditText) findViewById(R.id.editText7);
        et8 = (EditText) findViewById(R.id.editText8);
        et9 = (EditText) findViewById(R.id.editText9);
        et10 = (EditText) findViewById(R.id.editText10);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        et14 = (EditText) findViewById(R.id.editText14);
        et15 = (EditText) findViewById(R.id.editText15);
        et16 = (EditText) findViewById(R.id.editText16);
        et17 = (EditText) findViewById(R.id.editText17);


    }


    public void siguiente1(View view) {
        Boolean bandera = true;


        if (et1.length() == 0) {
            bandera = false;
        }


        if (et2.length() == 0) {

            bandera = false;
        }

        if (et3.length() == 0) {
            bandera = false;
        }


        if (et4.length() == 0) {
            bandera = false;
        }


        if (et5.length() == 0) {
            bandera = false;
        }


        if (et6.length() == 0) {
            bandera = false;
        }


        if (et7.length() == 0) {
            bandera = false;
        }


        if (et8.length() == 0) {
            bandera = false;
        }


        if (et9.length() == 0) {
            bandera = false;
        }


        if (et10.length() == 0) {
            bandera = false;
        }


        if (et11.length() == 0) {
            bandera = false;
        }

        if (et12.length() == 0) {
            bandera = false;
        }

        if (et13.length() == 0) {
            bandera = false;
        }


        if (et14.length() == 0) {
            bandera = false;
        }


        if (et15.length() == 0) {
            bandera = false;
        }


        if (et16.length() == 0) {
            bandera = false;
        }


        if (et17.length() == 0) {
            bandera = false;
        }


        if (bandera) {
            vector[0] = et1.getText().toString();
            vector[1] = et2.getText().toString();
            vector[2] = et3.getText().toString();
            vector[3] = et4.getText().toString();
            vector[4] = et5.getText().toString();
            vector[5] = et6.getText().toString();
            vector[6] = et7.getText().toString();
            vector[7] = et8.getText().toString();
            vector[8] = et9.getText().toString();
            vector[9] = et10.getText().toString();
            vector[10] = et11.getText().toString();
            vector[11] = et12.getText().toString();
            vector[12] = et13.getText().toString();
            vector[13] = et14.getText().toString();
            vector[14] = et15.getText().toString();
            vector[15] = et16.getText().toString();
            vector[16] = et17.getText().toString();

            Toast.makeText(this, "Vamos al siguiente", Toast.LENGTH_LONG).show();
            onClick(view);
            interno_estructura(view);


        } else {
            Toast.makeText(this, "REVISA LOS DATOS", Toast.LENGTH_LONG).show();
        }


    }


    public void interno_estructura(View view) {
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_estructura_1.class);
        intent.putExtra("File", directorio2.getPath());
        intent.putExtra("documento", tablaConcatenacion);
        startActivity(intent);
    }

    public void onClick (View view){

        tablaConcatenacion=
                "<html>" + "<body>" +

        "<TABLE border=\"1\" WIDTH=\"100%\">"+
                "<thead>"+
                "<tr>"+
                "<th colspan=\"3\" style=\"text-align:center;\">RIESGOS INTERNOS</th>"+

                "</tr>"+
                        "<tr>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"12%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"38%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"50%\"></th>" +
                        "</tr>" +
                "</thead>"+
                "<tbody>"+

                "<tr>"+
                "<td colspan=\"3\" style=\"text-align:right; border: inset 0pt\" >Fecha: <b>"+vector[0]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">IDENTIFICACIÓN DEL INMUEBLE</td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Nombre del promovente, poseedor, responsable o representante legal de la empresa: <b>"+ vector[1]+"</b></td>"+
                "</tr>" +

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Responsable del programa interno de protección civil: <b>"+vector[2]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"2\">Teléfono: <b>"+vector[3]+"</b></td>"+
                "<td style='border: inset 0pt' >Fax: <b>"+vector[4]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Domicilio: Calle y Número exterior o interior: <b>"+vector[5]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Cruzamientos: <b>"+vector[6]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Colonia: <b>"+vector[7]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"2\">Municipio: <b>"+vector[8]+"</b></td>"+
                "<td style='border: inset 0pt' >Localidad: <b>"+vector[9]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Giro o actividad en el inmueble: <b>"+vector[10]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Número de niveles incluyendo: sótano, entre pisos y anexos: <b>"+vector[11]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"2\">Superficie total (m^2): <b>"+vector[12]+"</b></td>"+
                "<td style='border: inset 0pt' >Superficie construida (m^2): <b>"+vector[13]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"3\">Antigüedad del inmueble o instalación (años): <b>"+vector[14]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' colspan=\"2\">Población fija: <b>"+vector[15]+"</b></td>"+
                "<td style='border: inset 0pt' >Población flotante: <b>"+vector[16]+"</b></td>"+
                "</tr>"+

                "<tr>"+
                "<td style=\"border: inset 0pt; border-top:1pt;\" colspan=\"3\">Planos de localización: \n" +
                "Trazar el plano general del inmueble (un plano por cada nivel o anexo, en su caso). La presentación de los planos se entregaran de acuerdo a la siguiente clasificación:\n</td>"+
                "</tr>"+

                "<tr>"+
                "<td style=\"border: inset 0pt; \" >PLANO P1</td>"+
                "<td style=\"border: inset 0pt; \" colspan=\"2\">Ubicación y distribución de los equipos de primeros auxilios y emergencia (extintores e hidrantes, sistemas de alertamiento y zonas de riesgos);</td>"+
                "</tr>"+

                "<tr>"+
                "<td style='border: inset 0pt' >PLANO P2</td>"+
                "<td style='border: inset 0pt' colspan=\"2\">Ubicación y distribución de la señalética; (Señales informativas; Señales informativas de emergencia; Señales informativas de siniestro o desastre; Señales de precaución; Señales prohibitivas y restrictivas; y Señales de obligación);</td>"+
                "</tr>"+

                "</tbody>"+
                "</table>";
            //style='border: inset 0pt'




            //Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
            //intent.putExtra("File", pdfFile.getPath());
            //startActivity(intent);



}
}