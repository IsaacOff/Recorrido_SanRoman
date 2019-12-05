package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class quintanaroo_id_riesgo_externo extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22;

    private RadioButton rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44;
    private EditText  et1, et2,  et3,  et4,  et5,  et6,  et7,  et8,  et9, et10, et11, et12, et13, et14, et15, et16, et17, et18, et19, et20;
    private EditText et21,et22;

    String vector[][] =new String[22][2];

    String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_externo);

        this.setTitle("Riesgo Externo_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        directorio2 = new File(quintanaroo_id_riesgo.file());
        if(directorio2 != null) {
            pdfFile = new File(directorio2.getPath(), "prueba1.pdf");
        }

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

        rg6= (RadioGroup) findViewById(R.id.Rg6);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rb12 = (RadioButton) findViewById(R.id.rb12);

        rg7= (RadioGroup) findViewById(R.id.Rg7);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rb14 = (RadioButton) findViewById(R.id.rb14);

        rg8= (RadioGroup) findViewById(R.id.Rg8);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rb16 = (RadioButton) findViewById(R.id.rb16);

        rg9= (RadioGroup) findViewById(R.id.Rg9);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rb18 = (RadioButton) findViewById(R.id.rb18);

        rg10= (RadioGroup) findViewById(R.id.Rg10);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rb20 = (RadioButton) findViewById(R.id.rb20);

        rg11= (RadioGroup) findViewById(R.id.Rg11);
        rb21 = (RadioButton) findViewById(R.id.rb21);
        rb22 = (RadioButton) findViewById(R.id.rb22);

        rg12= (RadioGroup) findViewById(R.id.Rg12);
        rb23 = (RadioButton) findViewById(R.id.rb23);
        rb24 = (RadioButton) findViewById(R.id.rb24);

        rg13= (RadioGroup) findViewById(R.id.Rg13);
        rb25 = (RadioButton) findViewById(R.id.rb25);
        rb26 = (RadioButton) findViewById(R.id.rb26);

        rg14= (RadioGroup) findViewById(R.id.Rg14);
        rb27 = (RadioButton) findViewById(R.id.rb27);
        rb28 = (RadioButton) findViewById(R.id.rb28);

        rg15= (RadioGroup) findViewById(R.id.Rg15);
        rb29 = (RadioButton) findViewById(R.id.rb29);
        rb30 = (RadioButton) findViewById(R.id.rb30);

        rg16= (RadioGroup) findViewById(R.id.Rg16);
        rb31 = (RadioButton) findViewById(R.id.rb31);
        rb32 = (RadioButton) findViewById(R.id.rb32);

        rg17= (RadioGroup) findViewById(R.id.Rg17);
        rb33 = (RadioButton) findViewById(R.id.rb33);
        rb34 = (RadioButton) findViewById(R.id.rb34);

        rg18= (RadioGroup) findViewById(R.id.Rg18);
        rb35 = (RadioButton) findViewById(R.id.rb35);
        rb36 = (RadioButton) findViewById(R.id.rb36);

        rg19= (RadioGroup) findViewById(R.id.Rg19);
        rb37 = (RadioButton) findViewById(R.id.rb37);
        rb38 = (RadioButton) findViewById(R.id.rb38);

        rg20= (RadioGroup) findViewById(R.id.Rg20);
        rb39 = (RadioButton) findViewById(R.id.rb39);
        rb40 = (RadioButton) findViewById(R.id.rb40);

        rg21= (RadioGroup) findViewById(R.id.Rg21);
        rb41 = (RadioButton) findViewById(R.id.rb41);
        rb42 = (RadioButton) findViewById(R.id.rb42);

        rg22= (RadioGroup) findViewById(R.id.Rg22);
        rb43 = (RadioButton) findViewById(R.id.rb43);
        rb44 = (RadioButton) findViewById(R.id.rb44);



        //asigna los edit text a los et de aqui Rg 39
        et1 = (EditText) findViewById(R.id.editText1);
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



        //Verificacion de los radiobutton


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){

                    vector[0][0]="SI";
                    et1.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb2) {
                    vector[0][0]="NO";
                    et1.setVisibility(View.GONE);



                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){

                    vector[1][0]="SI";
                    et2.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb4) {

                    vector[1][0]="NO";
                    et2.setVisibility(View.GONE);



                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2][0]="SI";
                    et3.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb6) {

                    vector[2][0]="NO";
                    et3.setVisibility(View.GONE);



                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3][0]="SI";
                    et4.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb8) {

                    vector[3][0]="NO";
                    et4.setVisibility(View.GONE);


                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){

                    vector[4][0]="SI";
                    et5.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb10) {

                    vector[4][0]="NO";
                    et5.setVisibility(View.GONE);




                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5][0]="SI";
                    et6.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb12) {

                    vector[5][0]="NO";
                    et6.setVisibility(View.GONE);



                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6][0]="SI";
                    et7.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb14) {

                    vector[6][0]="NO";
                    et7.setVisibility(View.GONE);



                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7][0]="SI";
                    et8.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb16) {

                    vector[7][0]="NO";
                    et8.setVisibility(View.GONE);



                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8][0]="SI";
                    et9.setVisibility(View.VISIBLE);



                }else if(checkedId==R.id.rb18) {

                    vector[8][0]="NO";
                    et9.setVisibility(View.GONE);




                }

            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9][0]="SI";
                    et10.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb20) {
                    vector[9][0]="NO";
                    et10.setVisibility(View.GONE);




                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[10][0]="SI";
                    et11.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb22) {

                    vector[10][0]="NO";
                    et11.setVisibility(View.GONE);



                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[11][0]="SI";
                    et12.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb24) {

                    vector[11][0]="NO";
                    et12.setVisibility(View.GONE);



                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[12][0]="SI";
                    et13.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb26) {

                    vector[12][0]="NO";
                    et13.setVisibility(View.GONE);


                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[13][0]="SI";
                    et14.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb28) {

                    vector[13][0]="NO";
                    et14.setVisibility(View.GONE);



                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[14][0]="SI";
                    et15.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb30) {

                    vector[14][0]="NO";
                    et15.setVisibility(View.GONE);



                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[15][0]="SI";
                    et16.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb32) {

                    vector[15][0]="NO";
                    et16.setVisibility(View.GONE);




                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector[16][0]="SI";
                    et17.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb34) {

                    vector[16][0]="NO";
                    et17.setVisibility(View.GONE);



                }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector[17][0]="SI";
                    et18.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb36) {

                    vector[17][0]="NO";
                    et18.setVisibility(View.GONE);



                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[18][0]="SI";
                    et19.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb38) {

                    vector[18][0]="NO";
                    et19.setVisibility(View.GONE);



                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb39){

                    vector[19][0]="SI";
                    et20.setVisibility(View.VISIBLE);



                }else if(checkedId==R.id.rb40) {

                    vector[19][0]="NO";
                    et20.setVisibility(View.GONE);




                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb41){

                    vector[20][0]="SI";
                    et21.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb42) {

                    vector[20][0]="NO";
                    et21.setVisibility(View.GONE);



                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb43){

                    vector[21][0]="SI";
                    et22.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb44) {

                    vector[21][0]="NO";
                    et22.setVisibility(View.GONE);


                }

            }
        });


    }



    public void externo_siguiente1(View view) {
        Boolean bandera = true;


        for(int i=0;i<22; i++  ){
            if(vector[i][0]==null){
                bandera= false;
            }
        }

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



        if (bandera) {
            vector[0] [1] = et1.getText().toString();
            vector[1] [1] = et2.getText().toString();
            vector[2] [1] = et3.getText().toString();
            vector[3] [1] = et4.getText().toString();
            vector[4] [1] = et5.getText().toString();
            vector[5] [1] = et6.getText().toString();
            vector[6] [1] = et7.getText().toString();
            vector[7] [1] = et8.getText().toString();
            vector[8] [1] = et9.getText().toString();
            vector[9] [1] = et10.getText().toString();
            vector[10][1] = et11.getText().toString();
            vector[11][1] = et12.getText().toString();
            vector[12][1] = et13.getText().toString();
            vector[13][1] = et14.getText().toString();
            vector[14][1] = et15.getText().toString();
            vector[15][1] = et16.getText().toString();
            vector[16][1] = et17.getText().toString();
            vector[17][1] = et18.getText().toString();
            vector[18][1] = et19.getText().toString();
            vector[19][1] = et20.getText().toString();
            vector[20][1] = et21.getText().toString();
            vector[21][1] = et22.getText().toString();


            onClick(view);
            //externo1(view);
            Toast.makeText(this, "Listo vamos al siguiente", LENGTH_SHORT).show();



        } else {
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }


    }



    public void externo1 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_1.class);
        startActivity(intent);
    }

    public void onClick (View view){
        try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile.getPath()));

            document.open();
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();

        tablaConcatenacion=
                "<html>" + "<body>" +

                        "<TABLE border=\"1\" WIDTH=\"100%\">"+
                        "<thead>"+
                        "<tr>"+
                        "<th colspan=\"5\" style=\"text-align:center;\">RIESGOS EXTERNOS</th>"+

                        "</tr>"+
                        "<tr>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"13%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"35%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"10%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"10%\"></th>" +
                        "<th style=\"border: inset 0pt\" WIDTH=\"32%\"></th>" +
                        "</tr>" +
                        "</thead>"+
                        "<tbody>"+

                        "<tr>"+
                        "<td colspan=\"5\" >Planos de localización: \n" +
                        "Trazar el plano del entorno del inmueble donde, además de ubicar la instalación objeto de estudio, se indicará la siguiente:\n" +
                        "La presentación se entregara de acuerdo al PLANO P3.\n </td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td>PLANO P3.</td>"+
                        "<td colspan=\"4\">Ubicación del inmueble, indicando sus colindancias, los usos del suelo en un radio de 500 m; las vialidades, vías de acceso y otros predios circundantes, rasgos geográficos predominantes (lagunas, humedales, etc.), rasgos sociales importantes aledaños (escuelas, hospitales, gasolineras, mercados), Áreas Naturales Protegidas, Ordenamientos Ecológicos, Planes Directores y otros  agentes perturbadores de origen natural o humano que signifiquen riesgo para el inmueble y su población señalando claramente los distanciamientos a las mismas.</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"5\">IDENTIFICACIÓN DE RIESGOS EN EL ENTORNO INMEDIATO</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"5\">Se identificará la presencia de elementos de riesgo en el entorno inmediato (500 metros) del inmueble:</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"4\">Elementos a evaluar</td>"+
                        "<td colspan=\"1\">Distancia aproximada</td>"+
                        "</tr>"+

                        "<tr>"+
                        "<td colspan=\"2\">Tanques elevados</td>";
                        agregarRenglon(vector[0][0],vector[0][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Postes de energía eléctrica en mal estado</td>";
            agregarRenglon(vector[1][0],vector[1][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Torres con líneas de alta tensión</td>";
            agregarRenglon(vector[2][0],vector[2][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Transformadores de energía eléctrica</td>";
            agregarRenglon(vector[3][0],vector[3][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Inmuebles aledaños dañados</td>";
            agregarRenglon(vector[4][0],vector[4][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Banquetas desniveladas</td>";
            agregarRenglon(vector[5][0],vector[5][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Alcantarillas abiertas</td>";
            agregarRenglon(vector[6][0],vector[6][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Árboles grandes que puedan caer</td>";
            agregarRenglon(vector[7][0],vector[7][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Calles muy transitadas</td>";
            agregarRenglon(vector[8][0],vector[8][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Fábricas con instalaciones de Gas L.P.</td>";
            agregarRenglon(vector[9][0],vector[9][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Tanques de gas L.P.</td>";
            agregarRenglon(vector[10][0],vector[10][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Gasolineras y/o Gaseras</td>";
            agregarRenglon(vector[11][0],vector[11][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Anuncios volados  o espectaculares</td>";
            agregarRenglon(vector[12][0],vector[12][1]);

            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Almacenes de sustancias peligrosas</td>";
            agregarRenglon(vector[13][0],vector[13][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Fábricas</td>";
            agregarRenglon(vector[14][0],vector[14][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Planta de PEMEX</td>";
            agregarRenglon(vector[15][0],vector[15][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Basureros</td>";
            agregarRenglon(vector[16][0],vector[16][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Vías del ferrocarril</td>";
            agregarRenglon(vector[17][0],vector[17][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Ríos y laderas</td>";
            agregarRenglon(vector[18][0],vector[18][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Costas</td>";
            agregarRenglon(vector[19][0],vector[19][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Presas</td>";
            agregarRenglon(vector[20][0],vector[20][1]);
            tablaConcatenacion= tablaConcatenacion+
                    "<tr>"+
                    "<td colspan=\"2\">Otros, especificar</td>";
            agregarRenglon(vector[21][0],vector[21][1]);

            tablaConcatenacion= tablaConcatenacion+
                        "</tbody>"+
                        "</table>"+
                        "</body>" +"</html>" ;



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
    }


    }

    public void agregarRenglon(String decision, String distancia) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td >"+distancia+"</td>"+
                    "</tr>";

        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "<td ></td>"+
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td ></td>"+
                    "</tr>";
        }

    }

}
