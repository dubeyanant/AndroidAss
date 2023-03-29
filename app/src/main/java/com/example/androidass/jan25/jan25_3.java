package com.example.androidass.jan25;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.androidass.R;

public class jan25_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan253);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        final Button redBtn = findViewById(R.id.redBtn);
        final Button skyBtn = findViewById(R.id.skyBtn);

        redBtn.setOnClickListener(v -> {
            redBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.sky));
            skyBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.redd));
        });

        skyBtn.setOnClickListener(v -> {
            redBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.redd));
            skyBtn.setBackgroundColor(ContextCompat.getColor(this, R.color.sky));
        });
    }
}