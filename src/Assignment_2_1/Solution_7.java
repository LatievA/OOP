package Assignment_2_1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[6];
        ArrayList<String> temp = new ArrayList<>();
        String[] res = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextLine();
        }
        in.close();
        for (int i = 0; i < 6 - 1; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (Objects.equals(arr[i], arr[j])) {
                    temp.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (Objects.equals(arr[i], temp.get(j))) {
                    res[i] = null;
                    break;
                }
                res[i] = arr[i];
            }

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
