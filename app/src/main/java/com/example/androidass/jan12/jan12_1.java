package com.example.androidass.jan12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class jan12_1 extends AppCompatActivity {

    EditText e1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan121);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        e1 = findViewById(R.id.PersonName);
        t1 = findViewById(R.id.textView);
    }

    public void ClickMe(View view) {
        t1.setText(String.format("%s %s %s", getString(R.string.welcome), e1.getText().toString(), getString(R.string.mit)));
    }
}