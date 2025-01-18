package Assignment_2_1;

import java.util.Scanner;

public class Solution_10 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[in.nextInt()];
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[] ");
            }
            System.out.println();
        }
        in.close();
    }
}
