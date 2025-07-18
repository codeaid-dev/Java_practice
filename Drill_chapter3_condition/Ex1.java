import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    System.out.print("天気を入力 >>");
    int num = new Scanner(System.in).nextInt();
//    int num = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    if (num == 0) {
      System.out.println("晴れです");
    } else if (num == 1) {
      System.out.println("曇りです");
    } else if (num == 2) {
      System.out.println("雨です");
    } else {
      System.out.println("台風です");
    }
  }
}
