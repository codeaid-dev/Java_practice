import java.util.ArrayList;
import java.util.Scanner;

public class PasswordEx {
  public static void main(String[] args) {
    System.out.print("パスワード桁数：");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String str = scan.nextLine();
    str = str.trim();
    int wc = Integer.parseInt(str);
    int ascii_s = 33;
    int ascii_e = 126;

    if (wc < 8 || wc > 32) {
      System.out.println("8~32までの桁数を入力してください");
      scan.close();
      return;
    }

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
    scan.close();
  }
}
