import java.awt.Color;
import java.awt.Graphics;

public class PacManOrg {
  int size;
  int xCenter;
  int yCenter;
  int angle;

  public void make(Graphics g) {
    g.setColor(Color.yellow);
    g.fillArc(xCenter - size / 2, yCenter = size /2,
              size, size, angle / 2, 360-angle);
  }
}