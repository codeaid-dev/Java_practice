import java.util.ArrayList;
import java.util.Scanner;

public class Ex40 {
  public static void main(String[] args) {
    int wc = 0;
    while (true) {
      System.out.print("パスワード桁数：");
      wc = new Scanner(System.in).nextInt();
//      wc = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
      if (wc >= 8 && wc <= 32) {
        break;
      } else {
        System.out.println("8~32までの桁数を入力してください");
      }
    }
    int ascii_s = 33;
    int ascii_e = 126;

    ArrayList<String> password = new ArrayList<String>();
    for (int i = 0; i < wc; i++) {
      int index = new java.util.Random().nextInt(ascii_e-ascii_s)+ascii_s;
      password.add(Character.toString((char)index));
    }

    String result = "";
    for (String pass : password) {
      result += pass;
    }
    System.out.println("password: " + result);
  }
}
