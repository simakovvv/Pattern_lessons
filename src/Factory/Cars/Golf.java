package Factory.Cars;


import Factory.Cars.Car;
import Factory.PartsFactory.CarPartsFactory;
import Strategy.Movement.Engine;

public class Golf extends Car {
    private CarPartsFactory carPartsFactory;
    public Golf(CarPartsFactory carPartsFactory){
        name = "Golf";
        body = "Hatchback";
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
