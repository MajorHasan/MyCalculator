package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText n1, n2, result;
Button add_btn, sub_btn, mul_btn, div_btn;
Button adv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        result = findViewById(R.id.result);
        add_btn = findViewById(R.id.add_btn);
        sub_btn = findViewById(R.id.sub_btn);
        mul_btn = findViewById(R.id.mul_btn);
        div_btn = findViewById(R.id.div_btn);
        adv = findViewById(R.id.go1);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a = Integer.parseInt(n1.getText().toString());
               int b = Integer.parseInt(n2.getText().toString());
               int c = a+b;
               result.setText(String.valueOf(c));
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a-b;
                result.setText(String.valueOf(c));
            }
        });

        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a*b;
                result.setText(String.valueOf(c));
            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(n1.getText().toString());
                int b = Integer.parseInt(n2.getText().toString());
                int c = a/b;
                result.setText(String.valueOf(c));
            }
        });

        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, advanced.class);
                startActivity(myIntent);
            }
        });

    }
}