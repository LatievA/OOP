class FirstClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] reversedArray = SecondClass.reverseAndFindMaxMin(numbers);

        System.out.print("RevArr: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        int max = SecondClass.getMax(numbers);
        int min = SecondClass.getMin(numbers);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

class SecondClass {

    public static int[] reverseAndFindMaxMin(int[] array) {
        int[] reversedArray = new int[array.length];
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }

        return reversedArray;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
