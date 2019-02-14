package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //declare

        int BMI;
        int weightInKg, heightInM;
        double weightInLb, heightInInches;
        String Name;
        Scanner keyboard;




        //initialize

        keyboard = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        Name = keyboard.nextLine();
        System.out.println("Greetings " + Name + "." + "  This is the BMI calculator.");
        System.out.println("Please type your weight in pounds.");
        weightInKg = keyboard.nextInt();
        System.out.println("Now, do the same for your height(in inches).");
        heightInM = keyboard.nextInt();
        weightInLb = weightInKg*(0.453592);
        heightInInches = heightInM*(0.0254);
        BMI = weightInKg/(heightInM*heightInM);


        //Apply



        System.out.println(Name + ", your BMI = " + BMI);























    }
}
