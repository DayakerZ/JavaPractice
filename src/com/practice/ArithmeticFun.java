package com.practice;
public class ArithmeticFun {

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int result = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;

        System.out.println("Result is "+result);
        System.out.println("difference is "+difference);
        System.out.println("product is "+product);
        System.out.println("quotient is "+quotient);
        System.out.println("remainder is "+remainder);
        result += result;
        difference  -= difference;
        product *= product;
        quotient /= 2;
        remainder %= 2;
        System.out.println(result);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

    }
}
