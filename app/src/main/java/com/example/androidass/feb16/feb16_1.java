package com.example.androidass.feb16;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class feb16_1 extends AppCompatActivity {

    Button feb16Button;
    TextView feb16TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb161);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        feb16Button = (Button) findViewById(R.id.feb16Button);
        feb16TextView = (TextView) findViewById(R.id.feb16TextView);

        feb16Button.setOnClickListener(v -> {
            Intent intent1 = new Intent(feb16_1.this, feb16_1_secondary.class);
            intent1.putExtra("Name", Name);
            intent1.putExtra("PRN", PRN);
            startActivityForResult(intent1, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                assert data != null;
                int result = data.getIntExtra("result", 0);
                feb16TextView.setText(String.format("%s %s", getString(R.string.addition_is), result));
            }
        }
    }
}