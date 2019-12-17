package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
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
    static private int numero =1;
    static String vector[] = {"", "", "", "", ""};
    private EditText  et1, et2,  et3,  et4;
    private File pdfFile;
    static private String htmlToPDF;
    static private File directorio2;
    static private String detectores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__detectores_contra_incendio);
        this.setTitle("Detectores contra incendio");

        directorio2 = new File(index_QuintanaRoo.file());
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Detectores contra incendio.pdf");
        }


        //asigna los espiner del xml a los espiner aqui declarados
        spin1 = (Spinner) findViewById(R.id.spinner1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String[] opciones = {"TIPO DE DETECTOR:", "HUMO", "FUEGO", "GAS", "SENSORES DE HUMO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);

        TV1=(TextView) findViewById(R.id.tv);
        TV1.setText(Integer.toString(numero));

        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);

        if(!vector[1].equals("")){
            et1.setText(vector[1]);
        }
        if(!vector[2].equals("")){
            et2.setText(vector[2]);
        }
        if(!vector[3].equals("")){
            et3.setText(vector[3]);
        }
        if(!vector[4].equals("")){
            et4.setText(vector[4]);
        }

        if(vector[0].equals("TIPO DE DETECTOR:")){
            spin1.setSelection(0);
        }else if(vector[0].equals("HUMO")) {
            spin1.setSelection(1);
        }else if (vector[0].equals("FUEGO")){
            spin1.setSelection(2);
        }else if (vector[0].equals("GAS")){
            spin1.setSelection(3);
        }else if (vector[0].equals("SENSORES DE HUMO")){
            spin1.setSelection(4);
        }else{
            spin1.setSelection(0);
        }

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[1]  = et1.getText().toString();


            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[2] = et2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[3]  = et3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[4] = et4.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                vector[0]= spin1.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });
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

        if (vector[1].equals("")) {
             bandera = false;
        }


        if (vector[2].equals("")) {
            bandera = false;
        }

        if (vector[3].equals("")) {
            bandera = false;
        }

        if (vector[4].equals("")) {
            bandera = false;
        }

        if(vector[0].equals("TIPO DE DETECTOR:")){
                bandera= false;
        }

        if (bandera){

            agregarDetector(numero, vector[0],vector[1],vector[2],vector[3],vector[4]);

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
                    detectores;


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

    void agregarDetector(int numero, String tipo, String area, String energizado, String colocado, String revision){
        if(tipo.equals("HUMO")){
            detectores = detectores +
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
            detectores = detectores +
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
            detectores = detectores +
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
            detectores = detectores +
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
            detectores = detectores +
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
