import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
  public Main() {
    setPreferredSize(new Dimension(500, 500));
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.BLACK);
    PacManWithEye pacman1 = new PacManWithEye(125, 250, 100, 60);
    pacman1.draw(g);
    PacManWithSmile pacman2 = new PacManWithSmile(375, 250, 100, 60);
    pacman2.draw(g);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("パックマンを描画");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Main());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
