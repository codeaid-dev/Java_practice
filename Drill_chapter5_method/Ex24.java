public class Ex24 {
  public static void main(String[] args) {
    System.out.println("結果：" + factorial(5));
  }
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
