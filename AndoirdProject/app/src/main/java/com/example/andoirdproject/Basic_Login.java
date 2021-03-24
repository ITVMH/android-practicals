package com.example.andoirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Basic_Login extends AppCompatActivity {
    EditText username,password;
    Button login,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__login__demo);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        cancel = findViewById(R.id.cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("priyank")&& password.getText().toString().equals("mehta")){
                    Toast.makeText(Basic_Login.this, "Successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Basic_Login.this, "invalid", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }


}