package com.example.parul.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText pass;
    Button login;
    String strname;
    String strpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //  Toast t=  Toast.makeText(getApplicationContext(),"hello Mahesh",Toast.LENGTH_SHORT);
       // t.setGravity(Gravity.CENTER,0,0);
         //t.show();

         name =(EditText)findViewById(R.id.txtname);
         pass =(EditText)findViewById(R.id.txtpass);
         login = (Button)findViewById(R.id.button);

         }

         public void login(View view)
         {

             strname = name.getText().toString();
             strpass = pass.getText().toString();
             if(strname.equals("mahesh") && strpass.equals("mahesh") )
             {
                 Toast.makeText(getApplicationContext(),
                         "Login Success",Toast.LENGTH_SHORT).show();
             }
             else
             {
                 Toast.makeText(getApplicationContext(),
                         "Incorrect username or password",Toast.LENGTH_SHORT).show();
             }
         }
         }
