package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
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

public class quintanaroo_RecursosCircundantes extends AppCompatActivity {
    private Spinner spin1, spin2, spin3, spin4, spin5, spin6, spin7, spin8, spin9, spin10, spin11, spin12, spin13, spin14, spin15, spin16;
    private Spinner spin17, spin18, spin19, spin20, spin21, spin22, spin23, spin24, spin25, spin26, spin27, spin28, spin29, spin30, spin31;
    private Spinner spin32, spin33, spin34, spin35, spin36;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24;
    private String sel;
    private final int top=36;
    String vector[] =new String[top];

    static File pdfFile;
    static String htmlToPDF;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo__recursos_circundantes);
        this.setTitle("Recursos Circundantes Quintana Roo");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        directorio2 = new File(getIntent().getStringExtra("File"));

        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Recursos cirdundantes.pdf");
        }

        //asignar EditText a las variables de aqui
        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);
        et5  = (EditText) findViewById(R.id.editText5);
        et6  = (EditText) findViewById(R.id.editText6);
        et7  = (EditText) findViewById(R.id.editText7);
        et8  = (EditText) findViewById(R.id.editText8);
        et9  = (EditText) findViewById(R.id.editText9);
        et10 = (EditText) findViewById(R.id.editText10);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        et14 = (EditText) findViewById(R.id.editText14);
        et15 = (EditText) findViewById(R.id.editText15);
        et16 = (EditText) findViewById(R.id.editText16);
        et17 = (EditText) findViewById(R.id.editText17);
        et18 = (EditText) findViewById(R.id.editText18);
        et19 = (EditText) findViewById(R.id.editText19);
        et20 = (EditText) findViewById(R.id.editText20);
        et21 = (EditText) findViewById(R.id.editText21);
        et22 = (EditText) findViewById(R.id.editText22);
        et23 = (EditText) findViewById(R.id.editText23);
        et24 = (EditText) findViewById(R.id.editText24);

        //Ocultar EditText
        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        et3.setVisibility(View.GONE);
        et4.setVisibility(View.GONE);
        et5.setVisibility(View.GONE);
        et6.setVisibility(View.GONE);
        et7.setVisibility(View.GONE);
        et8.setVisibility(View.GONE);
        et9.setVisibility(View.GONE);
        et10.setVisibility(View.GONE);
        et11.setVisibility(View.GONE);
        et12.setVisibility(View.GONE);
        et13.setVisibility(View.GONE);
        et14.setVisibility(View.GONE);
        et15.setVisibility(View.GONE);
        et16.setVisibility(View.GONE);
        et17.setVisibility(View.GONE);
        et18.setVisibility(View.GONE);
        et19.setVisibility(View.GONE);
        et20.setVisibility(View.GONE);
        et21.setVisibility(View.GONE);
        et22.setVisibility(View.GONE);
        et23.setVisibility(View.GONE);
        et24.setVisibility(View.GONE);

        //asigna los espiner del xml a los espiner aqui declarados
        spin1 =(Spinner)findViewById(R.id.spinner1);
        spin2 =(Spinner)findViewById(R.id.spinner2);
        spin3 =(Spinner)findViewById(R.id.spinner3);
        spin4 =(Spinner)findViewById(R.id.spinner4);
        spin5 =(Spinner)findViewById(R.id.spinner5);
        spin6 =(Spinner)findViewById(R.id.spinner6);
        spin7 =(Spinner)findViewById(R.id.spinner7);
        spin8 =(Spinner)findViewById(R.id.spinner8);
        spin9 =(Spinner)findViewById(R.id.spinner9);
        spin10=(Spinner)findViewById(R.id.spinner10);
        spin11=(Spinner)findViewById(R.id.spinner11);
        spin12=(Spinner)findViewById(R.id.spinner12);
        spin13=(Spinner)findViewById(R.id.spinner13);
        spin14=(Spinner)findViewById(R.id.spinner14);
        spin15=(Spinner)findViewById(R.id.spinner15);
        spin16=(Spinner)findViewById(R.id.spinner16);
        spin17=(Spinner)findViewById(R.id.spinner17);
        spin18=(Spinner)findViewById(R.id.spinner18);
        spin19=(Spinner)findViewById(R.id.spinner19);
        spin20=(Spinner)findViewById(R.id.spinner20);
        spin21=(Spinner)findViewById(R.id.spinner21);
        spin22=(Spinner)findViewById(R.id.spinner22);
        spin23=(Spinner)findViewById(R.id.spinner23);
        spin24=(Spinner)findViewById(R.id.spinner24);
        spin25=(Spinner)findViewById(R.id.spinner25);
        spin26=(Spinner)findViewById(R.id.spinner26);
        spin27=(Spinner)findViewById(R.id.spinner27);
        spin28=(Spinner)findViewById(R.id.spinner28);
        spin29=(Spinner)findViewById(R.id.spinner29);
        spin30=(Spinner)findViewById(R.id.spinner30);
        spin31=(Spinner)findViewById(R.id.spinner31);
        spin32=(Spinner)findViewById(R.id.spinner32);
        spin33=(Spinner)findViewById(R.id.spinner33);
        spin34=(Spinner)findViewById(R.id.spinner34);
        spin35=(Spinner)findViewById(R.id.spinner35);
        spin36=(Spinner)findViewById(R.id.spinner36);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione:","ACEPTABLE","INTERMEDIO","ALTO","NINGUNO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        String [] opciones1 ={"Tiempo de Respuesta:","0-10 minutos","11-20 minutos","21-30 minutos","31-40 minutos","40-60 minutos"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);

        String [] opciones2 ={"911", "-"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones2);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter1);
        spin3.setAdapter(adapter2);

        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter1);
        spin6.setAdapter(adapter2);

        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter1);
        spin9.setAdapter(adapter2);

        spin10.setAdapter(adapter);
        spin11.setAdapter(adapter1);
        spin12.setAdapter(adapter2);

        spin13.setAdapter(adapter);
        spin14.setAdapter(adapter1);
        spin15.setAdapter(adapter2);

        spin16.setAdapter(adapter);
        spin17.setAdapter(adapter1);
        spin18.setAdapter(adapter2);

        spin19.setAdapter(adapter);
        spin20.setAdapter(adapter1);
        spin21.setAdapter(adapter2);

        spin22.setAdapter(adapter);
        spin23.setAdapter(adapter1);
        spin24.setAdapter(adapter2);

        spin25.setAdapter(adapter);
        spin26.setAdapter(adapter1);
        spin27.setAdapter(adapter2);

        spin28.setAdapter(adapter);
        spin29.setAdapter(adapter1);
        spin30.setAdapter(adapter2);

        spin31.setAdapter(adapter);
        spin32.setAdapter(adapter1);
        spin33.setAdapter(adapter2);

        spin34.setAdapter(adapter);
        spin35.setAdapter(adapter1);
        spin36.setAdapter(adapter2);

        //Ocultar EditText
        spin2.setVisibility(View.GONE);
        spin3.setVisibility(View.GONE);

        spin5.setVisibility(View.GONE);
        spin6.setVisibility(View.GONE);

        spin8.setVisibility(View.GONE);
        spin9.setVisibility(View.GONE);

        spin11.setVisibility(View.GONE);
        spin12.setVisibility(View.GONE);

        spin14.setVisibility(View.GONE);
        spin15.setVisibility(View.GONE);

        spin17.setVisibility(View.GONE);
        spin18.setVisibility(View.GONE);

        spin20.setVisibility(View.GONE);
        spin21.setVisibility(View.GONE);

        spin23.setVisibility(View.GONE);
        spin24.setVisibility(View.GONE);

        spin26.setVisibility(View.GONE);
        spin27.setVisibility(View.GONE);

        spin29.setVisibility(View.GONE);
        spin30.setVisibility(View.GONE);

        spin32.setVisibility(View.GONE);
        spin33.setVisibility(View.GONE);

        spin35.setVisibility(View.GONE);
        spin36.setVisibility(View.GONE);

        //pasa parametros al spinner para mostrar
        mostrar(spin1, spin2, spin3, et1, et2);
        mostrar(spin4, spin5, spin6, et3, et4);

        mostrar(spin7, spin8, spin9, et5, et6);
        mostrar(spin10, spin11, spin12, et7, et8);
        mostrar(spin13, spin14, spin15, et9, et10);
        mostrar(spin16, spin17, spin18, et11, et12);
        mostrar(spin19, spin20, spin21, et13, et14);
        mostrar(spin22, spin23, spin24, et15, et16);
        mostrar(spin25, spin26, spin27, et17, et18);
        mostrar(spin28, spin29, spin30, et19, et20);
        mostrar(spin31, spin32, spin33, et21, et22);
        mostrar(spin34, spin35, spin36, et23, et24);
    }

    public void mostrar(Spinner x, final Spinner mostrar1, final Spinner mostrar2, final EditText o, final EditText E){
        x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sel= parent.getItemAtPosition(position).toString();
                switch( sel ) {
                    case "ACEPTABLE":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    case "INTERMEDIO":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    case "ALTO":
                        o.setVisibility(View.VISIBLE);
                        E.setVisibility(View.VISIBLE);
                        mostrar1.setVisibility(View.VISIBLE);
                        mostrar2.setVisibility(View.VISIBLE);
                        break;
                    default:
                        o.setVisibility(View.GONE);
                        E.setVisibility(View.GONE);
                        mostrar1.setVisibility(View.GONE);
                        mostrar2.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClick(View view){
        Boolean bandera=true;

        //selecciona lo que carga el spinner
        vector[0]   = spin1.getSelectedItem().toString();
        vector[1]   = spin2.getSelectedItem().toString();
        vector[2]   = spin3.getSelectedItem().toString();
        vector[3]   = spin4.getSelectedItem().toString();
        vector[4]   = spin5.getSelectedItem().toString();
        vector[5]   = spin6.getSelectedItem().toString();
        vector[6]   = spin7.getSelectedItem().toString();
        vector[7]   = spin8.getSelectedItem().toString();
        vector[8]   = spin9.getSelectedItem().toString();
        vector[9]   = spin10.getSelectedItem().toString();
        vector[10]  = spin11.getSelectedItem().toString();
        vector[11]  = spin12.getSelectedItem().toString();
        vector[12]  = spin13.getSelectedItem().toString();
        vector[13]  = spin14.getSelectedItem().toString();
        vector[14]  = spin15.getSelectedItem().toString();
        vector[15]  = spin16.getSelectedItem().toString();
        vector[16]  = spin17.getSelectedItem().toString();
        vector[17]  = spin18.getSelectedItem().toString();
        vector[18]  = spin19.getSelectedItem().toString();
        vector[19]  = spin20.getSelectedItem().toString();
        vector[20]  = spin21.getSelectedItem().toString();
        vector[21]  = spin22.getSelectedItem().toString();
        vector[22]  = spin23.getSelectedItem().toString();
        vector[23]  = spin24.getSelectedItem().toString();
        vector[24]  = spin25.getSelectedItem().toString();
        vector[25]  = spin26.getSelectedItem().toString();
        vector[26]  = spin27.getSelectedItem().toString();
        vector[27]  = spin28.getSelectedItem().toString();
        vector[28]  = spin29.getSelectedItem().toString();
        vector[29]  = spin30.getSelectedItem().toString();
        vector[30]  = spin31.getSelectedItem().toString();
        vector[31]  = spin32.getSelectedItem().toString();
        vector[32]  = spin33.getSelectedItem().toString();
        vector[33]  = spin34.getSelectedItem().toString();
        vector[34]  = spin35.getSelectedItem().toString();
        vector[35]  = spin36.getSelectedItem().toString();

        //Verificar si los editText contienen algo sino no los deja enviar
        if (et1.getVisibility() == View.VISIBLE) {
            if (et1.length() == 0) {
                bandera = false;
            }
        }

        if (et2.getVisibility() == View.VISIBLE) {
            if (et2.length() == 0) {
                bandera = false;
            }
        }

        if (et3.getVisibility() == View.VISIBLE) {
            if (et3.length() == 0) {
                bandera = false;
            }
        }

        if (et4.getVisibility() == View.VISIBLE) {
            if (et4.length() == 0) {
                bandera = false; }
        }

        if (et5.getVisibility() == View.VISIBLE) {
            if (et5.length() == 0) {
                bandera = false;
            }
        }

        if (et6.getVisibility() == View.VISIBLE) {
            if (et6.length() == 0) {
                bandera = false;
            }
        }

        if (et7.getVisibility() == View.VISIBLE) {
            if (et7.length() == 0) {
                bandera = false;
            }
        }

        if (et8.getVisibility() == View.VISIBLE) {
            if (et8.length() == 0) {
                bandera = false;
            }
        }

        if (et9.getVisibility() == View.VISIBLE) {
            if (et9.length() == 0) {
                bandera = false;
            }
        }

        if (et10.getVisibility() == View.VISIBLE) {
            if (et10.length() == 0) {
                bandera = false;
            }
        }

        if (et11.getVisibility() == View.VISIBLE) {
            if (et11.length() == 0) {
                bandera = false;
            }
        }

        if (et12.getVisibility() == View.VISIBLE) {
            if (et12.length() == 0) {
                bandera = false;
            }
        }

        if (et13.getVisibility() == View.VISIBLE) {
            if (et13.length() == 0) {
                bandera = false;
            }
        }

        if (et14.getVisibility() == View.VISIBLE) {
            if (et14.length() == 0) {
                bandera = false;
            }
        }

        if (et15.getVisibility() == View.VISIBLE) {
            if (et15.length() == 0) {
                bandera = false;
            }
        }

        if (et16.getVisibility() == View.VISIBLE) {
            if (et16.length() == 0) {
                bandera = false;
            }
        }

        if (et17.getVisibility() == View.VISIBLE) {
            if (et17.length() == 0) {
                bandera = false;
            }
        }

        if (et18.getVisibility() == View.VISIBLE) {
            if (et18.length() == 0) {
                bandera = false;
            }
        }

        if (et19.getVisibility() == View.VISIBLE) {
            if (et19.length() == 0) {
                bandera = false;
            }
        }

        if (et20.getVisibility() == View.VISIBLE) {
            if (et20.length() == 0) {
                bandera = false;
            }
        }

        if (et21.getVisibility() == View.VISIBLE) {
            if (et21.length() == 0) {
                bandera = false;
            }
        }

        if (et22.getVisibility() == View.VISIBLE) {
            if (et22.length() == 0) {
                bandera = false;
            }
        }

        if (et23.getVisibility() == View.VISIBLE) {
            if (et23.length() == 0) {
                bandera = false;
            }
        }

        if (et24.getVisibility() == View.VISIBLE) {
            if (et24.length() == 0) {
                bandera = false;
            }
        }

        //////verifica que el vector no este en seleccione para poner enviar///////////////
        for(int i=0;i<top; i++  ){
            if(vector[i]=="Selecione:"){
                bandera= false;
            }
        }

        if (bandera){
            Reporte(view);
        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }
    }

    public void Reporte(View v){
        try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();

            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Recursos Circundantes</title>" +
                    "</head>" +
                    "<body>" +
                    "<p>Recursos Circundantes</p>"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th colspan=\"9\">RECURSOS CIRCUNDANTES</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th WIDTH=\"15%\">RECURSOS</th>" +
                    "<th WIDTH=\"13%\">Aceptable</th>" +
                    "<th WIDTH=\"13%\">Intermedio</th>" +
                    "<th WIDTH=\"6%\">Alto</th>" +
                    "<th WIDTH=\"11%\">Ninguno</th>" +
                    "<th WIDTH=\"12%\">Distancia aproximada al inmueble</th>" +
                    "<th WIDTH=\"8%\">Zona o área</th>" +
                    "<th WIDTH=\"12%\">Tiempo de respuesta</th>" +
                    "<th WIDTH=\"10%\">Numero de telefono</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>";

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Hospitales o clínicas</th>" ;
            agregarColumna(vector[0], et1.getText().toString(), et2.getText().toString(),vector[1],vector[2]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Estaciones de bomberos</th>";
            agregarColumna(vector[3], et3.getText().toString(), et4.getText().toString(),vector[4],vector[5]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Ambulancia</th>";
            agregarColumna(vector[6], et5.getText().toString(), et6.getText().toString(),vector[7],vector[8]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Estación de policía</th>";
            agregarColumna(vector[9], et7.getText().toString(), et8.getText().toString(),vector[10],vector[11]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Zonas militares</th>";
            agregarColumna(vector[12], et9.getText().toString(), et10.getText().toString(),vector[13],vector[14]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Tiendas o bodegas comerciales</th>";
            agregarColumna(vector[15], et11.getText().toString(), et12.getText().toString(),vector[16],vector[17]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Gimnasios y otros grandes espacios para protegerse</th>";
            agregarColumna(vector[18], et13.getText().toString(), et14.getText().toString(),vector[19],vector[20]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles con poco trafico</th>";
            agregarColumna(vector[21], et15.getText().toString(), et16.getText().toString(),vector[22],vector[23]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Parques o áreas verdes</th>";
            agregarColumna(vector[24], et17.getText().toString(), et18.getText().toString(),vector[25],vector[26]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Terrenos baldíos en buen estado</th>";
            agregarColumna(vector[27], et19.getText().toString(), et20.getText().toString(),vector[28],vector[29]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Fábricas o almacenes de bebidas o productos alimenticios</th>";
            agregarColumna(vector[30], et21.getText().toString(), et22.getText().toString(),vector[31],vector[32]);

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Estaciones de radio o radioaficionados</th>";
            agregarColumna(vector[33], et23.getText().toString(), et24.getText().toString(),vector[34],vector[35]);

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

    static void agregarColumna(String posicionX, String Distancia, String Zona, String Tiempo, String Tel){
        if(posicionX.equals("ACEPTABLE")){
            htmlToPDF=htmlToPDF +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+Distancia+"</td>" +
                    "<td>"+Zona+"</td>" +
                    "<td>"+Tiempo+"</td>" +
                    "<td>"+Tel+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("INTERMEDIO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+Distancia+"</td>" +
                    "<td>"+Zona+"</td>" +
                    "<td>"+Tiempo+"</td>" +
                    "<td>"+Tel+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("ALTO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td>"+Distancia+"</td>" +
                    "<td>"+Zona+"</td>" +
                    "<td>"+Tiempo+"</td>" +
                    "<td>"+Tel+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("NINGUNO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "</tr>";
        }else{
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "</tr>";
        }
    }
}