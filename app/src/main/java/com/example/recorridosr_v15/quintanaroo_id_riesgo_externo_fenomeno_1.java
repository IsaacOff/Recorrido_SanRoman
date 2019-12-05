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

public class quintanaroo_id_riesgo_externo_fenomeno_1 extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23, rg24, rg25;
    private RadioGroup rg26, rg27, rg28, rg29,rg30,rg31,rg32,rg33,rg34;

    private RadioButton  rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46,rb47,rb48, rb49, rb50, rb51, rb52, rb53,rb54, rb55, rb56, rb57, rb58, rb59, rb60;
    private RadioButton rb61, rb62, rb63, rb64, rb65, rb66,rb67,rb68;

    private EditText et1, et2, et3, et4;

    String vector[] =new String[38];

    String tablaConcatenacion="";
    static File pdfFile;
    static File directorio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_externo_fenomeno_1);


        this.setTitle("Riesgo Externo chetumal");
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

        rg23= (RadioGroup) findViewById(R.id.Rg23);
        rb45 = (RadioButton) findViewById(R.id.rb45);
        rb46 = (RadioButton) findViewById(R.id.rb46);

        ///////////modificar desde aqui

        rg24= (RadioGroup) findViewById(R.id.Rg24);
        rb47 = (RadioButton) findViewById(R.id.rb47);
        rb48 = (RadioButton) findViewById(R.id.rb48);

        rg25= (RadioGroup) findViewById(R.id.Rg25);
        rb49 = (RadioButton) findViewById(R.id.rb49);
        rb50 = (RadioButton) findViewById(R.id.rb50);

        rg26= (RadioGroup) findViewById(R.id.Rg26);
        rb51 = (RadioButton) findViewById(R.id.rb51);
        rb52 = (RadioButton) findViewById(R.id.rb52);

        rg27= (RadioGroup) findViewById(R.id.Rg27);
        rb53 = (RadioButton) findViewById(R.id.rb53);
        rb54 = (RadioButton) findViewById(R.id.rb54);

        rg28= (RadioGroup) findViewById(R.id.Rg28);
        rb55 = (RadioButton) findViewById(R.id.rb55);
        rb56 = (RadioButton) findViewById(R.id.rb56);

        rg29= (RadioGroup) findViewById(R.id.Rg29);
        rb57 = (RadioButton) findViewById(R.id.rb57);
        rb58 = (RadioButton) findViewById(R.id.rb58);

        rg30= (RadioGroup) findViewById(R.id.Rg30);
        rb59 = (RadioButton) findViewById(R.id.rb59);
        rb60 = (RadioButton) findViewById(R.id.rb60);

        rg31= (RadioGroup) findViewById(R.id.Rg31);
        rb61 = (RadioButton) findViewById(R.id.rb61);
        rb62 = (RadioButton) findViewById(R.id.rb62);

        rg32= (RadioGroup) findViewById(R.id.Rg32);
        rb63 = (RadioButton) findViewById(R.id.rb63);
        rb64 = (RadioButton) findViewById(R.id.rb64);

        rg33= (RadioGroup) findViewById(R.id.Rg33);
        rb65 = (RadioButton) findViewById(R.id.rb65);
        rb66 = (RadioButton) findViewById(R.id.rb66);

        rg34= (RadioGroup) findViewById(R.id.Rg34);
        rb67 = (RadioButton) findViewById(R.id.rb67);
        rb68 = (RadioButton) findViewById(R.id.rb68);





        //asigna los edit text a los et de aqui Rg 39
        et1 = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);



        //Ocultar EditText
        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        et3.setVisibility(View.GONE);
        et4.setVisibility(View.GONE);








        //Verificacion de los radiobutton


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb1){

                    vector[0]="SI";

                }else if(checkedId==R.id.rb2) {
                    vector[0]="NO";


                }

            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb3){

                    vector[1]="SI";

                }else if(checkedId==R.id.rb4) {

                    vector[1]="NO";


                }

            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb5){
                    vector[2]="SI";


                }else if(checkedId==R.id.rb6) {

                    vector[2]="NO";


                }

            }
        });


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb7){

                    vector[3]="SI";


                }else if(checkedId==R.id.rb8) {

                    vector[3]="NO";

                }

            }
        });


        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb9){

                    vector[4]="SI";


                }else if(checkedId==R.id.rb10) {

                    vector[4]="NO";



                }

            }
        });


        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb11){

                    vector[5]="SI";


                }else if(checkedId==R.id.rb12) {

                    vector[5]="NO";


                }

            }
        });



        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb13){

                    vector[6]="SI";
                    et1.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb14) {

                    vector[6]="NO";
                    et1.setVisibility(View.GONE);


                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[8]="SI";

                }else if(checkedId==R.id.rb16) {

                    vector[8]="NO";


                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[9]="SI";



                }else if(checkedId==R.id.rb18) {

                    vector[9]="NO";



                }

            }
        });




        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[10]="SI";


                }else if(checkedId==R.id.rb20) {
                    vector[10]="NO";



                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[11]="SI";

                }else if(checkedId==R.id.rb22) {

                    vector[11]="NO";


                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[12]="SI";


                }else if(checkedId==R.id.rb24) {

                    vector[12]="NO";


                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[13]="SI";


                }else if(checkedId==R.id.rb26) {

                    vector[13]="NO";

                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[14]="SI";


                }else if(checkedId==R.id.rb28) {

                    vector[14]="NO";



                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[15]="SI";


                }else if(checkedId==R.id.rb30) {

                    vector[15]="NO";


                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[16]="SI";
                    et2.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb32) {

                    vector[16]="NO";
                    et2.setVisibility(View.GONE);


                }

            }
        });


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector[18]="SI";

                }else if(checkedId==R.id.rb34) {

                    vector[18]="NO";


                }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector[19]="SI";


                }else if(checkedId==R.id.rb36) {

                    vector[19]="NO";


                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[20]="SI";


                }else if(checkedId==R.id.rb38) {

                    vector[20]="NO";


                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb39){

                    vector[21]="SI";



                }else if(checkedId==R.id.rb40) {

                    vector[21]="NO";



                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb41){

                    vector[22]="SI";
                    et3.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb42) {

                    vector[22]="NO";
                    et3.setVisibility(View.GONE);


                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb43){

                    vector[24]="SI";


                }else if(checkedId==R.id.rb44) {

                    vector[24]="NO";


                }

            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb45){

                    vector[25]="SI";



                }else if(checkedId==R.id.rb46) {

                    vector[25]="NO";



                }

            }
        });



        //24-46


        //Verificacion de los radiobutton


        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb47){

                    vector[26]="SI";

                }else if(checkedId==R.id.rb48) {
                    vector[26]="NO";


                }

            }
        });


        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb49){

                    vector[27]="SI";

                }else if(checkedId==R.id.rb50) {

                    vector[27]="NO";


                }

            }
        });


        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb51){
                    vector[28]="SI";


                }else if(checkedId==R.id.rb52) {

                    vector[28]="NO";


                }

            }
        });


        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb53){

                    vector[29]="SI";


                }else if(checkedId==R.id.rb54) {

                    vector[29]="NO";

                }

            }
        });


        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb55){

                    vector[30]="SI";


                }else if(checkedId==R.id.rb56) {

                    vector[30]="NO";



                }

            }
        });


        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb57){

                    vector[31]="SI";


                }else if(checkedId==R.id.rb58) {

                    vector[31]="NO";


                }

            }
        });



        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb59){

                    vector[32]="SI";


                }else if(checkedId==R.id.rb60) {

                    vector[32]="NO";


                }

            }
        });

