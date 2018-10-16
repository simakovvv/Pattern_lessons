package Factory.Cars;


import Factory.Cars.Car;
import Factory.PartsFactory.CarPartsFactory;

public class Passat extends Car {
    private CarPartsFactory carPartsFactory;
    public Passat(CarPartsFactory carPartsFactory){
        name = "Passat";
        body = "Sedan";
        this.carPartsFactory = carPartsFactory;

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
