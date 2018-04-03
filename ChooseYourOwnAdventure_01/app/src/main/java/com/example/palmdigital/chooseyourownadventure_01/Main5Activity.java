package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{

    Button yButton;
    Button hButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        yButton = findViewById(R.id.yButton);
        hButton = findViewById(R.id.hButton);

        yButton.setOnClickListener(this);
        hButton.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.yButton)
        {
            Intent e = new Intent(this, Main6Activity.class);
            startActivity(e);
        }
        else if (v.getId() == R.id.hButton)
        {
            Intent f = new Intent(this, Main6Activity.class);
            startActivity(f);
        }
    }
}
