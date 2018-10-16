package Factory.PartsFactory;

import Factory.Parts.AbstractParts.Engine;
import Factory.Parts.AbstractParts.Paint;
import Factory.Parts.AbstractParts.Wheels;

public abstract class CarPartsFactory {
    public abstract Engine CreateEngine();
    public abstract Paint CreatePaint();
    public abstract Wheels CreateWheels();
}
