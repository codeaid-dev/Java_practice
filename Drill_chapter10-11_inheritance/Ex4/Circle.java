public class Circle extends Shape {
  double radius;
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return (double)Math.round(Math.PI * radius * radius * 100) / 100;
  }
}
