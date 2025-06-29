import java.util.Scanner;

public class NumberOfTypes {
  public static void main(String[] args) {
    System.out.print("入力：");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String str = scan.nextLine();
    str = str.trim();

    int count = 0;
    while (str.length() > 0) {
      String w = str.substring(0, 1);
      count++;
      str = str.replace(w, "");
    }
    System.out.println("種類数：" + count);
    scan.close();
  }
}
