package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSwitch = findViewById(R.id.button_Switch);
        bSwitch.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        if(v.getId() == R.id.button_Switch)
        {
            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }
    }
}
