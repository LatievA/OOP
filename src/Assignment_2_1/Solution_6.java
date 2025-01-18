package Assignment_2_1;

import java.util.Scanner;

public class Solution_6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        in.close();
        System.out.println("The maximum is " + max);
    }
}
