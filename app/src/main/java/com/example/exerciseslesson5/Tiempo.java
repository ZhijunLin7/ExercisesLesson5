package com.example.exerciseslesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exerciseslesson5.R.id;

import java.util.Date;

public class Tiempo extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo);


        setContentView(R.layout.activity_tiempo);
        btn=(Button)findViewById(R.id.btuon);
        btn.setOnClickListener(this);
        updateTime();

    }
    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        btn.setText(new Date().toString());
    }
}