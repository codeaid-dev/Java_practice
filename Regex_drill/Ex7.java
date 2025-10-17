import java.util.Scanner;
public class Ex7 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String str = new Scanner(System.in).nextLine();
    if (str.matches("\\S*")) {
      if (str.length() == 0) {
        System.out.println("空です");
      } else {
        System.out.println("そうです");
      }
    } else {
      System.out.println("空白文字が含まれています");
    }
  }
}
