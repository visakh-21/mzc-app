package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton btn1,btn2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.mobno);
        ed3 = (EditText) findViewById(R.id.mid);
        ed4 = (EditText) findViewById(R.id.pwrd);
        ed5 = (EditText) findViewById(R.id.cnfrmpswrd);
        btn1 = (AppCompatButton) findViewById(R.id.bn1);
        btn2 = (AppCompatButton) findViewById(R.id.bn2);
    }


}