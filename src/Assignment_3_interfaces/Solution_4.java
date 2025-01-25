package Assignment_3_interfaces;

public class Solution_4 {
    public static void main(String[] args) {

    }

    abstract static class Human implements CanSwim, CanRun {

    }

    interface CanSwim {
        public void swim();
    }

    interface CanRun {
        public void run();
    }

}
