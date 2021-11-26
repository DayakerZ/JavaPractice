package com.practice;
import java.util.Random;
public class DiceSimulation {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int diceNumber,count =0;

        while (count<10){

            diceNumber = randomNumber.nextInt(6)+1;
            System.out.println("Dice number occured :"+diceNumber);
            count++;
        }

    }

}
