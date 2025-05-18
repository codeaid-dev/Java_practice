import java.util.Scanner;

public class Ex74 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int num = new Scanner(System.in).nextInt();
    String calc = "";
    while (num != 1) {
      int res = 0;
      String str = String.valueOf(num);
      String[] strs = str.split("");
      for (String s : strs) {
        res += (int)Math.pow(Double.parseDouble(s), 2);
      }
      if (calc.indexOf("<"+res+">") != -1) {
        System.out.println("ラッキーナンバーではありません");
        calc += "<"+res+">";
        break;
      }
      num = res;
      calc += "<"+res+">";
    }
    if (num == 1) {
      System.out.println("ラッキーナンバーです");
    }
    System.out.println(calc);
  }
}
