public class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public Point(double x, double y) {
    this.x = (int)x;
    this.y = (int)y;
  }
  public static void main(String[] args) {
    Point p1 = new Point(4, 5);
    Point p2 = new Point(4.6, 5.6);
    System.out.println("座標(x, y): (" + p1.x + ", " + p1.y + ")");
    System.out.println("座標(x, y): (" + p2.x + ", " + p2.y + ")");
  }
}
