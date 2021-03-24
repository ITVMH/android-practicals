package com.example.andoirdproject.Prac9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andoirdproject.R;


public class FlagDetails extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_flag_details, container, false);

        String s = getArguments().getString("string");
        TextView textView = view.findViewById(R.id.textview);
        textView.setText(s);
        ImageView imageView = view.findViewById(R.id.flag);
        switch (s){
            case "India":
                imageView.setImageResource(R.drawable.india);
                break;
            case "Bangladesh":
                imageView.setImageResource(R.drawable.ban);
                break;
            case "Srilanka":
                imageView.setImageResource(R.drawable.slk);
                break;
            case "Japan":
                imageView.setImageResource(R.drawable.jp);
                break;
            case "United States":
                imageView.setImageResource(R.drawable.usa);
                break;
            case "China":
                imageView.setImageResource(R.drawable.china);
                break;
            case "Nepal":
                imageView.setImageResource(R.drawable.nepal);
                break;
        }
        return view;
    }
}