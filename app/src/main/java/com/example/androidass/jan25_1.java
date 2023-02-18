package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class jan25_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan251);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        final LinearLayout ll = (LinearLayout) findViewById(R.id.LinearLayout);

        final RadioButton red = (RadioButton) findViewById(R.id.red);
        final RadioButton cream = (RadioButton) findViewById(R.id.cream);
        final RadioButton sky = (RadioButton) findViewById(R.id.sky);
        final RadioButton navy = (RadioButton) findViewById(R.id.navy);

        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ll.setBackgroundColor(getResources().getColor(R.color.redd));
            }
        });

        cream.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ll.setBackgroundColor(getResources().getColor(R.color.cream));
            }
        });

        sky.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ll.setBackgroundColor(getResources().getColor(R.color.sky));
            }
        });

        navy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ll.setBackgroundColor(getResources().getColor(R.color.navy));
            }
        });
    }
}