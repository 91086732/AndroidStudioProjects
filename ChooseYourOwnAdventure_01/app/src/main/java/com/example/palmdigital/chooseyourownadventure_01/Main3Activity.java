package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    Button bButton;
    Button tButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bButton = findViewById(R.id.bButton);
        tButton = findViewById(R.id.tButton);

        bButton.setOnClickListener(this);
        tButton.setOnClickListener(this);
    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.bButton)
        {
            Intent c = new Intent(this, Main4Activity.class);
            startActivity(c);
        }
        else if (v.getId() == R.id.tButton)
        {
            Intent d = new Intent(this, Main5Activity.class);
            startActivity(d);
        }
    }
}
