package Factory.Fasillities;

import Factory.Cars.*;
import Factory.PartsFactory.CarPartsFactory;
import Factory.PartsFactory.RussianCarPartsFactory;

public class RussianVolswagenFasility extends VoltswagerFasilities {
    private CarPartsFactory carPartsFactory;
    @Override
    public Car CreateCar(String type) {


        carPartsFactory = new RussianCarPartsFactory();

        if(type == "Golf"){
            return new Golf(carPartsFactory);
        } else if(type == "Passat"){
            return new Passat(carPartsFactory);
        } else if(type == "Tiguan"){
            return new Tiguan(carPartsFactory);
        }else if(type == "Tuareg"){
            return new Tuareg(carPartsFactory);
        }
        return null;
    }
}
