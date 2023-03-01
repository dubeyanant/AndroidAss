package com.example.androidass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.at1);

        ArrayAdapter<String> adapter = new ArrayAdapter(mar1_2.this, android.R.layout.simple_list_item_1, std_name);
        auto.setAdapter(adapter);

        auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(mar1_2.this, "Happy " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}