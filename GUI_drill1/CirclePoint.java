import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CirclePoint extends JPanel {
  int x = 0, y = 0, size = 100;
  Color color;

  public CirclePoint() {
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.BLACK);
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        if (x > 0 && x < 250 && y > 0 && y < 250) {
          color = Color.RED;
        }
        if (x > 0 && x < 250 && y > 250 && y < 500) {
          color = Color.YELLOW;
        }
        if (x > 250 && x < 500 && y > 0 && y < 250) {
          color = Color.GREEN;
        }
        if (x > 250 && x < 500 && y > 250 && y < 500) {
          color = Color.BLUE;
        }
        x -= 50;
        y -= 50;
        repaint();
      }
    });

    Timer timer = new Timer(16, e -> {
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.drawLine(250, 0, 250, 500);
    g.drawLine(0, 250, 500, 250);
    g.setColor(color);
    g.fillOval(x, y, size, size);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("移動する円の色を変える");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new CirclePoint());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
