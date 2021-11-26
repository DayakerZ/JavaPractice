package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExmple2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();
        System.out.println("Start Entering the Numbers : ..");
        double number = input.nextDouble();
        while(number >= 0){
            numberList.add(number);
            number = input.nextDouble();
        }
        for(int i = numberList.size()-1;i >= 0; i--){
            System.out.println(numberList.get(i));
        }

    }
}
