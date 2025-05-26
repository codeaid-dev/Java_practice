public class Ex26 {
  public static void main(String[] args) {
    System.out.println("結果：" + isPrime(17));
    System.out.println("結果：" + isPrime(18));
  }
  public static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}
