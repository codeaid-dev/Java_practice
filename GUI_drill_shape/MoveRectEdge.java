import javax.swing.*;
import java.awt.*;

public class MoveRectEdge extends JPanel {
  int x = 0, y = 0;
  int status=0;

  public MoveRectEdge() {
    setPreferredSize(new Dimension(500, 500));
    Timer timer = new Timer(16, e -> {
      if (status == 0) {
        x += 1;
        if (x > 400) {
          status = 1;
          x = 400;
        }
      }
      if (status == 1) {
        y += 1;
        if (y > 400) {
          status = 2;
          y = 400;
        }
      }
      if (status == 2) {
        x -= 1;
        if (x < 0) {
          status = 3;
          x = 0;
        }
      }
      if (status == 3) {
        y -= 1;
        if (y < 0) {
          status = 0;
          y = 0;
        }
      }
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillRect(x, y, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("画面端に沿って四角形が移動");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveRectEdge());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
