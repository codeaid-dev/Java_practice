public class Ex10 {
  public static void main(String[] args) {
    System.out.print("英語 >>");
    int e = new java.util.Scanner(System.in).nextInt();
//    int e = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("数学 >>");
    int m = new java.util.Scanner(System.in).nextInt();
//    int m = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("英語"+e+"点、数学"+m+"点の平均点は"+(double)(e+m)/2+"点です");
  }
}
