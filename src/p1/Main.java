package p1;

/*
 * Demo program for an ordering system
 * CSC 164
 * Eric Mailman
 * 21Jan16
 * Version 1.0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;
        double price;
        String sandwich = "";

        System.out.println("Welcome to Jimmy Johns");

        do {
            System.out.println("(H)am");
            System.out.println("(R)oast Beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            // Get user input, convert to upper case and get first character
            String choice = input.next();
            option = choice.toUpperCase().charAt(0);

            switch (option) {
                // Ham
                case 'H':
                    price = 5.50;
                    sandwich = "Ham";
                    break;

                // Roast beef
                case 'R':
                    price = 6.00;
                    sandwich = "Roast beef";
                    break;

                // Salami
                case 'S':
                    price = 5.25;
                    sandwich = "Salami";
                    break;

                // Tuna
                case 'T':
                    price = 5.00;
                    sandwich = "Tuna";
                    break;

                // Done ordering
                case 'D':
                    price = 0;
                    break;

                default:
                    price = 0;
                    System.out.printf("Your choice, %s, is not available\nMake another choice:\n", choice);
            }

            // Give the user the order information if valid order
            if (price != 0)
                System.out.printf("%s Sandwich Cost $%.2f\n", sandwich, price);

        } while (option != 'D');

        System.out.println("Thank you for ordering at Jimmy Johns");
    }
}
