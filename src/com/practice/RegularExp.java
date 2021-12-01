package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\.");//[.] can also be used instead of \\.
        String[] tokens = pattern.split("www.google.com");
        for(String token:tokens){
            System.out.println(token);
        }
       /* Matcher matcher = pattern.matcher("aababbcdaaa");
        while(matcher.find()){
            System.out.println(matcher.start()+"......"+matcher.group());
        }*/
    }//end of main
    //Quantifiers +(one or more) *(zero or more) ?(atmost one)
    //split() method pattern.split("String to be splitted")
}
