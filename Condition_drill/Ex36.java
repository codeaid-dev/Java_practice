public class Ex36 {
  public static void main(String[] args) {
    System.out.print("入力:");
    String src = new java.util.Scanner(System.in).nextLine();
//    String src = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String dst = "";
    for (int i=src.length()-1; i>=0; i--) {
        if (src.charAt(i) == '>') {
            dst += '<';
        } else {
            dst += '>';
        }
    }
    System.out.println(src);
    System.out.println(dst);
  }
}
