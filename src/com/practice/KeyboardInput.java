package com.practice;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("What is your name : ");
        name = input.nextLine();

        System.out.println("What is your age : ");
        age = input.nextInt();
        System.out.println("What is your salary :");
        salary = input.nextDouble();

        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your salary is "+salary);

        //input.nextByte()
        //input.nextBoolean()

    }//end of main
}
