public class MyClass {

    private int number; // Number is a variable in the class.

    public MyClass(int num) { // Constructor for MyClass
        number = num;
    }

    public int plusOne() {
        return number++; // Should add 1 to number
    }

    public int plusTwo() {
        number = number + 2;
        return number; // should add 2 to number
    }

    public void showNumber() {
        System.out.println(number); // Should print number
    }


}
