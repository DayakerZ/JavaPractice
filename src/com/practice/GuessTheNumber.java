package com.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int guessedNumber;
        int numberOfGuesses = 0;
        int numberGenerated = randomNumber.nextInt(100)+1;

        while (true){
            System.out.println("Guess the number between 1 to 100!!");
            guessedNumber = input.nextInt();
            numberOfGuesses++;
            if (guessedNumber == numberGenerated){
                System.out.println("You gussed Right");
                System.out.println("Number of guesses "+numberOfGuesses);
                break;

            }
            else if(guessedNumber>numberGenerated){
                System.out.println("You guessed too high!!");
            }
            else if(guessedNumber<numberGenerated){
                System.out.println("you guessed too low!!");
            }
            else {
                System.out.println("wasted guess");
            }
        }
    }

}
