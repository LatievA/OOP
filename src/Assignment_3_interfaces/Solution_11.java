package Assignment_3_interfaces;

public class Solution_11 {
    public static void main(String[] args) {
    }
    //can move
    public interface Movable {
        void move();
    }
    //can be eaten
    public interface Edible {
        void beEaten();
    }
    // might eat someone
    public interface Eat {
        void eat();
    }
}
