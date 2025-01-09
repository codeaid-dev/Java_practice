public class Ex7 {
  public static void main(String[] args) {
    try {
      String str = null;
      try {
        str.length();
      } catch (NullPointerException e) {
        System.out.println("nullオブジェクトを参照(内部例外処理)");
      }
      System.out.println("外部例外処理");
      str.length();
    } catch (NullPointerException e) {
      System.out.println("nullオブジェクトを参照(外部例外処理)");
    }
  }
}
