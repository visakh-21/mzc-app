package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    EditText txt1, txt2, txt3, txt4;
    AppCompatButton btn1, btn2;
    String getName, getRollNo, getAdmissionNumber, getCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        txt1 = (EditText) findViewById(R.id.nm1);
        txt2 = (EditText) findViewById(R.id.rnm);
        txt3 = (EditText) findViewById(R.id.clg);
        txt4 = (EditText) findViewById(R.id.adn);
        btn1 = (AppCompatButton) findViewById(R.id.nm1);
        btn2 = (AppCompatButton) findViewById(R.id.nm2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = txt1.getText().toString();
                getRollNo = txt2.getText().toString();
                getAdmissionNumber = txt3.getText().toString();
                getCollege = txt4.getText().toString();

                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRollNo, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getAdmissionNumber, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getCollege, Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}



