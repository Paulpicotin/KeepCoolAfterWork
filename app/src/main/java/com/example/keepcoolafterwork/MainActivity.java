package com.example.keepcoolafterwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;

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