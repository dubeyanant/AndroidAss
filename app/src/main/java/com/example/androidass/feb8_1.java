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

import java.util.ArrayList;
import java.util.List;

public class feb8_1 extends AppCompatActivity {

    Button feb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb81);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        feb8 = (Button) findViewById(R.id.feb8);

        feb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an alert builder
                AlertDialog.Builder builder = new AlertDialog.Builder(feb8_1.this);
                builder.setTitle("Enter value:");

                // set the custom layout
                final View customLayout = getLayoutInflater().inflate(R.layout.custom_layout, null);
                builder.setView(customLayout);

                // add a button
                builder.setPositiveButton("Factorial", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText editText = customLayout.findViewById(R.id.editText);
                        String data = editText.getText().toString();
                        int n = Integer.parseInt(data);

                        Intent intent = new Intent(v.getContext(), factorial.class);
                        intent.putExtra("result", "Factorial of " + n + " is " + factorial(n));
                        intent.putExtra("Name", Name);
                        intent.putExtra("PRN", PRN);
                        startActivity(intent);
                    }
                });

                builder.setNegativeButton("Fibonacci", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText editText = customLayout.findViewById(R.id.editText);
                        String data = editText.getText().toString();
                        int n = Integer.parseInt(data);

                        Intent intent = new Intent(v.getContext(), fibonacci.class);
                        intent.putExtra("result", "Fibonacci series till " + n + " is:\n" + fibonacci(n));
                        intent.putExtra("Name", Name);
                        intent.putExtra("PRN", PRN);
                        startActivity(intent);
                    }
                });

                // create and show
                // the alert dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    private int factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }

    private List<Integer> fibonacci(int n) {
        ArrayList<Integer> series = new ArrayList<Integer>();
        series.add(0);
        series.add(1);

        int a = 0, b = 1, c = 0;

        while (true) {
            if ((a + b) >= n) {
                return series;
            } else {
                c = a + b;
                a = b;
                b = c;
                series.add(c);
            }
        }
    }
}