import java.util.Scanner;

class Circle {
  public static final double PI = 3.14159;
}

public class Ex9 {
  public static void main(String[] args) {
    System.out.print("半径 >>");
    double radius = new Scanner(System.in).nextDouble();
    System.out.println("円の面積：" + radius*radius*Circle.PI);
  }
}
