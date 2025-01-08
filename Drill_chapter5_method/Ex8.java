public class Ex8 {
  public static void main(String[] args) {
    System.out.println("結果：" + reverseNumber(12345));
  }
  public static int reverseNumber(int num) {
    int reversed = 0;
    while (num != 0) {
      reversed = reversed * 10 + num % 10;
      num /= 10;
    }
    return reversed;
  }
}
