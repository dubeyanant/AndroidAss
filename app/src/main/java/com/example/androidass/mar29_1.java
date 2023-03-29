package com.example.androidass;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mar29_1 extends AppCompatActivity {

    int[] countryImage = {
            R.drawable.india,
            R.drawable.germany,
            R.drawable.ireland,
            R.drawable.nepal,
            R.drawable.japan,
            R.drawable.newzealand,
            R.drawable.poland,
            R.drawable.southkorea
    };

    String[] capitalName = {
            "Country: India\nCapital: New Delhi",
            "Country: Germany\nCapital: Berlin",
            "Country: Ireland\nCapital: Dublin",
            "Country: Nepal\nCapital: Kathmandu",
            "Country: Japan\nCapital: Tokyo",
            "Country: New Zealand\nCapital: Wellington",
            "Country: Poland\nCapital: Warsaw",
            "Country: South Korea\nCapital: Seoul"
    };

    String[] presidentName = {
            "Droupadi Murmu",
            "Frank-Walter Steinmeier",
            "Michael D. Higgins",
            "Ram Chandra Poudel",
            "Fumio Kishida",
            "Jacinda Ardern",
            "Andrzej Duda",
            "Yoon Suk Yeol"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar291);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        final ArrayList<Flags> arrayList = new ArrayList<Flags>();

        for (int j : countryImage) {
            arrayList.add(new Flags(j));
        }

        FlagViewAdapter flagViewAdapter = new FlagViewAdapter(this, arrayList);

        ListView flagListView = findViewById(R.id.listView);
        registerForContextMenu(flagListView);
        flagListView.setAdapter(flagViewAdapter);
    }

    public String getName() {
        Intent intent = getIntent();
        return intent.getStringExtra("Name");
    }

    public String getPRN() {
        Intent intent = getIntent();
        return intent.getStringExtra("PRN");
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_list, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.capitalName:
                Intent intent = new Intent(mar29_1.this, factorial.class);
                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
                int index = info.position;
                intent.putExtra("result", capitalName[index]);
                intent.putExtra("Name", getName());
                intent.putExtra("PRN", getPRN());
                startActivity(intent);
                return true;

            case R.id.presidentName:
                Intent intent2 = new Intent(mar29_1.this, factorial.class);
                AdapterView.AdapterContextMenuInfo info2 = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
                int index2 = info2.position;
                intent2.putExtra("result", presidentName[index2]);
                intent2.putExtra("Name", getName());
                intent2.putExtra("PRN", getPRN());
                startActivity(intent2);
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}