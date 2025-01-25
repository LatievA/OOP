package Assignment_3_interfaces;

public class Solution_2 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog {
        public void move() {
            System.out.println("I can move and I'm a dog");
        }
        public void eat() {
            System.out.println("I can eat and I'm not meal");
        }
    }

    public class Duck {
        public void move() {
            System.out.println("I can move and I'm a duck");
        }

        public void eat() {
            System.out.println("I can eat and I'm meal for someone");
        }

        public void fly() {
            System.out.println("I can fly and I'm a duck");
        }
    }

    public class Car {
        public void move() {
            System.out.println("I can move and I'm a car");
        }
    }

    public class Airplane {
        public void move() {
            System.out.println("I can move and I'm airplane");
        }

        public void fly() {
            System.out.println("I can fly and I'm airplane");
        }
    }
}
