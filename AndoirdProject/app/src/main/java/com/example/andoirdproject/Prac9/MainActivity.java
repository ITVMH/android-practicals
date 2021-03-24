package com.example.andoirdproject.Prac9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.andoirdproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fr = fragmentManager.beginTransaction();
        Flaglist flaglist = new Flaglist();
        fr.add(R.id.linear1,flaglist,"done");
        fr.commit();

    }
}