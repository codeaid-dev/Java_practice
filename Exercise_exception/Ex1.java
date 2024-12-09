public class Ex1 {
  public static void main(String[] args) {
    try {
      int result = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("0で割ることはできません");
    }
  }
}
