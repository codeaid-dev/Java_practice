public class ExceptionMethod {
  public static void main(String[] args) {
    try {
      testException();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  public static void testException() throws IllegalArgumentException {
    throw new IllegalArgumentException("Test Exception");
  }
}
