import javax.swing.*;
import java.awt.*;

public class CircleCheckered extends JPanel {
  public CircleCheckered() {
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.GRAY);
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int size = 500/25;
    for (int y = 0; y < 25; y++) {
      for (int x = 0; x < 25; x++) {
        if (y/5%2 == 0) {
          if (x/5%2 == 0) {
            g.setColor(Color.WHITE);
          } else {
            g.setColor(Color.BLACK);
          }
        } else {
          if (x/5%2 == 1) {
            g.setColor(Color.WHITE);
          } else {
            g.setColor(Color.BLACK);
          }
        }
        g.fillOval(x*size, y*size, size, size);
      }
    }
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("円を縦横に並べる");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new CircleCheckered());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
