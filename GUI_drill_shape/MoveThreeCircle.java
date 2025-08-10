import javax.swing.*;
import java.awt.*;

public class MoveThreeCircle extends JPanel {
  private Circle c;

  public MoveThreeCircle() {
    setPreferredSize(new Dimension(500, 500));
    c = new Circle();
    Timer timer = new Timer(16, e -> {
      c.move();
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    c.draw(g);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("3つ並んだ円を動かす");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveThreeCircle());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  int dx, dy;

  public Circle() {
    this.x = 250;
    this.y = 250;
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
  }

  public void move() {
    this.x += this.dx;
    this.y += this.dy;
    if (this.x < 75 || this.x > 425) {
      this.dx *= -1;
    }
    if (this.y < 25 || this.y > 475) {
      this.dy *= -1;
    }
  }

  public void draw(Graphics g) {
    g.setColor(Color.BLACK);
    for (int i = 0; i < 3; i++) {
      g.fillOval(this.x-75+i*50,this.y-25,50,50);
    }
  }
}
