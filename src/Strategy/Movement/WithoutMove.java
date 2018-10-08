package Strategy.Movement;

import Strategy.ShipBase;

public class WithoutMove implements IMovement {

    @Override
    public void move() {
        System.out.println( "I'm not a floating boat");
    }
}
