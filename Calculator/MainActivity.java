package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView ans;
    Button add,sub,mul,div,cls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        ans = findViewById(R.id.ans);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        cls = findViewById(R.id.cls);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int answer = no1 + no2;
                ans.setText(String.valueOf(answer));
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int answer = no1 - no2;
                ans.setText(String.valueOf(answer));
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int answer = no1 * no2;
                ans.setText(String.valueOf(answer));
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());

                if(no2 == 0){
                    ans.setText("Can't divide by 0!");
                }else{
                    int answer = no1 / no2;
                    ans.setText(String.valueOf(answer));
                }
            }
        });


        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText(null);
                n2.setText(null);
                ans.setText(null);
            }
        });
    }

}
