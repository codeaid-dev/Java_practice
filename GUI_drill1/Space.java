import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Space extends JPanel {
  private List<Circle> circles = new ArrayList<>();

  public Space() {
    setPreferredSize(new Dimension(600, 400));
    setBackground(Color.BLACK);
    for (int i = 0; i < 100; i++) {
      circles.add(new Circle());
    }

    Timer timer = new Timer(16, e -> {
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      c.x -= c.s;
      if (c.x < -c.s) c.x = 600;
      g.setColor(new Color(255,255,255, (int)(255*((double)c.s/6))));
      g.fillOval(c.x, c.y, c.s, c.s);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("宇宙を表現する");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Space());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x,y,s;
  public Circle() {
    this.x = new java.util.Random().nextInt(600);
    this.y = new java.util.Random().nextInt(400);
    this.s = new java.util.Random().nextInt(6)+1;
  }
}
