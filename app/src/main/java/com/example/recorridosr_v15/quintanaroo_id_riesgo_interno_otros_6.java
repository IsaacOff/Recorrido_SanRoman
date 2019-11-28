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

public class quintanaroo_id_riesgo_interno_otros_6 extends AppCompatActivity {
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9, rg10, rg11, rg12,rg13, rg14, rg15,rg16,rg17,rg18,rg19,rg20, rg21, rg22, rg23, rg24, rg25;
    private RadioGroup rg26, rg27, rg28, rg29,rg30,rg31,rg32,rg33,rg34, rg35, rg36, rg37,rg38, rg39, rg40,rg41,rg42,rg43,rg44,rg45, rg46, rg47, rg48, rg49, rg50;
    private RadioGroup rg51, rg52, rg53, rg54;

    private RadioButton  rb1,  rb2,  rb3,  rb4,  rb5,  rb6, rb7, rb8,  rb9, rb10, rb11, rb12, rb13,rb14, rb15, rb16, rb17, rb18, rb19, rb20;
    private RadioButton rb21, rb22, rb23, rb24, rb25, rb26,rb27,rb28, rb29, rb30, rb31, rb32, rb33,rb34, rb35, rb36, rb37, rb38, rb39, rb40;
    private RadioButton rb41, rb42, rb43, rb44, rb45, rb46,rb47,rb48, rb49, rb50, rb51, rb52, rb53,rb54, rb55, rb56, rb57, rb58, rb59, rb60;
    private RadioButton rb61, rb62, rb63, rb64, rb65, rb66,rb67,rb68, rb69, rb70, rb71, rb72, rb73,rb74, rb75, rb76, rb77, rb78, rb79, rb80;
    private RadioButton rb81, rb82, rb83, rb84, rb85, rb86,rb87,rb88, rb89, rb90, rb91, rb92, rb93,rb94, rb95, rb96, rb97, rb98, rb99, rb100;
    private RadioButton rb101,rb102,rb103,rb104,rb105,rb106,rb107,rb108;
    private EditText et1;

    String vector[] =new String[54];
    String vector2;
    static File pdfFile;
    static File directorio2;
    String tablaConcatenacion="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_otros_6);



