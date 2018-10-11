package Factory.Factory;

import Factory.Cars.*;

public class SimpleFactory {
    public Car GetCar(String type){
        Car car = new Car();

        if(type == "RussianGolf"){
            car = new RussianGolf();
        } else if(type == "RussianPassat"){
            car = new RussianPassat();
        } else if(type == "RussianTiguan"){
            car = new RussianTiguan();
        }else if(type == "RussianTuareg"){
            car = new RussianTuareg();
        }
        return car;
    }
}
