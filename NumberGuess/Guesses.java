import java.util.HashSet;
import java.util.*;

public class Guesses implements GuessTracker {
    
    private HashSet<Integer> guesses;

    // Constructor for Guesses class
    public Guesses() {
        guesses = new HashSet<>();
    }

    /* This function adds the users guess to a set and prints a message if the number
     * has already been guessed.
     */
    public void addGuess(int guess) {
        if (guesses.contains(guess)) {
            System.out.println("You've already guessed this number. Try again.");
        }
        else {
            guesses.add(guess);
        }
    }

    // This function returns the number of times the player has guessed. 
    public int totalGuesses() {
        return guesses.size();
    }

    // This function returns a list of the players past guesses.
    public List<Integer> listGuesses() {
        return new ArrayList<>(guesses);
    }
}
