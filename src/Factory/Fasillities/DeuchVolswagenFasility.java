package Factory.Fasillities;

import Factory.Cars.*;

public class DeuchVolswagenFasility extends VoltswagerFasilities {
    @Override
    public Car CreateCar(String type) {
        Car car = new Car();

        if(type == "Golf"){
            car = new DeuchGolf();
        } else if(type == "Passat"){
            car = new DeuchPassat();
        } else if(type == "Tiguan"){
            car = new DeuchTiguan();
        }else if(type == "Tuareg"){
            car = new DeuchTuareg();
        }
        return car;
    }
}
