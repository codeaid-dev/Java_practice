public class Ex3 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    try {
      int result = 10 / 2;
      int num = numbers[5];
    } catch (ArithmeticException e) {
      System.out.println("0で割ることはできません");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("配列の範囲外です");
    }
  }
}
