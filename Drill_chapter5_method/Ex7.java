public class Ex7 {
  public static void main(String[] args) {
    System.out.println("結果：" + multiply(2, 3));
    System.out.println("結果：" + multiply(2, 3, 6));
  }
  public static int multiply(int a, int b) {
    return a * b;
  }
  public static int multiply(int a, int b, int c) {
    return a * b * c;
  }
}
