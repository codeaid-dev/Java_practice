public class Circle {
  private double radius;
  public static final double PI = 3.14159;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * PI;
  }
}
