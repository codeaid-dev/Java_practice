import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FallCircles extends JPanel {
  private List<Circle> circles = new ArrayList<>();

  public FallCircles() {
    setPreferredSize(new Dimension(500, 500));
    for (int i = 0; i < 50; i++) {
      circles.add(new Circle());
    }
    Timer timer = new Timer(16, e -> {
      for (Circle c : circles) {
        c.move();
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      c.draw(g);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("円が落ちる");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new FallCircles());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}

class Circle {
  int x, y;
  int dy;
  int size;

  public Circle() {
    this.size = new java.util.Random().nextInt(46)+5;
    this.x = new java.util.Random().nextInt(500-this.size);
    this.y = new java.util.Random().nextInt(500-this.size);
    this.dy = new java.util.Random().nextInt(6)+1;
  }

  public void move() {
    this.y += this.dy;
    if (this.y > 500+this.size) {
      reset();
      this.y = 0 - this.size;
    }
  }

  public void draw(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillOval(this.x,this.y,this.size,this.size);
  }

  public void reset() {
    this.size = new java.util.Random().nextInt(46)+5;
    this.x = new java.util.Random().nextInt(500-this.size);
  }
}
