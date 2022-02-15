package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String getEmailId,getPassword,prefvalue;
EditText ed1,ed2;
AppCompatButton b1,b2;
SharedPreferences myPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPreferences=getSharedPreferences("login",MODE_PRIVATE);
        ed1=(EditText)findViewById(R.id.mailid);
        ed2=(EditText)findViewById(R.id.pswrd);
        b1=(AppCompatButton)findViewById(R.id.btn1);
        b2=(AppCompatButton)findViewById(R.id.btn2);

        prefvalue=myPreferences.getString("password",null);
                if(prefvalue!=null){
                    Intent i= new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);

                    }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmailId=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getEmailId,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_SHORT).show();
                if(getEmailId.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    SharedPreferences.Editor myEdit=myPreferences.edit();
                    myEdit.putString("password",getPassword);
                    myEdit.commit();
                    Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}