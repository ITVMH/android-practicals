package com.example.andoirdproject.Prac9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.andoirdproject.R;

import java.util.List;


public class Flaglist extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_flaglist, container, false);
        ListView listView = view.findViewById(R.id.list);
        String[] Countries = getResources().getStringArray(R.array.Country_list);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, Countries);
        listView.setAdapter(countryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = parent.getAdapter().getItem(position).toString();
                Bundle b = new Bundle();
                b.putString("string",s);
                FlagDetails flagDetails = new FlagDetails();
                flagDetails.setArguments(b);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft =fragmentManager.beginTransaction();
                ft.replace(R.id.linear1,flagDetails);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }
}