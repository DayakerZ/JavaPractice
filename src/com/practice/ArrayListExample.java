package com.practice;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Dayaker");
        listOfNames.add("Amith");
        listOfNames.add("Saileshwar");
        listOfNames.add("Akhil");
        listOfNames.add("Imran");
        for(String name : listOfNames){
            System.out.println(name);
        }
    }
}
