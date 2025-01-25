package Assignment_3_2;

import java.util.Arrays;


public class Memory_task11 {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, null,
                "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int non_null = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[non_null] = array[i];
                non_null++;
            }
        }

        for (int i = non_null; i < array.length; i++) {
            array[i] = null;
        }
    }
}