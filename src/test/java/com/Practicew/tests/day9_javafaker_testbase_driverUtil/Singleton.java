package com.Practicew.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    private static String word; //variables


    private Singleton(){} //constructor


    public static String getWord(){ //getter


        if(word==null){
            System.out.println("First time call. Word object is null." + "Assigning value to it now!");
            word = "something";

        }else{
            System.out.println("Word already has value");
        }

        return word;
    }
}
