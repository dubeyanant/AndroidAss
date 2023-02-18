package com.example.androidass;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class feb16_1 extends AppCompatActivity {

    Button feb16Button;
    TextView feb16TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb161);

        feb16Button = (Button) findViewById(R.id.feb16Button);
        feb16TextView = (TextView) findViewById(R.id.feb16TextView);

        feb16Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feb16_1.this, feb16_1_secondary.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1) {
            if(resultCode == RESULT_OK) {
                int result = data.getIntExtra("result", 0);
                feb16TextView.setText("Addition is " + result);
            }
        }
    }
}