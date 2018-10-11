package Decorator.Decorator;

import Decorator.Beverage.BeverageBase;
import Strategy.ShipBase;

public class ShocolateCondiment extends CondimentsDecoratorBase {
    private BeverageBase beverageBase;
    public ShocolateCondiment(BeverageBase beverageBase){
        this.beverageBase = beverageBase;
        desctiption = beverageBase.getDesctiption() + " + chocolate";
    }
    @Override
    public double GetCost() {
        return beverageBase.GetCost() + 70;
    }
}
