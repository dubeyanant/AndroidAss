package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class factorial extends AppCompatActivity {

    TextView factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        factorial = (TextView) findViewById(R.id.factorial);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        factorial.setText(result);
    }
}