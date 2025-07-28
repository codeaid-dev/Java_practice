import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class StopCircleByClick extends JPanel {
  private List<Circle> circles = new ArrayList<>();
  
  public StopCircleByClick() {
    setPreferredSize(new Dimension(500, 500));
    for (int i = 0; i < 4; i++) {
      circles.add(new Circle());
    }
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        for (Circle c : circles) {
          int diffX = (c.x+25) - x;
          int diffY = (c.y+25) - y;
          double dist = Math.sqrt(diffX * diffX + diffY * diffY);
          if (dist < 25) {
            c.dx = 0;
            c.dy = 0;
          }
        }
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
    for (Circle c : circles) {
      g.setColor(c.c);
      g.fillOval(c.x, c.y, 50, 50);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("動く円をクリック");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new StopCircleByClick());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  int dx, dy;
  Color c;

  public Circle() {
    this.x = new java.util.Random().nextInt(450);
    this.y = new java.util.Random().nextInt(450);
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
    this.c = Color.BLACK;
  }
}
