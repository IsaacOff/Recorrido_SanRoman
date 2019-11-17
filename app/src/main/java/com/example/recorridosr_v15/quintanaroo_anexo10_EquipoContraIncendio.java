package com.example.recorridosr_v15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

import static android.widget.Toast.LENGTH_SHORT;

public class quintanaroo_anexo10_EquipoContraIncendio extends AppCompatActivity {

private Spinner spin1, spin2, spin3;
private EditText et1, et2, et3, et4, et5;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
    private RadioGroup rg1, rg2, rg3, rg4,rg5;
    private TextView tv1;
    private String sel;
private int numero =1;
String vector[] =new String[13];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintana_roo_anexo10__equipo_contra_incendio);


        tv1 = (TextView) findViewById(R.id.tv1);

        //asigna los edit text a los et de aqui
        et1  = (EditText) findViewById(R.id.editText1);
        et2  = (EditText) findViewById(R.id.editText2);
        et3  = (EditText) findViewById(R.id.editText3);
        et4  = (EditText) findViewById(R.id.editText4);
        et5  = (EditText) findViewById(R.id.editText5);


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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones1 ={"CAPACIDAD EN KILOGRAMOS:","1 KG","2KG","2.5KG","4.5KG","6KG","9KG","12KG","35KG","50KG","70KG", "OTROS"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);

        //crea el vector de String que contendra el spinner y lo carga en la variable adapter
        String [] opciones2 ={"PRESION:","0","1.2","1.7","2.7","SOBRECARGA", "OTROS"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones2);


        //se asigna la variable adapter a cada espiner para mostrarle al usuario
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter1);
        spin3.setAdapter(adapter2);




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
        mostrar(spin1, et1);
        mostrar(spin2, et2);
        mostrar(spin3, et3);




    }


    public void mostrar(Spinner x, final EditText o){
        x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sel= parent.getItemAtPosition(position).toString();

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





    public void agregar(View view) {
        Boolean bandera= true;

        vector[0]   = spin1.getSelectedItem().toString();
        vector[2]   = spin2.getSelectedItem().toString();
        vector[6]   = spin3.getSelectedItem().toString();


        if(vector[0]=="TIPO DE EXTINTOR:"){
            bandera= false;
        }
        if(vector[2]=="CAPACIDAD EN KILOGRAMOS:"){
            bandera= false;
        }
        if(vector[6]=="PRESION:"){
            bandera= false;
        }


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


        if (et4.length() == 0) {
            bandera = false;
        }
        if (et5.length() == 0) {
            bandera = false;
        }




        if(bandera){



            vector[1]   = et1.getText().toString();
            vector[3]   = et2.getText().toString();
            vector[7]   = et3.getText().toString();
            vector[11]  = et4.getText().toString();
            vector[12]  = et5.getText().toString();


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

            rg1.clearCheck();
            rg2.clearCheck();
            rg3.clearCheck();
            rg4.clearCheck();
            rg5.clearCheck();


            Toast.makeText(this, "Agregado con exito", LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "REVISA LOS DATOS", LENGTH_SHORT).show();
        }
    }
}
