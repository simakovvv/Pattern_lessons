package Factory.Cars;


import Factory.Cars.Car;
import Factory.PartsFactory.CarPartsFactory;

public class Tiguan extends Car {
    private CarPartsFactory carPartsFactory;
    public Tiguan(CarPartsFactory carPartsFactory){
        this.carPartsFactory = carPartsFactory;
        name = "Tiguan";
        body = "Crossover";

    }

    @Override
    public void Configure() {

        System.out.println(("Configuring: "+ name));
        System.out.println(("Configuring: "+ body));

        engine = carPartsFactory.CreateEngine();
        paintColor = carPartsFactory.CreatePaint();
        wheels = carPartsFactory.CreateWheels();
    }
}
