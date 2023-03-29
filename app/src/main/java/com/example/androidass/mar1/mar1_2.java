package com.example.androidass.mar1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class mar1_2 extends AppCompatActivity {

    String[] std_name = {
            "Vineet",
            "Atharva",
            "Suyash",
            "Sumedh",
            "Vinod",
            "Paresh",
            "Anant",
            "Kakshil",
            "Uday",
            "Harsh",
            "Disha",
            "Shubham",
            "Dhanno",
            "Sahil",
            "Sukanya",
            "Geet",
            "Sri",
            "Sanika",
            "Mayur",
            "Vedang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar12);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.at1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(mar1_2.this, android.R.layout.simple_list_item_1, std_name);
        auto.setAdapter(adapter);

        auto.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(mar1_2.this, "Happy " + adapter.getItem(i), Toast.LENGTH_SHORT).show());
    }
}