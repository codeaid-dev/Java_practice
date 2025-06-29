import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    String input;
    int count = 1;
    do {
      System.out.print(count + "回目：文字を入力(quitで終了)>");
      input = new Scanner(System.in).nextLine();
//      input = new Scanner(System.in, "Shift-JIS").nextLine();
      System.out.println(input);
      count++;
    } while (!input.equalsIgnoreCase("quit"));

    System.out.println("終了しました。");
  }
}
