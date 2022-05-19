package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button living,bath,bed,kitchen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        living=(Button)findViewById(R.id.living);
        kitchen=(Button)findViewById(R.id.kitchen);
        bath=(Button)findViewById(R.id.bath);
        bed=(Button)findViewById(R.id.bed);
        living.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LivingRoom.class);
                startActivity(i);
            }
        });
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Bedroom.class);
                startActivity(i);
            }
        });
        bath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Bathroom.class);
                startActivity(i);
            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Kitchen.class);
                startActivity(i);
            }
        });
    }
}