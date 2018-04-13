package com.example.palmdigital.edittextone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bGetButton = findViewById(R.id.buttonGetName);
        bGetButton.setOnClickListener(this);

    }
    public void onClick (View v)
    {

        // get the first
        EditText firstNameObject = (EditText) findViewById(R.id.et_firstName);
        String firstStr = firstNameObject.getText().toString();

        EditText lastNameObject = (EditText) findViewById(R.id.et_lastName);
        String lastStr = lastNameObject.getText().toString();

        TextView tv_output = findViewById(R.id.tv_output);
        tv_output.setText(firstStr + " " + lastStr);
    } // end of onCreate
} // end of main
