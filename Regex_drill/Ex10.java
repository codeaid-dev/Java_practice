import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String str = new Scanner(System.in).nextLine();
//    String str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (str.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!-/:-@\\[-`{-~])[!-~]{8,32}")) {
      System.out.println("有効です");
    } else {
      System.out.println("無効です");
    }
  }
}
