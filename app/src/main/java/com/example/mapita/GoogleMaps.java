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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends AppCompatActivity implements OnMapReadyCallback{

    Button Regreso;
    double lat = 0.0;
    double lon = 0.0;

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

        double lon1 = getIntent().getDoubleExtra("lo1", 0.0);
        double lat1 = getIntent().getDoubleExtra("la1", 0.0);

        double lon2 = getIntent().getDoubleExtra("lo2", 0.0);
        double lat2 = getIntent().getDoubleExtra("la2", 0.0);

        double lon3 = getIntent().getDoubleExtra("lo3", 0.0);
        double lat3 = getIntent().getDoubleExtra("la3", 0.0);

        double lon4 = getIntent().getDoubleExtra("lo4", 0.0);
        double lat4 = getIntent().getDoubleExtra("la4", 0.0);

        LatLng puntito1 = new LatLng(lon1, lat1);
        mMap.addMarker(new MarkerOptions().position(puntito1)
                .title("Primera Direccion")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng puntito2 = new LatLng(lon2, lat2);
        mMap.addMarker(new MarkerOptions().position(puntito2)
                .title("Segunda Direccion")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng puntito3 = new LatLng(lon3, lat3);
        mMap.addMarker(new MarkerOptions().position(puntito3)
                .title("Tercera Direccion")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng mipuntito = new LatLng(lon4, lat4);
        mMap.addMarker(new MarkerOptions().position(mipuntito)
                .title("Mi Direccion")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));



    }
}