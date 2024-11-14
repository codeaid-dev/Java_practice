public class StaticTest {
  static String hoge = "静的フィールド";
  private static int testCount = 0;
  public StaticTest() {
    testCount++;
  }
  public void showCount() {
    System.out.println(testCount);
  }
  static void foobar() {
    System.out.println("静的メソッド");
  }
}
