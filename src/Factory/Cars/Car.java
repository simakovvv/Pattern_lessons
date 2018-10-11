package Factory.Cars;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public class Car {
    protected String name = "";
    protected String engine = "Diesel";
    protected String paintColor = "White";
    protected String wheels = "16 inch";
    protected String body = "Caravan";

    public void Configure() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(("Configuring: "+ name));
        System.out.println(("Configuring: "+ engine));
        System.out.println(("Configuring: "+ paintColor));
        System.out.println(("Configuring: "+ wheels));
        System.out.println(("Configuring: "+ body));
    }

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
