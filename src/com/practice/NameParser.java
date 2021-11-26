package com.practice;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String firstAndLastName;
        String firstName;
        String lastName;
        int spaceIndex ;
        firstAndLastName = scanner.nextLine();
      /*  for (int i = 0; i < firstAndLastName.length(); i++) {

            if(firstAndLastName.charAt(i)==' ') {
                spaceIndex = i;
                break;
            }
        }*/
        spaceIndex = firstAndLastName.indexOf(' ');
        firstName = firstAndLastName.substring(0,spaceIndex);
        lastName = firstAndLastName.substring(spaceIndex+1);
        System.out.println("first name is "+firstName.toUpperCase());
        System.out.println("last name is "+lastName.toLowerCase());
    }
}
