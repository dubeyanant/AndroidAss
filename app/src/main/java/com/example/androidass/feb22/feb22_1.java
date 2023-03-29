package com.example.androidass.feb22;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class feb22_1 extends AppCompatActivity {

    String[] studentNames = {
            "Rahul Gupta",
            "Abhishek Dubey",
            "Tanya Chaudhary",
            "Priyanka Daga",
            "Rohit Rathi",
            "Gayatri Kothari",
            "Manoj Rajput",
            "Karan Singh",
            "Niharika Modi",
            "Isha Patel",
            "Abhinav Kanani",
            "Raghav Bindra"
    };

    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb221);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        l1 = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(feb22_1.this, R.layout.row_item, studentNames);

        l1.setAdapter(adapter);

        l1.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(feb22_1.this, "This is " + adapter.getItem(position), Toast.LENGTH_SHORT).show());
    }
}