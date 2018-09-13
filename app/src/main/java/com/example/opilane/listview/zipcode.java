package com.example.opilane.listview;

public class zipcode {

    private final String code;
    private final String city;

    //konstruktor
    public zipcode(String code, String city) {
        this.code = code;
        this.city = city;
    }

    //getterid
    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }
    //selllega kuvame hiljem listis oma andmeid näide: 13123 Mustamäe
    public String toString() {
        return getCode() + " " + getCity();
    }
}
