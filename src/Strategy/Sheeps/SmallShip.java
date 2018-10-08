package Strategy.Sheeps;

import Strategy.Movement.WaterGet;
import Strategy.Purpose.Fishing;
import Strategy.ShipBase;

public class SmallShip extends ShipBase {
    public SmallShip(){
        mvm = new WaterGet();
        prp = new Fishing();
    }
    @Override
    public void display() {
        System.out.println(" I am a small fishing boat ");
    }
}
