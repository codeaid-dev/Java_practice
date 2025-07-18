public class Practice10 {
  public static void main(String[] args) {
    String[] week = {"木","金","土","日","月","火","水"};
    System.out.print("7月何日？");
    int d = new java.util.Scanner(System.in).nextInt();
//    int d = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("7月"+d+"日は"+week[d%7]+"曜日");
  }
}
