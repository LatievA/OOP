package Assignment_2_2;

public class Func_5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
