import java.util.Random;
import java.util.Scanner;

public class Ex73 {
  public static void main(String[] args) {
    int result = 0;
    for (int i=1; i<=3; i++) {
      System.out.print(i + "回目：");
      new Scanner(System.in).nextLine();
      result += slot();
    }
    System.out.println("合計：" + result);
  }

  public static int slot() {
    String[] rool = {"●","■","▲"};
    int[] count = {0,0,0};
    String[] slot = {"","",""};
    for (int i=0; i<3; i++) {
      int num = new Random().nextInt(3);
      count[num] += 1;
      slot[i] = rool[num];
    }
    System.out.println(String.join(" ", slot));

    int score = 0;
    for (int i=0; i<rool.length; i++) {
      if (i == 0) {
        if (count[i] == 3) { score = 100; }
      } else if (i == 1) {
        if (count[i] == 3) { score = 200; }
      } else {
        if (count[i] == 3) { score = 300; }
      }
    }
    System.out.println(score);
    return score;
  }
}
