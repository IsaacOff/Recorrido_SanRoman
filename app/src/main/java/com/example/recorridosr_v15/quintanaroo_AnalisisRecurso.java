package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
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

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_AnalisisRecurso extends AppCompatActivity {
    private Spinner spin1;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22 ;
    private final int top = 12;
    String vector[] = new String[top];
    static File pdfFile;
    static String htmlToPDF;
    static File directorio2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo__analisis_recurso);

        directorio2 = new File(getIntent().getStringExtra("File"));
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Analisis de recursos.pdf");
        }

        this.setTitle("Analisis de Recurso Quintana Roo");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //asigna los espiner del xml a los espiner aqui declarados
        spin1 = (Spinner) findViewById(R.id.spinner1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String[] opciones = {"Selecione:", "RURAL", "SEMIURBANA", "URBANO", "ZONA DE FACIL ACCESO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);
        rb21 = (RadioButton) findViewById(R.id.rb21);
        rb22 = (RadioButton) findViewById(R.id.rb22);


    }


    public void onClick(View view) {
        Boolean bandera = true;

        //selecciona lo que carga el spinner
        vector[0] = spin1.getSelectedItem().toString();

        if (rb1.isChecked()){
                vector[1]="Si";
        }
        if (rb2.isChecked()){
                vector[1]="No";
        }

        if (rb3.isChecked()){
            vector[2]="Si";
        }
        if (rb4.isChecked()){
            vector[2]="No";
        }

        if (rb5.isChecked()){
            vector[3]="Si";
        }
        if (rb6.isChecked()){
            vector[3]="No";
        }

        if (rb7.isChecked()){
            vector[4]="Si";
        }
        if (rb8.isChecked()){
            vector[4]="No";
        }

        if (rb9.isChecked()){
            vector[5]="Si";
        }
        if (rb10.isChecked()){
            vector[5]="No";
        }

        if (rb11.isChecked()){
            vector[6]="Si";
        }
        if (rb12.isChecked()){
            vector[6]="No";
        }

        if (rb13.isChecked()){
            vector[7]="Si";
        }
        if (rb14.isChecked()){
            vector[7]="No";
        }

        if (rb15.isChecked()){
            vector[8]="Si";
        }
        if (rb16.isChecked()){
            vector[8]="No";
        }

        if (rb17.isChecked()){
            vector[9]="Si";
        }
        if (rb18.isChecked()){
            vector[9]="No";
        }

        if (rb19.isChecked()){
            vector[10]="Si";
        }
        if (rb20.isChecked()){
            vector[10]="No";
        }

        if (rb21.isChecked()){
            vector[11]="Si";
        }
        if (rb22.isChecked()){
            vector[11]="No";
        }

        //////verifica que el vector no este en seleccione para poner enviar///////////////

            if(vector[0]=="Selecione:"){
                bandera= false;
            }

        //////verifica que el vector no este en seleccione para poner enviar///////////////
        for(int i=1;i<top; i++  ){
            if(vector[i]==null){
                bandera= false;
            }
        }

        if (bandera) {
                Reporte(view);
            } else {
                Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            }
        }

    public void Reporte(View v){
        try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF= "<html>" +
                    "<head>" +
                    "<title>Seguridad Exterior</title>" +
                    "</head>" +
                    "<body>" +
                    "<p>Analisis de Recurso</p>"+
                    "<p><br/>El inmueble se úbica en:</p>" +
                    "<TABLE border=\"1\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th>Tipo de zona</th>" +
                    "<th>Señale con X</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>";

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<td>Rural</td>";
            if (vector[0].equals("RURAL")) {
                htmlToPDF = htmlToPDF +
                        "<td>X</td>"
                        + "</tr>";
            }else{
                htmlToPDF = htmlToPDF +
                        "<td></td>"
                        + "</tr>";
            }

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<td>Semiurbana</td>";
            if (vector[0].equals("SEMIURBANA")) {
                htmlToPDF = htmlToPDF +
                        "<td>X</td>"
                        + "</tr>";
            }else{
                htmlToPDF = htmlToPDF +
                        "<td></td>"
                        + "</tr>";
            }

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<td>Urbano</td>";
            if (vector[0].equals("URBANO")) {
                htmlToPDF = htmlToPDF +
                        "<td>X</td>"
                        + "</tr>";
            }else{
                htmlToPDF = htmlToPDF +
                        "<td></td>"
                        + "</tr>";
            }

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<td>Lazona es de fácil acceso</td>";
            if (vector[0].equals("ZONA DE FACIL ACCESO")) {
                    htmlToPDF = htmlToPDF +
                            "<td>X</td>"
                            + "</tr>";
            }else{
                htmlToPDF = htmlToPDF +
                        "<td></td>"
                        + "</tr>";
            }

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "<p><br/>El inmueble cuenta con:</p>";

            htmlToPDF=htmlToPDF+"<table border=\"1\" style=\"text-align:center;\">" +
                    "<colgroup>" +
                    "<col style=\"width: 20%\"/>" +
                    "<col style=\"width: 40%\"/>" +
                    "</colgroup>" +
                    "<thead>" +
                    "<tr>" +
                    "<th>Servicios</th>" +
                    "<th>¿Si o No?</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>"+

                    "<tr>" +
                    "<td>Agua</td>"
                    +"<td>"+vector[1]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Energia eléctrica</td>"
                    +"<td>"+vector[2]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Drenaje</td>"
                    +"<td>"+vector[3]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Telefono (fijo o móvil)</td>"
                    +"<td>"+vector[4]+"</td>"
                    + "</tr>";

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "<p><br/>Alrededor del inmueble se cuenta con:</p>";

            htmlToPDF=htmlToPDF+"<table border=\"1\" style=\"text-align:center;\">" +
                    "<colgroup>" +
                    "<col style=\"width: 20%\"/>" +
                    "<col style=\"width: 40%\"/>" +
                    "</colgroup>" +
                    "<thead>" +
                    "<tr>" +
                    "<th>Servicios</th>" +
                    "<th>¿Si o No?</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>"+

                    "<tr>" +
                    "<td>Alumbrado público</td>"
                    +"<td>"+vector[5]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Banquetas</td>"
                    +"<td>"+vector[6]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Guarniciones</td>"
                    +"<td>"+vector[7]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Calle pavimentada</td>"
                    +"<td>"+vector[8]+"</td>"
                    + "</tr>";

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "<p><br/>El inmueble está cerca de:</p>";

            htmlToPDF=htmlToPDF+"<table border=\"1\" style=\"text-align:center;\">" +
                    "<colgroup>" +
                    "<col style=\"width: 20%\"/>" +
                    "<col style=\"width: 40%\"/>" +
                    "</colgroup>" +
                    "<thead>" +
                    "<tr>" +
                    "<th>Instituciones</th>" +
                    "<th>¿Si o No?</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>"+

                    "<tr>" +
                    "<td>Servicios médicos</td>"
                    +"<td>"+vector[9]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Bomberos</td>"
                    +"<td>"+vector[10]+"</td>"
                    + "</tr>"+

                    "<tr>" +
                    "<td>Seguridad pública</td>"
                    +"<td>"+vector[11]+"</td>"
                    + "</tr>";

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>";

            htmlToPDF= htmlToPDF + "</body>" + "</html>";

            worker.parseXHtml(pdfWriter, document, new StringReader(htmlToPDF));

            document.close();

            Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
            intent.putExtra("File", pdfFile.getPath());
            startActivity(intent);

        } catch (IOException e) {
            Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (DocumentException e) {
            Toast.makeText(this,"NO SE PUDO GENERAR EL DOCUMENTO", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}


