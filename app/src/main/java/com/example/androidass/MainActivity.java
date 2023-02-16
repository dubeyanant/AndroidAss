package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button j121, j122, j181, j182, j191, j192, j251, j252, j253, f11, f12, f81, f161;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        j121 = (Button) findViewById(R.id.j121);
        j122 = (Button) findViewById(R.id.j122);
        j181 = (Button) findViewById(R.id.j181);
        j182 = (Button) findViewById(R.id.j182);
        j191 = (Button) findViewById(R.id.j191);
        j192 = (Button) findViewById(R.id.j192);
        j251 = (Button) findViewById(R.id.j251);
        j252 = (Button) findViewById(R.id.j252);
        j253 = (Button) findViewById(R.id.j253);
        f11 = (Button) findViewById(R.id.f11);
        f12 = (Button) findViewById(R.id.f12);
        f81 = (Button) findViewById(R.id.f81);
        f161 = (Button) findViewById(R.id.f161);

        j121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan12_1.class);
                startActivity(intent);
            }
        });

        j122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan12_2.class);
                startActivity(intent);
            }
        });

        j181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan18_1.class);
                startActivity(intent);
            }
        });

        j182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan18_2.class);
                startActivity(intent);
            }
        });

        j191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan19_1.class);
                startActivity(intent);
            }
        });

        j192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), jan19_2.class);
                startActivity(intent);
            }
        });

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

        f81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), feb8_1.class);
                startActivity(intent);
            }
        });

        f161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), feb16_1.class);
                startActivity(intent);
            }
        });
    }
}