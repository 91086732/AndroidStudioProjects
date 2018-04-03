package com.example.palmdigital.simplecalc_v03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewNum1;
    TextView textViewNum2;
    TextView textViewNumOutput;
    // TextViews
    ImageView iv_plus;
    ImageView iv_minus;
    ImageView iv_multiply;
    ImageView iv_divide;
    ImageView iv_expo;
    ImageView iv_clear;
    ImageView iv_neagtion;
    ImageView iv_square;
    // ImageViews
    double result;
    // Doubles
    int num1;
    int num2;
    int operation;
    // Integers





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1 = findViewById(R.id.tv_input);
        textViewNum2 = findViewById(R.id.textViewNum3);
        textViewNumOutput = findViewById(R.id. tv_output);
        // TextViews
        /*
         *
         *
         *
         */
        ImageView imageView_zero = findViewById(R.id.zero);
        ImageView imageView_zero2 = findViewById(R.id.zero2);
        ImageView imageView_1 = findViewById(R.id.imageView1);
        ImageView imageView_2 = findViewById(R.id.imageView2);
        ImageView imageView_3 = findViewById(R.id.imageView3);
        ImageView imageView_4 = findViewById(R.id.imageView4);
        ImageView imageView_5 = findViewById(R.id.imageView5);
        ImageView imageView_6 = findViewById(R.id.imageView6);
        ImageView imageView_7 = findViewById(R.id.imageView7);
        ImageView imageView_8 = findViewById(R.id.imageView8);
        ImageView imageView_9 = findViewById(R.id.imageView9);
        ImageView imageView_16 = findViewById(R.id.imageView16);
        ImageView imageView_17 = findViewById(R.id.imageView17);
        ImageView imageView_18 = findViewById(R.id.imageView18);
        ImageView imageView_19 = findViewById(R.id.imageView19);
        ImageView imageView_20 = findViewById(R.id.imageView20);
        ImageView imageView_21 = findViewById(R.id.imageView21);
        ImageView imageView_22 = findViewById(R.id.imageView22);
        ImageView imageView_23 = findViewById(R.id.imageView23);
        ImageView imageView_24 = findViewById(R.id.imageView24);
        // ImageView
        /*
         *
         *
         *
         */
        iv_clear = findViewById(R.id.clear);
        iv_plus = findViewById(R.id.plus);
        iv_minus = findViewById(R.id. minus);
        iv_multiply = findViewById(R.id.multiply);
        iv_divide = findViewById(R.id.divide);
        iv_expo = findViewById(R.id.expo);
        iv_neagtion = findViewById(R.id.negation);
        iv_square = findViewById(R.id.square_rt);
        ImageView imageView_equals = findViewById(R.id.equals);
        // Signs
        /*
         *
         *
         *
         */
        imageView_zero.setOnClickListener(this);
        imageView_zero2.setOnClickListener(this);
        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_7.setOnClickListener(this);
        imageView_8.setOnClickListener(this);
        imageView_9.setOnClickListener(this);
        imageView_16.setOnClickListener(this);
        imageView_17.setOnClickListener(this);
        imageView_18.setOnClickListener(this);
        imageView_19.setOnClickListener(this);
        imageView_20.setOnClickListener(this);
        imageView_21.setOnClickListener(this);
        imageView_22.setOnClickListener(this);
        imageView_23.setOnClickListener(this);
        imageView_24.setOnClickListener(this);
        iv_plus.setOnClickListener(this);
        iv_minus.setOnClickListener(this);
        iv_multiply.setOnClickListener(this);
        iv_divide.setOnClickListener(this);
        iv_expo.setOnClickListener(this);
        iv_clear.setOnClickListener(this);
        iv_neagtion.setOnClickListener(this);
        iv_square.setOnClickListener(this);
        imageView_equals.setOnClickListener(this);
        // OnClick Listeners
        /*
         *
         *
         *
         */

        iv_plus.setBackgroundColor(Color.rgb(7, 76, 188));
    } // end of onCreate
    /*
     *
     *
     *
     */
    // Start of num1's
    public void onClick (View v)
    {
        String currNum1Val = textViewNum1.getText().toString();
        String currNum2Val = textViewNum2.getText().toString();
        if (currNum1Val.equals("0"))
        {
            currNum1Val = "";
        }
        if (currNum2Val.equals("0"))
        {
            currNum2Val = "";
        }
        //Log.i("info", "Current value of top textview is: " + currNUm1Val);
        if (v.getId() == R.id.imageView1)
        {
            textViewNum1.setText(currNum1Val + "1");
            int temp = Integer.parseInt(currNum1Val + "1");
            num1 = temp;
        }
        else if (v.getId() == R.id.zero)
        {
            textViewNum1.setText(currNum1Val + "0");
            int temp = Integer.parseInt(currNum1Val + "0");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView2)
        {
            textViewNum1.setText(currNum1Val + "2");
            int temp = Integer.parseInt(currNum1Val + "2");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView3)
        {
            textViewNum1.setText(currNum1Val + "3");
            int temp = Integer.parseInt(currNum1Val + "3");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView4)
        {
            textViewNum1.setText(currNum1Val + "4");
            int temp = Integer.parseInt(currNum1Val + "4");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView5)
        {
            textViewNum1.setText(currNum1Val + "5");
            int temp = Integer.parseInt(currNum1Val + "5");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView6)
        {
            textViewNum1.setText(currNum1Val + "6");
            int temp = Integer.parseInt(currNum1Val + "6");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView7)
        {
            textViewNum1.setText(currNum1Val + "7");
            int temp = Integer.parseInt(currNum1Val + "7");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView8)
        {
            textViewNum1.setText(currNum1Val + "8");
            int temp = Integer.parseInt(currNum1Val + "8");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView9)
        {
            textViewNum1.setText(currNum1Val + "9");
            int temp = Integer.parseInt(currNum1Val + "9");
            num1 = temp;
        }
        /*
         *
         *
         *
         *
         *
         */
        // Start of num2's
        else if (v.getId() == R.id.zero2)
        {
            textViewNum2.setText(currNum2Val + "0");
            int temp = Integer.parseInt(currNum2Val + "0");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView16)
        {
            textViewNum2.setText(currNum2Val + "1");
            int temp = Integer.parseInt(currNum2Val + "1");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView17)
        {
            textViewNum2.setText(currNum2Val + "2");
            int temp = Integer.parseInt(currNum2Val + "2");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView18)
        {
            textViewNum2.setText(currNum2Val + "3");
            int temp = Integer.parseInt(currNum2Val + "3");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView19)
        {
            textViewNum2.setText(currNum2Val + "4");
            int temp = Integer.parseInt(currNum2Val + "3");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView20)
        {
            textViewNum2.setText(currNum2Val + "5");
            int temp = Integer.parseInt(currNum2Val + "5");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView21)
        {
            textViewNum2.setText(currNum2Val + "6");
            int temp = Integer.parseInt(currNum2Val + "6");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView22)
        {
            textViewNum2.setText(currNum2Val + "7");
            int temp = Integer.parseInt(currNum2Val + "7");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView23)
        {
            textViewNum2.setText(currNum2Val + "8");
            int temp = Integer.parseInt(currNum2Val + "8");
            num2 = temp;
        }
        else if (v.getId() == R.id.imageView24)
        {
            textViewNum2.setText(currNum2Val + "9");
            int temp = Integer.parseInt(currNum2Val + "9");
            num2 = temp;
        }
        else if (v.getId() == R.id.plus)
        {
            operation = '+';
        }
        else if (v.getId() == R.id.minus)
        {
            operation = '-';
        }
        else if (v.getId() == R.id.multiply)
        {
            operation = '*';
        }
        else if (v.getId() == R.id.divide)
        {
            operation = '/';
        }
        else if (v.getId() == R.id.expo)
        {
            operation = '^';
        }
        else if (v.getId() == R.id.square_rt)
        {
            operation = '@';
        }
        // Start of equals
        /*
         *
         *
         *
         */
        else if (v.getId() == R.id.equals)
        {
            if (operation == '/' && num2 == 0)
            {
                Toast.makeText(this, "You can't dived by zero!!", Toast.LENGTH_SHORT).show();
            }
            else if (operation == '+')
            {
                result = num1 + num2;
            }
            else if (operation == '-')
            {
                result = num1 - num2;
            }
            else if (operation == '*')
            {
                result = num1 * num2;
            }
            else if (operation == '/')
            {
                result = (double) num1 / num2;
            }
            else if (operation == '^')
            {
                result = pow(num1, num2);
            }
            else if (operation == '@')
            {
                result = Math.sqrt(num1);
            }

            textViewNumOutput.setText("" + result);
        }
        // Start of negation
        /*
         *
         *
         *
         */
        if (v.getId() == R.id.negation)
        {
            result = result * -1;
        }
        else
        {
            result = result * 1;
        }
        textViewNumOutput.setText("" + result);
        // Start of clear
        /*
         *
         *
         *
         */
        if (v.getId() == R.id.clear)
        {
            result = 0;
            textViewNum1.setText("0");
            textViewNum2.setText("0");
        }
        textViewNumOutput.setText("" + result);
        // Start of Colors
        /*
         *
         *
         *
         */
        if (operation == '+')
        {
            iv_plus.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multiply.setBackgroundColor(Color.rgb(255,255,255));
            iv_divide.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '-')
        {
            iv_plus.setBackgroundColor(Color.rgb(255, 255, 255));
            iv_minus.setBackgroundColor(Color.rgb(7,76,188));
            iv_multiply.setBackgroundColor(Color.rgb(255,255,255));
            iv_divide.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '*')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multiply.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_divide.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '/')
        {

            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multiply.setBackgroundColor(Color.rgb(255,255,255));
            iv_divide.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_expo.setBackgroundColor(Color.rgb(255,255,255));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));

        }
        else if (operation == '^')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multiply.setBackgroundColor(Color.rgb(255,255,255));
            iv_divide.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(7, 76, 188));
            iv_square.setBackgroundColor(Color.rgb(255,255,255));
        }
        else if (operation == '@')
        {
            iv_plus.setBackgroundColor(Color.rgb(255,255,255));
            iv_minus.setBackgroundColor(Color.rgb(255,255,255));
            iv_multiply.setBackgroundColor(Color.rgb(255,255,255));
            iv_divide.setBackgroundColor(Color.rgb(255,255,255));
            iv_expo.setBackgroundColor(Color.rgb(255, 255, 255));
            iv_square.setBackgroundColor(Color.rgb(7, 76, 188));
        }

    } // end of onCLick
    /*
     *
     *
     */
    public int pow(int base, int exponent)
    {
        int product = 1;
        for (int i = 0; i < exponent; i++)
        {
            product = product * base;
        }
        return product;
    }
} // end of Class
