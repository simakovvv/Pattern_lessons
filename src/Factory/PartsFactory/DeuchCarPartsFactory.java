package Factory.PartsFactory;

import Factory.Parts.AbstractParts.Engine;
import Factory.Parts.AbstractParts.Paint;
import Factory.Parts.AbstractParts.Wheels;
import Factory.Parts.RealParts.BigWheels;
import Factory.Parts.RealParts.DieselEngine;
import Factory.Parts.RealParts.WhitePaint;

public class DeuchCarPartsFactory extends CarPartsFactory {

    @Override
    public Engine CreateEngine() {
        return new DieselEngine();
    }

    @Override
    public Paint CreatePaint() {
        return new WhitePaint();
    }

    @Override
    public Wheels CreateWheels() {
        return new BigWheels();
    }
}
