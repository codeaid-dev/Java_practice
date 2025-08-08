import java.awt.*;

public class PacManWithEye extends PacMan {
  public PacManWithEye(int x, int y, int radius, int mouth) {
    super(x, y, radius, mouth);
  }

  @Override
  public void draw(Graphics g) {
    super.draw(g);
    int x = getX();
    int y = getY();
    int radius = getRadius();
    g.setColor(Color.BLACK);
    g.fillOval(x, y - radius/3*2, radius/3, radius/3);
  }
}
