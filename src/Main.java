// Assignment 1.1
// Task 1
//public class Main {
//    public static void main(String[] args) {
//        String name;
//        int age;
//        String city;
//    }
//}

// Task 2
//public class Main {
//    public static void main(String[] args) {
//        int a = 1,b = 2;
//    }
//}

// Task 3
//public class Main {
//    public static void main(String[] args) {
//        int year = 3126, age = 8;
//        System.out.println("Year of birth: "+ (year-age));
//    }
//}

// Task 4
//public class Main {
//    public static void main(String[] args) {
//        String word = "cat", phrase = "black cat", line = "my cat is black", text = "I have two cats";
//    }
//}

// Assignment 1.2
import java.util.Scanner;

// Task 1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the outside temperature: ");
//        int temperature = scanner.nextInt();
//        if (temperature < 0) {
//            System.out.println("it’s cold outside.");
//        } else {
//            System.out.println("it’s warm outside.");
//        }
//        scanner.close();
//    }
//}

// Task 2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        if (age >= 18 && age <= 28) {
//            System.out.println(name + ", come to the military registration and enlistment office");
//        }
//        scanner.close();
//    }
//}

// Task 3
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter body temperature: ");
//        double temperature = scanner.nextDouble();
//
//        boolean isHigh = temperature > 37.5;
//        boolean isLow = temperature < 36.0;
//
//        if (isHigh) {
//            System.out.println("The body temperature is high.");
//        } else if (isLow) {
//            System.out.println("The body temperature is low.");
//        } else {
//            System.out.println("The body temperature is normal.");
//        }
//
//        scanner.close();
//    }
//}

// Task 4
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        if (age < 20 || age > 60) {
//            System.out.println("you don’t have to work.");
//        }
//
//        scanner.close();
//    }
//}

// Task 5
//public class Main {
//    public static void main(String[] args) {
//        String quote = "I will never work for pennies.";
//        int count = 0;
//
//        while (count < 100) {
//            System.out.println(quote);
//            count++;
//        }
//    }
//}

// Task 6
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        while (true) {
//            String input = scanner.nextLine();
//
//            if (input.equals("ENTER")) {
//                break;
//            }
//
//            sum += Integer.parseInt(input);
//        }
//
//        System.out.println("The total sum is: " + sum);
//        scanner.close();
//    }
//}

// Task 7
//public class Main {
//    public static void main(String[] args) {
//        int height = 5;
//        int width = 10;
//        int i = 0;
//
//        while (i < height) {
//            int j = 0;
//            while (j < width) {
//                System.out.print("Q");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}

// Task 8
//public class Main {
//    public static void main(String[] args) {
//        int sum = 0;
//        int number = 1;
//
//        while (number <= 100) {
//            if (number % 3 == 0) {
//                number++;
//                continue;
//            }
//            sum += number;
//            number++;
//        }
//
//        System.out.println("The sum is: " + sum);
//    }
//}

// Task 9
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 15; i += 2) {
//            System.out.println(i);
//        }
//    }
//}

// Task 10
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        int multiple = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = start; i < end; i++) {
//            if (i % multiple != 0) {
//                continue;
//            }
//            sum += i;
//        }
//
//        System.out.println(sum);
//        scanner.close();
//    }
//}

// Task 11
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}