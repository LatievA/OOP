package Assignment_3_interfaces;

import java.io.IOException;

public class  Solution_9 {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        double showSpeed();
    }

    interface CanFly extends CanMove {
        double showSpeed(CanFly canFly);
    }
}
