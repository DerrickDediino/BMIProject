package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //declare

        int BMI;
        int weightInKg, heightInMeters;
        Scanner keyboard;




        //initialize

        keyboard = new Scanner(System.in);
        System.out.println("What is your weight in kilograms?");
        weightInKg = keyboard.nextInt();
        System.out.println("What is your height in meters?");
        heightInMeters = keyboard.nextInt();
        BMI = weightInKg/(heightInMeters*heightInMeters);





















    }
}
