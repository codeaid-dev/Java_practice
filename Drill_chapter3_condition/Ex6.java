import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    System.out.print("所持金 >>");
    int m = new Scanner(System.in).nextInt();
//    int m = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("借りられる金額 >>");
    int f = new Scanner(System.in).nextInt();
//    int f = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("本の値段 >>");
    int b = new Scanner(System.in).nextInt();
//    int b = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    if (m + f < b) {
      System.out.println("購入できません");
    } else if (m >= b) {
      System.out.println("0円です");
    } else {
      System.out.println((b-m) + "円です");
    }
  }
}
