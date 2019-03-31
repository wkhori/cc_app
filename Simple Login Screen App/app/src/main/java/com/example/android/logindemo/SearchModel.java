package com.example.android.logindemo;

public class SearchModel {
    String clubName;
    String clubBuilding;
    String clubAddress;

    //constructor
    public SearchModel(String name, String building, String address){
        this.clubName = name;
        this.clubBuilding = building;
        this.clubAddress = address;
    }

    //getters
    public String getClubName() { return this.clubName; }

    public String getClubBuilding() {
        return this.clubBuilding;
    }

    public String getClubAddress() {
        return this.clubAddress;
    }

    //setters
    public void setclubName(String name){ this.clubName = name; }

    public void setClubBuilding(String building){ this.clubBuilding = building; }

    public void setClubAddress(String address){ this.clubAddress = address; }
}
