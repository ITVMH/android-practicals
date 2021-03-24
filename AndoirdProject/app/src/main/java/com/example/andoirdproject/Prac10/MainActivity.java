package com.example.andoirdproject.Prac10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.andoirdproject.Prac9.Flaglist;
import com.example.andoirdproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fr = fragmentManager.beginTransaction();
        CarList carList = new CarList();
        fr.add(R.id.linear1,carList,"done");
        fr.commit();
    }
}