package com.example.mapita;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText puntito1;
    EditText puntito2;
    EditText puntito3;
    EditText mipuntito;
    Button Siguiente;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntito1 = findViewById(R.id.txtD1);
        puntito2 = findViewById(R.id.txtD2);
        puntito3 = findViewById(R.id.txtD3);
        mipuntito = findViewById(R.id.txtMD);

        Siguiente = findViewById(R.id.btnsiguiente);
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        GoogleMaps.class
                );

                String cadena1 = (puntito1.getText().toString());
                String[] partesuno = cadena1.split(",");
                String partelongituduna = partesuno[0];
                String partelatituduna = partesuno[1];

                String cadena2 = (puntito2.getText().toString());
                String[] partesdos = cadena2.split(",");
                String partelongituddos = partesdos[0];
                String partelatituddos = partesdos[1];

                String cadena3 = (puntito3.getText().toString());
                String[] partestres = cadena3.split(",");
                String partelongitudtres = partestres[0];
                String partelatitudtres = partestres[1];

                String cadena4 = (mipuntito.getText().toString());
                String[] partescuatro = cadena4.split(",");
                String partelongitudcuatro = partescuatro[0];
                String partelatitudcuatro = partescuatro[1];

                double primeralong = Double.parseDouble(partelongituduna.toString());
                double primeralati = Double.parseDouble(partelatituduna.toString());
                double segundalong = Double.parseDouble(partelongituddos.toString());
                double segundalati = Double.parseDouble(partelatituddos.toString());
                double terceralong = Double.parseDouble(partelongitudtres.toString());
                double terceralati = Double.parseDouble(partelatitudtres.toString());
                double cuartalong = Double.parseDouble(partelongitudcuatro.toString());
                double cuartalati = Double.parseDouble(partelatitudcuatro.toString());

                intent.putExtra("lo1", primeralong);
                intent.putExtra("la1", primeralati);
                intent.putExtra("lo2", segundalong);
                intent.putExtra("la2", segundalati);
                intent.putExtra("lo3", terceralong);
                intent.putExtra("la3", terceralati);
                intent.putExtra("lo4", cuartalong);
                intent.putExtra("la4", cuartalati);

                intent.putExtra("Siguiente",Siguiente.getText().toString());
                startActivity(intent);

            }
        });
    }}