        this.setTitle("Riesgo interno_chetumal");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        directorio2 = new File(getIntent().getStringExtra("File"));
        if(directorio2 != null) {
          pdfFile = new File(directorio2.getPath(), "Otros.pdf");
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

        rg35= (RadioGroup) findViewById(R.id.Rg35);
        rb69 = (RadioButton) findViewById(R.id.rb69);
        rb70 = (RadioButton) findViewById(R.id.rb70);

        rg36= (RadioGroup) findViewById(R.id.Rg36);
        rb71 = (RadioButton) findViewById(R.id.rb71);
        rb72 = (RadioButton) findViewById(R.id.rb72);

        rg37= (RadioGroup) findViewById(R.id.Rg37);
        rb73 = (RadioButton) findViewById(R.id.rb73);
        rb74 = (RadioButton) findViewById(R.id.rb74);

        rg38 = (RadioGroup) findViewById(R.id.Rg38);
        rb75 = (RadioButton) findViewById(R.id.rb75);
        rb76 = (RadioButton) findViewById(R.id.rb76);

        rg39= (RadioGroup) findViewById(R.id.Rg39);
        rb77 = (RadioButton) findViewById(R.id.rb77);
        rb78 = (RadioButton) findViewById(R.id.rb78);

        rg40= (RadioGroup) findViewById(R.id.Rg40);
        rb79 = (RadioButton) findViewById(R.id.rb79);
        rb80 = (RadioButton) findViewById(R.id.rb80);

        rg41= (RadioGroup) findViewById(R.id.Rg41);
        rb81 = (RadioButton) findViewById(R.id.rb81);
        rb82 = (RadioButton) findViewById(R.id.rb82);

        rg42= (RadioGroup) findViewById(R.id.Rg42);
        rb83 = (RadioButton) findViewById(R.id.rb83);
        rb84 = (RadioButton) findViewById(R.id.rb84);

        rg43= (RadioGroup) findViewById(R.id.Rg43);
        rb85 = (RadioButton) findViewById(R.id.rb85);
        rb86 = (RadioButton) findViewById(R.id.rb86);

        rg44= (RadioGroup) findViewById(R.id.Rg44);
        rb87 = (RadioButton) findViewById(R.id.rb87);
        rb88 = (RadioButton) findViewById(R.id.rb88);

        rg45= (RadioGroup) findViewById(R.id.Rg45);
        rb89 = (RadioButton) findViewById(R.id.rb89);
        rb90 = (RadioButton) findViewById(R.id.rb90);

        rg46= (RadioGroup) findViewById(R.id.Rg46);
        rb91 = (RadioButton) findViewById(R.id.rb91);
        rb92 = (RadioButton) findViewById(R.id.rb92);

        rg47= (RadioGroup) findViewById(R.id.Rg47);
        rb93 = (RadioButton) findViewById(R.id.rb93);
        rb94 = (RadioButton) findViewById(R.id.rb94);

        rg48= (RadioGroup) findViewById(R.id.Rg48);
        rb95 = (RadioButton) findViewById(R.id.rb95);
        rb96 = (RadioButton) findViewById(R.id.rb96);

        rg49= (RadioGroup) findViewById(R.id.Rg49);
        rb97 = (RadioButton) findViewById(R.id.rb97);
        rb98 = (RadioButton) findViewById(R.id.rb98);

        rg50= (RadioGroup) findViewById(R.id.Rg50);
        rb99 = (RadioButton) findViewById(R.id.rb99);
        rb100 = (RadioButton) findViewById(R.id.rb100);

        rg51= (RadioGroup) findViewById(R.id.Rg51);
        rb101 = (RadioButton) findViewById(R.id.rb101);
        rb102 = (RadioButton) findViewById(R.id.rb102);

        rg52= (RadioGroup) findViewById(R.id.Rg52);
        rb103 = (RadioButton) findViewById(R.id.rb103);
        rb104 = (RadioButton) findViewById(R.id.rb104);

        rg53= (RadioGroup) findViewById(R.id.Rg53);
        rb105 = (RadioButton) findViewById(R.id.rb105);
        rb106 = (RadioButton) findViewById(R.id.rb106);

        rg54  = (RadioGroup) findViewById(R.id.Rg54);
        rb107 = (RadioButton) findViewById(R.id.rb107);
        rb108 = (RadioButton) findViewById(R.id.rb108);



        //asigna los edit text a los et de aqui Rg 39
        et1 = (EditText) findViewById(R.id.editText1);



        //Ocultar EditText
        et1.setVisibility(View.GONE);







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


        rg17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb33){

                    vector[16]="SI";

                }else if(checkedId==R.id.rb34) {

                    vector[16]="NO";


                }

            }
        });


        rg18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb35){

                    vector[17]="SI";


                }else if(checkedId==R.id.rb36) {

                    vector[17]="NO";


                }

            }
        });

        rg19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb37){

                    vector[18]="SI";


                }else if(checkedId==R.id.rb38) {

                    vector[18]="NO";


                }

            }
        });

        rg20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb39){

                    vector[19]="SI";



                }else if(checkedId==R.id.rb40) {

                    vector[19]="NO";



                }

            }
        });


        rg21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb41){

                    vector[20]="SI";


                }else if(checkedId==R.id.rb42) {

                    vector[20]="NO";


                }

            }
        });

        rg22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb43){

                    vector[21]="SI";


                }else if(checkedId==R.id.rb44) {

                    vector[21]="NO";


                }

            }
        });

        rg23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb45){

                    vector[22]="SI";



                }else if(checkedId==R.id.rb46) {

                    vector[22]="NO";



                }

            }
        });



        //24-46


        //Verificacion de los radiobutton


        rg24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb47){

                    vector[23]="SI";

                }else if(checkedId==R.id.rb48) {
                    vector[23]="NO";


                }

            }
        });


        rg25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb49){

                    vector[24]="SI";

                }else if(checkedId==R.id.rb50) {

                    vector[24]="NO";


                }

            }
        });


        rg26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb51){
                    vector[25]="SI";


                }else if(checkedId==R.id.rb52) {

                    vector[25]="NO";


                }

            }
        });


        rg27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb53){

                    vector[26]="SI";


                }else if(checkedId==R.id.rb54) {

                    vector[26]="NO";

                }

            }
        });


        rg28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb55){

                    vector[27]="SI";


                }else if(checkedId==R.id.rb56) {

                    vector[27]="NO";



                }

            }
        });


        rg29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb57){

                    vector[28]="SI";


                }else if(checkedId==R.id.rb58) {

                    vector[28]="NO";


                }

            }
        });



        rg30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb59){

                    vector[29]="SI";


                }else if(checkedId==R.id.rb60) {

                    vector[29]="NO";


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

                    vector[30]="SI";

                }else if(checkedId==R.id.rb62) {

                    vector[30]="NO";


                }

            }
        });


        rg32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb63){

                    vector[31]="SI";



                }else if(checkedId==R.id.rb64) {

                    vector[31]="NO";



                }

            }
        });






        ///otro9-18


        rg33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb65){

                    vector[32]="SI";


                }else if(checkedId==R.id.rb66) {
                    vector[32]="NO";



                }

            }
        });


        rg34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb67){

                    vector[33]="SI";

                }else if(checkedId==R.id.rb68) {

                    vector[33]="NO";


                }

            }
        });


        rg35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb69){
                    vector[34]="SI";


                }else if(checkedId==R.id.rb70) {

                    vector[34]="NO";


                }

            }
        });


        rg36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb71){

                    vector[35]="SI";


                }else if(checkedId==R.id.rb72) {

                    vector[35]="NO";

                }

            }
        });


        rg37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb73){

                    vector[36]="SI";


                }else if(checkedId==R.id.rb74) {

                    vector[36]="NO";



                }

            }
        });


        rg38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb75){

                    vector[37]="SI";


                }else if(checkedId==R.id.rb76) {

                    vector[37]="NO";


                }

            }
        });



        rg39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb77){

                    vector[38]="SI";
                    et1.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb78) {

                    vector[38]="NO";
                    et1.setVisibility(View.GONE);


                }

            }
        });


        rg40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb79){

                    vector[39]="SI";


                }else if(checkedId==R.id.rb80) {

                    vector[39]="NO";


                }

            }
        });


        rg41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb81){

                    vector[40]="SI";


                }else if(checkedId==R.id.rb82) {

                    vector[40]="NO";


                }

            }
        });

        rg42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb83){

                    vector[41]="SI";


                }else if(checkedId==R.id.rb84) {

                    vector[41]="NO";


                }

            }
        });

        rg43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb85){

                    vector[42]="SI";



                }else if(checkedId==R.id.rb86) {

                    vector[42]="NO";



                }

            }
        });


        rg44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb87){

                    vector[43]="SI";


                }else if(checkedId==R.id.rb88) {

                    vector[43]="NO";


                }

            }
        });

        rg45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb89){

                    vector[44]="SI";


                }else if(checkedId==R.id.rb90) {

                    vector[44]="NO";


                }

            }
        });

        rg46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb91){

                    vector[45]="SI";



                }else if(checkedId==R.id.rb92) {

                    vector[45]="NO";



                }

            }
        });


        //47-54

        rg47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb93){

                    vector[46]="SI";



                }else if(checkedId==R.id.rb94) {

                    vector[46]="NO";



                }

            }
        });

        rg48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb95){

                    vector[47]="SI";



                }else if(checkedId==R.id.rb96) {

                    vector[47]="NO";



                }

            }
        });

        rg49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb97){

                    vector[48]="SI";



                }else if(checkedId==R.id.rb98) {

                    vector[48]="NO";



                }

            }
        });

        rg50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb99){

                    vector[49]="SI";



                }else if(checkedId==R.id.rb100) {

                    vector[49]="NO";



                }

            }
        });

        rg51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb101){

                    vector[50]="SI";



                }else if(checkedId==R.id.rb102) {

                    vector[50]="NO";



                }

            }
        });

        rg52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb103){

                    vector[51]="SI";



                }else if(checkedId==R.id.rb104) {

                    vector[51]="NO";



                }

            }
        });

        rg53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb105){

                    vector[52]="SI";



                }else if(checkedId==R.id.rb106) {

                    vector[52]="NO";



                }

            }
        });

        rg54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rb107){

                    vector[53]="SI";



                }else if(checkedId==R.id.rb108) {

                    vector[53]="NO";



                }

            }
        });



    }



    public void final_interno(View view) {
        Boolean bandera = true;


        for(int i=0;i<54; i++  ){
            if(vector[i]==null){
                bandera= false;
            }
        }

        if( vector[38]=="SI"){

            if (et1.length() == 0) {
                bandera = false;
            }

        }


        if (bandera) {
            vector2 = et1.getText().toString();


            Toast.makeText(this, "Guardado con exito", LENGTH_SHORT).show();



        } else {
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }
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
                            "<td colspan=\"4\">OTROS RIESGOS INTERNOS</td>"+
                            "</tr>"+
                            "<tr>"+
                            "<td colspan=\"4\">Objetos que pueden caer:</td>"+
                            "</tr>"+
                            "<tr>" +

                            "<th style=\"border: inset 0pt\" WIDTH=\"3%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"87%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +
                            "<th style=\"border: inset 0pt\" WIDTH=\"5%\"></th>" +

                            "</tr>" +
                            "</thead>"+
                            "<tbody>"+

                            "<tr>" +
                            "<td>1</td>"+
                            "<td>Lámparas</td>";
            agregarRenglon(vector[0]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>2</td>"+
                    "<td>Candiles</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>3</td>"+
                    "<td>Bocinas</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>4</td>"+
                    "<td>Rejillas</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>5</td>"+
                    "<td>Aparadores de Vidrio</td>";
            agregarRenglon(vector[4]);


            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td>6</td>"+
                    "<td>Canceles de vidrio</td>";
            agregarRenglon(vector[5]);
//_------------------------
            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en el tanque</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en tuberías</td>";
            agregarRenglon(vector[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Anomalías en la instalación del suministro de gas: Estufa, calentador de agua</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con dictamen técnico de instalación gas</td>";
            agregarRenglon(vector[9]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" ;

            if(vector[9].equals("SI")) {
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"4\" >De qué fecha: <b>"+vector[10]+"</b></td>";
            }else{
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"4\" >De qué fecha:</td>";
            }

            tablaConcatenacion=  tablaConcatenacion +
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"4\"><b>Nota: </b> Si respondió afirmativo presentar copia del dictamen técnico.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td>3.</td>"+
                    "<td colspan=\"3\" >Instalación eléctrica</td>"+
                    "</tr>"+

                    "<tr>" +
                    "<td></td>"+
                    "<td>Subestación (protegida y señalada)</td>";
            agregarRenglon(vector[11]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Tablero (con tapa y señalado)</td>";
            agregarRenglon(vector[12]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cableado (entubado o empotrado)</td>";
            agregarRenglon(vector[13]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Contactos (protegidos)</td>";
            agregarRenglon(vector[14]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Interruptores (con tapa protectora)</td>";
            agregarRenglon(vector[15]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Lámparas (funcionando)</td>";
            agregarRenglon(vector[16]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Lámparas de emergencia (funcionando)</td>";
            agregarRenglon(vector[17]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Planta de emergencia</td>";
            agregarRenglon(vector[18]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cajas de distribución</td>";
            agregarRenglon(vector[19]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con dictamen técnico de instalación eléctrica</td>";
            agregarRenglon(vector[20]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" ;

            if(vector[20].equals("SI")) {
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"4\" >De qué fecha: <b>"+vector[21]+"</b></td>";
            }else{
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"4\" >De qué fecha:</td>";
            }

            tablaConcatenacion=  tablaConcatenacion +
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td colspan=\"4\"><b>Nota: </b> Si respondió afirmativo presentar copia del dictamen técnico.</td>"+
                    "</tr>";

            tablaConcatenacion =  tablaConcatenacion +
                    "<tr>"+
                    "<td>4.</td>"+
                    "<td colspan=\"3\" >Instalación de aire acondicionado</td>"+
                    "</tr>"+

                    "<tr>" +
                    "<td></td>"+
                    "<td>La instalación eléctrica se encuentra protegida</td>";
            agregarRenglon(vector[22]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Cuenta con tierra física</td>";
            agregarRenglon(vector[23]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>"+
                    "<td>Instalaciones especiales</td>";
            agregarRenglon(vector[24]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td></td>";
            if(vector[24].equals("SI")) {
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"3\">Especifique: <b>" + vector[25] + "</b></td>";
            }else{
                tablaConcatenacion=  tablaConcatenacion +
                        "<td colspan=\"3\">Especifique: </td>";
            }
            tablaConcatenacion=  tablaConcatenacion +
                    "</tr>"+
                    "<tr>"+
                    "<td colspan=\"4\"><b>Nota: </b>\n" +
                    "Si respondió afirmativo en alguna de las opciones de la cuestión 1., se requiere implementar medidas preventivas.\n" +
                    "Si respondió afirmativo en alguna de las opciones de las cuestiones 2 a la 4, se requiere implementar medidas correctivas, además de los dictámenes técnicos correspondientes elaborados por una Unidad de Verificación o Perito Autorizado en la materia.\n</td>"+
                    "</tr>";


            tablaConcatenacion=  tablaConcatenacion +
                    "</tbody>"+
                    "</table>"+

                    "</body>" + "</html>";
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
                    "<td >SI</td>" +
                    "<td>NO</td>" +
                    "</tr>";
        }

    }



}
