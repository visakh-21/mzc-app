package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String getEmailid,getPassword;
EditText ed1,ed2;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.mailid);
        ed2=(EditText)findViewById(R.id.pswrd);
        b1=(AppCompatButton)findViewById(R.id.btn1);
        b2=(AppCompatButton)findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmailid=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getEmailid,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_SHORT).show();
                if(getEmailId.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                }else{
                    Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}