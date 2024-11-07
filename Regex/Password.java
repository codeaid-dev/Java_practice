public class Password {
  public static void main(String[] args) {
    System.out.print("パスワード>>");
    String str = new java.util.Scanner(System.in).nextLine();
    System.out.println(str.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!-/_])[\\w!-/]{8,32}"));
  }
}
