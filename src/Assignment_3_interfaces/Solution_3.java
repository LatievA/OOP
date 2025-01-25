package Assignment_3_interfaces;

public class Solution_3 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Human {
        public void swim() {
            System.out.println("I'm a human and can swim");
        }

        public void run() {
            System.out.println("I'm human and can run");
        }
    }

    public class Duck {
        public void swim() {
            System.out.println("I'm a duck and can swim");
        }

        public void run() {
            System.out.println("I'm a duck and can run");
        }

        public void fly() {
            System.out.println("I'm a duck and can fly");
        }
    }

    public class Penguin {
        public void swim() {
            System.out.println("I'm a penguin and can swim");
        }

        public void run() {
            System.out.println("I'm a penguin and can run");
        }
    }
    public class Airplane {
        public void fly() {
            System.out.println("I'm an airplane and can fly");
        }

    }
}
