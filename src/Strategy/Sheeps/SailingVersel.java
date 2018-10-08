package Strategy.Sheeps;

import Strategy.Movement.Sails;
import Strategy.Purpose.Fishing;
import Strategy.ShipBase;

public class SailingVersel extends ShipBase {


    public SailingVersel(){
        mvm = new Sails();
        prp = new Fishing();
    }
    @Override
    public void display() {
        System.out.println(" I'm a ship ");
    }

}
