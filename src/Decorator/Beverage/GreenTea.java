package Decorator.Beverage;

public class GreenTea extends BeverageBase {
    public GreenTea(){
        desctiption = "Green leaf tea";
    }
    @Override
    public double GetCost() {
        return 125;
    }
}
