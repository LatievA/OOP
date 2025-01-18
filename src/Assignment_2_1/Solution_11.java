package Assignment_2_1;

public class Solution_11 {
    public static int[][][] ultiarray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
    public static void main(String[] args) {
        for (int i = 0; i < ultiarray.length; i++) {
            for (int j = 0; j < ultiarray[i].length; j++) {
                for (int k = 0; k < ultiarray[i][j].length; k++) {
                    System.out.print(ultiarray[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}

