import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    System.out.print("入力1 >>");
    String str1 = new Scanner(System.in).nextLine();
    System.out.print("入力2 >>");
    String str2 = new Scanner(System.in).nextLine();
    if (str1.contains(str2)) {
      System.out.println("含まれています");
    } else {
      System.out.println("含まれていません");
    }
  }
}
