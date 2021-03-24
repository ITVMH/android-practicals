package com.example.andoirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class New_Login extends AppCompatActivity {
    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__login__demo_2);
        textView= findViewById(R.id.textView);
        textView2= findViewById(R.id.textView2);
        Bundle b = getIntent().getExtras();
        String Username = b.getString("Username");
        String Password = b.getString("Password");
        String msg = "This is Your Username & Password";
        textView.setText(Username);
        textView2.setText(Password);
        Toast.makeText(New_Login.this,msg, Toast.LENGTH_LONG).show();}
}

