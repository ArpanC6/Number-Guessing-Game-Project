/**
 * A fun Java Number Guessing Game
 * The computer generates a random number (1–100),
 * and the user tries to guess it with hints.
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Auto-close Scanner
            Random rand = new Random();

            int numberToGuess = rand.nextInt(100) + 1;
            int guess = 0, attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                }
            }
        }
    }
}