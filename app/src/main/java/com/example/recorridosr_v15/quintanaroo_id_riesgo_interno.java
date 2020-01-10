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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
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
    static private EditText et1, et2, et3, et4, et6, et7, et8, et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    static private String vector[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno);
        this.setTitle("Riesgo interno 1");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

//instancia para saber donde poner el snackbar
        layout = findViewById(R.id.interno);



        /*directorio2 = new File(getIntent().getStringExtra("File"));
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "prueba1.pdf");
        }*/

        //asigna los edit text a los et de aqui
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        //et5 = (EditText) findViewById(R.id.editText5);
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

        et1.setText(vector[0]);
        et2.setText(vector[1]);
        et3.setText(vector[2]);
        et4.setText(vector[3]);
        //et5.setText(vector[4]);
        et6.setText(vector[5]);
        et7.setText(vector[6]);
        et8.setText(vector[7]);
        et9.setText(vector[8]);
        et10.setText(vector[9]);
        et11.setText(vector[10]);
        et12.setText(vector[11]);
        et13.setText(vector[12]);
        et14.setText(vector[13]);
        et15.setText(vector[14]);
        et16.setText(vector[15]);
        et17.setText(vector[16]);

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[0]=et1.getText().toString();
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
                vector[1]=et2.getText().toString();
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
                vector[2]=et3.getText().toString();
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
                vector[3]=et4.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

       /* et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[4]=et5.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
*/
        et6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[5]=et6.getText().toString();
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
                vector[6]=et7.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[7]=et8.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[8]=et9.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9]=et10.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[10]=et11.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[11]=et12.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[12]=et13.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[13]=et14.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[14]=et15.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[15]=et16.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[16]=et17.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.ayuda) {
            Snackbar snackbar =Snackbar.make(layout, "Para los campos de '(N/A)': 'Presiona sobre los campos de color naranja' o solo 'deja vacios esos campos'", Snackbar.LENGTH_LONG);
            snackbar.show();


            return true;
        }
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Actividad 1 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno.class);
            startActivity(intent);


            return true;
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Actividad 2 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_estructura_1.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Actividad 3 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_escaleraservicio_2.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion4) {
            Toast.makeText(this, "Actividad 4 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_instalaciones_3.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion5) {
            Toast.makeText(this, "Actividad 5 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_noEstructurales_4.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion6) {
            Toast.makeText(this, "Actividad 6 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_equiposyservicios_5.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion7) {
            Toast.makeText(this, "Actividad 7 abierta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_otros_6.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.opcion8) {
            quintanaroo_id_riesgo_interno_otros_6.revisar(getApplicationContext());
            return true;
        }


        if (id == R.id.equipovsincendio) {

            Toast.makeText(this, "Equipo de incendio abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_anexo10_EquipoContraIncendio.class);
            startActivity(intent);

            return true;
        }
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
            Toast.makeText(this, "Riesgo externo abierto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, quintanaroo_id_riesgo_externo.class);
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



    static public boolean siguiente1() {
        Boolean bandera = true;


        if (et1.length() == 0 || et1.equals("")) {
            bandera = false;
        }


        if (et2.length() == 0 || et2.equals("")) {

            bandera = false;
        }

        if (et3.length() == 0 || et3.equals("")) {
            bandera = false;
        }


        if (et4.length() == 0 || et4.equals("")) {
            bandera = false;
        }


        /*if (et5.length() == 0 || et5.equals("")) {
            bandera = false;
        }*/


        if (et6.length() == 0 || et6.equals("")) {
            bandera = false;
        }


        if (et7.length() == 0 || et7.equals("")) {
            bandera = false;
        }


        if (et8.length() == 0 || et8.equals("")) {
            bandera = false;
        }


        if (et9.length() == 0 || et9.equals("")) {
            bandera = false;
        }


        if (et10.length() == 0 || et10.equals("")) {
            bandera = false;
        }


        if (et11.length() == 0 || et11.equals("")) {
            bandera = false;
        }

        if (et12.length() == 0 || et12.equals("")) {
            bandera = false;
        }

        if (et13.length() == 0 || et13.equals("")) {
            bandera = false;
        }


        if (et14.length() == 0 || et14.equals("")) {
            bandera = false;
        }


        if (et15.length() == 0 || et15.equals("")) {
            bandera = false;
        }


        if (et16.length() == 0 || et16.equals("")) {
            bandera = false;
        }


        if (et17.length() == 0 || et17.equals("")) {
            bandera = false;
        }


        if (bandera) {
            /*vector[0] = et1.getText().toString();
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
*/
            //Toast.makeText(this, "Vamos al siguiente", Toast.LENGTH_LONG).show();
            //onClick(view);
            //interno_estructura(view);
            return true;

        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", Toast.LENGTH_LONG).show();
            return false;
        }

    }


    public void interno_estructura(View view) {
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_estructura_1.class);
        startActivity(intent);
    }

    public static String onClick (){
        /*try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
*/
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
                "<td style='border: inset 0pt' colspan=\"3\">Teléfono: <b>"+vector[3]+"</b></td>"+
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
               /* "</body>" + "</html>";
        //style='border: inset 0pt'



        worker.parseXHtml(pdfWriter, document, new StringReader(tablaConcatenacion));

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
    }*/
               return tablaConcatenacion;


}




            //Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
            //intent.putExtra("File", pdfFile.getPath());
            //startActivity(intent);



}