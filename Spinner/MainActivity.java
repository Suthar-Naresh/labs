package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {

    String[] subjects = {"C","C++","Java","Bash","Android","Ios","Windows","Linux"};

    TextView sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdownlist = findViewById(R.id.spinner);
        dropdownlist.setOnItemSelectedListener(this);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,subjects);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownlist.setAdapter(ad);

        sub = findViewById(R.id.subject);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        sub.setText("You selected: "+subjects[position]);
        Toast.makeText(this, subjects[position], Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
