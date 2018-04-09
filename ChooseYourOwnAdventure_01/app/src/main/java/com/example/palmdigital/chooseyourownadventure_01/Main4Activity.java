package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    Button sButton;
    Button fButton;
    Button BButton;
    MediaPlayer scream;
    MediaPlayer faint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        sButton = findViewById(R.id.sButton);
        fButton = findViewById(R.id.fButton);
        BButton = findViewById(R.id.b_Back2);
        scream = MediaPlayer.create(Main4Activity.this, R.raw.scream);
        faint = MediaPlayer.create(Main4Activity.this, R.raw.faint);

        sButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        BButton.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.sButton)
        {
            Intent g = new Intent(this, MainActivity.class);
            startActivity(g);
            scream.start();
        }
        else if (v.getId() == R.id.fButton)
        {
            Intent h = new Intent(this, Main7Activity.class);
            startActivity(h);
            faint.start();
        }
        else if (v.getId() == R.id.b_Back2)
        {
            Intent back1 = new Intent(this, Main3Activity.class );
            startActivity(back1);
        }
    }
}
