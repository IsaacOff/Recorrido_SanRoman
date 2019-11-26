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

public class quintanaroo_SeguridadExterior extends AppCompatActivity{
    private Spinner spin1, spin2, spin3, spin4, spin5, spin6, spin7, spin8, spin9, spin10, spin11, spin12, spin13, spin14, spin15, spin16;
    private Spinner spin17, spin18, spin19, spin20, spin21, spin22, spin23, spin24, spin25, spin26, spin27, spin28, spin29, spin30, spin31;
    private Spinner spin32, spin33, spin34, spin35, spin36, spin37, spin38;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22, et23, et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34, et35, et36, et37, et38;

    private String sel;
    private final int top=38;
    String vector[] =new String[top];
    static File pdfFile;
    static String htmlToPDF;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo__seguridad_exterior);
        this.setTitle("Seguridad Exterior Quintana Roo");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        directorio2 = new File(getIntent().getStringExtra("File"));
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "Seguridad exterior.pdf");
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
        et25 = (EditText) findViewById(R.id.editText25);
        et26 = (EditText) findViewById(R.id.editText26);
        et27 = (EditText) findViewById(R.id.editText27);
        et28 = (EditText) findViewById(R.id.editText28);
        et29 = (EditText) findViewById(R.id.editText29);
        et30 = (EditText) findViewById(R.id.editText30);
        et31 = (EditText) findViewById(R.id.editText31);
        et32 = (EditText) findViewById(R.id.editText32);
        et33 = (EditText) findViewById(R.id.editText33);
        et34 = (EditText) findViewById(R.id.editText34);
        et35 = (EditText) findViewById(R.id.editText35);
        et36 = (EditText) findViewById(R.id.editText36);
        et37 = (EditText) findViewById(R.id.editText37);
        et38 = (EditText) findViewById(R.id.editText38);

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
        et25.setVisibility(View.GONE);
        et26.setVisibility(View.GONE);
        et27.setVisibility(View.GONE);
        et28.setVisibility(View.GONE);
        et29.setVisibility(View.GONE);
        et30.setVisibility(View.GONE);
        et31.setVisibility(View.GONE);
        et32.setVisibility(View.GONE);
        et33.setVisibility(View.GONE);
        et34.setVisibility(View.GONE);
        et35.setVisibility(View.GONE);
        et36.setVisibility(View.GONE);
        et37.setVisibility(View.GONE);
        et38.setVisibility(View.GONE);

        //asigna los espiner del xml a los espiner aqui declarados
        spin1=(Spinner)findViewById(R.id.spinner1);
        spin2=(Spinner)findViewById(R.id.spinner2);
        spin3=(Spinner)findViewById(R.id.spinner3);
        spin4=(Spinner)findViewById(R.id.spinner4);
        spin5=(Spinner)findViewById(R.id.spinner5);
        spin6=(Spinner)findViewById(R.id.spinner6);
        spin7=(Spinner)findViewById(R.id.spinner7);
        spin8=(Spinner)findViewById(R.id.spinner8);
        spin9=(Spinner)findViewById(R.id.spinner9);
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
        spin37=(Spinner)findViewById(R.id.spinner37);
        spin38=(Spinner)findViewById(R.id.spinner38);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"Selecione:","ACEPTABLE","INTERMEDIO","ALTO","NINGUNO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones);

        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);
        spin3.setAdapter(adapter);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter);
        spin6.setAdapter(adapter);
        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter);
        spin9.setAdapter(adapter);
        spin10.setAdapter(adapter);
        spin11.setAdapter(adapter);
        spin12.setAdapter(adapter);
        spin13.setAdapter(adapter);
        spin14.setAdapter(adapter);
        spin15.setAdapter(adapter);
        spin16.setAdapter(adapter);
        spin17.setAdapter(adapter);
        spin18.setAdapter(adapter);
        spin19.setAdapter(adapter);
        spin20.setAdapter(adapter);
        spin21.setAdapter(adapter);
        spin22.setAdapter(adapter);
        spin23.setAdapter(adapter);
        spin24.setAdapter(adapter);
        spin25.setAdapter(adapter);
        spin26.setAdapter(adapter);
        spin27.setAdapter(adapter);
        spin28.setAdapter(adapter);
        spin29.setAdapter(adapter);
        spin30.setAdapter(adapter);
        spin31.setAdapter(adapter);
        spin32.setAdapter(adapter);
        spin33.setAdapter(adapter);
        spin34.setAdapter(adapter);
        spin35.setAdapter(adapter);
        spin36.setAdapter(adapter);
        spin37.setAdapter(adapter);
        spin38.setAdapter(adapter);


        //pasa parametros al spinner para mostrar
        mostrar(spin1, et1);
        mostrar(spin2, et2);
        mostrar(spin3, et3);
        mostrar(spin4, et4);
        mostrar(spin5, et5);
        mostrar(spin6, et6);
        mostrar(spin7, et7);
        mostrar(spin8, et8);
        mostrar(spin9, et9);
        mostrar(spin10, et10);
        mostrar(spin11, et11);
        mostrar(spin12, et12);
        mostrar(spin13, et13);
        mostrar(spin14, et14);
        mostrar(spin15, et15);
        mostrar(spin16, et16);
        mostrar(spin17, et17);
        mostrar(spin18, et18);
        mostrar(spin19, et19);
        mostrar(spin20, et20);
        mostrar(spin21, et21);
        mostrar(spin22, et22);
        mostrar(spin23, et23);
        mostrar(spin24, et24);
        mostrar(spin25, et25);
        mostrar(spin26, et26);
        mostrar(spin27, et27);
        mostrar(spin28, et28);
        mostrar(spin29, et29);
        mostrar(spin30, et30);
        mostrar(spin31, et31);
        mostrar(spin32, et32);
        mostrar(spin33, et33);
        mostrar(spin34, et34);
        mostrar(spin35, et35);
        mostrar(spin36, et36);
        mostrar(spin37, et37);
        mostrar(spin38, et38);
    }

    public void mostrar(Spinner x, final EditText o){
        x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sel= parent.getItemAtPosition(position).toString();

                switch( sel ) {

                    case "ACEPTABLE":
                        o.setVisibility(View.VISIBLE);
                        break;
                    case "INTERMEDIO":
                        o.setVisibility(View.VISIBLE);
                        break;
                    case "ALTO":
                        o.setVisibility(View.VISIBLE);
                        break;
                    default:
                        o.setVisibility(View.GONE);
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
        vector[36]  = spin37.getSelectedItem().toString();
        vector[37]  = spin38.getSelectedItem().toString();

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

       if (et25.getVisibility() == View.VISIBLE) {
            if (et25.length() == 0) {
                bandera = false;
            }
        }

       if (et26.getVisibility() == View.VISIBLE) {
            if (et26.length() == 0) {
                bandera = false;
            }
        }

       if (et27.getVisibility() == View.VISIBLE) {
            if (et27.length() == 0) {
                bandera = false;
            }
        }

       if (et28.getVisibility() == View.VISIBLE) {
            if (et28.length() == 0) {
                bandera = false;
            }
        }

       if (et29.getVisibility() == View.VISIBLE) {
            if (et29.length() == 0) {
                bandera = false;
            }
        }

       if (et30.getVisibility() == View.VISIBLE) {
            if (et30.length() == 0) {
                bandera = false;
            }
        }

       if (et31.getVisibility() == View.VISIBLE) {
            if (et31.length() == 0) {
                bandera = false;
            }
        }

       if (et32.getVisibility() == View.VISIBLE) {
            if (et32.length() == 0) {
                bandera = false;
            }
        }

       if (et33.getVisibility() == View.VISIBLE) {
            if (et33.length() == 0) {
                bandera = false;
            }
        }

       if (et34.getVisibility() == View.VISIBLE) {
            if (et34.length() == 0) {
                bandera = false;
            }
        }

       if (et35.getVisibility() == View.VISIBLE) {
            if (et35.length() == 0) {
                bandera = false;
            }
        }

       if (et36.getVisibility() == View.VISIBLE) {
            if (et36.length() == 0) {
                bandera = false;
            }
        }

       if (et37.getVisibility() == View.VISIBLE) {
            if (et37.length() == 0) {
                bandera = false;
            }
        }

       if (et38.getVisibility() == View.VISIBLE) {
            if (et38.length() == 0) {
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
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Seguridad Exterior</title>" +
                    "</head>" +
                    "<body>" +
                    "Seguridad Exterior"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th rowspan=\"2\" WIDTH=\"28%\">Elementos de riesgo</th>" +
                    "<th colspan=\"4\" WIDTH=\"52%\">Nivel de riesgo</th>" +
                    "<th rowspan=\"2\" WIDTH=\"20%\">Área donde se ubica el riesgo</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th WIDTH=\"30%\">Aceptable</th>" +
                    "<th WIDTH=\"30%\">Intermedio</th>" +
                    "<th WIDTH=\"20%\">Alto</th>" +
                    "<th WIDTH=\"20%\">Ninguno</th>" +
                    "</tr>" +
                    "</thead>" +
                    "<tbody>";


            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Tanques Elevados</th>" ;
            agregarColumna(vector[0], et1.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Torres de alta tension</th>";
            agregarColumna(vector[1], et2.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Antena</th>";
            agregarColumna(vector[2], et3.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Postes de electricidad</th>";
            agregarColumna(vector[3], et4.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Postes de teléfono</th>";
            agregarColumna(vector[4], et5.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Alumbrado publico</th>";
            agregarColumna(vector[5], et6.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Transformadires de electricidad</th>";
            agregarColumna(vector[6], et7.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Alcantarillas y registros abiertos</th>";
            agregarColumna(vector[7], et8.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Bardas, Mallas o cercas, para delimitacion territorial o contra robos</th>";
            agregarColumna(vector[8], et9.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Banquetas desniveladas</th>";
            agregarColumna(vector[9], et10.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Arboles viejos o grandes y ramas que pueden despegarse</th>";
            agregarColumna(vector[10], et11.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Rampas para autos</th>";
            agregarColumna(vector[11], et12.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Vias de ferrocarril</th>";
            agregarColumna(vector[12], et13.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles con excesiva circulación vehicular</th>";
            agregarColumna(vector[13], et14.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles sin pavimentar</th>";
            agregarColumna(vector[14], et15.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles con inclinacion pronunciada</th>";
            agregarColumna(vector[15], et16.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles cerradas al trafico de vehiculos</th>";
            agregarColumna(vector[16], et17.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Calles estrechas</th>";
            agregarColumna(vector[17], et18.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Carreteras</th>";
            agregarColumna(vector[18], et19.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Terrenos baldios</th>";
            agregarColumna(vector[19], et20.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Construcciones vecinas dañadas</th>";
            agregarColumna(vector[20], et21.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Construcciones vecinas muy altas</th>";
            agregarColumna(vector[21], et22.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Ventanales</th>";
            agregarColumna(vector[22], et23.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Anuncios volados</th>";
            agregarColumna(vector[23], et24.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Anuncios panorámicos</th>";
            agregarColumna(vector[24], et25.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Marquesinas</th>";
            agregarColumna(vector[25], et26.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Pretiles de balcones</th>";
            agregarColumna(vector[26], et27.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Gasolineras</th>";
            agregarColumna(vector[27], et28.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Depositos o almacenes de sustancias toxicas, inflamables o explosivas</th>";
            agregarColumna(vector[28], et29.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Industrias</th>";
            agregarColumna(vector[29], et30.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Cantinas, bares o Salones</th>";
            agregarColumna(vector[30], et31.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Mercados</th>";
            agregarColumna(vector[31], et32.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Pasos a desnivel para vehiculos</th>";
            agregarColumna(vector[32], et33.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Pasos a desnivel para peatones</th>";
            agregarColumna(vector[33], et34.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Puentes elevados para peatones</th>";
            agregarColumna(vector[34], et35.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Terminales aéreas</th>";
            agregarColumna(vector[35], et36.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Terminales terrestres</th>";
            agregarColumna(vector[36], et37.getText().toString());

            htmlToPDF = htmlToPDF +
                    "<tr>" +
                    "<th>Terminales fluviales</th>";
            agregarColumna(vector[37], et38.getText().toString());

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

    static void agregarColumna(String posicionX, String msj){
        if(posicionX.equals("ACEPTABLE")){
            htmlToPDF=htmlToPDF +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+msj+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("INTERMEDIO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>"+msj+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("ALTO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "<td>"+msj+"</td>" +
                    "</tr>";
        }else if (posicionX.equals("NINGUNO")){
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td>X</td>" +
                    "<td></td>" +
                    "</tr>";
        }else{
            htmlToPDF=htmlToPDF +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "<td></td>" +
                    "</tr>";
        }
    }
}
