import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public void main() {
    ArrayList<Integer> numberList = new ArrayList<Integer>(); // Create an ArrayList object
    numberList.add(10);
    numberList.add(34);
    numberList.add(62);
    System.out.println(numberList); // Should show 10, 34, 62
    System.out.println("The second number in the list is " + numberList.get(1)); // Should print 34.
    numberList.set(0,85);
    System.out.println(numberList.get(0)); // Should print 85.
    numberList.remove(2);
    System.out.println(numberList); // Should show 85, 34
    numberList.clear();
    System.out.println(numberList); // Should print nothing.
    System.out.println(numberList.size()); // Should print 0.

    HashSet<String> fruits = new HashSet<String>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("grape");
    fruits.add("strawberry");
    fruits.add("banana"); // This one shouldn't be added becuase it's a duplicate.
    System.out.println(fruits); // Should show apple, banana, grape, strawberry in no particular order
    if (fruits.contains("apple")) {
        System.out.println("This set has apple"); // Should print.
    }
    fruits.remove("grape");
    System.out.println(fruits); // Printed list shouldn't have grape anymore.
    System.out.println(fruits.size()); // Should print 3.
    fruits.clear();
    System.out.println(fruits); // Shouldn't print anything.
    }
}