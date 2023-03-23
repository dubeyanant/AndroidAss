package com.example.androidass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mar23_1 extends AppCompatActivity {

    List<String> sports;
    List<String> countries;
    Map<String, List<String>> sportsCountriesCollection;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar231);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        sports = new ArrayList<>();
        createSportsList();
        createCollection();
        expandableListView = findViewById(R.id.expandableListView);
        expandableListAdapter = new MyExpandableListAdapter(this, sports, sportsCountriesCollection);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int lastExpandedPosition = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition != -1 && groupPosition != lastExpandedPosition) {
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String selected = expandableListAdapter.getChild(groupPosition, childPosition).toString();
                return true;
            }
        });
    }

    private void createCollection() {
        String[] hockeyCountries = {"1. Australia", "2. Belgium", "3. India"};
        String[] volleyballCountries = {"1. Argentina", "2. Brazil", "3. France"};
        String[] triathlonCountries = {"1. Bermuda", "2. Britain", "3. United States"};
        String[] badmintonCountries = {"1. China", "2. Chinese Taipei", "3. India"};
        String[] shootingCountries = {"1. Iran", "2. Serbia", "3. China"};

        sportsCountriesCollection = new HashMap<String, List<String>>();
        for (String group : sports) {
            if (group.equals("Hockey")) {
                loadChild(hockeyCountries);
            } else if (group.equals("Volleyball")) {
                loadChild(volleyballCountries);
            } else if (group.equals("Triathlon")) {
                loadChild(triathlonCountries);
            } else if (group.equals("Badminton")) {
                loadChild(badmintonCountries);
            } else {
                loadChild(shootingCountries);
            }
            sportsCountriesCollection.put(group, countries);
        }
    }

    private void loadChild(String[] sportsCountries) {
        countries = new ArrayList<>();
        for (String country : sportsCountries) {
            countries.add(country);
        }
    }

    private void createSportsList() {
        sports = new ArrayList<>();
        sports.add("Hockey");
        sports.add("Volleyball");
        sports.add("Triathlon");
        sports.add("Badminton");
        sports.add("Shooting");
    }
}