//import java.util.Scanner;

public class Bingo {
  public static void main(String[] args) {
    System.out.print("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println("０〜９の数字を入力してください");
      //Scanner scan = new Scanner(System.in);
      //int num = scan.nextInt();
      //scan.close();
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います。");
      }
    }
    System.out.println("ゲームを終了します");
  }
}