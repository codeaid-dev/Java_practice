import javax.swing.*;
import java.awt.*;

public class CircleBiggerSmaller extends JPanel {
  int x = 0, y = 0, size = 100;
  int ds=2;

  public CircleBiggerSmaller() {
    setPreferredSize(new Dimension(300, 300));
    Timer timer = new Timer(16, e -> {
      if (size > 300 || size < 0) ds *= -1;
      size += ds;
      x = 150-size/2;
      y = 150-size/2;
      repaint();
    });
    timer.start();
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillOval(x, y, size, size);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("円が大きくなったり小さくなったり");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new CircleBiggerSmaller());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
