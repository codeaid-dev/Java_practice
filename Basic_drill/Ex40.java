public class Ex40 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    int len = s.length()/3;
    System.out.println(s.substring(len, len*2));
  }
}
