package Assignment_3_interfaces;

public class Solution_10 {
    public static void main(String[] args) throws Exception {
    }
    interface Person {
        void use(Person person);
        void startToWork();
    }
    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }
    interface Secretary extends Person {

    }
    interface Boss extends Person, HasManagementPotential {
    }
    class Manager implements Boss {
        public void use(Person person) {
            System.out.println("I am Manager and command to work to " + person);
        }
        public void startToWork() {
            System.out.println("I am Manager and starting to work to " + this);
        }
        public boolean inspiresOthersToWork() {
            return true;
        }
    }
    class Subordinate implements Secretary {
        public void use(Person person) {
            System.out.println("Subordinate use power of " + person);
        }
        public void startToWork() {
            System.out.println("Subordinate start to work");
        }
    }
}
