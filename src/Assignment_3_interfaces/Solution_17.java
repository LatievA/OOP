package Assignment_3_interfaces;

import java.awt.*;

public class Solution_17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
        String getName();
    }

    public static class Fox implements Animal {
        @Override
        public Color getColor() {
            return Color.ORANGE; // Provide a valid color
        }

        @Override
        public String getName() {
            return "Fox";
        }
    }

    // Provide a concrete implementation of BigFox
    public static class BigFox extends Fox {
        @Override
        public String getName() {
            return "Big Fox"; // Custom name for BigFox
        }
    }
}
