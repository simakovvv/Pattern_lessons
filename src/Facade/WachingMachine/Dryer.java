package Facade.WachingMachine;

import java.util.Formatter;

public class Dryer {
    public void dry(int seconds, int intencity){
        System.out.println(new Formatter().format("Drying %d seconds with intensity %d",seconds,intencity));
    }
}
