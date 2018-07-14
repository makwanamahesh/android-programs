package com.example.parul.emailvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText email, pass;
    Button login;
    String stremail, strpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.txtemail);
        pass = (EditText) findViewById(R.id.txtpass);
        login = (Button) findViewById(R.id.bntlogin);
        String Epatten = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
        stremail = email.getText().toString();
        strpass = pass.getText().toString();

        


    }
}
