package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
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

public class quintanaroo_anexo10_DetectoresContraIncendio extends AppCompatActivity {
    private Spinner spin1;
    private TextView TV1;
    private int numero =1;
    String vector[] =new String[5];
    private EditText  et1, et2,  et3,  et4;
    static File pdfFile;
    static String htmlToPDF;
    static File directorio2;
    static String extintores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__detectores_contra_incendio);

        directorio2 = new File(getIntent().getStringExtra("File"));
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Detectores contra incendio.pdf");
        }


        //asigna los espiner del xml a los espiner aqui declarados
        spin1 = (Spinner) findViewById(R.id.spinner1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String[] opciones = {"TIPO DE DETECTOR:", "HUMO", "FUEGO", "GAS", "SENSORES DE HUMO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);

        TV1=(TextView) findViewById(R.id.tv);


        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);



    }







    public void OnClick2 (View view){
        if(numero > 1){
            Reporte(view);
        }else{
            Toast.makeText(this, "Ingrese almenos 1 extintor", LENGTH_SHORT).show();
        }
    }

    public void OnClick (View view){
        Boolean bandera=true;



        vector[0]   = spin1.getSelectedItem().toString();

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

        if(vector[0]=="TIPO DE DETECTOR:"){
                bandera= false;
        }

        if (bandera){
            vector[1]   = et1.getText().toString();
            vector[2]   = et2.getText().toString();
            vector[3]   = et3.getText().toString();
            vector[4]   = et4.getText().toString();

            agregarExtintor(numero, vector[0],vector[1],vector[2],vector[3],vector[4]);

            numero++;
            TV1.setText(Integer.toString(numero));

            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");

            spin1.setSelection(0);
            Toast.makeText(this, "Agregado con exito", LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }



    }

    public void Reporte(View v){
        try {
            Document document = new Document(PageSize.LETTER.rotate());
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Detectores contra incendio</title>" +
                    "</head>" +
                    "<body>" +
                    "Detectores contra incendio"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th rowspan=\"2\" >NO.</th>" +
                    "<th colspan=\"4\" >Tipo de detector</th>" +
                    "<th rowspan=\"2\" >Área</th>" +
                    "<th rowspan=\"2\" >Energizado con</th>" +
                    "<th rowspan=\"2\" >Colocado en</th>" +
                    "<th rowspan=\"2\" >Ultima revision</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th>Humo</th>" +
                    "<th>Fuego</th>" +
                    "<th>Gas</th>" +
                    "<th>Sensores de humo</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>" +
                    extintores;


            /*htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Otros, especificar:</th>";
            agregarColumna(vector[38], et39.getText().toString());
            */

            htmlToPDF= htmlToPDF +"</tbody>" + "</table>" + "</body>" + "</html>";

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

    static void agregarExtintor(int numero, String tipo, String area, String energizado, String colocado, String revision){
        if(tipo.equals("HUMO")){
            extintores=extintores +
                    "<tr>" +
                    "<td>"+numero+"</td>"+
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+area+"</td>" +
                    "<td>"+energizado+"</td>" +
                    "<td>"+colocado+"</td>" +
                    "<td>"+revision+"</td>" +
                    "</tr>";
        }else if (tipo.equals("FUEGO")){
            extintores=extintores +
                    "<tr>" +
                    "<td>"+numero+"</td>"+
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+area+"</td>" +
                    "<td>"+energizado+"</td>" +
                    "<td>"+colocado+"</td>" +
                    "<td>"+revision+"</td>" +
                    "</tr>";
        }else if (tipo.equals("GAS")){
            extintores=extintores +
                    "<tr>" +
                    "<td>"+numero+"</td>"+
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td>"+area+"</td>" +
                    "<td>"+energizado+"</td>" +
                    "<td>"+colocado+"</td>" +
                    "<td>"+revision+"</td>" +
                    "</tr>";
        }else if (tipo.equals("SENSORES DE HUMO")){
            extintores=extintores +
                    "<tr>" +
                    "<td>"+numero+"</td>"+
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td>"+area+"</td>" +
                    "<td>"+energizado+"</td>" +
                    "<td>"+colocado+"</td>" +
                    "<td>"+revision+"</td>" +
                    "</tr>";
        }else{
            extintores=extintores +
                    "<tr>" +
                    "<td>"+numero+"</td>"+
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+area+"</td>" +
                    "<td>"+energizado+"</td>" +
                    "<td>"+colocado+"</td>" +
                    "<td>"+revision+"</td>" +
                    "</tr>";
        }
    }


}
