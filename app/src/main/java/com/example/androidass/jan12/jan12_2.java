package com.example.androidass.jan12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

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

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void sum(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText(String.format("%s %s %s %s %s %s", getString(R.string.addition), a, getString(R.string.and), b, getString(R.string.equals), (a + b)));
    }

    public void sub(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText(String.format("%s %s %s %s %s %s", getString(R.string.subtraction), a, getString(R.string.and), b, getString(R.string.equals), (a - b)));
    }

    public void mul(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        result.setText(String.format("%s %s %s %s %s %s", getString(R.string.multiplication), a, getString(R.string.and), b, getString(R.string.equals), (a * b)));
    }

    public void div(View view) {
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        float c = (float) a / b;
        result.setText(String.format("%s %s %s %s %s %s", getString(R.string.division), a, getString(R.string.and), b, getString(R.string.equals), c));
    }
}