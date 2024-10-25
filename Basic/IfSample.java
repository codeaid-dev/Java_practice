public class IfSample {
  public static void main(String[] args) {
    int val1 = 5;
    if (val1 == 5) {
      System.out.println("変数val1は5");
    } else {
      System.out.println("変数val1は5ではない");
    }
    int val2 = 8;
    if (val2 == 5) {
      System.out.println("変数val2は5");
    } else if (val2 == 10) {
      System.out.println("変数val2は10");
    } else {
      System.out.println("変数val2は5でも10でもない");
    }
  }
}
