package com.bipinrupadiya.ex4;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class F2 extends Fragment {


    /**
     * @author Bipin S Rupadiya , www.BipinRupadiya.com

     */

    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_f2, container, false);
        /*
         b.putString("name", mycars.get(i).get("name"));
                b.putString("launchedDate", mycars.get(i).get("launchedDate"));
                b.putString("companyName", mycars.get(i).get("companyName"));
        * */
        TextView name= (TextView) v.findViewById(R.id.name);
        name.setText(getArguments().getString("name"));
        TextView launchedDate= (TextView) v.findViewById(R.id.launchedDate);
        launchedDate.setText(getArguments().getString("launchedDate"));
        TextView companyName= (TextView) v.findViewById(R.id.companyName);
        companyName.setText(getArguments().getString("companyName"));



      //  final TypedArray imgArray =getResources().obtainTypedArray(R.array.flag);
        int i=getArguments().getInt("lstid");


        //iv.setImageResource(imgArray.getResourceId(i,-1));
        // Keys used in Hashmap
        String[] from = { "flag"};

        // Ids of views in listview_layout
        int[] to = { R.id.flag};
        ArrayList<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        HashMap h = new HashMap();
        if(name.getText().toString().equals("nano")) {
            h.put("flag", Integer.toString(R.drawable.nano1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.nano2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.nano3));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.nano4));
            aList.add(h);
        }
        if(name.getText().toString().equals("kwid")) {
            h.put("flag", Integer.toString(R.drawable.kwid1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.kwid2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.kwid3));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.kwid4));
            aList.add(h);
        }
        if(name.getText().toString().equals("scorpio")) {
            h.put("flag", Integer.toString(R.drawable.scorpio1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.scorpio2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.scorpio2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.scorpio4));
            aList.add(h);
        }
        if(name.getText().toString().equals("hondacity")) {
            h.put("flag", Integer.toString(R.drawable.hondacity1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.hondacity2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.hondacity3));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.hondacity4));
            aList.add(h);
        }
        if(name.getText().toString().equals("odi")) {
            h.put("flag", Integer.toString(R.drawable.odi1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.odi2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.odi3));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.odi4));
            aList.add(h);
        }
        if(name.getText().toString().equals("swift")) {
            h.put("flag", Integer.toString(R.drawable.swift1));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.swift2));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.swift3));
            aList.add(h);
            h = new HashMap();
            h.put("flag", Integer.toString(R.drawable.swift4));
            aList.add(h);
        }

        //Toast.makeText(v.getContext(),""+i,Toast.LENGTH_LONG).show();

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(v.getContext(),aList, R.layout.gridview_layout, from, to);

        // Getting a reference to gridview of MainActivity
        GridView gridView = (GridView) v.findViewById(R.id.img);

        // Setting an adapter containing images to the gridview
        gridView.setAdapter(adapter);
        return v;
    }

}
