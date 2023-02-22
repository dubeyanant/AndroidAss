package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

    TextView studentName;

    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb221);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);


        l1 = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(feb22_1.this, R.layout.row_item, studentNames);

        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(feb22_1.this, "This is " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}