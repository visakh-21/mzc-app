package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
    EditText tx1,tx2,tx3,tx4,tx5;
    AppCompatButton btn1,btn2;
    String getFacultyName,getDepartment,getQualification,getMobileNumber,getEmailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        tx1=(EditText) findViewById(R.id.facn);
        tx2=(EditText) findViewById(R.id.dptn);
        tx3=(EditText) findViewById(R.id.qual);
        tx2=(EditText) findViewById(R.id.mobno);
        tx2=(EditText) findViewById(R.id.eid);
        btn1=(AppCompatButton) findViewById(R.id.sbmt);
        btn2=(AppCompatButton) findViewById(R.id.sbt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName=tx1.getText().toString();
                getDepartment=tx2.getText().toString();
                getQualification=tx3.getText().toString();
                getMobileNumber=tx4.getText().toString();
                getEmailId=tx5.getText().toString();

                Toast.makeText(getApplicationContext(), getFacultyName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDepartment, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getQualification, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getMobileNumber, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEmailId, Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}