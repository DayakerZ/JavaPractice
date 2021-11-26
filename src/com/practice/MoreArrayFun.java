package com.practice;

public class MoreArrayFun {

    public static void main(String[] args) {

        int[] integerArray = new int[10];
        for (int i = 0;i < integerArray.length;i++){
            integerArray[i] = i+1;
        }
        for(int number : integerArray){
            System.out.println(number);
        }
    }
}
