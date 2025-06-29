import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    System.out.print("メールアドレス>>");
    String str = new Scanner(System.in).nextLine();
//    String str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
//    if (str.matches("[\\w\\-.]+@([\\w\\-]+\\.)+[a-zA-Z]+")) {
    if (str.matches("^[\\w\\-.]+@[\\w\\-.]+\\.[a-zA-Z]+{2,}$")) {
        System.out.println("有効です");
    } else {
      System.out.println("無効です");
    }
  }
}
