package com.example.parul.practical_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    String stremail,strpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.txtemail);
        pass=(EditText)findViewById(R.id.txtpass);


    }



    protected void login(View view){

        stremail=email.getText().toString();
        strpass=pass.getText().toString();
        if(stremail.equals("abc@gmail.com")&& strpass.equals("password")){

        }
       else
        {
            
        }
    }
}
