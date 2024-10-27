public class LabelSample {
  public static void main(String[] args) {
    outerLoop:
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue outerLoop; // outerLoopに戻って外側のループを次に進める
        }
        System.out.println("i: " + i + ", j: " + j);
        //if (i==2 && j==0) {
        //  break outerLoop; // outerLoopの繰り返しを中断
        //}
      }
    }
  }
}
