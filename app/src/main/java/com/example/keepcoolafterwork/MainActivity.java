package com.example.keepcoolafterwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;

import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button map = findViewById(R.id.boutonMagique);

        map.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ActivityMap.class);
            startActivity (intent);
        });

    }

}