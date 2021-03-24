package com.bipinrupadiya.ex4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class F1 extends Fragment {

    /**
     * @author Bipin S Rupadiya , www.BipinRupadiya.com
     */
    ArrayList<HashMap<String, String>> mycars;
    Context c;
    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f1, container, false);
        ListView lv = (ListView) v.findViewById(R.id.list);

        mycars= new ArrayList<>();
        Car x = new Car();
        mycars=x.getCars();
        c=v.getContext();


        ListAdapter adapter = new SimpleAdapter(
                v.getContext(), mycars,
                R.layout.list_item,
                new String[]{"name", "launchedDate","companyName","images"},
                new int[]{R.id.name, R.id.launchedDate, R.id.companyName,R.id.img});

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment f = new F2();
                Bundle b = new Bundle();
                b.putString("id", mycars.get(i).get("id"));
                b.putString("name", mycars.get(i).get("name"));
                b.putString("launchedDate", mycars.get(i).get("launchedDate"));
                b.putString("companyName", mycars.get(i).get("companyName"));
                b.putInt("lstid", i);
                f.setArguments(b);
                ft.replace(R.id.activity_main, f);
                ft.addToBackStack(null);
                ft.commit();


                Toast.makeText(c, ""+mycars.get(i).get("name"), Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }


}
