package Decorator.Decorator;

import Decorator.Beverage.BeverageBase;

public class MilkCondiment extends CondimentsDecoratorBase {
    private BeverageBase beverage;

    public MilkCondiment(BeverageBase beverage){
        this.beverage = beverage;
        desctiption = this.beverage.getDesctiption() + " + milk";
    }
    @Override
    public double GetCost() {
        return beverage.GetCost() + 50;
    }
}
