public class ExceptionMethod {
  public static void main(String[] args) {
    try {
      divide(10, 0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  public static int divide(int a, int b) throws ArithmeticException {
//    if (b==0)
//      throw new IllegalArgumentException("Test Exception");
    return a / b;
  }
}
