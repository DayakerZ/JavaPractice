package com.practice;

import java.util.Scanner;

public class LearningPackages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int packageNumber;
        int numberOfCoursesEnrolled;
        System.out.println("Enter the Package number 1,2 or 3: ");
        packageNumber = input.nextInt();
        System.out.println("Enter the number of Courses Enrolled : ");
        numberOfCoursesEnrolled = input.nextInt();
        if(packageNumber == 1){

            if(numberOfCoursesEnrolled <= 2){
                System.out.println("your total Cost for this month : 10$");
            }
            else{
                System.out.println("your total Cost for this month : "+(10 +(numberOfCoursesEnrolled-2)*6)+"$");
            }
        }
        else if (packageNumber == 2){
            if(numberOfCoursesEnrolled <= 4){
                System.out.println("your total Cost for this month : 12$");
            }
            else{
                System.out.println("your total Cost for this month : "+ (12 +(numberOfCoursesEnrolled-4)*4)+"$");
            }
        }
        else{

            if(numberOfCoursesEnrolled <= 6){
                System.out.println("your total Cost for this month : 15$");
            }
            else{
                System.out.println("your total Cost for this month : "+(15 +(numberOfCoursesEnrolled-6)*3)+"$");
            }
        }
    }
}
