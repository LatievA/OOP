package Assignment_2_1;

import java.util.Scanner;

public class Solution_13 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        int max = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum is " + max);
        in.close();
    }
}