///////////////////////////////////////////////////////
        ///////////////////////
        ///////////////////
        ///////////////
        ///////////
        ///////////

        rg31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb61){

                    vector[33]="SI";

                }else if(checkedId==R.id.rb62) {

                    vector[33]="NO";


                }

            }
        });


        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb63){

                    vector[34]="SI";



                }else if(checkedId==R.id.rb64) {

                    vector[34]="NO";



                }

            }
        });






        ///otro9-18


        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb65){

                    vector[35]="SI";


                }else if(checkedId==R.id.rb66) {
                    vector[35]="NO";



                }

            }
        });


        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb67){

                    vector[36]="SI";
                    et4.setVisibility(View.VISIBLE);

                }else if(checkedId==R.id.rb68) {

                    vector[36]="NO";
                    et4.setVisibility(View.GONE);


                }

            }
        });


    }




    public void externo_siguiente2(View view) {
        Boolean bandera = true;


        for(int i=0;i<7; i++){
            if(vector[i]==null){
                bandera= false;
            }
        }


        for(int i=8;i<17; i++){
            if(vector[i]==null){
                bandera= false;
            }
        }

        for(int i=18;i<23; i++){
            if(vector[i]==null){
                bandera= false;
            }
        }
        for(int i=24;i<37; i++){
            if(vector[i]==null){
                bandera= false;
            }
        }



        if( vector[6]=="SI"){

            if (et1.length() == 0) {
                bandera = false;
            }

        }

        if( vector[16]=="SI"){

            if (et2.length() == 0) {
                bandera = false;
            }

        }


        if( vector[22]=="SI"){

            if (et3.length() == 0) {
                bandera = false;
            }

        }


        if( vector[36]=="SI"){

            if (et4.length() == 0) {
                bandera = false;
            }

        }



        if (bandera) {
            vector[7] = et1.getText().toString();
            vector[17] = et2.getText().toString();
            vector[23] = et3.getText().toString();
            vector[37] = et4.getText().toString();


            Toast.makeText(this, "Guardado con exito", LENGTH_SHORT).show();
            onClick(view);
            //externo2(view);



        } else {
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }


    }



    public void externo2 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_externo_fenomeno_2.class);
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
                            "<td colspan=\"4\">FENÓMENOS PERTURBADORES</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"4\">De origen Socio-Organizativo</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"3%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"87%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>"+
                            "<td colspan=\"4\" style=\"text-align:center;\" >Elementos a evaluar</td>"+
                            "</tr>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Accidentes aéreos, terrestres y fluviales</td>";
            agregarRenglon(vector[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes de vehículos que transportan materiales químicos peligrosos (explosiones, gas, cloro, gasolina, solventes, otros).</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos terrestres de transporte de       pasajeros.</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos aéreos.</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transporte de carga.</td>";
            agregarRenglon(vector[4]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Accidentes en donde se involucren vehículos marítimos de transportes de       pasajeros.</td>";
            agregarRenglon(vector[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[7]+"</td>"+
                    "</tr>";


//_------------------------------------ VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Terrorismo y sabotaje</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo</td>";
            agregarRenglon(vector[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Robo con violencia</td>";
            agregarRenglon(vector[10]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Secuestro</td>";
            agregarRenglon(vector[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Invasión de bienes inmuebles</td>";
            agregarRenglon(vector[12]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Interrupción de vialidades</td>";
            agregarRenglon(vector[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios públicos</td>";
            agregarRenglon(vector[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Sabotaje a los servicios privados</td>";
            agregarRenglon(vector[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[17]+"</td>"+
                    "</tr>";


            //-------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Concentraciones masivas</td>";
            agregarRenglon(vector[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Marchas y manifestaciones</td>";
            agregarRenglon(vector[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Plantones y mítines</td>";
            agregarRenglon(vector[20]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Actos vandálicos</td>";
            agregarRenglon(vector[21]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[22]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[23]+"</td>"+
                    "</tr>";

            //-----------------------------VERIFICAR

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Interrupción de servicios</td>";
            agregarRenglon(vector[24]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"4\">De origen Geológico</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Agrietamiento</td>";
            agregarRenglon(vector[25]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Hundimiento de terreno</td>";
            agregarRenglon(vector[26]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Deslave</td>";
            agregarRenglon(vector[27]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Deslizamiento de alud</td>";
            agregarRenglon(vector[28]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Erosión del suelo productivo</td>";
            agregarRenglon(vector[29]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Sobre explotación de fuentes de agua</td>";
            agregarRenglon(vector[30]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>11</td>"+
                    "<td>Sobre explotación de mantos freáticos</td>";
            agregarRenglon(vector[31]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>12</td>"+
                    "<td>Sismos o Terremotos</td>";
            agregarRenglon(vector[32]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Derrumbes de edificios aledaños</td>";
            agregarRenglon(vector[33]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Caída de torres de alta tensión</td>";
            agregarRenglon(vector[34]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td> Maremotos o Tsunamis</td>";
            agregarRenglon(vector[35]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Otros, especificar:</td>";
            agregarRenglon(vector[36]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td colspan=\"3\">"+vector[37]+"</td>"+
                    "</tr>";

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

    public void agregarRenglon(String decision) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "</tr>";

        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "</tr>";
        }

    }

}
