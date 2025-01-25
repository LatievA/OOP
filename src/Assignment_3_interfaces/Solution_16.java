package Assignment_3_interfaces;

import java.awt.*;

public class Solution_16 {
    public static void main(String[] args) throws Exception {
    }
    public interface Animal {
        Color getColor();
        Integer getAge();
        String getName();
    }
    public static class Fox implements Animal {
        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return 0;
        }

        @Override
        public String getName() {
            return "Fox.";
        }
    }
}
