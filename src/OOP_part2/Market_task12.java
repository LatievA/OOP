package OOP_part2;

public class Market_task12 {
    private static boolean has_eggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean has_eggs) {
        if (has_eggs) {
            System.out.println("Bought 10 Batons");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
}