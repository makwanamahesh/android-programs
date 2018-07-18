package com.example.parul.practical5;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button stopButton, startButton;
    int i=0;
    TextView tv;
    boolean clickedstop=false;
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton= (Button)findViewById(R.id.btnstart);
        stopButton=(Button)findViewById(R.id.btnstop)  ;
        tv=(TextView)findViewById(R.id.txtviews);


    }
    protected void dostart(View view)
    {
        handler.postDelayed(run,1000);
    }

    protected void dostop(View view)
    {
     clickedstop =true;
        handler.removeCallbacksAndMessages(null);
    }

    Runnable run =new Runnable() {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                       updateCounter();
                }
            });
        }
    };
    public void updateCounter(){
        tv.setText(""+(Integer.parseInt(tv.getText().toString())+1));
        if (clickedstop) {
            tv.setText(""+ tv.getText().toString());
        }else{
            handler.postDelayed(run,1000);
        }
    }

}
