package prog2.finalgroup;

import javax.swing.*;
import java.awt.*;

public class Hexagon {
    public Hexagon(){
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hexagon GUI");
        frame.setResizable(false);
        frame.setVisible(true);

        DrawPolygon dp = new DrawPolygon();
        frame.add(dp);
    }

    public static void main(String[] args){
        new Hexagon();
    }
}
