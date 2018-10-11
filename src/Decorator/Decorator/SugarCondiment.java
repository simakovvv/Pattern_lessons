package Decorator.Decorator;

import Decorator.Beverage.BeverageBase;

public class SugarCondiment extends CondimentsDecoratorBase {
    private BeverageBase beverageBase;
    public SugarCondiment(BeverageBase beverageBase){
        this.beverageBase = beverageBase;
        desctiption = beverageBase.getDesctiption() + " + sugar";
    }
    @Override
    public double GetCost() {
        return beverageBase.GetCost() + 10;
    }
}
