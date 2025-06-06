public class Ex29 {
  public static void main(String[] args) {
    char[] data = {'L', 'E', 'V', 'E', 'L'};
    //char[] data = {'し', 'ん', 'ぶ', 'ん', 'し'};
    boolean result = true;
    for (int i = 0; i < data.length / 2; i++) {
      if (data[i] != data[data.length - 1 - i]) {
        result = false;
        break;
      }
    }
    if (result) System.out.println("回文です");
    else System.out.println("回文ではありません");
    //System.out.println(result ? "回文です" : "回文ではありません");
  }
}
