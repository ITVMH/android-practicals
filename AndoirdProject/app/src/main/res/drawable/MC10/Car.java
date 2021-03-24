package com.bipinrupadiya.ex4;

import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author Bipin S Rupadiya , www.BipinRupadiya.com

 */

public class Car {



    public ArrayList<HashMap<String, String>> getCars()
    {
        ArrayList<HashMap<String, String>> cars;

        cars= new ArrayList<>();
        // tmp hash map for single car
        HashMap<String, String> c = new HashMap<>();

        // adding each child node to HashMap key => value
        c.put("id", "1");
        c.put("name", "hondacity");
        c.put("launchedDate", "2017");
        c.put("companyName", "HONDA");
        c.put("images",Integer.toString(R.drawable.hondacity1));
        cars.add(c);

        c = new HashMap<>();
        c.put("name", "kwid");
        c.put("launchedDate", "2016");
        c.put("companyName", "Renault");
        c.put("images",Integer.toString(R.drawable.kwid1));
        cars.add(c);

        c = new HashMap<>();
        c.put("name", "nano");
        c.put("launchedDate", "2008");
        c.put("companyName", "TATA");
        c.put("images",Integer.toString(R.drawable.nano1));
        cars.add(c);


        c = new HashMap<>();
        c.put("name", "odi");
        c.put("launchedDate", "2007");
        c.put("companyName", "ODI");
        c.put("images",Integer.toString(R.drawable.odi1));
        cars.add(c);

        c = new HashMap<>();
        c.put("name", "scorpio");
        c.put("launchedDate", "2002");
        c.put("companyName", "mahindra");
        c.put("images",Integer.toString(R.drawable.scorpio1));
        cars.add(c);

        c = new HashMap<>();
        c.put("name", "swift");
        c.put("launchedDate", "2000");
        c.put("companyName", "MarutiSuzuki");
        c.put("images",Integer.toString(R.drawable.swift1));
        cars.add(c);

        return  cars;
    }
}
