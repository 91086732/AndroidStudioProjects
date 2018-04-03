package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener{

    Button rButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        rButton = findViewById(R.id.rButton);
        rButton.setOnClickListener(this);
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
