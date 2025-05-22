import java.util.Random;
import java.util.Scanner;

public class Ex36 {
  public static void main(String[] args) {
    int wc = 0;
    while (true) {
      System.out.print("パスワード桁数：");
      wc = new Scanner(System.in).nextInt();
      if (wc < 4 || wc > 16) {
        System.out.println("4~16までの桁数を入力してください");
        continue;
      } else break;
    }
    String[] ascii = {"a", "b", "c", "d", "E", "F", "G", "H", "0", "1", "2", "3", "4", "!", "@", "#", "$", "%"};
    String result = "";
    for (int i = 0; i < wc; i++) {
      int index = new Random().nextInt(ascii.length);
      result += ascii[index];
    }
    System.out.println("password: " + result);
  }
}
