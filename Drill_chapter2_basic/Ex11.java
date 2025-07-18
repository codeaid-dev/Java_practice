public class Ex11 {
  public static void main(String[] args) {
    System.out.print("角数 >>");
    int n = new java.util.Scanner(System.in).nextInt();
//    int n = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println(n+"角形の内角の和は"+(n-2)*180+"度です");
  }
}
