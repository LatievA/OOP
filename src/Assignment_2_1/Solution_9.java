package Assignment_2_1;

public class Solution_9 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][];
        for (int i = 0; i < 10; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                matrix[i][j] = i + j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
