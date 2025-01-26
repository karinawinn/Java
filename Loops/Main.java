public class Main {
    public static void main() {
        int num = 9;
        // This is a while loop
        while (num < 20) {
            num++;
        }
        /* This is a do-while loop. It runs once and then checks 
         * if the condition is true. In this particular example, the do 
         * section should only run once, because once num gets to the 
         * while check, it won't pass. */
        do {
            num *= 10;
        }
        while (num < 20);
        // This is a for loop. It loops through numbers in a certain range.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int[] numbers = {5,7,3,9,10,15,34};
        // This is a for-each loop. It loops through each item in a list.
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}