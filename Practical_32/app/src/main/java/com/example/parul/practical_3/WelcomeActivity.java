package com.example.parul.practical_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView t1 = (TextView)findViewById(R.id.txtdisplay);
        Intent i  = getIntent();
        String str = i.getStringExtra("value1");
        t1.setText(str);

    }
}
