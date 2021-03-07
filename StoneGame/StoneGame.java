import java.util.Scanner;

public class StoneGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int max = 0;
    // 最初に取っていく石の数を入力する
    while (max < 10) {
      System.out.println("石の数を入力してください（10個以上)：");
      String str = scan.nextLine();
      str = str.trim();
      max = Integer.parseInt(str);
    }

    // 残りの数が1以下になるまで交互に石を取っていく
    // 取る数は1~3なのでそれ以外の数値のときは繰り返し聞く
    int turn = 1;
    while (true) {
      System.out.println("石の数："+Integer.toString(max));
      if (max <= 1) break;

      if (turn == 1) {
        System.out.println("プレイヤー1の番です");
        int p1 = 0;
        while (p1 < 1 || p1 > 3) {
          System.out.println("いくつ取りますか？（1〜3個）");
          String str = scan.nextLine();
          str = str.trim();
          p1 = Integer.parseInt(str);
        }
        turn = 2;
        max -= p1;
      } else {
        System.out.println("プレイヤー2の番です");
        int p2 = 0;
        while (p2 < 1 || p2 > 3) {
          System.out.println("いくつ取りますか？（1〜3個）");
          String str = scan.nextLine();
          str = str.trim();
          p2 = Integer.parseInt(str);
        }
        turn = 1;
        max -= p2;
      }
    }

    // 結果を判定する
    if (max == 1 && turn == 1) {
      System.out.println("プレイヤー2の勝ちです");
    } else if (max == 1 && turn == 2) {
      System.out.println("プレイヤー1の勝ちです");
    } else if (max < 1 && turn == 1) {
      System.out.println("プレイヤー2の反則負けです");
    } else if (max < 1 && turn == 2) {
      System.out.println("プレイヤー1の反則負けです");
    }
    scan.close();
  }
}
