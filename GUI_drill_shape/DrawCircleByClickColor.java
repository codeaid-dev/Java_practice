import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawCircleByClickColor extends JPanel {
  private List<Circle> circles = new ArrayList<>();
  
  public DrawCircleByClickColor() {
    setPreferredSize(new Dimension(500, 500));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        int x = e.getX()-25;
        int y = e.getY()-25;
        circles.add(new Circle(x, y));
        repaint();
      }
    });
    Timer timer = new Timer(16, e -> {
      for (Circle c : circles) {
        c.x += c.dx;
        c.y += c.dy;
        if (c.x < 0 || c.x > 450) {
          c.dx *= -1;
          int r = new java.util.Random().nextInt(256);
          int g = new java.util.Random().nextInt(256);
          int b = new java.util.Random().nextInt(256);
          c.c = new Color(r, g, b);
        }
        if (c.y < 0 || c.y > 450) {
          c.dy *= -1;
          int r = new java.util.Random().nextInt(256);
          int g = new java.util.Random().nextInt(256);
          int b = new java.util.Random().nextInt(256);
          c.c = new Color(r, g, b);
        }
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      g.setColor(c.c);
      g.fillOval(c.x, c.y, 50, 50);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("クリックしたところに円を表示し移動する(色変)");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawCircleByClickColor());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  int dx, dy;
  Color c;

  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
    this.c = Color.BLACK;
  }
}
