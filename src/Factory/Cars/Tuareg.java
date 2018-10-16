package Factory.Cars;


import Factory.Cars.Car;
import Factory.PartsFactory.CarPartsFactory;

public class Tuareg extends Car {
    private CarPartsFactory carPartsFactory;
    public Tuareg(CarPartsFactory carPartsFactory){
        name = "Tuareg";
        body = "Big crossover";

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
