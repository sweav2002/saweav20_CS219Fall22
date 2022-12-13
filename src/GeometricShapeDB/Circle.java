package GeometricShapeDB;

import java.awt.*;

public class Circle extends Oval {
    public Circle(double radius, Color clr) {
        super(radius*2, radius*2, clr);
    }
    public String toString() {
        return "Color(" + super.width/2 + clr.toString() + ")";
    }
}
