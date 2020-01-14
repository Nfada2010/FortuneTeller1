package org.wcci;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        // ask for first name
        System.out.println("What is your first name");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println(firstName);

        // ask for last name
        System.out.println("What is your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);

        // ask for age
        System.out.println("What is your age (give me an Integer value)");
        int age = input.nextInt();
        System.out.println(age);

        // ask birth month as int
        System.out.println("What is your birth month (give me an Integer value)");
        int birthMonth = input.nextInt();
        System.out.println(birthMonth);

        //ask for ROYGBIV favorite color
        input.nextLine();
        System.out.println("What is your favorite ROYGBIV color if you don't know ask for HELP");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("Help")) {
            System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
            System.out.println("What is your Favorite Color");
            favoriteColor = input.nextLine();
        }
        System.out.println(favoriteColor);

        // number of siblings

        System.out.println("How many Siblings do you have (give me an Integer value)");
        int siblings = input.nextInt();
        System.out.println(siblings);

        // Part 2 determine years till retirement
        int numberOfYearsUntilRetirement = 0;
        if (age % 2 == 0) {
            numberOfYearsUntilRetirement = 24;
        } else {
            numberOfYearsUntilRetirement = 17;

        }

        System.out.println(numberOfYearsUntilRetirement);

        String vacationHomeLocation = "";
        if (siblings == 0) {
            vacationHomeLocation = "Boca Raton";

        } else if (siblings == 1) {
            vacationHomeLocation = "Nassu";

        } else if (siblings == 2) {
            vacationHomeLocation = "Portna Negra";
        } else if (siblings == 3) {
            vacationHomeLocation = "Portland";
        } else if (siblings > 3) {
            vacationHomeLocation = "Baton Rouge";
        } else {
            vacationHomeLocation = "Chernobyl";

        }
        System.out.println(vacationHomeLocation);

        String modeOfTransportation = "";
        switch (favoriteColor) {
            case "Red":
                modeOfTransportation = "Maserati";
                break;
            case "Orange":
                modeOfTransportation = "Stallion";
                break;
            case "Yellow":
                modeOfTransportation = "Chariot";
                break;
            case "Green":
                modeOfTransportation = "Taxi";
                break;
            case "Blue":
                modeOfTransportation = "Rickshaw";
                break;
            case "Indigo":
                modeOfTransportation = "Motor Scooter";
                break;
            case "Violet":
                modeOfTransportation = "Flying Saucer";
                break;
            default:
                modeOfTransportation = "Learn your colors";
        }
        System.out.println(modeOfTransportation);
        double bankBalance = 0.0;
        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 500000000.02;
        } else if (birthMonth >= 5 && birthMonth <= 8) {
            bankBalance = 250000.45;
        } else if (birthMonth >= 9 && birthMonth <= 12) {
            bankBalance = 2000000000.25;
        } else {
            bankBalance = -54000.34;
        }
        System.out.println(bankBalance);
        System.out.println(firstName + lastName + "will retire in" + numberOfYearsUntilRetirement + "with" + bankBalance + "inthebank" + "You will vaction at" + vacationHomeLocation + "and travel by" + modeOfTransportation + ".");


    }






}








        /*
        write multiple lines of comments in code
         */




