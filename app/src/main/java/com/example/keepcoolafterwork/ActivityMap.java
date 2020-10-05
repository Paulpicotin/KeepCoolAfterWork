package com.example.keepcoolafterwork;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ActivityMap extends AppCompatActivity
        implements OnMapReadyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {


        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        LatLng paris = new LatLng(48.814, 2.378);
        googleMap.addMarker(new MarkerOptions()
                .position(paris)
                .title("Marker in Paris"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(paris));
    }


}