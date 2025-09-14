import java.util.Scanner;

class Circle {
  private double radius;
  public static final double PI = 3.14159;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * PI;
  }
}

public class Ex9 {
  public static void main(String[] args) {
    Circle en = new Circle(20);
    System.out.println("円の面積1：" + en.getArea());

    System.out.print("半径 >>");
    double radius = new Scanner(System.in).nextDouble();
    System.out.println("円の面積2：" + radius*radius*Circle.PI);
  }
}
