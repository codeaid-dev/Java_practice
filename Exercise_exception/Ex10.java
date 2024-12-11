public class Ex10 {
  public static void main(String[] args) {
    try {
      checkAge(17);
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
  public static void checkAge(int age) throws InvalidAgeException {
    if (age > 0 && age < 18) {
      throw new InvalidAgeException("年齢が18未満です");
    } if (age <= 0) {
      throw new IllegalArgumentException("年齢が0です");
    }
    System.out.println("年齢は18以上です");
  }
}

class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}
