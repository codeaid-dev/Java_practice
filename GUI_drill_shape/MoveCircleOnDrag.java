import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class MoveCircleOnDrag extends JPanel {
  private List<Circle> circles = new ArrayList<>();

  public MoveCircleOnDrag() {
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.BLACK);
    Timer timer = new Timer(16, e -> {
      for (Circle en : circles) {
        if (en.move) en.move();
      }
      repaint();
    });
    timer.start();

    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        Circle en = new Circle(e.getX(), e.getY());
        circles.add(en);
        repaint();
      }

      public void mouseReleased(MouseEvent e) {
        for (Circle en : circles) {
          if (!en.move) en.move = true;
        }
        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        for (Circle en : circles) {
          if (!en.move) {
            int x = e.getX();
            int y = e.getY();
            en.radius = Math.sqrt((x-en.x)*(x-en.x) + (y-en.y)*(y-en.y));
          }
        }
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);

    for (Circle en : circles) {
      int diameter = (int)(en.radius * 2);
      int upperLeftX = (int)(en.x - en.radius);
      int upperLeftY = (int)(en.y - en.radius);
      g.fillOval(upperLeftX, upperLeftY, diameter, diameter);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("ドラッグで描いた円が移動する");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveCircleOnDrag());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}

class Circle {
  int x,y;
  int dx,dy;
  boolean move;
  double radius;
  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
    this.move = false;
    this.radius = 0;
  }

  public void move() {
    this.x += this.dx;
    this.y += this.dy;
    if (this.x-this.radius < 0 || this.x+this.radius > 500) {
      this.dx *= -1;
    }
    if (this.y-this.radius < 0 || this.y+this.radius > 500) {
      this.dy *= -1;
    }
  }
}