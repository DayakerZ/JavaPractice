package com.practice;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        char gender;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter gender male as M and female as F :");
        gender = input.next().charAt(0);
        System.out.println("Enter your age : ");
        age = input.nextInt();
        if(age>=19 && gender == 'M'){
            System.out.println("Eligible to join fraternity");
        }
        else
            System.out.println("not Eligible to join fraternity");
    }
}
