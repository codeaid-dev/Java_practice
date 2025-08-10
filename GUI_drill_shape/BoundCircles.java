import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BoundCircles extends JPanel {
  List<Circle> circles = new ArrayList<>();

  public BoundCircles() {
    setPreferredSize(new Dimension(500, 500));
    for (int i = 0; i < 6; i++) {
      int x = new java.util.Random().nextInt(450);
      circles.add(new Circle(x, 100));
    }
    Timer timer = new Timer(16, e -> {
      for (Circle c : circles) {
        c.y += c.speed;
        c.speed += c.gravity;
        if (c.y+50 > 500) {
          c.speed *= -0.85;
        }
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      g.setColor(new Color(c.r, c.g, c.b));
      g.fillOval(c.x, c.y, 50, 50);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("弾む円(複数)");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new BoundCircles());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  double speed;
  double gravity = 0.05;
  int r,g,b;

  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
    this.speed = new java.util.Random().nextDouble(2);
    this.r = new java.util.Random().nextInt(256);
    this.g = new java.util.Random().nextInt(256);
    this.b = new java.util.Random().nextInt(256);
  }
}