package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    Button bButton;
    Button tButton;
    Button BButton;
    MediaPlayer back;
    MediaPlayer toilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bButton = findViewById(R.id.bButton);
        tButton = findViewById(R.id.tButton);
        BButton = findViewById(R.id.b_Back1);

        back = MediaPlayer.create(Main3Activity.this, R.raw.backyard);
        toilet = MediaPlayer.create(Main3Activity.this, R.raw.toilet);

        bButton.setOnClickListener(this);
        tButton.setOnClickListener(this);
        BButton.setOnClickListener(this);
    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.bButton)
        {
            Intent c = new Intent(this, Main4Activity.class);
            startActivity(c);
            back.start();
        }
        else if (v.getId() == R.id.tButton)
        {
            Intent d = new Intent(this, Main5Activity.class);
            startActivity(d);
            toilet.start();
        }
        else if (v.getId() == R.id.b_Back1)
        {
            Intent back = new Intent(this, MainActivity.class );
            startActivity(back);
        }
    }
}
