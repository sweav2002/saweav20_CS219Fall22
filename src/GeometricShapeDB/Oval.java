package GeometricShapeDB;

import java.awt.*;

public class Oval implements Shape {
    protected double width, height;
    protected Color clr;

    public Oval() {
        width = 1;
        height = 2;
        clr = Color.RED;
    }

    public Oval(double width, double height, Color clr) {
        this.width = width;
        this.height = height;
        this.clr = clr;
    }

    public double area() {
        return Math.PI * width / 2 * height / 2;
    }

    public void draw(Graphics g, Point p) {
        g.setColor(clr);
        g.fillOval(p.x, p.y, (int) width, (int) height);
    }

    public String toString() {
        return "Oval:" + width + "," + height;
    }

}
