public class APP1 {
  public static void main(String[] args) {
    int[][] score = {{9,1},{8,2},{10},{5,0},{3,6},{4,2},{7,3},{6,3},{10},{9,1,0}};
    int result=0, next1=0, next2=0, next3=0;
    for (int i=score.length-1; i>=0; i--) {
      int[] frame = score[i];
      int total = 0;
      for (int j=0; j<frame.length; j++) { // 各フレームの合計
        total += frame[j];
      }
      if (frame.length == 1) { // ストライクの時は10と次とその次のスコアを加算する
        result += 10+next1+next2;
        next2=next1;
        next1=10;
      } else if (frame.length == 2 && total == 10) { // スペアの時は10と次のスコアを加算する
        result += 10 + next1;
        next1=frame[0];
        next2=frame[1];
      } else { // 通常時はそのスコアだけを加算する
        result += total;
        if (frame.length == 3) {
          next1=frame[0];
          next2=frame[1];
          next3=frame[2];
        } else {
            next1=frame[0];
            next2=frame[1];
        }
      }
    }
    System.out.println("スコア"+result+"点");
  }
}
