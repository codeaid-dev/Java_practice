import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JPanel {
  int mouseX, mouseY;
  public TrafficLight() {
    setPreferredSize(new Dimension(900, 300));
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
      }
    });
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int lightX=0, lightY=0;
    if (mouseX < 300) {
      g.setColor(Color.GREEN);
      lightX = 0;
    } else if (mouseX >= 300 && mouseX < 600) {
      g.setColor(Color.YELLOW);
      lightX = 300;
    } else {
      g.setColor(Color.RED);
      lightX = 600;
    }
    g.fillOval(lightX, lightY, 300, 300);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("信号機");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TrafficLight());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
