package Assignment_3_2;

public class Hedgehog_task13 {

    public void eat(Apple apple) {
        System.out.println("The apple has been eaten!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();

        Hedgehog_task13 hedgehog = new Hedgehog_task13();

        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
