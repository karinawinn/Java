import java.util.Random;

public class Number implements NumberGenerator {

    private int num;

    // This function generates a random number to be guessed by the player.
    public void generateNumber() {
        Random rand = new Random();
        num = rand.nextInt(101);
    }
    // This function returns the target number.
    public int showNumber() {
        return num;
    }
    // This function returns true if the player's guess is correct.
    public boolean isGuessCorrect(int guess) {
        boolean correct = false;
        if (guess == num) {
            correct = true;
        }
        return correct;
    }
    // This function returns true if the player's guess is higher than the target number.
    public boolean isHigher(int guess) {
        boolean higher = false;
        if (guess < num) {
            higher = true;
        }
        return higher;
    }
}
