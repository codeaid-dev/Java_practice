import java.awt.*;

public class PacMan {
  private int radius;
  private int x;
  private int y;
  private int mouth;
  private int direction=3; // 0:UP, 1:DOWN, 2:LEFT, 3:RIGHT

  public PacMan(int x, int y, int radius, int mouth) {
    this.mouth = mouth;
    this.radius = radius;
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }

  public int getDirection() {
    return direction;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setDirection(int dir) {
    if (dir < 0 || dir > 3) {
      this.direction = 3;
    } else {
      this.direction = dir;
    }
  }

  public void draw(Graphics g) {
    g.setColor(Color.YELLOW);
    switch (direction) {
      case 0 -> {
        g.fillArc(x-radius, y-radius,
                  radius*2, radius*2,
                  90+mouth/2, 360-mouth);
      }
      case 1 -> {
        g.fillArc(x-radius, y-radius,
                  radius*2, radius*2,
                  270+mouth/2, 360-mouth);
      }
      case 2 -> {
        g.fillArc(x-radius, y-radius,
                  radius*2, radius*2,
                  180+mouth/2, 360-mouth);
      }
      case 3 -> {
        g.fillArc(x-radius, y-radius,
                  radius*2, radius*2,
                  mouth/2, 360-mouth);
      }
    }
  }
}
