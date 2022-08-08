public class Ex46 {
  public static void main(String[] args) {
    String left = "(^^*)";
    String right = "(*^^)";
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    int lc=0, rc=0;
    while (s.length() != 0) {
      String word = s.substring(0, 5);
      if (left.equals(word)) {
        lc++;
      } else if (right.equals(word)) {
        rc++;
      }
      s = s.substring(5);
    }
    System.out.println("左向きは"+lc+"個、右向きは"+rc+"個");
  }
}
