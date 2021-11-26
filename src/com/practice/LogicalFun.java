package com.practice;

public class LogicalFun {
    public static void main(String[] args) {

        boolean isRaining = false;
        boolean isWarm = false;

        // && both truth values gives true and rest gives false
        // || both false values gives false and rest gives true
        // ! negates the original value
        boolean combined = isRaining && isWarm; //logical AND
        System.out.println("Is it raining and warm?: " + combined);

        combined = isRaining || isWarm; //logical OR
        System.out.println("Is it raining or warm?: " + combined);

        combined = !isRaining; //logical NOT
        System.out.println("Is it not raining outside?: " + combined);

    }//end of main
}
