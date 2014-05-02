import javax.swing.*;
import java.awt.*;

class Paint extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent (g);
        g.drawRect(5, 5, 200, 100);
        g.drawOval(5, 110, 150, 150);
        g.drawLine(5,265,200,265);
    }
}


class Frame extends JFrame {
    public Frame() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        Paint panel=new Paint();
        add(panel);
    }
    public static final int FRAME_WIDTH = 300;
    public static final int FRAME_HEIGHT = 400;
} 


class Paint extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent (g);
        g.drawRect(5, 5, 200, 100);
        g.drawOval(5, 110, 150, 150);
        g.drawLine(5,265,200,265);
    }
}
