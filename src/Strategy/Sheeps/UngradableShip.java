package Strategy.Sheeps;

import Strategy.Movement.IMovement;
import Strategy.Movement.WithoutMove;
import Strategy.Purpose.IPurpose;
import Strategy.Purpose.WithoutPurpose;
import Strategy.ShipBase;

public class UngradableShip extends ShipBase {
    public UngradableShip(){
        mvm = new WithoutMove();
        prp = new WithoutPurpose();
    }
    @Override
    public void display() {
        System.out.println("I'm a upgradable ship");
    }

}
