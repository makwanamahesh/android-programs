package com.example.parul.optionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.options_menu,menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                Toast.makeText(getApplicationContext(), "red", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                return true;
            case R.id.blue:
                Toast.makeText(getApplicationContext(), "Blue", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                return true;
            case R.id.yellow:
                Toast.makeText(getApplicationContext(), "yellow", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.green:
                Toast.makeText(getApplicationContext(), "green", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                return true;
            case R.id.black:
                Toast.makeText(getApplicationContext(), "Black", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                return true;
            case R.id.gray:
                Toast.makeText(getApplicationContext(), "gray", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.GRAY);
                return true;
            default:
                Toast.makeText(getApplicationContext(), "Enter Valid Option", Toast.LENGTH_SHORT).show();
                return true;
        }
    }
}
