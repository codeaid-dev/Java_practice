import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    System.out.print("メールアドレス>>");
    String str = new Scanner(System.in).nextLine();
    if (str.matches("^[\\w\\-.]+@[A-Za-z0-9.\\-]+\\.[a-zA-Z]{2,}$")) {
        System.out.println("有効です");
    } else {
      System.out.println("無効です");
    }
  }
}
