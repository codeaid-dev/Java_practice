import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String str = new Scanner(System.in).nextLine();
    if (str.matches("\\w{8}")) {
      System.out.println("そうです");
    } else {
      System.out.println("違います");
    }
  }
}
