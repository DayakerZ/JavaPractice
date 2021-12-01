package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {

        Scanner input ;
        try{
            input =  new Scanner(new File("text.txt"));
            int text;
            while (input.hasNext())
            {
                text = input.nextInt();//reading input from file and storing in text var
                System.out.println(text);
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File is not found");
        }
        catch (InputMismatchException i){
            System.out.println(i.getMessage());
        }



    }
}
