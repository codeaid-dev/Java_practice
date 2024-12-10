public class FinallySample {
  public static void main(String[] args) {
    try {
      testException();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Do finally block.");
    }
  }
  public static void testException() {
    throw new IllegalArgumentException("Test Exception");
  }
}
