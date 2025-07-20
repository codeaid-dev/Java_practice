import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import javax.swing.Timer;

public class BallAnimation {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ball Animation");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    BallPanel panel = new BallPanel();
    frame.add(panel);
    frame.setVisible(true);
    panel.createBalls();

    // 30msごとに再描画してアニメーション
    new Timer(30, e -> {
      panel.moveBalls();
      panel.repaint();
    }).start();
  }
}

// 🟠 Ballクラス：1つのボールの情報と動き方を定義
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

    // 壁に当たったら反射
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

// 🎨 BallPanelクラス：複数のBallを管理して描画
class BallPanel extends JPanel {
  private final List<Ball> balls = new ArrayList<>();
  private final int BALLNUM = 30;

  public BallPanel() {
    setBackground(Color.WHITE);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Ball ball : balls) {
      ball.draw(g);
    }
  }

  public void createBalls() {
    int width = getWidth();
    int height = getHeight();
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
}
