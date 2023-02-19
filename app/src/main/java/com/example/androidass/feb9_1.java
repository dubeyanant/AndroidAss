package com.example.androidass;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class feb9_1 extends AppCompatActivity {

    EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb91);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        n1 = (EditText) findViewById(R.id.firstNumber);
        n2 = (EditText) findViewById(R.id.secondNumber);

        Button[] buttons = new Button[]{
                findViewById(R.id.add),
                findViewById(R.id.subtract),
                findViewById(R.id.multiply),
                findViewById(R.id.divide)};

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;

            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (n1.getText().toString().equals("") || n2.getText().toString().equals("")) {
                        Toast.makeText(feb9_1.this, "Please enter numbers!", Toast.LENGTH_SHORT).show();
                    } else {
                        float result = 0;

                        switch (index) {
                            case 0:
                                result = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                                break;

                            case 1:
                                result = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                                break;

                            case 2:
                                result = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                                break;

                            case 3:
                                result = Float.parseFloat(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
                                break;
                        }

                        AlertDialog.Builder builder = new AlertDialog.Builder(feb9_1.this);

                        final View customLayout = getLayoutInflater().inflate(R.layout.custom_text_layout, null);
                        builder.setView(customLayout);

                        TextView tv = customLayout.findViewById(R.id.customTextView);
                        tv.setText("Result is " + result);

                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });

                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                }
            });
        }
    }
}