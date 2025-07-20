import javax.swing.*;
import java.awt.*;

public class Checkered extends JPanel {
  public Checkered() {
    setPreferredSize(new Dimension(500, 500));
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        if ((x%2 == 0 && y%2 == 0) || (x%2 == 1 && y%2 == 1)) {
          g.setColor(Color.WHITE);
        } else {
          g.setColor(Color.BLACK);
        }
        g.fillRect(x*50, y*50, x*50+50, y*50+50);
      }
    }
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("市松模様");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Checkered());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
