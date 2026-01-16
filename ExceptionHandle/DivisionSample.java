public class DivisionSample {
  public static void main(String[] args) {
    try {
        int result = 10 / 0;
        // double result = 10 / 0.0;
        // System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }
  }
}
