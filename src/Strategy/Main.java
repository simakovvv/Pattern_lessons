package Strategy;

import Strategy.Movement.BladeSkrew;
import Strategy.Purpose.Fishing;
import Strategy.Sheeps.*;

import java.util.LinkedList;
import java.util.List;
//  an example of using the strategy pattern
public class Main {
    public static void main(String[] args) {
        List<ShipBase> ships = new LinkedList<>();

        ships.add( new SailingVersel());
        ships.add( new SmallShip());
        ships.add( new Boat());
        ships.add( new HoverCraft());
        ships.add( new CargoChip());

        for (ShipBase ship: ships){
            ship.display();
            ship.move();
            ship.doSomething();
            ship.beep();
            System.out.println("--");
        }

        //implementation example of late binding
        ShipBase upgradableShip = new UngradableShip();

        upgradableShip.display();
        upgradableShip.move();
        upgradableShip.doSomething();
        upgradableShip.beep();
        System.out.println("--");

        upgradableShip.setMoveBehavior(new BladeSkrew());
        upgradableShip.setPurposeBehavior(new Fishing());

        upgradableShip.move();
        upgradableShip.doSomething();

        System.out.println("--");
    }
}
