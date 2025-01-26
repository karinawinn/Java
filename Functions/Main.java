public class Main {
    // This function returns the given number times 9 plus 32 divided by 10
    static double function(double number) {
        return ((number*9) + 32)/10;
    }
    public static void main() {
        double number = 27.5;
        double answer = function(number); // Runs number through function
        System.out.println(answer); // answer should be 27.95
    }
}