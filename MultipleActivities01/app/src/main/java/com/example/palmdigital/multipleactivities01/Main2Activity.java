package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonBack = findViewById(R.id.button_Back);
        buttonBack.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if(v.getId() == R.id.button_Back)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}

