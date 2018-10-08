package Strategy.Sheeps;

import Strategy.Movement.Engine;
import Strategy.Purpose.Cargo;
import Strategy.ShipBase;

public class CargoChip extends ShipBase {
    public CargoChip(){
        mvm = new Engine();
        prp = new Cargo();
    }
    @Override
    public void display() {
        System.out.println(" I am a barge ");
    }

}
