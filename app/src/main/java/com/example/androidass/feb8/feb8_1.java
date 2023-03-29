package com.example.androidass.feb8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

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
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        feb8 = (Button) findViewById(R.id.feb8);

        feb8.setOnClickListener(v -> {
            // Create an alert builder
            AlertDialog.Builder builder = new AlertDialog.Builder(feb8_1.this);
            builder.setTitle("Enter value:");

            // set the custom layout
            final View customLayout = getLayoutInflater().inflate(R.layout.custom_layout, null);
            builder.setView(customLayout);

            // add a button
            builder.setPositiveButton("Factorial", (dialog, which) -> {
                EditText editText = customLayout.findViewById(R.id.editText);
                String data = editText.getText().toString();
                int n = Integer.parseInt(data);

                Intent intent1 = new Intent(v.getContext(), factorial.class);
                intent1.putExtra("result", "Factorial of " + n + " is " + factorial(n));
                intent1.putExtra("Name", Name);
                intent1.putExtra("PRN", PRN);
                startActivity(intent1);
            });

            builder.setNegativeButton("Fibonacci", (dialog, which) -> {
                EditText editText = customLayout.findViewById(R.id.editText);
                String data = editText.getText().toString();
                int n = Integer.parseInt(data);

                Intent intent1 = new Intent(v.getContext(), fibonacci.class);
                intent1.putExtra("result", "Fibonacci series till " + n + " is:\n" + fibonacci(n));
                intent1.putExtra("Name", Name);
                intent1.putExtra("PRN", PRN);
                startActivity(intent1);
            });

            // create and show
            // the alert dialog
            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }

    private int factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }

    private List<Integer> fibonacci(int n) {
        ArrayList<Integer> series = new ArrayList<>();
        series.add(0);
        series.add(1);

        int a = 0, b = 1, c;

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