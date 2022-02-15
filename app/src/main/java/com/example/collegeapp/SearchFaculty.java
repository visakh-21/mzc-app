package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchFaculty extends AppCompatActivity {
    EditText ed1;
    AppCompatButton btn1,btn2;
    String getFacultyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_faculty);
        ed1=(EditText) findViewById(R.id.nm1);
        btn1=(AppCompatButton) findViewById(R.id.sr1);
        btn2=(AppCompatButton) findViewById(R.id.dr1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getFacultyName, Toast.LENGTH_SHORT).show();
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