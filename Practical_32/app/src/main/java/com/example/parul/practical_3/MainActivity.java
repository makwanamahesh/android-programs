package com.example.parul.practical_3;

import android.content.Intent;
import android.media.MediaCodec;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    EditText email;
    EditText pass;
    String stremail,strpass;
    Button login;
    Pattern p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        email= (EditText)findViewById(R.id.txtemail);
        pass= (EditText)findViewById(R.id.txtpass);
        login = (Button)findViewById(R.id.login);
        login.setEnabled(false);

       email.setOnFocusChangeListener(new View.OnFocusChangeListener(){
           @Override
           public void onFocusChange(View arg0,boolean hasFocus){
               stremail=email.getText().toString().trim();
               String emailpattern ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$".toLowerCase();
               if(stremail.matches(emailpattern)){
                   login.setEnabled(true);
               }
           }
       });


    }

    protected void dologin(View view) {

        stremail=email.getText().toString();
        strpass=pass.getText().toString();

        if (stremail.equals("mahesh@gmail.com") && strpass.equals("mahesh")) {
            Toast.makeText(getApplicationContext(), "Login successful !", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(),WelcomeActivity.class);
            i.putExtra("value1","mahesh@gmail.com");
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Email or Password incorrect !", Toast.LENGTH_SHORT).show();
        }

    }
}
