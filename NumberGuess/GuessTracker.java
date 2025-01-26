import java.util.List;

public interface GuessTracker {
    /* This is the interface that will be implemented in the 
     * Guesses class. Below there is a method that matches each 
     * method in the Guesses class.
     */
    void addGuess(int guess);
    int totalGuesses();
    List<Integer> listGuesses();
}
