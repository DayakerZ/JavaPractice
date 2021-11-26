package com.practice;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number,sum=0;
        System.out.println("Enter the non negetive numbers to add to sum : ");
        System.out.println("Enter negetive number to exit");
        number = input.nextInt();
        while(number >= 0){
            sum+=number;
            number = input.nextInt();
        }
        System.out.println("The sum is "+sum);
    }
}
