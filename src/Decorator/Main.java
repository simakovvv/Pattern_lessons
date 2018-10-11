package Decorator;

import Decorator.Beverage.*;
import Decorator.Decorator.MilkCondiment;
import Decorator.Decorator.SugarCondiment;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        BeverageBase espresso = new Espresso();
        BeverageBase tea = new BlackTea();
        BeverageBase greenTea = new GreenTea();
        PrintBeverage(espresso);
        PrintBeverage(tea);
        PrintBeverage(greenTea);
        System.out.println( "-------------------------------------------");

        BeverageBase cappuchino = new SugarCondiment(new MilkCondiment(new Espresso()));
        BeverageBase greenTeaWithSugar = new SugarCondiment(new GreenTea());
        PrintBeverage(cappuchino);
        PrintBeverage(greenTeaWithSugar);


           }
    static void PrintBeverage(BeverageBase beverageBase){
        System.out.println( new Formatter().format("Beverage: %s; Price %s" ,beverageBase.getDesctiption(), beverageBase.GetCost()));
    }

}
