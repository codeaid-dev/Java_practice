public class Ex2 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    try {
        int num = numbers[5];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("配列の範囲外です");
    }
  }
}
