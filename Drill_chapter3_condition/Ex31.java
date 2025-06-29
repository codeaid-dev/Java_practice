package Exercise_condition_novice;

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
  public static void main(String[] args) {
    int com = new Random().nextInt(20) + 1;
    int count = 0;
    while (true) {
      System.out.print("入力 >>");
      int you = new Scanner(System.in).nextInt();
//      int you = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
      count++;
      if (com > you) {
        System.out.println("足りない");
      } else if (com < you) {
        System.out.println("多い");
      } else {
        System.out.println(count + "回目に当たり");
        break;
      }
      if (count == 4) {
        System.out.println("4回ハズレなので終了:正解は" + com);
        break;
      }
    }
  }
}
