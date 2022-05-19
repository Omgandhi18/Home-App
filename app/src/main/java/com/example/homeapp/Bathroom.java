package com.example.homeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Bathroom extends AppCompatActivity {
    SwitchCompat switchbtn;
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);
        reff= FirebaseDatabase.getInstance().getReference();
        switchbtn=(SwitchCompat)findViewById(R.id.switchbtn);
        switchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    Toast.makeText(Bathroom.this, "On", Toast.LENGTH_SHORT).show();
                    FirebaseDatabase database=FirebaseDatabase.getInstance();
                    DatabaseReference ref= database.getReference("garden");
                    ref.setValue("b");
                }
                else{
                    Toast.makeText(Bathroom.this, "Off", Toast.LENGTH_SHORT).show();
                    FirebaseDatabase database=FirebaseDatabase.getInstance();
                    DatabaseReference ref= database.getReference("garden");
                    ref.setValue("a");
                }
            }
        });
    }
}