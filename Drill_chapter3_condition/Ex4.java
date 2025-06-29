import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    System.out.print("年齢は？ >>");
    int age = new Scanner(System.in).nextInt();
//    int age = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    if (age < 18) {
      if (age >= 6 && age <= 15) {
        System.out.println("未成年（義務教育の対象）");
      } else {
        System.out.println("未成年");
      }
    } else {
      if (age >= 65 && age < 75) {
        System.out.println("前期高齢者");
      } else if (age >= 75) {
        System.out.println("後期高齢者");
      } else {
        System.out.println("成人");
      }
    }
  }
}
