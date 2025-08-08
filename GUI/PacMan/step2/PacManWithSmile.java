import java.awt.*;

public class PacManWithSmile extends PacMan {
  public PacManWithSmile(int x, int y, int radius, int mouth) {
    super(x, y, radius, mouth);
  }

  @Override
  public void draw(Graphics g) {
    super.draw(g);
    int x = getX();
    int y = getY();
    int radius = getRadius();
    g.setColor(Color.BLACK);
    g.drawArc(x, y - radius/3*2, radius/3, radius/3, 0, 180);
  }
}
