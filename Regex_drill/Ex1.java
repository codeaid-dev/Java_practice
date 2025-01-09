public class Ex1 {
  public static void main(String[] args) {
    String source = "Hello, World!";
    System.out.println(source.matches(".*"));
    System.out.println(source.matches(".+"));
    System.out.println(source.matches(".{0,}"));
  }
}
