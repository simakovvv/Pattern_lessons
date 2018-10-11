package Decorator.Beverage;

import Decorator.Beverage.BeverageBase;

public class BlackTea extends BeverageBase {
    public BlackTea(){
        desctiption = "Black tea from teabag";
    }
    @Override
    public double GetCost() {
        return 25;
    }


}
