public class LogicalOperators {
  public static void main(String[] args) {
    int x = 1, y = 2;
    String str = "Foo";
    if (x == 1 && y == 2) {
      System.out.println("左辺右辺ともにtrue");
    }
    if (x == 1 || y == 2) {
      System.out.println("左辺か右辺のどちらかがtrue");
    }
    if (x == 1 ^ y == 2) {
      System.out.println("左辺と右辺の結果が違う場合true");
    }
    if (!str.equals("Bar")) {
      System.out.println("文字列が等しくない場合true");
    }
  }
}
