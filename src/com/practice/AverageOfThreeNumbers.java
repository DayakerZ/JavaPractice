package com.practice;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        double num1,num2,num3;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        average = (num1+num2+num3)/3;
        System.out.println("Average of three numbers is "+average);
    }//end of main
}
