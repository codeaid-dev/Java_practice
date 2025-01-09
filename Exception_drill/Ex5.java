public class Ex5 {
  public static void main(String[] args) {
    try {
      int num = divide(10,2);
      System.out.println("割り算の結果：" + num);
    } catch(ArithmeticException e) {
      System.out.println("割り算処理で例外が発生しました");
    } finally {
      System.out.println("処理が完了しました");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
