package com.example.mapita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends AppCompatActivity implements OnMapReadyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapita);
        mapFragment.getMapAsync(this);

        btnregreso.SetOnClickListener(new View.OnClickListener() {

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

        double lon1 = getIntent() .getDoubleExtra("lo1", 0.0);
        double lat1 = getIntent() .getDoubleExtra("lat1", 0.0);

        double lon2 = getIntent() .getDoubleExtra("lo2", 0.0);
        double lat2 = getIntent() .getDoubleExtra("lat2", 0.0);

        double lon3 = getIntent() .getDoubleExtra("lo3", 0.0);
        double lat3 = getIntent() .getDoubleExtra("lat3", 0.0);

        LatLng puntito1 = new LatLng(lon1, lat1);
        mMap.addMarker(new MarkerOptions()

        LatLng puntito2 = new LatLng(lon2, lat2);
        mMap.addMarker(new MarkerOptions()

        LatLng puntito3 = new LatLng(lon3, lat3);
        mMap.addMarker(new MarkerOptions()

    }
}