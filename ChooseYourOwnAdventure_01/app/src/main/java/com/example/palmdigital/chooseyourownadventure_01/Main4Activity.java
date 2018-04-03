package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    Button sButton;
    Button fButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        sButton = findViewById(R.id.sButton);
        fButton = findViewById(R.id.fButton);

        sButton.setOnClickListener(this);
        fButton.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.sButton)
        {
            Intent g = new Intent(this, MainActivity.class);
            startActivity(g);
        }
        else if (v.getId() == R.id.fButton)
        {
            Intent h = new Intent(this, Main7Activity.class);
            startActivity(h);
        }
    }
}
