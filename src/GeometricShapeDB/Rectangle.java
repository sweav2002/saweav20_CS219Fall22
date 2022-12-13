package GeometricShapeDB;

import java.awt.*;

public class Rectangle implements Shape {
    protected double width, height;
    protected Color clr;
    public Rectangle() {
        width = 1;
        height = 2;
        clr = Color.RED;
    }
    public Rectangle(double width, double height, Color clr) {
        this.width = width;
        this.height = height;
        this.clr = clr;
    }
    public double area() {
        return Math.PI * width/2 * height/2;
    }
    public void draw(Graphics g, Point p) {
        g.setColor(clr);
        g.fillRect(p.x, p.y, (int) width, (int) height);
    }
    public String toString() {
        return "Rect:" + width + "," + height;
    }
}
