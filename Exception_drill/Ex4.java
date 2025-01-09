public class Ex4 {
  public static void main(String[] args) {
    try {
      int num = divide(10,0);
      System.out.println(num);
    } catch(ArithmeticException e) {
      System.out.println("割り算処理で例外が発生しました");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
