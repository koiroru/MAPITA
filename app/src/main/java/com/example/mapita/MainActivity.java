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

                intent.putExtra("Siguiente",Siguiente.getText().toString());
                startActivity(intent);

            }
        });
    }}