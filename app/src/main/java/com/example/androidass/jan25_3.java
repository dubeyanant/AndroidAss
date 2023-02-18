package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class jan25_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan253);
        
        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        final LinearLayout ll2 = (LinearLayout) findViewById(R.id.ll2);
        final Button redBtn = (Button) findViewById(R.id.redBtn);
        final Button skyBtn = (Button) findViewById(R.id.skyBtn);

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redBtn.setBackgroundColor(getResources().getColor(R.color.sky));
                skyBtn.setBackgroundColor(getResources().getColor(R.color.redd));
            }
        });

        skyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redBtn.setBackgroundColor(getResources().getColor(R.color.redd));
                skyBtn.setBackgroundColor(getResources().getColor(R.color.sky));
            }
        });
    }
}