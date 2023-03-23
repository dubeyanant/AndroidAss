package com.example.androidass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, prn;
    String Name, PRN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buttons = new Button[]{
                findViewById(R.id.j121),
                findViewById(R.id.j122),
                findViewById(R.id.j181),
                findViewById(R.id.j182),
                findViewById(R.id.j191),
                findViewById(R.id.j192),
                findViewById(R.id.j251),
                findViewById(R.id.j252),
                findViewById(R.id.j253),
                findViewById(R.id.f11),
                findViewById(R.id.f12),
                findViewById(R.id.f81),
                findViewById(R.id.f91),
                findViewById(R.id.f161),
                findViewById(R.id.f221),
                findViewById(R.id.m11),
                findViewById(R.id.m12),
                findViewById(R.id.m81),
                findViewById(R.id.m231)
        };

        Intent[] intents = new Intent[]{
                new Intent(this, jan12_1.class),
                new Intent(this, jan12_2.class),
                new Intent(this, jan18_1.class),
                new Intent(this, jan18_2.class),
                new Intent(this, jan19_1.class),
                new Intent(this, jan19_2.class),
                new Intent(this, jan25_1.class),
                new Intent(this, jan25_2.class),
                new Intent(this, jan25_3.class),
                new Intent(this, feb1_1.class),
                new Intent(this, feb1_2.class),
                new Intent(this, feb8_1.class),
                new Intent(this, feb9_1.class),
                new Intent(this, feb16_1.class),
                new Intent(this, feb22_1.class),
                new Intent(this, mar1_1.class),
                new Intent(this, mar1_2.class),
                new Intent(this, mar8_1.class),
                new Intent(this, mar23_1.class)
        };

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    name = (EditText) findViewById(R.id.name);
                    prn = (EditText) findViewById(R.id.prn);

                    if (name.getText().toString().equals("") || prn.getText().toString().equals("")) {
                        Name = getString(R.string.Name);
                        PRN = getString(R.string.PRN);
                    } else {
                        Name = name.getText().toString();
                        PRN = prn.getText().toString();
                    }

                    intents[index].putExtra("Name", Name);
                    intents[index].putExtra("PRN", PRN);
                    startActivity(intents[index]);
                }
            });
        }
    }
}