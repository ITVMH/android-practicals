package com.example.andoirdproject.Prac14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
        }
    }
}
