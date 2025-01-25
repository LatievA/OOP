package Assignment_3_interfaces;

public class Solution_7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString()); //extra )
    }

    interface Desire {
    }

    interface Dream {
        //not private
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire { //to work directly without creating Dream object
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++; //two ++ enough
            return "" + INDEX;
        }
    }
}
