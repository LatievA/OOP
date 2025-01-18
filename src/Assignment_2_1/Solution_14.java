package Assignment_2_1;

import java.util.Scanner;

public class Solution_14 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        int minRow1 = 0, minRow2 = 0, minRow3 = 0, minCol1 = 0, minCol2 = 0, minCol3 = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            minRow1 += array[i][0];
            minRow2 += array[i][1];
            minRow3 += array[i][2];
            minCol1 += array[0][i];
            minCol2 += array[1][i];
            minCol3 += array[2][i];
        }
        int[] minArray = new int[6];
        minArray[0] = minRow1;
        minArray[1] = minRow2;
        minArray[2] = minRow3;
        minArray[3] = minCol1;
        minArray[4] = minCol2;
        minArray[5] = minCol3;
        for (int i = 0; i < minArray.length; i++) {
            for (int j = 0; j < minArray.length - 1 - i; j++) {
                if (minArray[j] < minArray[j + 1]) {
                    int temp = minArray[j];
                    minArray[j] = minArray[j + 1];
                    minArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The minimum is " + minArray[5]);
        in.close();
    }
}
