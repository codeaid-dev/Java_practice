public class StaticMain {
  public static void main(String[] args) {
    System.out.println(StaticTest.hoge);
    StaticTest.foobar();
    new StaticTest();
    new StaticTest();
    StaticTest t = new StaticTest();
    t.showCount();
  }
}
