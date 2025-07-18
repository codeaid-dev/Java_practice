import java.util.Scanner;

public class StoneGameEx {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    int max = 0;
    // 最初に取っていく石の数を入力する
    while (max < 10) {
      System.out.println("石の数を入力してください（10個以上)：");
      String str = scan.nextLine();
      str = str.trim();
      max = Integer.parseInt(str);
    }

    // 残りの数が1以下になるまで交互に石を取っていく
    // コンピューターが取る数は残りが4以下だと1つ取る
    // 4より大きいと-1した数を4で割った余りを取る
    // 人が取る数は1~3なのでそれ以外の数値のときは繰り返し聞く
    int turn = (max%4 == 1) ? 2 : 1;
    while (true) {
      System.out.println("石の数："+Integer.toString(max));
      if (max <= 1) break;

      if (turn == 1) {
        System.out.println("わたしの番です");
        int p1 = 0;
        if (max <= 4) {
          p1 = max - 1;
        } else {
          p1 = (max - 1) % 4;
          if (p1 == 0) {
            p1 = 1;
          }
        }
        System.out.println("コンピューターは"+Integer.toString(p1)+"個取りました");
        turn = 2;
        max -= p1;
      } else {
        System.out.println("あなたの番です");
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
      System.out.println("あなたの勝ちです");
    } else if (max == 1 && turn == 2) {
      System.out.println("コンピューターの勝ちです");
    } else if (max < 1 && turn == 1) {
      System.out.println("あなたの反則負けです");
    } else if (max < 1 && turn == 2) {
      System.out.println("コンピューターの反則負けです");
    }
    scan.close();
  }
}
