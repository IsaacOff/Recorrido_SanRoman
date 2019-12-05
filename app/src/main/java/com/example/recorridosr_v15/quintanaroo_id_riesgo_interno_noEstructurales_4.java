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

public class quintanaroo_id_riesgo_interno_noEstructurales_4 extends AppCompatActivity {
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26, rb27, rb28, rb29, rb30, rb31, rb32;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16;
    static String vector[]= {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    static File pdfFile;
    static File directorio2;
    static String tablaConcatenacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_no_estructurales_4);



        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


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

        if (vector[0].equals("SI")) {
            rb1.setChecked(true);
            rb2.setChecked(false);
        } else if (vector[0].equals("NO")) {
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if (vector[1].equals("SI")) {
            rb3.setChecked(true);
            rb4.setChecked(false);
        } else if (vector[1].equals("NO")) {
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if (vector[2].equals("SI")) {
            rb5.setChecked(true);
            rb6.setChecked(false);
        } else if (vector[2].equals("NO")) {
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if (vector[3].equals("SI")) {
            rb7.setChecked(true);
            rb8.setChecked(false);
        } else if (vector[3].equals("NO")) {
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if (vector[4].equals("SI")) {
            rb9.setChecked(true);
            rb10.setChecked(false);
        } else if (vector[4].equals("NO")) {
            rb9.setChecked(false);
            rb10.setChecked(true);
        }


        if (vector[5].equals("SI")) {
            rb11.setChecked(true);
            rb12.setChecked(false);
        } else if (vector[5].equals("NO")) {
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if (vector[6].equals("SI")) {
            rb13.setChecked(true);
            rb14.setChecked(false);
        } else if (vector[6].equals("NO")) {
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if (vector[7].equals("SI")) {
            rb15.setChecked(true);
            rb16.setChecked(false);
        } else if (vector[7].equals("NO")) {
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if (vector[8].equals("SI")) {
            rb17.setChecked(true);
            rb18.setChecked(false);
        } else if (vector[8].equals("NO")) {
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if (vector[9].equals("SI")) {
            rb19.setChecked(true);
            rb20.setChecked(false);
        } else if (vector[9].equals("NO")) {
            rb19.setChecked(false);
            rb20.setChecked(true);
        }


        if (vector[10].equals("SI")) {
            rb21.setChecked(true);
            rb22.setChecked(false);
        } else if (vector[10].equals("NO")) {
            rb21.setChecked(false);
            rb22.setChecked(true);
        }

        if (vector[11].equals("SI")) {
            rb23.setChecked(true);
            rb24.setChecked(false);
        } else if (vector[11].equals("NO")) {
            rb23.setChecked(false);
            rb24.setChecked(true);
        }

        if (vector[12].equals("SI")) {
            rb25.setChecked(true);
            rb26.setChecked(false);
        } else if (vector[12].equals("NO")) {
            rb25.setChecked(false);
            rb26.setChecked(true);
        }

        if (vector[13].equals("SI")) {
            rb27.setChecked(true);
            rb28.setChecked(false);
        } else if (vector[13].equals("NO")) {
            rb27.setChecked(false);
            rb28.setChecked(true);
        }

        if (vector[14].equals("SI")) {
            rb29.setChecked(true);
            rb30.setChecked(false);
        } else if (vector[14].equals("NO")) {
            rb29.setChecked(false);
            rb30.setChecked(true);
        }


        if (vector[15].equals("SI")) {
            rb31.setChecked(true);
            rb32.setChecked(false);
        } else if (vector[15].equals("NO")) {
            rb31.setChecked(false);
            rb32.setChecked(true);
        }

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


                }else if(checkedId==R.id.rb14) {

                    vector[6]="NO";


                }

            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb15){

                    vector[7]="SI";

                }else if(checkedId==R.id.rb16) {

                    vector[7]="NO";


                }

            }
        });


        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb17){

                    vector[8]="SI";



                }else if(checkedId==R.id.rb18) {

                    vector[8]="NO";



                }

            }
        });






        ///otro9-18


        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb19){

                    vector[9]="SI";

                }else if(checkedId==R.id.rb20) {
                    vector[9]="NO";


                }

            }
        });


        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb21){

                    vector[10]="SI";

                }else if(checkedId==R.id.rb22) {

                    vector[10]="NO";


                }

            }
        });


        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb23){
                    vector[11]="SI";


                }else if(checkedId==R.id.rb24) {

                    vector[11]="NO";


                }

            }
        });


        rg13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb25){

                    vector[12]="SI";


                }else if(checkedId==R.id.rb26) {

                    vector[12]="NO";

                }

            }
        });


        rg14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb27){

                    vector[13]="SI";


                }else if(checkedId==R.id.rb28) {

                    vector[13]="NO";



                }

            }
        });


        rg15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb29){

                    vector[14]="SI";


                }else if(checkedId==R.id.rb30) {

                    vector[14]="NO";


                }

            }
        });



        rg16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb31){

                    vector[15]="SI";


                }else if(checkedId==R.id.rb32) {

                    vector[15]="NO";


                }

            }
        });


    }


    public static boolean siguiente5() {
        Boolean banderanula = true;


        for(int i=0;i<16; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                vector[i]="N/P";
                banderanula= false;
            }
        }


        if (banderanula) {

            return true;
            //Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();
            //onClick(view);
            //interno_siguiente5(view);


        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            return false;
        }


    }



    public void interno_siguiente5 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_equiposyservicios_5.class);
        startActivity(intent);
    }

    public static String onClick (){


            tablaConcatenacion=

                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<td colspan=\"5\">RIESGOS POR ELEMENTOS NO ESTRUCTURALES</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"5\">Riesgo por las <b>condiciones de inseguridad</b> que existe en :</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"4%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"66%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                                    "<th style=\"border: inset 0pt\" WIDTH=\"20%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Anaqueles y/o estantería</td>";
            agregarRenglon(vector[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Vidrios</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Antenas</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Plafones</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Lámparas</td>";
            agregarRenglon(vector[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Elevadores</td>";
            agregarRenglon(vector[5]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 1 a la 6, se requiere implementar medidas correctivas.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>7</td>"+
                    "<td>Cancelería</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>8</td>"+
                    "<td>Puertas y ventanas</td>";
            agregarRenglon(vector[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>9</td>"+
                    "<td>Elementos suspendidos</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>10</td>"+
                    "<td>Muros falsos</td>";
            agregarRenglon(vector[9]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 7 a la 10, se requiere implementar medidas preventivas.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\">RIESGOS POR ACABADOS DEL INMUEBLE</td>"+
                    "</tr>"+
                    "<tr>"+
                    "<td colspan=\"5\">Riesgo por las <b>condiciones de inseguridad</b> que presentan los acabados del inmueble :</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>1</td>"+
                    "<td>Lambrines</td>";
            agregarRenglon(vector[10]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Recubrimiento de material incombustible</td>";
            agregarRenglon(vector[11]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 1 y  2, se requiere implementar medidas preventivas.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Recubrimiento de material combustible</td>";
            agregarRenglon(vector[12]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Pisos y desniveles</td>";
            agregarRenglon(vector[13]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Pisos falsos</td>";
            agregarRenglon(vector[14]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Losetas y azulejos</td>";
            agregarRenglon(vector[15]);

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"5\"><b>Nota: </b>Si respondió afirmativo en alguna de las cuestiones 3 a la 6, se requiere implementar medidas correctivas.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>";


            return tablaConcatenacion;
    }
    public static void agregarRenglon(String decision) {
        if (decision.equals("SI")) {
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"background-color:Yellow; text-align:center;\">SI</td>" +
                    "<td style=\"text-align:center;\">NO</td>" +
                    "<td>"+""+"</td>" +
                    "</tr>";
        } else if(decision.equals("NO")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td style=\"text-align:center;\">SI</td>" +
                    "<td style=\"background-color:Yellow; text-align:center;\">NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }else if(decision.equals("N/P")){
            tablaConcatenacion= tablaConcatenacion +
                    "<td colspan=\"2\" style=\"text-align:center; background-color:Yellow;\">No aplica</td>" +
                    "<td></td>" +
                    "</tr>";
        }else{
            tablaConcatenacion= tablaConcatenacion +
                    "<td >SI</td>" +
                    "<td>NO</td>" +
                    "<td></td>" +
                    "</tr>";
        }

    }

}
