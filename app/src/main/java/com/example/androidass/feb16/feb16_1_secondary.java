package com.example.androidass.feb16;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class feb16_1_secondary extends AppCompatActivity {

    EditText first, second;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb161_secondary);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        add = (Button) findViewById(R.id.feb16Button);

        add.setOnClickListener(v -> {
            if (first.getText().toString().equals("") || second.getText().toString().equals("")) {
                Toast.makeText(feb16_1_secondary.this, "Please insert numbers!", Toast.LENGTH_SHORT).show();
            } else {
                int n1 = Integer.parseInt(first.getText().toString());
                int n2 = Integer.parseInt(second.getText().toString());

                int result = n1 + n2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}