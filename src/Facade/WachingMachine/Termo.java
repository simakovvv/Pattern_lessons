package Facade.WachingMachine;

import sun.misc.FormattedFloatingDecimal;

import java.util.Formatter;

public class Termo {
    public void WarmUp(int degrees){
        System.out.println(new Formatter().format("Warm for %d degrees", degrees));
    }
}
