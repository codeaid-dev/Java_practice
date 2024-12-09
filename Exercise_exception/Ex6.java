public class Ex6 {
  public static void main(String[] args) {
    try {
      throw new MyException("これは自作例外です");
    } catch (MyException e) {
      System.out.println(e.getMessage());
    }
  }
}

class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}
