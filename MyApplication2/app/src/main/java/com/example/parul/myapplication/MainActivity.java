package com.example.parul.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText email;
    EditText pass;
    String stremail,strpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email= (EditText)findViewById(R.id.txtemailid);
        pass= (EditText)findViewById(R.id.txtpass);






    }
    protected void dologin(View view) {

        stremail=email.getText().toString();
        strpass=pass.getText().toString();

        if (stremail.equals("mahesh") && strpass.equals("mahesh")) {
            Toast.makeText(getApplicationContext(), "Login successful !", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Email or Password incorrect !", Toast.LENGTH_SHORT).show();
        }

    }
}