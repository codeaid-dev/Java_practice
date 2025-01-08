public class Ex6 {
  public static void main(String[] args) {
    System.out.println("結果：" + sumRange(10));
  }
  public static int sumRange(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += i;
    }
    return result;
  }
}
