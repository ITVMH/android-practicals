package com.example.andoirdproject.Prac10;

import java.io.Serializable;

public class CarModel implements Serializable {

    String launchedDate;
    String companyName;

    public CarModel(  String launchedDate, String companyName) {

        this.launchedDate = launchedDate;
        this.companyName = companyName;
    }



    public String getLaunchedDate() {
        return launchedDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}
