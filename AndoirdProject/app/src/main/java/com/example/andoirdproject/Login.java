package com.example.andoirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button cancel,login;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo_2);
        cancel = findViewById(R.id.cancel);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username.setText("");
                password.setText("");
                Toast.makeText(Login.this,"Values are null",Toast.LENGTH_LONG).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("priyank") && password.getText().toString().equals("mehta")) {
                    Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this, New_Login.class);
                    i.putExtra("Username",username.getText().toString());
                    i.putExtra("Password",password.getText().toString());
                    startActivity(i);
                }else {
                    Toast.makeText(Login.this,"Sorry, Please enter correct details",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}