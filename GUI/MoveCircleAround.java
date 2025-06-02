import javax.swing.*;
import java.awt.*;

public class MoveCircleAround extends JPanel {
  private int x = 0;
  private int y = 0;
  private int dx = 4;
  private int dy = 5;

  public MoveCircleAround() {
    Timer timer = new Timer(30, e -> {
      x += dx;
      y += dy;
      if (x > getWidth()-30 || x < 0)
        dx *= -1;
      if (y > getHeight()-30 || y < 0)
        dy *= -1;
      repaint();
    });
    timer.start();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillOval(x, y, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("円をウロウロ動かす");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.add(new MoveCircleAround());
    frame.setVisible(true);
  }
}
