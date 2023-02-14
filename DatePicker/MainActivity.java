package com.example.calculator;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button pickdate;
    TextView seldate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pickdate = findViewById(R.id.pickdate);
        seldate = findViewById(R.id.seldate);

        pickdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final Calendar cal = Calendar.getInstance();

               int yr = cal.get(Calendar.YEAR);
               int m = cal.get(Calendar.MONTH);
               int d = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener(){
                   public void onDateSet(DatePicker view, int year, int month, int day){
                       seldate.setText(day+"/"+(month+1)+"/"+year);
                   }
                },yr,m,d);

                datePickerDialog.show();
            }
        });
    }
}
