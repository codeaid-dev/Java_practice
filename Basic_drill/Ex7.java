public class Ex7 {
  public static void main(String[] args) {
    System.out.print("1.5リットルのペットボトルの本数 >>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("1リットルのペットボトルは"+((int)(num*1.5))+"本です");
  }
}
