package Lib;
import javax.swing.*;
import java.awt.*;

public class RollingBall extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(50, 210, 50, 50);
    }
}
