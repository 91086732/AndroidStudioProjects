package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // member variable or feilds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end of onCreate

    public void myAwesomeMethod02 ()
    {
        int awsome = 1;
        double awsomeDouble = 2.5;
        String awsomeString = "hey there";
        TextView tv_awsome = null;
        ImageView iv_awsome = null;
        Button awsomeButton = null;
        awsomeButton = findViewById(R.id.button_top);
    }
    public void myAwesomeMethod01 ()
    {
        int awsome2 = 1;
        double awsomeDouble2 = 2.5;
        TextView tv_awsome2;
        ImageView iv_awsome2;
        Button awsomeButton2;
    }
    public void myAwesomeMethod03 ()
    {
        int awsome = 1;
        double awsome2 = 2.5;
        TextView tv_awsome;
        ImageView iv_awsome;
        Button awsomeButton;
    }
    public void myAwesomeMethod04 ()
    {
        int awsome = 1;
        double awsome2 = 2.5;
        TextView tv_awsome;
        ImageView iv_awsome;
        Button awsomeButton;
    }
    public void myAwesomeMethod05 ()
    {
        int awsome = 1;
        double awsome2 = 2.5;
        TextView tv_awsome;
        ImageView iv_awsome;
        Button awsomeButton;
    }

} // end of MainActivity
