package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClcik = findViewById(R.id.btnClcik);
        btnClcik.setOnClickListener(this);

        Button btnHey = findViewById(R.id.btnHey);
        btnHey.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnClcik:
                Toast.makeText(MainActivity.this,"The Click is Pressed",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHey:
                System.out.println("Hey Satyaki!");
                break;
            default:
                System.out.println("Hey !");
        }
    }
}