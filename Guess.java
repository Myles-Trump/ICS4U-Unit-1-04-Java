/*
* The "Guess" program makes you guess at a random number
* until you get it right
*
* @author  Myles Trump
* @version 1.0
* @since   2020-11-24
*/

import java.util.Scanner;

/**
* This is the "Guess"  program.
*/
final class Guess {

    /**
    * Loop number.
    */
    public static final double LOOP_COUNTER = 1.0;

    /**
    * Six.
    */
    public static final int SIX = 6;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Guess() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // variables
        double totalTries = 0;

        final Scanner input = new Scanner(System.in);

        // block of code to try
        try {
            // keeps track of how many attempts the user has done
            totalTries = totalTries + 1;

            // instance of random class
            int max = SIX;
            int min = 1;

            // generate random value from 1-6
            int randNum
                = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(randNum);

            // infinite loop until the break statement when correct
            while (LOOP_COUNTER > 0) {

                System.out.print("\nEnter an integer between 1-6: ");

                // stores user input
                int userInput = input.nextInt();

                // if the user gets it right
                if (userInput == randNum) {
                    System.out.print("\nYou have entered the correct answer!");
                    System.out.println("It took you " + totalTries + " tries!");
                    break;

                // if the user guesses too big
                } else if (userInput > SIX) {
                    System.out.print("\nYour integer is too large!");
                    System.out.println("This won't count.");

                // if the user guesses too small
                } else if (userInput < 1) {
                    System.out.print("\nYour integer is too small!");
                    System.out.println("This won't count.");

                // if the user is wrong
                } else {
                    System.out.println("\nYou are wrong. Try again!");
                    totalTries = totalTries + 1;
                }

            }

        // block of code to handle errors
        } catch (java.util.InputMismatchException errorCode) {

            System.out.println("\nYou have not entered a valid input.");
        }

        // done
        System.out.println("\n\nDone.");
    }
}

