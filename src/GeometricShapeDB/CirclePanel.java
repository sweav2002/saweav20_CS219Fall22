package GeometricShapeDB;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class CirclePanel extends JPanel {
    ArrayList<Oval> ol;
    Random rng = new Random();

    public CirclePanel(int n) {
        ol = new ArrayList<>();
        setPreferredSize(new Dimension(400, 400));
        for (int i = 0; i < n; i++) {
            ol.add(new Oval(40, 10,
                    new Color(rng.nextInt(256),
                            rng.nextInt(256),
                            rng.nextInt(256))));
        }
        // add a circle to the array. This works because a circle extends oval.
        ol.add(new Circle(20, Color.black));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Oval o : ol) {
            Point p = new Point(rng.nextInt(getWidth()), rng.nextInt(getHeight()));
            o.draw(g, p);
        }
        repaint();
    }

}
