import java.awt.Graphics;
import javax.swing.JFrame;

public class PainterOrg extends JFrame {

  public PainterOrg() {
    setSize(400, 300);
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void paint(Graphics g) {
    PacManOrg pacman1 = new PacManOrg();
    pacman1.size = 100;
    pacman1.xCenter = 200;
    pacman1.yCenter = 150;
    pacman1.angle = 60;
    pacman1.make(g);
  }

  public static void main(String[] args) {
    new PainterOrg();
  }
}