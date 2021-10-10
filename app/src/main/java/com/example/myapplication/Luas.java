package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Luas extends AppCompatActivity {
    EditText a,t;
    TextView hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);
        a = (EditText)findViewById(R.id.input_alas);
        t = (EditText)findViewById(R.id.input_tinggi);
        hitung =(Button) findViewById(R.id.btn_hitung);
        hasil = (TextView) findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String a1 = a.getText().toString();
                String t1 = t.getText().toString();
                double a = Double.parseDouble(a1);
                double t = Double.parseDouble(t1);
                double hs = LuasSegitiga(a,t);
                String output = String.valueOf(hs);
                hasil.setText(output.toString());
            }
        });
    }
    public  double LuasSegitiga(double a, double t){return a*t/2;}
}