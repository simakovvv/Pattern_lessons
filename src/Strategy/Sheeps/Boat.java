package Strategy.Sheeps;

import Strategy.Movement.Paddle;
import Strategy.Purpose.Walking;
import Strategy.ShipBase;

public class Boat extends ShipBase {
    public Boat(){
        mvm = new Paddle();
        prp = new Walking();
    }
    @Override
    public void display() {
        System.out.println(" I'm a boat ");
    }

}
