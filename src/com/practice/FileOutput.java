package com.practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutput {
    public static void main(String[] args) {
        PrintWriter writer;
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Dayaker Reddy");
        namesList.add("amith sai");
        namesList.add("prajjet gumudala");
        namesList.add("Goutham goli");
        namesList.add("Saileshwar bogam");
        try {
            writer = new PrintWriter("text.txt");
            for (String name : namesList) {
                writer.println(name);
            }
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
