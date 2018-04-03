package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button wButton;
    Button eButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wButton = findViewById(R.id.wButton);
        eButton = findViewById(R.id.eButton);

        wButton.setOnClickListener(this);
        eButton.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if (v.getId() == R.id.wButton)
        {
            Intent a = new Intent(this, Main2Activity.class);
            startActivity(a);
        }
        else if (v.getId() == R.id.eButton)
        {
            Intent b = new Intent(this, Main3Activity.class);
            startActivity(b);
        }
    }
}
