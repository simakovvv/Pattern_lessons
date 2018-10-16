package Factory.Fasillities;

import Factory.Cars.*;
import Factory.PartsFactory.CarPartsFactory;
import Factory.PartsFactory.DeuchCarPartsFactory;
import Factory.PartsFactory.RussianCarPartsFactory;

public class DeuchVolswagenFasility extends VoltswagerFasilities {
    private CarPartsFactory carPartsFactory;
    @Override
    public Car CreateCar(String type) {


        carPartsFactory = new DeuchCarPartsFactory();

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
