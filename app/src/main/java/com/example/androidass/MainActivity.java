package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button j251, j252, j253, f11, f12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        j251 = (Button) findViewById(R.id.j251);
        j252 = (Button) findViewById(R.id.j252);
        j253 = (Button) findViewById(R.id.j253);
        f11 = (Button) findViewById(R.id.f11);
        f12 = (Button) findViewById(R.id.f12);

        j251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan25_1.class);
                startActivity(intent);
            }
        });

        j252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan25_2.class);
                startActivity(intent);
            }
        });

        j253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan25_3.class);
                startActivity(intent);
            }
        });

        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), feb1_1.class);
                startActivity(intent);
            }
        });

        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), feb1_2.class);
                startActivity(intent);
            }
        });
    }
}