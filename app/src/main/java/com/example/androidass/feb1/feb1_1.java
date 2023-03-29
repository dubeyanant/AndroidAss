package com.example.androidass.feb1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class feb1_1 extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb11);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        txt = (TextView) findViewById(R.id.txt);
    }

    public void showAlertDialogButtonClicked(View view) {

        // Create an alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter value of n:");

        // set the custom layout
        final View customLayout = getLayoutInflater().inflate(R.layout.custom_layout, null);
        builder.setView(customLayout);

        // add a button
        builder.setPositiveButton("Done", (dialog, which) -> {

            // send data from the
            // AlertDialog to the Activity
            EditText editText = customLayout.findViewById(R.id.editText);
            sendDialogDataToActivity(editText.getText().toString());
        });

        // create and show
        // the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // Do something with the data
    // coming from the AlertDialog
    private void sendDialogDataToActivity(String data) {
        int n = Integer.parseInt(data); // Converting string data to int n
        StringBuilder temp = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                temp.append(i).append(" ");
            }
        }

        txt.setText(temp.toString());
    }
}