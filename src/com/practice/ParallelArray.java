package com.practice;

import java.util.Scanner;

public class ParallelArray {

    public static void display(String name,int age){
        System.out.println(name+" is "+age+" years old");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] namesArray = new String[5];
        int[] agesArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name : ");
            namesArray[i] = scanner.nextLine();
            System.out.println("Enter an age : ");
            agesArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            display(namesArray[i],agesArray[i]);
        }
    }
}
