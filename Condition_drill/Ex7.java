public class Ex7 {
  public static void main(String[] args) {
    String words = "";
    while (words.length() < 10) {
      System.out.print("半角英数字入力>>");
      words += new java.util.Scanner(System.in).nextLine();
    }
    System.out.println(words.substring(0, 10));
  }
}
