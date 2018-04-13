package com.example.palmdigital.madlibes_pizza_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.b_MS);
        button.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        EditText et_adj1    = findViewById(R.id.et_adjective_01);
        String adjStr       = et_adj1.getText().toString();

        EditText et_nat     = findViewById(R.id.et_nationality);
        String natStr       = et_nat.getText().toString();

        EditText et_Name    = findViewById(R.id.et_Name);
        String nameStr      = et_Name.getText().toString();

        EditText et_Noun    = findViewById(R.id.et_Noun1);
        String nounStr      = et_Noun.getText().toString();


        String story = "Pizza was invented by a ";
        story = story + adjStr;
        story = story + " " + natStr;
        story = story + " chef named " + nameStr + ".";
        story = story + " To make a pizza, you need to take a lump of " + nounStr;

        TextView output = findViewById(R.id.tv_Story);
        output.setText(story);
    }
}
