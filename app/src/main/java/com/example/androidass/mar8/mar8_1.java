package com.example.androidass.mar8;

import static android.Manifest.permission.CALL_PHONE;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.androidass.R;

import java.util.ArrayList;

public class mar8_1 extends AppCompatActivity {

    private static final int REQ_CODE = 200;

    int[] contactImage = {
            R.drawable.shrutika,
            R.drawable.harshada,
            R.drawable.rohan,
            R.drawable.sumit,
            R.drawable.geet,
            R.drawable.anant

    };

    String[] contactName = {
            "Shrutika Aher",
            "Harshada Deore",
            "Rohan Bhujbal",
            "Sumit Burhade",
            "Geet Ahire",
            "Anant Dubey"
    };

    String[] contactNumber = {
            "91742059940",
            "70447544779",
            "77210946094",
            "78937492801",
            "76669908202",
            "89836445510"
    };

    String[] contactQuirk = {
            "Oye! Wapas Kab Mil Rahi Hai?",
            "Ese Hi Milte Rehna!!",
            "Bhai",
            "Bhai",
            "Bhai",
            "NA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mar81);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        final ArrayList<Contacts> arrayList = new ArrayList<>();

        for (int i = 0; i < contactImage.length; i++) {
            arrayList.add(new Contacts(contactImage[i], contactName[i], contactNumber[i]));
        }

        ContactViewAdapter contactArrayAdapter = new ContactViewAdapter(this, arrayList);

        ListView contactListView = findViewById(R.id.listView);

        contactListView.setOnItemClickListener((parent, view, position, id) -> {

            if (checkPer()) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + contactNumber[position]));
                startActivity(i);
            } else {
                ActivityCompat.requestPermissions(mar8_1.this, new String[]{CALL_PHONE}, REQ_CODE);
            }

        });

        contactListView.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(mar8_1.this, contactQuirk[position], Toast.LENGTH_SHORT).show();
            return true;
        });

        contactListView.setAdapter(contactArrayAdapter);
    }

    // Asking for permissions and stuff
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQ_CODE) {
            if (grantResults.length == 1) {
                int callPerm = grantResults[0];

                boolean checkCall = callPerm == PackageManager.PERMISSION_GRANTED;

                if (checkCall) {
                    Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public boolean checkPer() {
        int result = ActivityCompat.checkSelfPermission(this, CALL_PHONE);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}