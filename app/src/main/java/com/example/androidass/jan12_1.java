package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jan12_1 extends AppCompatActivity {

    EditText e1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan121);

        e1 = (EditText) findViewById(R.id.PersonName);
        t1 = (TextView) findViewById(R.id.textView);
    }

    public void ClickMe(View view) {
        t1.setText("Welcome " + e1.getText().toString() + " To MITWPU, Pune.");
    }
}