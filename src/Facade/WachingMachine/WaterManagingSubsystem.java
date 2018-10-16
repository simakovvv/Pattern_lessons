package Facade.WachingMachine;

import java.util.Formatter;

public class WaterManagingSubsystem {
    public void FillWater(int litres){
        System.out.println(new Formatter().format("Fill with %d liter of water", litres));
    }
    public void EmptyWater(){
        System.out.println("Empty water tank");
    }
}
