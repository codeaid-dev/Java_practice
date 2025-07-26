import javax.swing.*;
import java.awt.*;

public class BoundCircle extends JPanel {
  int x=200, y=100;
  double speed;
  double gravity = 0.05;

  public BoundCircle() {
    setPreferredSize(new Dimension(500, 500));
    Timer timer = new Timer(16, e -> {
      y += speed;
      speed += gravity;
      if (y+100 > 500) {
        speed *= -0.85;
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillOval(x, y, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("弾む円");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new BoundCircle());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
