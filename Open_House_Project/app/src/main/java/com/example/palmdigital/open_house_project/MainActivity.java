package com.example.palmdigital.open_house_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button M_button;
    Button B_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M_button = findViewById(R.id.M_button);
        B_button = findViewById(R.id.B_button);

        M_button.setOnClickListener(this);
        B_button.setOnClickListener(this);
    }

    public void onClick (View v) {
        if(v.getId() == R.id.M_button)
        {
            Intent a = new Intent(this, Main2Activity.class);
            startActivity(a);

        }


    }
}
