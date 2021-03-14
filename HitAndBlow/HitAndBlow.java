import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HitAndBlow {
  public static void main(String[] args) {
    // ランダムに4桁の数値を作成する
    // 同じ数値が重複しないようにする
    ArrayList<Integer> digits = new ArrayList<Integer>();
    while (digits.size() != 4) {
      int n = (int)(Math.random() * 10);
      if (!digits.contains(n)) {
        digits.add(n);
      }
    }
    System.out.println(digits);
    String target = "";
    for (int n : digits) {
      target += Integer.toString(n);
    }

    Scanner scan = new Scanner(System.in);
    while (true) {
      String num = "";
      ArrayList<Integer> nums = new ArrayList<Integer>();
      int hit = 0;
      int blow = 0;
      // 4桁の入力を求める
      while(num.length() != 4) {
        System.out.println("数字入力（4桁）：");
        String str = scan.nextLine();
        num = str.trim();
      }
      for (int i = 0; i < num.length(); i++) {
        nums.add(num.charAt(i)-'0');
      }

      // 入力した4桁とランダムに選んだ4桁を比較する
      // 同じ数値が重複していないことが前提
      for (int i = 0; i < nums.size(); i++) {
        for (int j = 0; j < digits.size(); j++) {
          if (nums.get(i) == digits.get(j)) {
            if (i == j) {
              hit++;
            } else {
              blow++;
            }
            break;
          }
        }
      }

      if (hit == 4) {
        System.out.println("クリア！！");
        break;
      } else {
        System.out.println(hit+" hit");
        System.out.println(blow+" blow");
      }
    }
    System.out.println("ターゲット："+target);
    scan.close();
  }
}
