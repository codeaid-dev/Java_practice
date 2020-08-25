public class Seiki {
  public static void main(String[] args) {
    System.out.println(isValidPlayerName("ADJKJKJKJKJKJK"));
  }

  public static boolean isValidPlayerName(String name) {
    return name.matches("[A-Z]\\w{7,}");
//    return name.matches("[A-Z][a-zA-Z_0-9]{7,}");
  }
}