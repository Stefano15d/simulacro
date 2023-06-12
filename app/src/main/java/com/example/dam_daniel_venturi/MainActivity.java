package com.example.dam_daniel_venturi;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button_primero);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envio sus datos", Toast.LENGTH_SHORT).show());

    }
}