public class Main {
    public static void main() {
        MyClass number = new MyClass(25); // Creates new instance of MyClass

        number.plusTwo();
        number.showNumber(); // Should print 27
        number.plusOne();
        number.plusTwo();
        number.showNumber(); // Should print 30
    }
}