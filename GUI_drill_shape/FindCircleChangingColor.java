import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class FindCircleChangingColor extends JPanel {
  private List<Circle> circles = new ArrayList<>();
  private final int ATARI = new java.util.Random().nextInt(16);
  private boolean finish = false;
  private long start, spend;

  public FindCircleChangingColor() {
    setPreferredSize(new Dimension(600, 600));
    for (int i = 0; i < 16; i++) {
      int x = (i%4) * 150;
      int y = (i/4) * 150;
      if (i == ATARI) {
        circles.add(new Circle(x, y, 150, true));
      } else {
        circles.add(new Circle(x, y, 150, false));
      }
    }
    start = System.currentTimeMillis();
    // System.out.println(ATARI);

    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        for (int i = 0; i < 16; i++) {
          if (i == ATARI) {
            int diffX = ((i%4) * 150 + 75) - mx;
            int diffY = ((i/4) * 150 + 75) - my;
            double dist = Math.sqrt(diffX*diffX + diffY*diffY);
            if (dist < 75 && !finish) {
              spend = (System.currentTimeMillis() - start) / 1000;
              finish = true;
            }
          }
        }
        repaint();
      }
    });

    Timer timer = new Timer(300, e -> {
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Circle c : circles) {
      g.setColor(new Color(c.r, c.g, c.b));
      g.fillOval(c.x, c.y, c.s, c.s);
      if (c.target) {
        c.r += c.dr;
        c.g += c.dg;
        c.b += c.db;
        if (c.r == 255 || c.r == 0) c.dr *= -1;
        if (c.g == 255 || c.g == 0) c.dg *= -1;
        if (c.b == 255 || c.b == 0) c.db *= -1;
      }
    }
    if (finish) {
      g.setColor(Color.BLACK);
      g.setFont(new Font("Sans-Serif", Font.BOLD, 30));
      g.drawString("経過時間："+spend+"秒", 195, 300);
    }
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("色が変化している円を見つけろ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new FindCircleChangingColor());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Circle {
  int x,y,s;
  int r,g,b;
  int dr=1,dg=1,db=1;
  boolean target;
  public Circle(int x, int y, int s, boolean target) {
    this.x = x;
    this.y = y;
    this.s = s;
    this.target = target;
    this.r = new java.util.Random().nextInt(256);
    this.g = new java.util.Random().nextInt(256);
    this.b = new java.util.Random().nextInt(256);
  }
}