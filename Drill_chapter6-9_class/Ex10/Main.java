import java.util.Scanner;

import utilities.NumUtils;

public class Main {
  public static void main(String[] args) {
    NumUtils nu = new NumUtils();
    System.out.print("整数入力 >>");
    int n = new Scanner(System.in).nextInt();
    if (nu.isEven(n)) {
      System.out.println(n + "は偶数です");
    } else {
      System.out.println(n + "は奇数です");
    }
  }
}
