import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    System.out.print("年齢は？ >>");
    int age = new Scanner(System.in).nextInt();
    if (age < 18) {
      System.out.println("未成年");
    } else {
      if (age >= 65 && age < 75) {
        System.out.println("前期高齢者");
      } else if (age >= 70) {
        System.out.println("後期高齢者");
      } else {
        System.out.println("成人");
      }
    }
  }
}
