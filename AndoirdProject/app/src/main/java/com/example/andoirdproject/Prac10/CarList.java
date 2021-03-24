package com.example.andoirdproject.Prac10;

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

import com.example.andoirdproject.Prac9.FlagDetails;
import com.example.andoirdproject.R;

import java.util.ArrayList;
import java.util.List;


public class CarList extends Fragment {
      List item = new ArrayList();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_car_list, container, false);
        ListView listView = view.findViewById(R.id.carlist);
        String[] cars = getResources().getStringArray(R.array.cars);

        CarModel carModel1 = new CarModel( "Feb 24, 2021","Maruti Suzuki");
        item.add(carModel1);
         CarModel carModel2 = new CarModel( "Feb 4, 2021","Tata");
         item.add(carModel2);
          CarModel carModel3 = new CarModel( "jan 24, 2021","Renault");
          item.add(carModel3);
           CarModel carModel4 = new CarModel( "Mar 4, 2021","Renault");
           item.add(carModel4);

         ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, cars);
        listView.setAdapter(countryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CarModel carModel = (CarModel) item.get(position);
                String a  = carModel.companyName;
                String c  = carModel.launchedDate;
                String s = parent.getAdapter().getItem(position).toString();
                Bundle b = new Bundle();
                b.putString("name",s);
                b.putString("company",a);
                b.putString("date",c);

                CarDetails carDetails = new CarDetails();
                carDetails.setArguments(b);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft =fragmentManager.beginTransaction();
                ft.replace(R.id.linear1,carDetails);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }
}