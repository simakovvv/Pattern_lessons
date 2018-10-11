package Factory.Fasillities;

import Factory.Cars.Car;
import Factory.Factory.SimpleFactory;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public abstract class VoltswagerFasilities {


    public Car getCar(String type) throws FileNotFoundException, UnsupportedEncodingException {

        Car car = CreateCar(type);
        car.Configure();
        car.AssembleBody();
        car.InstallEngine();
        car.installWheels();
        car.Paint();
        return car;
    }
    public abstract Car CreateCar(String type);
}
