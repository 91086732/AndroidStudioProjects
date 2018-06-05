package com.example.palmdigital.cipher_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_Encrypt = findViewById(R.id.b_Shift);
        Button b_Decrypt = findViewById(R.id.b_NegShift);


        b_Encrypt.setOnClickListener(this);
        b_Decrypt.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        EditText  et_input = findViewById(R.id.et_input);
        //Declare the input

        String origMsgStr = et_input.getText().toString();
        //Convert/Make a string

        String shift = "";
        //Empty string

        EditText et_Shift = findViewById(R.id.et_Shift);
        //Declare the shift

        shift += et_Shift.getText().toString();
        //Convert shift to string

        int theShift = Integer.parseInt(shift);
        //Convert the string shift into a(n) int

       if(v.getId() == R.id.b_Shift)
       {
           String encrypted = encrypt (origMsgStr, theShift);
           TextView tv_Output = findViewById(R.id.tv_output);
           tv_Output.setText(encrypted);
       }
       else if (v.getId() == R.id.b_NegShift)
       {
           String decrypt = decrypted (origMsgStr, theShift);
           TextView tv_Output = findViewById(R.id.tv_output);
           tv_Output.setText(decrypt);
       }
    }
    public static String encrypt(String input, int shift) {
        // write logic that shifts the input string by 5 letters
        // so, 'a' would become 'f', and 'r' would become 'w'
        // make an alphabet array we can use to shift with
        //String input2 = "MEET";
        //int shift = 5;
        // what index is M at?
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        //input = input.toUpperCase();
        // for each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char thisVal = input.charAt(i);
            if (thisVal == ' ') {
                output += ' ';
            } else {
                for (int j = 0; j < alphabetSize; j++) {
                    if (alphabet[j] == thisVal) {
                        int shiftedIndex = (j + shift) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }
    public static String decrypted(String input, int shift)
    {
        // write logic that shifts the input string by 5 letters
        // so, 'a' would become 'f', and 'r' would become 'w'
        // make an alphabet array we can use to shift with
        //String input2 = "MEET";
        //int shift = 5;
        // what index is M at?
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        // for each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char thisVal = input.charAt(i);
            if (thisVal == ' ') {
                output += ' ';
            } else {
                for (int j = 0; j < alphabetSize; j++) {
                    if (alphabet[j] == thisVal) {
                        int shiftedIndex = (j - shift + 26) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }
}
