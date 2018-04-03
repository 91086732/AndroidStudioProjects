package com.example.palmdigital.javaexpressions01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int a = 10;
        String b = "Alan Turing";
        boolean c = true;

        Log.i("info", "Hello, Android");
        Log.i("info", "a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);
        a++;
        Log.i("info", "a = " + a);
        Log.i("info", "c = " + (1 + 1 == 3));

        float myFloat = 4.0f;
        double myDouble = 42.0;
        int result = myAwsomeFunction();
        Log.i("info", "myAwsomeFunction returned = " + result);
        float result2 = myFunction();
        Log.i("info", "myFinction returned = " + result2);

        //Challenge: make a method that returns void that logs something out to the console.

            myFunction2();



    } // end of onCreate method
    int myAwsomeFunction()
    {
        return 1000;
    }

    float myFunction()
    {
        return 42.0f;
    }

    void myFunction2()
    {
        Log.i("info", "Hello from myFunction2! :)");
    }
} // end of class MainActivity
