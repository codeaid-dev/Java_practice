import java.util.ArrayList;
import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    System.out.print("パスワード桁数：");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String str = scan.nextLine();
    str = str.trim();
    int wc = Integer.parseInt(str);
    String[] ascii = {"a", "b", "c", "d", "E", "F", "G", "H", "0", "1", "2", "3", "4", "!", "@", "#", "$", "%"};

    if (wc < 4 || wc > 16) {
      System.out.println("4~16までの桁数を入力してください");
      scan.close();
      return;
    }

    ArrayList<String> password = new ArrayList<String>();
    for (int i = 0; i < wc; i++) {
      int index = new java.util.Random().nextInt(ascii.length);
      password.add(ascii[index]);
    }

    String result = "";
    for (String pass : password) {
      result += pass;
    }
    System.out.println("password: " + result);
    scan.close();
  }
}
