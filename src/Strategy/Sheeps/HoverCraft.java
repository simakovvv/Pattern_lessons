package Strategy.Sheeps;

import Strategy.Movement.BladeSkrew;
import Strategy.Purpose.Martial;
import Strategy.ShipBase;

public class HoverCraft extends ShipBase {
    public HoverCraft(){
        mvm = new BladeSkrew();
        prp = new Martial();
    }
    @Override
    public void display() {
        System.out.println(" i hovercraft ");
    }

}
