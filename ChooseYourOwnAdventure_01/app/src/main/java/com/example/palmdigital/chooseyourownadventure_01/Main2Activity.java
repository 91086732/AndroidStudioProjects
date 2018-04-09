package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button rButton;
    MediaPlayer sight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rButton = findViewById(R.id.rButton);
        rButton.setOnClickListener(this);
        sight = MediaPlayer.create(Main2Activity.this, R.raw.sigh);
        sight.start();
    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.rButton)
        {
            Intent r = new Intent(this, MainActivity.class);
            startActivity(r);

        }
    }
}
