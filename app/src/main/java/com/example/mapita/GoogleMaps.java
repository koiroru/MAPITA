package com.example.mapita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends AppCompatActivity implements OnMapReadyCallback{

    Button Regreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapita);
        mapFragment.getMapAsync(this);



    Regreso = findViewById(R.id.btnregreso);
        Regreso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        GoogleMap mMap = googleMap;

        LatLng puntito1 = new LatLng(-54,171);
        mMap.addMarker(new MarkerOptions().position(puntito1).title("Direccion 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puntito1));

        LatLng puntito2 = new LatLng(34,168);
        mMap.addMarker(new MarkerOptions().position(puntito2).title("Direccion 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puntito2));

        LatLng puntito3 = new LatLng(-64,150);
        mMap.addMarker(new MarkerOptions().position(puntito3).title("Direccion 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puntito3));

        LatLng mipuntito = new LatLng(-94,171);
        mMap.addMarker(new MarkerOptions().position(mipuntito).title("Direccion 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mipuntito));






    }
}