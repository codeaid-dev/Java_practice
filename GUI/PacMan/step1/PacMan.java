import java.awt.*;

public class PacMan {
  private int radius;
  private int x;
  private int y;
  private int mouth;

  public PacMan(int x, int y, int radius, int mouth) {
    this.mouth = mouth;
    this.radius = radius;
    this.x = x;
    this.y = y;
  }

  public void draw(Graphics g) {
    g.setColor(Color.YELLOW);
    g.fillArc(x-radius, y-radius,
              radius*2, radius*2,
              mouth/2, 360-mouth);
  }
}
