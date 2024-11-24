public class MyExceptionSample {
  public static void main(String[] args) {
    try {
      throw new MyException("Test MyException");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class MyException extends Exception {
  public MyException(String msg) {
    super(msg);
  }
}
