package com.practice;

import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {

        String adjective1,adjective2,adjective3;
        String girlName,boyName,manName;
        String occupation1,occupation2;
        String place,clothing,hobby;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an adjective : ");
        adjective1 = input.nextLine();
        System.out.print("Enter a girls name : ");
        girlName = input.nextLine();
        System.out.print("Enter another adjective : ");
        adjective2 = input.nextLine();
        System.out.print("Enter an occupation : ");
        occupation1 = input.nextLine();
        System.out.print("Enter the name of a place : ");
        place = input.nextLine();
        System.out.print("Enter the name of a place of clothing : ");
        clothing = input.nextLine();
        System.out.print("Enter the name ofa hobby : ");
        hobby = input.nextLine();
        System.out.print("Enter another adjective : ");
        adjective3 = input.nextLine();
        System.out.print("Enter another Occupation : ");
        occupation2 = input.nextLine();
        System.out.print("Enter a boy's name : ");
        boyName = input.nextLine();
        System.out.print("Enter a man's name : ");
        manName = input.nextLine();
        System.out.println("There once was a "+adjective1+" girl named "+girlName+" ,who was a "+adjective2+" "+occupation1+" in the Kingdom of "+place);
        System.out.println("She loved to wear "+clothing+" and to "+hobby+".");
        System.out.println("She wanted to marry the "+adjective3+" "+occupation2+"named "+boyName+" but her father,King "+manName+"forbid her from seeing him.");
    }
}
