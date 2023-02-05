package com.example.calculator;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button picktime;
    TextView setime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picktime = findViewById(R.id.picktime);
        setime = findViewById(R.id.setime);

        picktime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal = Calendar.getInstance();

                int hr = cal.get(Calendar.HOUR_OF_DAY);
                int min = cal.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener(){
                    public void onTimeSet(TimePicker view, int hour, int minute){
                        String ampm;

                        if(hour<12){
                            ampm = "AM";
                        }else{
                            hour -= 12;
                            ampm = "PM";
                        }
                        setime.setText(hour+":"+minute+" "+ampm);
                    }
                },hr,min,false);

                timePickerDialog.show();
            }
        });
    }
}
