import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Sets up scanner to read user input.
        String cont = "yes"; // Creates variable to track whether to play again.

        while (cont.equals("yes")) {
            NumberGenerator target = new Number(); // Creates a new instance of Number class.
            target.generateNumber(); // Generates the target number. 
            GuessTracker guessList = new Guesses(); // Creates a new instance of the Guesses class.

            System.out.println("Welcome to the number guessing game!"); 
            System.out.println("In this game you have ten opportunities to correctly guess the number between 0 and 100.");
            boolean won = false; // Boolean to keep track of whether the player has won.

            while (guessList.totalGuesses() < 10) {
                System.out.println("Enter your next guess:");
                int guess = scanner.nextInt(); // Reads player's guess.
                guessList.addGuess(guess); // Adds player's guess to the set. 

                if (target.isGuessCorrect(guess)) { // Runs if the player guessed correctly.
                    System.out.println("Congratulations! You won!");
                    // Prints player's guesses and total number of guesses.
                    System.out.printf("You guessed " + guessList.listGuesses() + " for a total of " + guessList.totalGuesses() + " guesses. ");
                    won = true; 
                    break; // Breaks loop.
                }
                else {
                    boolean higher = target.isHigher(guess); // Determines if target is higher than guess.
                    if (higher) {
                        System.out.println("Incorrect guess. The number is higher than your guess. Try again.");
                    }
                    else {
                        System.out.println("Incorrect guess. The number is lower than your guess. Try again.");
                    }
                }
            }
            if (!won) { // If player lost, prints message and correct number. 
                System.out.println("Sorry, you lost. The correct number was " + target.showNumber() + ".");
            }
            // Asks user if they want to play again. Runs again if user says yes.
            System.out.println("Would you like to play again? (yes/no)"); 
            scanner.nextLine();
            cont = scanner.nextLine();
        }
        // Prints end message and closes scanner.
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}