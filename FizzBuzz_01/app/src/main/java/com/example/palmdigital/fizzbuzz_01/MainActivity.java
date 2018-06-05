package com.example.palmdigital.fizzbuzz_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View v) {
        EditText et_input = findViewById(R.id.et_input);

        String orgMsgStr = et_input.getText().toString();

        Button b_work = findViewById(R.id.b_work);


        if (v.getId() == R.id.b_work)
        {
            TextView tv_output = findViewById(R.id.tv_output);
            tv_output.setText(orgMsgStr);
        }
    }
}