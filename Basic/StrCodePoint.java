public class StrCodePoint {
  public static void main(String[] args) {
    String str = "あいうえ😀";
    System.out.println(str.length()); // 6
    System.out.println(str.codePointCount(0, str.length())); // 5
  }
}
