package com.example.palmdigital.simplecalc_v02;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int operation;
    int result;

    TextView ImageView_equals2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display = findViewById(R.id.tv_input);

        textViewNum2Display = findViewById(R.id.tv_input2);

        textViewOutput = findViewById(R.id.tv_output);

        ImageView imageView1 = findViewById(R.id.imageView1);

        ImageView imageView2 = findViewById(R.id.imageView2);

        ImageView imageView3 = findViewById(R.id.imageView3);

        ImageView imageView4 = findViewById(R.id.imageView4);

        ImageView imageView5 = findViewById(R.id.imageView5);

        ImageView imageView6 = findViewById(R.id.imageView6);

        ImageView imageViewEquals = findViewById(R.id.ImageView_equals);

        ImageView imageViewSubtrct = findViewById(R.id.subtract);

        ImageView imageViewPlus = findViewById(R.id.plus);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
        imageViewSubtrct.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
    } // end of onCreate()

    public void onClick(View v) {
        if (v.getId() == R.id.imageView1) {
            textViewNum1Display.setText("1");
            num1 = 1;
        } else if (v.getId() == R.id.imageView2) {
            textViewNum1Display.setText("2");
            num1 = 2;
        } else if (v.getId() == R.id.imageView3) {
            textViewNum1Display.setText("3");
            num1 = 3;
        } else if (v.getId() == R.id.imageView4) {
            textViewNum2Display.setText("4");
            num2 = 4;
        } else if (v.getId() == R.id.imageView5) {
            textViewNum2Display.setText("5");
            num2 = 5;
        } else if (v.getId() == R.id.imageView6) {
            textViewNum2Display.setText("6");
            num2 = 6;
        } else if (v.getId() == R.id.plus) {
            operation = '+';
        } else if (v.getId() == R.id.subtract) {
            operation = '-';
        } else if (v.getId() == R.id.ImageView_equals) {
            if (operation == '+')
            {
                result = num1 + num2;
            }
            else if (operation == '-')
            {
                result = num1 - num2;
            }
            textViewOutput.setText("" + result);
        }
    } // end of onClick()
} // end of Class

