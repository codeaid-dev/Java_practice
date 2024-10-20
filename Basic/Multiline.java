public class Multiline {
  public static void main(String[] args) {
    System.out.println("Hello\040World!\n\u0020\u0041\u0042\u0043");
    System.out.println("""
        Hello, World!
        I's multiline string.
        """);
  }
}
