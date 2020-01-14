package org.wcci;

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






        /*
        write multiple lines of comments in code
         */



    }
}
