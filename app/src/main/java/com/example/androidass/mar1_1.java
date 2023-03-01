package com.example.androidass;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mar1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar11);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        final ArrayList<Country> arrayList = new ArrayList<Country>();

        arrayList.add(new Country(R.drawable.india, "India", "New Delhi"));
        arrayList.add(new Country(R.drawable.canada, "Canada", "Ottawa"));
        arrayList.add(new Country(R.drawable.germany, "Germany", "Berlin"));
        arrayList.add(new Country(R.drawable.ireland, "Ireland", "Dublin"));
        arrayList.add(new Country(R.drawable.japan, "Japan", "Tokyo"));
        arrayList.add(new Country(R.drawable.nepal, "Nepal", "Kathmandu"));
        arrayList.add(new Country(R.drawable.newzeland, "New Zealand", "Wellington"));
        arrayList.add(new Country(R.drawable.poland, "Poland", "Warsaw"));
        arrayList.add(new Country(R.drawable.singapore, "Singapore", "Singapore City"));
        arrayList.add(new Country(R.drawable.southkorea, "South Korea", "Seoul"));
        arrayList.add(new Country(R.drawable.swedan, "Sweden", "Stockholm"));

        CountryViewAdapter countryArrayAdapter = new CountryViewAdapter(this, arrayList);

        ListView countryListView = findViewById(R.id.listView);

        countryListView.setAdapter(countryArrayAdapter);
    }
}