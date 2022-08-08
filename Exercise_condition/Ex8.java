public class Ex8 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String left = "";
    String right = "";
    for (int i=0; i<s.length(); i++) {
      String ch = String.valueOf(s.charAt(i));
      if (ch.equals("A")) {
        left += ch;
      } else if (ch.equals("B")) {
        right += ch;
      }
    }
    System.out.println(left+right);
  }
}
