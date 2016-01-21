package p1;

/*
 * Demo program for an ordering system
 * CSC 164
 * Eric Mailman
 * 21Jan16
 * Version 0.1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;

        System.out.println("Welcome to Jimmy Johns");

        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            // Get user input and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            // Get the first character of the user input
            option = choice.charAt(0);

            System.out.println("choice = " + choice + " ; option = " + option);
        } while (option != 'D');

        System.out.println("Thank you for ordering at Jimmy Johns");
    }
}
