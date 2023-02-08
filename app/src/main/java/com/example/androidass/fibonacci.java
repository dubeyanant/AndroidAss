package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fibonacci extends AppCompatActivity {

    TextView fibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        fibonacci = (TextView) findViewById(R.id.fibonacci);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        fibonacci.setText(result);
    }
}