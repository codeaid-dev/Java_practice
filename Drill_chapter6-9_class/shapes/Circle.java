package shapes;

public class Circle {
  public double area(double radius) {
    double result = Math.PI * radius * radius;
    result = Math.round(result * 100);
    return (double)result/100;
  }
}
