package Decorator.Beverage;

import Decorator.Beverage.BeverageBase;

public class Espresso extends BeverageBase {

    public Espresso(){
        desctiption = "Small portion of strong coffe";
    }
    @Override
    public double GetCost() {
        return 150;
    }


}
