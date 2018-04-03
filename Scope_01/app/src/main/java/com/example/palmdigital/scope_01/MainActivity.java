package com.example.palmdigital.scope_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int myInt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare a local variable
        // dataType variableName; <-- this is a local variable decloration

        // some examples of primitive types and declortions
        myInt = 100; // int is a Java primitive type
        myInt = 200;
        double myDouble; // double is a Java primitive type
        char myChar;
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;
        // these re not primitive they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        // assign values to these variables
        myString = "this is an awsome string";
        myInt = 5;
        myInt = awsomeMethod(myInt);
        Log.i("info", "myInt = " + myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;

        TextView tv_Num1Display = findViewById(R.id.tv_Num1Display);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awsomeMethod2();


    } // end of onCreate

    // let's try to put a method here
    public int awsomeMethod(int input)
    {
        myInt = 42;
        awsomeMethod2();
        return input + 5;
    }

    public void awsomeMethod2 ()
    {
        System.out.println("myInt = " + myInt);
    }

} // end of MainActivity class
