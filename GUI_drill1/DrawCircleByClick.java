import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawCircleByClick extends JPanel {
  private List<Circle> circles = new ArrayList<>();
  
  public DrawCircleByClick() {
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
        }
        if (c.y < 0 || c.y > 450) {
          c.dy *= -1;
        }
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    for (Circle c : circles) {
      g.fillOval(c.x, c.y, 50, 50);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("クリックしたところに円を表示し移動する");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawCircleByClick());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  int dx, dy;

  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
  }
}
