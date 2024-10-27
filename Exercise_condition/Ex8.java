public class Ex8 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String left = "";
    String right = "";
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      
      if (c == 'A') {
        left += c;
      } else if (c == 'B') {
        right += c;
      }
      /*
      String ch = String.valueOf(c);
      if (ch.equals("A")) {
        left += ch;
      } else if (ch.equals("B")) {
        right += ch;
      }
      */
    }
    System.out.println(left+right);
  }
}
