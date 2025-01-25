package Assignment_3_interfaces;

public class Solution_15 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable extends Selectable {
        void refresh();
    }
    class Screen implements Updatable {
        public void refresh() {
            System.out.println("Screen refreshed");
        }

        @Override
        public void onSelect() {
            System.out.println("Screen onSelected");
        }
    }
}
