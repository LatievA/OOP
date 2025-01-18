package Assignment_2_1;

import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the number: ");
                arr[i] = in.nextInt();
            }
            System.out.print("The array is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            in.close();
        }
    }
}
