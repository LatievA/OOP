package Assignment_2_1;

import java.util.Scanner;

public class Solution_12 {
    public static int[][] array;
    public static void main(String[] args) {
        array = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                if (x == 0) {
                    System.out.println("NOT 0 PLEASE");
                    break;
                }
                array[i][j] = x;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
