package Assignment_2_1;

import java.util.Scanner;

public class Solution_15 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] res = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[j][i] = count;
                count++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = array[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
