import java.util.Scanner;

public class Practice1 {
  public static void main(String[] args) {
    System.out.println("数字を入力してください");
    Scanner s = new Scanner(System.in);
//    Scanner s = new Scanner(System.in, "Shift-JIS"); //for Windows
    int num = s.nextInt();
    if (num % 2 == 0) {
      System.out.println("偶数です");
    } else {
      System.out.println("奇数です");
    }
  }
}