package com.example.andoirdproject.Prac10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andoirdproject.R;

public class CarDetails extends Fragment {
    TextView name,date,company;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_car_details, container, false);


        String s = getArguments().getString("name");
        String a = getArguments().getString("date");
        String b = getArguments().getString("company");
        name = view.findViewById(R.id.carname);
        date = view.findViewById(R.id.launcheddate);
        company = view.findViewById(R.id.companyname);
        name.setText("Carname :"+s);

        ImageView imageView = view.findViewById(R.id.carimage);
        switch (s){
            case "Maruti Suzuki Swift":
                date.setText("Date :" +a);
                company.setText("company :"+b);
                imageView.setImageResource(R.drawable.swift);
                break;
            case "Tata Safari":
                date.setText("Date :" +a);
                company.setText("company :"+b);
                imageView.setImageResource(R.drawable.safari);
                break;
            case "Renault Kiger":
                date.setText("Date :" +a);
                company.setText("company :"+b);
                imageView.setImageResource(R.drawable.kiger);
                break;
            case "Jeep Compass":
                date.setText("Date :" +a);
                company.setText("company :"+b);
                imageView.setImageResource(R.drawable.compass);
                break;

    }
        return view;
}
}