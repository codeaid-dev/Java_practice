import java.util.Scanner;

public class Ex40 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int num = new Scanner(System.in).nextInt();
//    int num = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    for (int i = 0; i < num; i++) {
      System.out.print(i % 10);
    }
  }
}
