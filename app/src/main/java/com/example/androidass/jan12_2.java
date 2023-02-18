package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class jan12_2 extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan122);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }

    public void sum(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText("Addition of " + a + " and " + b + " is equal to " + (a + b));
    }

    public void sub(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText("Subtraction of " + a + " and " + b + " is equal to " + (a - b));
    }

    public void mul(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText("Multiplication of " + a + " and " + b + " is equal to " + (a * b));
    }

    public void div(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        float c = (float) a / b;
        result.setText("Division of " + a + " and " + b + " is equal to " + c);
    }
}