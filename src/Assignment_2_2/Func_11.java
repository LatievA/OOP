package Assignment_2_2;

public class Func_11 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }
    public static void printSqrt(int[] array) {
        String elementSqrt = "The square root for the number ";
        for (int element: array) {
            double elementSqrtValue = Math.sqrt(element);
            System.out.println(elementSqrt + element + " equals " + elementSqrtValue);
        }
    }
}
