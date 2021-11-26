package com.practice;

public class RelationalFun {
    public static void main(String[] args) {

        int myAge = 21;
        int yourAge = 25;
        boolean greaterthanOperation = myAge >yourAge;
        boolean lessthanOperation  = myAge < yourAge;
        boolean equaltoOperation = myAge == yourAge;
        boolean greaterthanOrequaltoOperation = myAge >= yourAge;
        boolean lessthanOrequaltoOperation = myAge <= yourAge;

        System.out.println(greaterthanOperation);
        System.out.println(lessthanOperation);
        System.out.println(equaltoOperation);
        System.out.println(greaterthanOrequaltoOperation);
        System.out.println(lessthanOrequaltoOperation);
    }
}
