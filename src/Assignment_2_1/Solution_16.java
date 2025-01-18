package Assignment_2_1;

import java.util.Scanner;

public class Solution_16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println((" ").repeat(height - i - 1) + ("#").repeat(2*i+1));
        }

        sc.close();
    }
}
