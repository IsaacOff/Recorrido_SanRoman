package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class quintanaroo_anexo10_EquipoContraIncendio extends AppCompatActivity {

private Spinner spin1, spin2, spin3;
private EditText et1, et2, et3, et4, et5, et6, et7;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
    private RadioGroup rg1, rg2, rg3, rg4,rg5;
    private TextView tv1;
    private String sel;
    static private int numero =1;
    static  String vector[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    private File pdfFile;
    private String htmlToPDF;
    static private String detectores;
    private File directorio2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__equipo_contra_incendio);
        this.setTitle("Equipo contra incendio");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(Integer.toString(numero));

        //asigna los edit text a los et de aqui
        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);
        et5  = (EditText) findViewById(R.id.editText5);
        et6  = (EditText) findViewById(R.id.editText6);
        et7  = (EditText) findViewById(R.id.editText7);


        //Ocultar EditText
        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        et3.setVisibility(View.GONE);

        //vincular checkbox del xml al .java

        //Asigna los Rg y rb del xml a los de aqui
        rg1= (RadioGroup) findViewById(R.id.Rg1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);

        rg2= (RadioGroup) findViewById(R.id.Rg2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        rg3= (RadioGroup) findViewById(R.id.Rg3);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);

        rg4= (RadioGroup) findViewById(R.id.Rg4);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rb8 = (RadioButton) findViewById(R.id.rb8);

        rg5= (RadioGroup) findViewById(R.id.Rg5);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rb10 = (RadioButton) findViewById(R.id.rb10);



        //asigna los espiner del xml a los espiner aqui declarados
        spin1 =(Spinner)findViewById(R.id.spinner1);
        spin2 =(Spinner)findViewById(R.id.spinner2);
        spin3 =(Spinner)findViewById(R.id.spinner3);


        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones ={"TIPO DE EXTINTOR:","PQS","K","CO2","H2O","ESPUMA","POLVO", "OTROS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones1 ={"CAPACIDAD EN KILOGRAMOS:","1 KG","2KG","2.5KG","4.5KG","6KG","9KG","12KG","35KG","50KG","70KG", "OTROS"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones2 ={"PRESION:","0","1.2","1.7","2.7","SOBRECARGA", "OTROS"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item_sanroman, opciones2);


        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter1);
        spin3.setAdapter(adapter2);






        if(!vector[1].equals("")){
        et1.setText(vector[1]);
        }
        if(!vector[3].equals("")){
        et2.setText(vector[3]);
        }
        if(!vector[7].equals("")){
        et3.setText(vector[7]);
        }
        if(!vector[11].equals("")){
        et4.setText(vector[11]);
        }
        if(!vector[12].equals("")){
        et5.setText(vector[12]);
        }
        if(!vector[13].equals("")){
        et6.setText(vector[13]);
        }
        if(!vector[14].equals("")){
        et7.setText(vector[14]);
        }



        if (vector[4].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
           // et1.setVisibility(View.VISIBLE);
        } else if (vector[4].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[5].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
           // et2.setVisibility(View.VISIBLE);
        } else if (vector[5].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if (vector[8].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
            //et3.setVisibility(View.VISIBLE);
        } else if (vector[8].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[9].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
           // et4.setVisibility(View.VISIBLE);
        } else if (vector[9].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[10].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
           // et5.setVisibility(View.VISIBLE);
        } else if (vector[10].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }

        //pinta de nuevo lo que habia guardado en el espiner
        if(vector[0].equals("TIPO DE EXTINTOR:")){
            spin1.setSelection(0);
        }else if(vector[0].equals("PQS")) {
            spin1.setSelection(1);
        }else if (vector[0].equals("K")){
            spin1.setSelection(2);
        }else if (vector[0].equals("CO2")){
            spin1.setSelection(3);
        }else if (vector[0].equals("H2O")){
            spin1.setSelection(4);
        }else if (vector[0].equals("ESPUMA")){
            spin1.setSelection(5);
        }else if (vector[0].equals("POLVO")){
            spin1.setSelection(6);
        }else if (vector[0].equals("OTROS")){
            spin1.setSelection(7);
        }



        //pinta de nuevo lo que habia guardado en el espiner//////////////
        if(vector[2].equals("CAPACIDAD EN KILOGRAMOS:")){
            spin2.setSelection(0);
        }else if(vector[2].equals("1 KG")) {
            spin2.setSelection(1);
        }else if (vector[2].equals("2KG")){
            spin2.setSelection(2);
        }else if (vector[2].equals("2.5KG")){
            spin2.setSelection(3);
        }else if (vector[2].equals("4.5KG")){
            spin2.setSelection(4);
        }else if (vector[2].equals("6KG")){
            spin2.setSelection(5);
        }else if (vector[2].equals("9KG")){
            spin2.setSelection(6);
        }else if (vector[2].equals("12KG")){
            spin2.setSelection(7);
        }else if (vector[2].equals("35KG")){
            spin2.setSelection(8);
        }else if (vector[2].equals("50KG")){
            spin2.setSelection(9);
        }else if (vector[2].equals("70KG")){
            spin2.setSelection(10);
        }else if (vector[2].equals("OTROS")){
            spin2.setSelection(11);
        }


        //pinta de nuevo lo que habia guardado en el espiner
        if(vector[6].equals("PRESION:")){
            spin3.setSelection(0);
        }else if(vector[6].equals("0")) {
            spin3.setSelection(1);
        }else if (vector[6].equals("1.2")){
            spin3.setSelection(2);
        }else if (vector[6].equals("1.7")){
            spin3.setSelection(3);
        }else if (vector[6].equals("2.7")){
            spin3.setSelection(4);
        }else if (vector[6].equals("SOBRECARGA")){
            spin3.setSelection(5);
        }else if (vector[6].equals("OTROS")){
            spin3.setSelection(6);
        }






        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[1]   = et1.getText().toString();
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
                vector[3]   = et2.getText().toString()+ " KG";
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
                vector[7]   = et3.getText().toString();
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
                vector[11]  = et4.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12]  = et5.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13]  = et6.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[14]  = et7.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });






       rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){
                    vector[4]="SI";


                }else if(checkedId==R.id.rb2) {
                    vector[4]="NO";

                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){
                    vector[5]="SI";


                }else if(checkedId==R.id.rb4) {
                    vector[5]="NO";

                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[8]="SI";


                }else if(checkedId==R.id.rb6) {
                    vector[8]="NO";

                }

            }
        });



        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){
                    vector[9]="SI";


                }else if(checkedId==R.id.rb8) {
                    vector[9]="NO";

                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){
                    vector[10]="SI";


                }else if(checkedId==R.id.rb10) {
                    vector[10]="NO";

                }

            }
        });





        //pasa parametros al spinner para mostrar
        mostrar(spin1, et1, 0);
        mostrar(spin2, et2, 2);
        mostrar(spin3, et3, 6);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_equipo_incendio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        if (id == R.id.detectoresvsincendio) {
            Toast.makeText(this, "Detectores de incendio abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_anexo10_DetectoresContraIncendio.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.inventariorecursos) {
            Toast.makeText(this, "Inventario de recursos abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_anexo10_RecursosMateriales.class);
            startActivity(intent);
            return true;
        }



        if (id == R.id.riesgoexterno) {
            Toast.makeText(this, "Riesgo Externo abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.riesgointerno) {
            Toast.makeText(this, "Riesgo Interno abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.senalitica) {
            Toast.makeText(this, "Señaletica abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, senaletica.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }





    public void mostrar(final Spinner x, final EditText o, final int i){
        x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sel= parent.getItemAtPosition(position).toString();

                vector[i]   = x.getSelectedItem().toString();

                switch( sel ) {

                    case "OTROS":
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
        Reporte(view);
    }

    public void agregar(View view) {
        Boolean bandera= true;



        if (et1.getVisibility() == View.VISIBLE) {
            if (vector[1] == null || vector[1].equals("")) {
                bandera = false;
            }
        }

        if (et2.getVisibility() == View.VISIBLE) {
            if (vector[3] == null || vector[3].equals("")) {
                bandera = false;
            }
        }

        if (et3.getVisibility() == View.VISIBLE) {
            if (vector[7] == null || vector[7].equals("")) {
                bandera = false;
            }
        }


        for(int i=0;i<15; i++  ){
            if((vector[i]==null || vector[i].equals("")) && (i!=1 && i!=3 && i!=7)){
                bandera= false;
            }
        }

        if((vector[0]==null || vector[0].equals("") || vector[0].equals("TIPO DE EXTINTOR:"))){
            bandera= false;
        }

        if((vector[2]==null || vector[2].equals("") || vector[2].equals("CAPACIDAD EN KILOGRAMOS:"))){
            bandera= false;
        }

        if((vector[6]==null || vector[6].equals("") || vector[6].equals("PRESION:"))){
            bandera= false;
        }

        if(bandera){
            agregarExtintor(vector);

            numero++;
            tv1.setText(Integer.toString(numero));

            spin1.setSelection(0);
            spin2.setSelection(0);
            spin3.setSelection(0);

            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
            et5.setText("");
            et6.setText("");
            et7.setText("");

            rg1.clearCheck();
            rg2.clearCheck();
            rg3.clearCheck();
            rg4.clearCheck();
            rg5.clearCheck();

            for(int i=0;i<15; i++  ){
                vector[i]="";
            }

            Toast.makeText(this, "Agregado con exito", LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }
    }

    public void Reporte(View v){
        try {

            directorio2 = new File(index_QuintanaRoo.file());
            if(directorio2 != null) {
                pdfFile = new File(directorio2.getPath(), "Equipo contra incendio.pdf");
            }

            Document document = new Document(PageSize.LETTER.rotate());
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            //String htmlToPDF="<html><head></head><body><h1>Hola que tal</h1><p>Shalalala que pazo</p></body></html>";
            htmlToPDF="<html>" +
                    "<head>" +
                    "<title>Equipo contra incendio</title>" +
                    "</head>" +
                    "<body>" +
                    "Recursos materiales"+
                    "<TABLE border=\"1\" WIDTH=\"100%\" style=\"text-align:center;\">" +
        /*"<colgroup>" +
        "<col style=\"width: 20%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "<col style=\"width: 40%\"/>" +
        "</colgroup>" +*/
                    "<thead>" +
                    "<tr>" +
                    "<th colspan=\"13\">Equipo contra incendios</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<th WIDTH=\"3%\">No.</th>" +
                    "<th WIDTH=\"8%\">Tipo</th>" +
                    "<th WIDTH=\"5%\">Cap. KG</th>" +
                    "<th WIDTH=\"8%\">P. Hidros</th>" +
                    "<th WIDTH=\"7%\">Valvula</th>" +
                    "<th WIDTH=\"7%\">Presion</th>" +
                    "<th WIDTH=\"10%\">Manometro</th>" +
                    "<th WIDTH=\"8%\">Boquilla</th>" +
                    "<th WIDTH=\"9%\">Etiqueta de inspec.</th>" +
                    "<th WIDTH=\"9%\">Ubicación</th>" +
                    "<th WIDTH=\"10%\">Proveedor</th>" +
                    "<th WIDTH=\"8%\">Fecha de ultima recarga</th>" +
                    "<th WIDTH=\"8%\">Fecha de proxima recarga</th>" +
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

    void agregarExtintor(String[] vector){
        String tipo, capacidad, presion;

        if (vector[0].equals("OTROS")){
            tipo = vector[1];
        }else{
            tipo = vector[0];
        }

        if (vector[2].equals("OTROS")){
            capacidad = vector[3];
        }else{
            capacidad = vector[2];
        }

        if (vector[6].equals("OTROS")){
            presion = vector[7];
        }else{
            presion = vector[6];
        }

        detectores=detectores +
                "<tr>" +
                "<td>"+ (numero) +"</td>"+
                "<td>"+tipo+"</td>" +
                "<td>"+capacidad+"</td>" +
                "<td>"+vector[4]+"</td>" +
                "<td>"+vector[5]+"</td>" +
                "<td>"+presion+"</td>" +
                "<td>"+vector[8]+"</td>" +
                "<td>"+vector[9]+"</td>" +
                "<td>"+vector[10]+"</td>" +
                "<td>"+vector[11]+"</td>" +
                "<td>"+vector[14]+"</td>" +
                "<td>"+vector[12]+"</td>" +
                "<td>"+vector[13]+"</td>" +
                "</tr>";
    }

}
