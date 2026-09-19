import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Circle en = new Circle(20);
    System.out.println("円の面積1：" + en.getArea());

    System.out.print("半径 >>");
    double radius = new Scanner(System.in).nextDouble();
    System.out.println("円の面積2：" + radius*radius*Circle.PI);
  }
}
