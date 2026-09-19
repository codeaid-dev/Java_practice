public class Rect extends Shape {
  double width, height;
  Rect(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    return (double)Math.round(width * height * 100) / 100;
  }
}
