package prog2.finalgroup;

import javax.swing.JComponent;
import java.awt.*;
public class DrawPolygon extends JComponent {
    public void paintComponent (Graphics g){     // Graphics is an abstract class provided by Java AWT which is used to draw or paint on the components.
        Graphics2D g2d = (Graphics2D) g;    // Graphics2d is fundamental class for rendering 2-dimensional shapes, text and images on the Java(tm) platform.
        Polygon hexa = new Polygon(new int[] {40, 100, 400, 460}, new int[] {140, 330, 330, 140}, 4);
        // sets x and y values of the polygon's points
        g2d.draw(hexa);
        // draws the polygon in the frame
    }
}
