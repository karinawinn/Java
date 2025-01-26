public interface NumberGenerator {
    /* This is the interface that will be implemented in the 
     * Number class. Below there is a method that matches each 
     * method in the Number class.
     */
    void generateNumber();
    int showNumber();
    boolean isGuessCorrect(int guess);
    boolean isHigher(int guess);
}
