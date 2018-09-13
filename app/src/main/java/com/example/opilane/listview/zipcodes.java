package com.example.opilane.listview;

import java.util.ArrayList;
import java.util.List;

public class zipcodes {
    private final List<zipcode> list = new ArrayList<>();
    private  static  final String[][] codes ={
            {"10115","berlin-Mitte"},
            {"10243","Frisdrichshain"},
            {"10318","Lichtenberg"},
            {"10405","Tempelhof"},

    };
    public zipcodes(){
        for (String[] code:codes) list.add(new zipcode(code[0],code[1]));
    }
    public List<zipcode> search(String code,String city){
        city = city.toLowerCase();
        List<zipcode> lines = new ArrayList();
        for (zipcode z : list)
            if (z.getCode().startsWith(code) && z.getCity().toLowerCase().contains(city))lines.add(z);
        return lines;


    }
}
