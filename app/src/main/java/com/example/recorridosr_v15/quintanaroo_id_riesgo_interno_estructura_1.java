package com.example.recorridosr_v15;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.content.pm.ActivityInfo;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
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


public class quintanaroo_id_riesgo_interno_estructura_1  extends AppCompatActivity {
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15, rb16, rb17, rb18,rb19,rb20, rb21, rb22, rb23, rb24 ;
    private RadioGroup rg1, rg2, rg3, rg4,rg5,rg6,rg7,rg8,rg9;
    private EditText et1;
    static private String vector[]= {"","","","","","","","","",""};
    static File pdfFile;
    static File directorio2;
    String temporal;
    static String tablaConcatenacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_id_riesgo_interno_estructura_1);

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

        //asigna los edit text a los et de aqui
        et1 = (EditText) findViewById(R.id.editText1);


        //Ocultar EditText
        et1.setVisibility(View.GONE);

        if(vector[0].equals("SI")){
            rb1.setChecked(true);
            rb2.setChecked(false);
        }else if(vector[0].equals("NO")){
            rb1.setChecked(false);
            rb2.setChecked(true);
        }

        if(vector[1].equals("SI")){
            rb3.setChecked(true);
            rb4.setChecked(false);
        }else if(vector[1].equals("NO")){
            rb3.setChecked(false);
            rb4.setChecked(true);
        }

        if(vector[2].equals("SI")){
            rb5.setChecked(true);
            rb6.setChecked(false);
        }else if(vector[2].equals("NO")){
            rb5.setChecked(false);
            rb6.setChecked(true);
        }

        if(vector[3].equals("SI")){
            rb7.setChecked(true);
            rb8.setChecked(false);
        }else if(vector[3].equals("NO")){
            rb7.setChecked(false);
            rb8.setChecked(true);
        }

        if(vector[4].equals("SI")){
            rb9.setChecked(true);
            rb10.setChecked(false);
        }else if(vector[4].equals("NO")){
            rb9.setChecked(false);
            rb10.setChecked(true);
        }

        if(vector[5].equals("SI")){
            rb11.setChecked(true);
            rb12.setChecked(false);
        }else if(vector[5].equals("NO")){
            rb11.setChecked(false);
            rb12.setChecked(true);
        }

        if(vector[6].equals("SI")){
            rb13.setChecked(true);
            rb14.setChecked(false);
        }else if(vector[6].equals("NO")){
            rb13.setChecked(false);
            rb14.setChecked(true);
        }

        if(vector[7].equals("SI")){
            rb15.setChecked(true);
            rb16.setChecked(false);
        }else if(vector[7].equals("NO")){
            rb15.setChecked(false);
            rb16.setChecked(true);
        }

        if(vector[8].equals("SI")){
            rb17.setChecked(true);
            rb18.setChecked(false);
            et1.setVisibility(View.VISIBLE);
        }else if(vector[8].equals("NO")){
            rb17.setChecked(false);
            rb18.setChecked(true);
        }

        if(!vector[9].equals("") && vector[9] != null){
            et1.setText(vector[9]);
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
                    if (checkedId == R.id.rb5) {
                        vector[2] = "SI";


                    } else if (checkedId == R.id.rb6) {

                        vector[2] = "NO";


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
                    et1.setVisibility(View.VISIBLE);


                }else if(checkedId==R.id.rb18) {

                    vector[8]="NO";
                    et1.setVisibility(View.GONE);


                }

            }
        });

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                vector[9]=et1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    public static boolean siguiente2() {
        Boolean bandera = true;


        if( vector[8]=="SI"){

            if (vector[9] == null || vector[9].equals("")) {
                bandera = false;
            }

        }

        for(int i=0;i<9; i++  ){
            if(vector[i]==null || vector[i].equals("")){
                bandera= false;
            }
        }



        if (bandera) {
            //vector[9] = et1.getText().toString();

            return true;
            //Toast.makeText(this, "vamos al siguiente", LENGTH_SHORT).show();
            //onClick(view);
            //interno_siguiente2(view);


        } else {
            //Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
            return false;
        }


    }




    public void interno_siguiente2 (View view){
        Intent intent = new Intent(this, quintanaroo_id_riesgo_interno_escaleraservicio_2.class);
        startActivity(intent);
    }



    public static String onClick (){



            tablaConcatenacion=


                            "<TABLE border=\"1\" WIDTH=\"100%\">"+
                            "<thead>"+
                            "<tr>"+
                            "<th colspan=\"4\" style=\"text-align:center;\">RIESGOS POR DAÑOS ESTRUCTURALES</th>"+
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
                            "<td colspan=\"4\" >Los aspectos de este apartado, se evaluaran <b>por simple apreciación visual.</b></td>"+
                            "</tr>"+

                            "<tr>" +
                            "<td style=\"text-align:center;\">1</td>" +
                            "<td>Presenta inclinación</td>";
                            agregarRenglon(vector[0]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">2</td>" +
                    "<td>Separación de elementos estructurales</td>";
            agregarRenglon(vector[1]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">3</td>" +
                    "<td>Deformación de muros, columnas, losas o trabes</td>";
            agregarRenglon(vector[2]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">4</td>" +
                    "<td>Los muros presentan grietas</td>";
            agregarRenglon(vector[3]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">5</td>" +
                    "<td>Hundimiento del inmueble</td>";
            agregarRenglon(vector[4]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">6</td>" +
                    "<td>Grietas en el piso</td>";
            agregarRenglon(vector[5]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"4\"><b>Nota:</b> Si respondió afirmativo en alguna de las cuestiones 1 a la 6, se requiere una evaluación detallada la cual será realizada por un experto en estructuras, quien emitirá un dictamen técnico correspondiente de acuerdo a la reglamentación local y normativa aplicable vigente.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">7</td>" +
                    "<td>Existe filtración de agua</td>";
            agregarRenglon(vector[6]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\">8</td>" +
                    "<td>Presenta daños en escaleras y rampas</td>";
            agregarRenglon(vector[7]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"4\"><b>Nota:</b> Si respondió afirmativo en alguna de las cuestiones 1 a la 8, se requiere la atención inmediata para subsanar las deficiencias encontradas.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td style=\"text-align:center;\"></td>" +
                    "<td>Cuenta con dictamen técnico</td>";
            agregarRenglon(vector[8]);

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"4\">De qué fecha: "+vector[9]+"</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                    "<tr>" +
                    "<td colspan=\"4\"><b>Nota:</b> Si respondió afirmativo presentar copia del dictamen técnico.</td>"+
                    "</tr>";

            tablaConcatenacion=  tablaConcatenacion +
                            "</tbody>"+
                            "</table>";
            //style='border: inset 0pt'



            //Intent intent = new Intent(this, com.example.recorridosr_v15.ViewPdf.class);
            //intent.putExtra("File", pdfFile.getPath());
            //startActivity(intent);

            return tablaConcatenacion;

    }
    public static void agregarRenglon(String decision) {
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
                            "<td>SI</td>" +
                            "<td>NO</td>" +
                            "</tr>";
                }
    }
}

