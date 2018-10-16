package Factory.PartsFactory;

import Factory.Parts.AbstractParts.Engine;
import Factory.Parts.AbstractParts.Paint;
import Factory.Parts.AbstractParts.Wheels;
import Factory.Parts.RealParts.BlackPaint;
import Factory.Parts.RealParts.GasolineEngine;
import Factory.Parts.RealParts.MediumWheels;

public class RussianCarPartsFactory extends CarPartsFactory {
    @Override
    public Engine CreateEngine() {
        return new GasolineEngine();
    }

    @Override
    public Paint CreatePaint() {
        return new BlackPaint();
    }

    @Override
    public Wheels CreateWheels() {
        return new MediumWheels();
    }
}
