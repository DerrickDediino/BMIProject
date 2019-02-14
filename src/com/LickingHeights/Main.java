package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //declare

        int BMI;
        int weightInKg, heightInM;
        double weightInLb, heightInFt;
        Scanner keyboard;




        //initialize

        keyboard = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        weightInKg = keyboard.nextInt();
        System.out.println("What is your height in feet?");
        heightInM = keyboard.nextInt();
        BMI = weightInKg/(heightInM*heightInM);
        weightInLb = weightInKg*(1/0.453592);
        heightInFt = heightInM*(0.3048);























    }
}
