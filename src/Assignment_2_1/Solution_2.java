package Assignment_2_1;

public class Solution_2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] arr = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = ODD;
            } else {
                arr[i] = EVEN;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
