package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener{
    int x = 50;
    int y = 210;
    int s = 0;
    int size = 50;
    public RollingBall(){
    Timer t = new Timer(30,this);
    t.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
        g.fillArc(x, y, size, size, s, 180);
    }
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        s += 10;
        if(x <= - size ) x = getWidth();
        if(s >= 360) s = 0;
        repaint();
    }
}
