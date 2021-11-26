package com.practice;

public class CompareTo {
    public static void main(String[] args) {
        String myName = "dayaker reddy";
        String otherName = "jhon drew";
        if(myName.compareTo(otherName)>0)
        {
            System.out.println(myName+" > "+otherName);
        }
        else {
            System.out.println(myName+" <= "+otherName);
        }
    }
}
