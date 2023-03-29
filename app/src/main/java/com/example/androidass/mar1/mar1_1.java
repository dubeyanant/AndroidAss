package com.example.androidass.mar1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

import java.util.ArrayList;

public class mar1_1 extends AppCompatActivity {

    int[] countryImage = {
            R.drawable.vct_country_india,
            R.drawable.vct_country_sweden,
            R.drawable.vct_country_canada,
            R.drawable.vct_country_germany,
            R.drawable.vct_country_ireland,
            R.drawable.vct_country_japan,
            R.drawable.vct_country_nepal,
            R.drawable.vct_country_newzealand,
            R.drawable.vct_country_poland,
            R.drawable.vct_country_singapore,
            R.drawable.vct_country_southkorea
    };

    String[] countryName = {
            "India",
            "Sweden",
            "Canada",
            "Germany",
            "Ireland",
            "Japan",
            "Nepal",
            "New Zealand",
            "Poland",
            "Singapore",
            "South Korea"
    };

    String[] capitalName = {
            "New Delhi",
            "Stockholm",
            "Ottawa",
            "Berlin",
            "Dublin",
            "Tokyo",
            "Kathmandu",
            "Wellington",
            "Warsaw",
            "Singapore City",
            "Seoul"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar11);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        final ArrayList<Country> arrayList = new ArrayList<>();

        for (int i = 0; i < countryImage.length; i++) {
            arrayList.add(new Country(countryImage[i], countryName[i], capitalName[i]));
        }

        CountryViewAdapter countryArrayAdapter = new CountryViewAdapter(this, arrayList);

        ListView countryListView = findViewById(R.id.listView);

        countryListView.setAdapter(countryArrayAdapter);
    }
}