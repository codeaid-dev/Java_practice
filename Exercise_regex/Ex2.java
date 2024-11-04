public class Ex2 {
  public static void main(String[] args) {
    String source = "<p>Thank you!</p>";
    System.out.println(source.matches("^<.*>$"));
  }
}
