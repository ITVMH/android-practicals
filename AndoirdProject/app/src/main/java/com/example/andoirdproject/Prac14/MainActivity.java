package com.example.andoirdproject.Prac14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.example.andoirdproject.Prac13.ConnectionReceiver;
import com.example.andoirdproject.R;

public class MainActivity extends AppCompatActivity {
    MyBroadcast receiver;
    IntentFilter intentFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        receiver = new MyBroadcast();
        intentFilter = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    }
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(receiver, intentFilter);
    }
}