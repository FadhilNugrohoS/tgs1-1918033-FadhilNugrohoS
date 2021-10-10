package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BIODATA(View view){
        Intent a = new Intent(MainActivity.this,Biodata.class);
        startActivity(a);
    }
    public void lUAS(View view){
        Intent b = new Intent(MainActivity.this,Luas.class);
        startActivity(b);
    }
}