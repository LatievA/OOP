package Assignment_3_interfaces;

public class Solution_6 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    public static class Screen implements Selectable, Updatable {
        @Override
        public void refresh() {
            System.out.println("Refreshing screen");
        }
        @Override
        public void onSelect() {
            System.out.println("Selected screen");
        }
    }
}
