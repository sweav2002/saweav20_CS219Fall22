package GeometricShapeDB;

import java.awt.*;

public interface Shape {

    void draw(Graphics g, Point p);

    double area();

    String toString();
}
