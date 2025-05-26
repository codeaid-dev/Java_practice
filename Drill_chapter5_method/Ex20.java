public class Ex20 {
  public static void main(String[] args) {
    System.out.println("結果：" + sumRange(2, 12));
  }
  public static int sumRange(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += i;
    }
    return result;
  }
  public static int sumRange(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      result += i;
    }
    return result;
  }
}
