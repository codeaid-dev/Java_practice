import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class BallAnimation extends JPanel {
  private final List<Ball> balls = new ArrayList<>();
  private final int BALLNUM = 50;
  private final int WIDTH = 500;
  private final int HEIGHT = 500;

  public BallAnimation() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.WHITE);

    createBalls();

    new Timer(16, e -> {
      moveBalls();
      repaint();
    }).start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Ball ball : balls) {
      ball.draw(g);
    }
  }

  public void createBalls() {
    int width = WIDTH;
    int height = HEIGHT;
    Random rand = new Random();
    for (int i = 0; i < BALLNUM; i++) {
      int size = 20 + rand.nextInt(10);
      int x = rand.nextInt(width-size*2)+size;
      int y = rand.nextInt(height-size*2)+size;
      int dx = rand.nextInt(5) + 1;
      int dy = rand.nextInt(5) + 1;
      Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
      balls.add(new Ball(x, y, dx, dy, size, color));
    }
  }

  public void moveBalls() {
    int width = getWidth();
    int height = getHeight();
    for (Ball ball : balls) {
      ball.move(width, height);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("複数の円がウロウロ動く");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(500, 500);
    frame.getContentPane().add(new BallAnimation());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class Ball {
  int x, y;
  int dx, dy;
  int size;
  Color color;

  public Ball(int x, int y, int dx, int dy, int size, Color color) {
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;
    this.size = size;
    this.color = color;
  }

  public void move(int panelWidth, int panelHeight) {
    x += dx;
    y += dy;

    if (x < 0 || x + size > panelWidth) {
      dx = -dx;
    }
    if (y < 0 || y + size > panelHeight) {
      dy = -dy;
    }
  }

  public void draw(Graphics g) {
    g.setColor(color);
    g.fillOval(x, y, size, size);
  }
}
