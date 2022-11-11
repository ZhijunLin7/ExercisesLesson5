package com.example.exerciseslesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button primero;
    private Button segundo;
    private Button tercero;
    private Button cuarto;
    private Button quinto;
    private Button sexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero= (Button) findViewById(R.id.Primero);
        primero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tiempo.class);
                startActivity(intent);
            }
        });

        segundo= (Button) findViewById(R.id.Segundo);
        segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,assigninglabels.class);
                startActivity(intent);
            }
        });
        tercero= (Button) findViewById(R.id.Tercero);
        tercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Imagen.class);
                startActivity(intent);
            }
        });
        cuarto= (Button) findViewById(R.id.Cuarto);
        cuarto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Fields.class);
                startActivity(intent);
            }
        });
        quinto= (Button) findViewById(R.id.Quinto);
        quinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Checkbox.class);
                startActivity(intent);
            }
        });
        sexto= (Button) findViewById(R.id.Sexto);
        sexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Radiobutton.class);
                startActivity(intent);
            }
        });
    }
}