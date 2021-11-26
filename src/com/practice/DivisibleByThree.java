package com.practice;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println("Enter a number :");
        number = input.nextInt();
        if (number%3 ==0){
            System.out.println(number+" is divisible by three");
        }
        else {
            System.out.println(number+" is not divisible by three");
        }
    }
}
