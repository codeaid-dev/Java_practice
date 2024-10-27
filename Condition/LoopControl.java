public class LoopControl {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break; // iが5になったらループを終了
      }
      System.out.print(i +" ");
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // iが偶数の場合、以下の処理をスキップ
      }
      System.out.print(i + " ");
    }
    System.out.println("");
  }
}
