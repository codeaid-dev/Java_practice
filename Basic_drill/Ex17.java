public class Ex17 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("オフセット >>");
    int n = new java.util.Scanner(System.in).nextInt();
//    int n = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println(s);
    System.out.println(s.substring(n));
  }
}
