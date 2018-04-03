package com.example.palmdigital.simplecalc_advanced;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewNum1;

    ImageView iv_plus;
    ImageView iv_minus;
    ImageView iv_multi;
    ImageView iv_divi;
    ImageView iv_expo;
    ImageView iv_square;
    ImageView iv_equals;

    int operation;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1 = findViewById(R.id.tv_1);

        ImageView iv_zero = findViewById(R.id.iv_zero);
        ImageView iv_one = findViewById(R.id.iv_one);
        ImageView iv_two = findViewById(R.id.iv_two);
        ImageView iv_three = findViewById(R.id.iv_three);
        ImageView iv_four = findViewById(R.id.iv_four);
        ImageView iv_five = findViewById(R.id.iv_five);
        ImageView iv_six = findViewById(R.id.iv_six);
        ImageView iv_seven = findViewById(R.id.iv_seven);
        ImageView iv_eight = findViewById(R.id.iv_eight);
        ImageView iv_nine = findViewById(R.id.iv_nine);

        iv_plus = findViewById(R.id.iv_plus);
        iv_minus = findViewById(R.id.iv_minus);
        iv_multi = findViewById(R.id.iv_multi);
        iv_divi = findViewById(R.id.iv_divi);
        iv_expo = findViewById(R.id.iv_expo);
        iv_square = findViewById(R.id.iv_square);
        iv_equals = findViewById(R.id.iv_equals);

        iv_zero.setOnClickListener(this);
        iv_one.setOnClickListener(this);
        iv_two.setOnClickListener(this);
        iv_three.setOnClickListener(this);
        iv_four.setOnClickListener(this);
        iv_five.setOnClickListener(this);
        iv_six.setOnClickListener(this);
        iv_seven.setOnClickListener(this);
        iv_eight.setOnClickListener(this);
        iv_nine.setOnClickListener(this);
        iv_equals.setOnClickListener(this);
        iv_plus.setOnClickListener(this);
        iv_minus.setOnClickListener(this);
        iv_multi.setOnClickListener(this);
        iv_divi.setOnClickListener(this);
        iv_expo.setOnClickListener(this);
        iv_square.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        String currNum1 = textViewNum1.getText().toString();
        if (currNum1.equals("0"))
        {
            currNum1 = "";
        }
        if (v.getId() == R.id.iv_one)
        {
            int temp = Integer.parseInt(currNum1 + "1");
            textViewNum1.setText(currNum1 + "1");
        }
        else if (v.getId() == R.id.iv_zero)
        {
            textViewNum1.setText("0");
        }
        else if (v.getId() == R.id.iv_two)
        {
            textViewNum1.setText("2");
        }
        else if (v.getId() == R.id.iv_three)
        {
            textViewNum1.setText("3");
        }
        else if (v.getId() == R.id.iv_four)
        {
            textViewNum1.setText("4");
        }
        else if (v.getId() == R.id.iv_five)
        {
            textViewNum1.setText("5");
        }
        else if (v.getId() == R.id.iv_six)
        {
            textViewNum1.setText("6");
        }
        else if (v.getId() == R.id.iv_seven)
        {
            textViewNum1.setText("7");
        }
        else if (v.getId() == R.id.iv_eight)
        {
            textViewNum1.setText("8");
        }
        else if (v.getId() == R.id.iv_nine)
        {
            textViewNum1.setText("9");
        }
        else if (v.getId() == R.id.iv_plus)
        {
            operation = '+';
        }
        else if (v.getId() == R.id.iv_minus)
        {
            operation = '-';
        }
        else if (v.getId() == R.id.iv_multi)
        {
            operation = '*';
        }
        else if (v.getId() == R.id.iv_divi)
        {
            operation = '/';
        }
        else if (v.getId() == R.id.iv_expo)
        {
            operation = '^';
        }
        else if (v.getId() == R.id.iv_square)
        {
            operation = '@';
        }

        else if (v.getId() == R.id.iv_equals)
        {
            if (operation == '+')
            {
                result = 1;
            }
            else if (operation == '-')
            {
                result = 2;
            }
            else if (operation == '*')
            {
                result = 3;
            }
            else if (operation == '/')
            {
                result = 4;
            }
            else if (operation == '^')
            {
                result = 5;
            }
            else if (operation == '@')
            {
                result = 6;
            }
            textViewNum1.setText("" + result);

        }
        if (operation == '+')
        {
            iv_plus.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multi.setBackgroundColor(Color.rgb(255,255,255));
            iv_divi.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '-')
        {
            iv_plus.setBackgroundColor(Color.rgb(255, 255, 255));
            iv_minus.setBackgroundColor(Color.rgb(7,76,188));
            iv_multi.setBackgroundColor(Color.rgb(255,255,255));
            iv_divi.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '*')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multi.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_divi.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '/')
        {

            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multi.setBackgroundColor(Color.rgb(255,255,255));
            iv_divi.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));

        }
        else if (operation == '^')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multi.setBackgroundColor(Color.rgb(255,255,255));
            iv_divi.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '@')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multi.setBackgroundColor(Color.rgb(255,255,255));
            iv_divi.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255, 255, 255));
            iv_square.setBackgroundColor(Color.rgb(7, 76, 188));
        }

    } // end of onClick
}
