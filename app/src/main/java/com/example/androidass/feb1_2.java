package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class feb1_2 extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    TextView txt;
    Button b1, b2;
    int animalPics[] = {R.drawable.cats, R.drawable.doggo, R.drawable.lamba, R.drawable.monki, R.drawable.panda, R.drawable.rabbit, R.drawable.sheep};
    String animalNames[] = {"Cat", "Dog", "Lamba", "Monkey", "Panda", "Rabbit", "Sheep"};
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feb12);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        txt = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.prev);
        b2 = (Button) findViewById(R.id.next);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });

        imageSwitcher.setImageResource(animalPics[0]);
        txt.setText(animalNames[0]);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) i = animalPics.length - 1;
                else i--;
                imageSwitcher.setImageResource(animalPics[i]);
                txt.setText(animalNames[i]);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == animalPics.length - 1) i = 0;
                else i++;
                imageSwitcher.setImageResource(animalPics[i]);
                txt.setText(animalNames[i]);
            }
        });
    }
}