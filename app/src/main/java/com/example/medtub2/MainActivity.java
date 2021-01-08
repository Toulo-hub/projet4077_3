package com.example.medtub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.cardform);
        card2 = (CardView) findViewById(R.id.cardsms);
        card3 = (CardView) findViewById(R.id.cardcamera);
        card4 = (CardView) findViewById(R.id.cardson);
        card5 = (CardView) findViewById(R.id.cardgps);
        card6 = (CardView) findViewById(R.id.cardstat);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardform :
                i = new Intent(this,form.class);
                startActivity(i);
                break;

            case R.id.cardsms :
                i = new Intent(this,sms.class);
                startActivity(i);
                break;

            case R.id.cardcamera :
                i = new Intent(this,camera.class);
                startActivity(i);
                break;

            case R.id.cardson :
                i = new Intent(this,son.class);
                startActivity(i);
                break;

            case R.id.cardgps :
                i = new Intent(this,gps.class);
                startActivity(i);
                break;

            case R.id.cardstat :
                i = new Intent(this,stat.class);
                startActivity(i);
                break;
        }

    }
}