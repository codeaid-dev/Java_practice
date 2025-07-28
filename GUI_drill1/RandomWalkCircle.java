import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class RandomWalkCircle extends JPanel {
  private List<Circle> circles = new ArrayList<>();
  private long start, spend;
  private boolean finish = false;
  
  public RandomWalkCircle() {
    start = System.currentTimeMillis();
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
            c.interval = 0;
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
        if (c.interval != 0) c.interval++;
        if (c.interval != 0 && c.interval%60 == 0) {
          int nx = new java.util.Random().nextInt(450);
          int ny = new java.util.Random().nextInt(450);
          c.dx = (nx-c.x)/40;
          c.dy = (ny-c.y)/40;
        }
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int count = 0;
    for (Circle c : circles) {
      g.setColor(c.c);
      g.fillOval(c.x, c.y, 50, 50);
      if (c.interval == 0) count++;
    }
    if (count == circles.size()) {
      if (!finish) {
        spend = (System.currentTimeMillis() - start) / 1000;
        finish = true;
      }
      g.setColor(Color.RED);
      g.setFont(new Font("Sans-Serif", Font.BOLD, 30));
      g.drawString("経過時間："+spend+"秒", 140, 230);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("ランダムに動く複数の円をクリック");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new RandomWalkCircle());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x, y;
  int dx, dy;
  Color c;
  int interval;

  public Circle() {
    this.x = new java.util.Random().nextInt(450);
    this.y = new java.util.Random().nextInt(450);
    this.dx = new java.util.Random().nextInt(5)+1;
    this.dy = new java.util.Random().nextInt(5)+1;
    this.c = Color.BLACK;
    this.interval = new java.util.Random().nextInt(60)+1;
  }
}
