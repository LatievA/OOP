package Assignment_2_2;

public class Func_6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod("Hello, world!");
        universalMethod(42);
        universalMethod(3.14);
        universalMethod(true);
        universalMethod("Repeat this", 3);
        universalMethod(10, 20);
        universalMethod(1.2, 3.4, 5.6);
        universalMethod("Java", "Overloading");
        universalMethod(new int[]{1, 2, 3, 4, 5});
    }

    public static void universalMethod() {
        System.out.println("This is a universal method with no parameters.");
    }

    public static void universalMethod(String message) {
        System.out.println("String parameter: " + message);
    }

    public static void universalMethod(int number) {
        System.out.println("Integer parameter: " + number);
    }

    public static void universalMethod(double value) {
        System.out.println("Double parameter: " + value);
    }

    public static void universalMethod(boolean flag) {
        System.out.println("Boolean parameter: " + flag);
    }

    public static void universalMethod(String message, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Repeated message: " + message);
        }
    }

    public static void universalMethod(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    public static void universalMethod(double a, double b, double c) {
        System.out.println("Product of doubles: " + (a * b * c));
    }

    public static void universalMethod(String str1, String str2) {
        System.out.println("Concatenated Strings: " + str1 + " " + str2);
    }

    public static void universalMethod(int[] numbers) {
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
