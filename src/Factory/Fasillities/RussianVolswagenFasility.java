package Factory.Fasillities;

import Factory.Cars.*;

public class RussianVolswagenFasility extends VoltswagerFasilities {
    @Override
    public Car CreateCar(String type) {
        Car car = new Car();

        if(type == "Golf"){
            car = new RussianGolf();
        } else if(type == "Passat"){
            car = new RussianPassat();
        } else if(type == "Tiguan"){
            car = new RussianTiguan();
        }else if(type == "Tuareg"){
            car = new RussianTuareg();
        }
        return car;
    }
}
