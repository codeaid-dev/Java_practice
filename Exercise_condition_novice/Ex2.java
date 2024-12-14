import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    System.out.print("年齢は？ >>");
    int age = new Scanner(System.in).nextInt();
    if (age < 18) {
      System.out.println("未成年");
    } else {
      System.out.println("成人");
    }
  }
}
