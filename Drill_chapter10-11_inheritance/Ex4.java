class Shape {
  double area() {
    return 0;
  }
}

class Circle extends Shape {
  double radius;
  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return (double)Math.round(Math.PI * radius * radius * 100) / 100;
  }
}

class Rect extends Shape {
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

public class Ex4 {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rect = new Rect(4, 6);
    System.out.println("円の面積：" + circle.area());
    System.out.println("四角形の面積：" + rect.area());
  }
}
