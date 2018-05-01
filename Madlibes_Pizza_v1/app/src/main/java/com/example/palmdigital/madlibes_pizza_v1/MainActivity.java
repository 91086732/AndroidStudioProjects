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
        EditText et_adj1        = findViewById(R.id.et_adjective_01);
        String adjStr           = et_adj1.getText().toString();

        EditText et_nat         = findViewById(R.id.et_nationality);
        String natStr           = et_nat.getText().toString();

        EditText et_Name        = findViewById(R.id.et_Name);
        String nameStr          = et_Name.getText().toString();

        EditText et_Noun        = findViewById(R.id.et_Noun1);
        String nounStr          = et_Noun.getText().toString();

        EditText et_adj2        = findViewById(R.id.et_adjective_02);
        String adjStr2          = et_adj2.getText().toString();

        EditText et_Noun2       = findViewById(R.id.et_Noun2);
        String nounStr2         = et_Noun2.getText().toString();

        EditText et_adj3        = findViewById(R.id.et_adjective_03);
        String adjStr3          = et_adj3.getText().toString();

        EditText et_adj4        = findViewById(R.id.et_adjective_04);
        String adjStr4          = et_adj4.getText().toString();

        EditText et_PN          = findViewById(R.id.et_Plural_Noun);
        String PN_Str           = et_PN.getText().toString();

        EditText et_Noun3       = findViewById(R.id.et_Noun3);
        String nounStr3         = et_Noun3.getText().toString();

        EditText et_Number      = findViewById(R.id.et_number);
        String numberStr        = et_Number.getText().toString();

        EditText et_Shape       = findViewById(R.id.et_shape);
        String shapeStr         = et_Shape.getText().toString();

        EditText et_Food        = findViewById(R.id.et_food);
        String foodStr          = et_Food.getText().toString();

        EditText et_Food2       = findViewById(R.id.et_food_02);
        String foodStr2         = et_Food2.getText().toString();

        EditText et_Number2     = findViewById(R.id.et_number_02);
        String numberStr2       = et_Number2.getText().toString();


        String story;
        story = "Pizza was invented by a " + adjStr + " " + natStr + " chef named " + nameStr + "."
                + " To make a pizza, you need to take a lump of " + nounStr
                + " and make a thin, round " + adjStr2 + " " + nounStr2 + "."
                + " Then you cover it with " + adjStr3 + " sauce, " + adjStr4
                + " cheese, and fresh chopped " + PN_Str + "." + " Next you have to bake it in a vary hot "
                + nounStr3 + "." + " When it is done, cut it into " + numberStr + " " + shapeStr + "." +
                " Some kids like " + foodStr + " pizza the best, but my favorite is the " + foodStr2 + " pizza."
                + " If I could, I would eat pizza " + numberStr2 + " times a day!";

        TextView output = findViewById(R.id.tv_Story);
        output.setText(story);
    }
}