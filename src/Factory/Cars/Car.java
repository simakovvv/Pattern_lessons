package Factory.Cars;

import Factory.Parts.AbstractParts.Engine;
import Factory.Parts.AbstractParts.Paint;
import Factory.Parts.AbstractParts.Wheels;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public abstract class Car {
    protected String name = "";
    protected String body = "Caravan";

    protected Paint paintColor ;
    protected Wheels wheels ;
    protected Engine engine ;
    public abstract void Configure();

    public void AssembleBody(){
        System.out.println("Body is assembled");
    }
    public void InstallEngine(){
        System.out.println("Engine is in its place");
    }
    public void Paint(){
        System.out.println("car is painted");
    }
    public void installWheels(){
        System.out.println("Wheels are installed");
    }

}
