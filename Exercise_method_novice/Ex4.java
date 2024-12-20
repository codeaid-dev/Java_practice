public class Ex4 {
  public static void main(String[] args) {
    System.out.println(checkEvenOdd(4));
  }
  public static String checkEvenOdd(int num) {
//    return (num % 2 == 0) ? "Even" : "Odd";
    if (num % 2 == 0) {
      return "Even";
    } else {
      return "Odd";
    }
  }
}
