public class Ex25 {
  public static void main(String[] args) {
    System.out.print("巣穴の距離 >>");
    int D = new java.util.Scanner(System.in).nextInt();
//    int D = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("大ジャンプの距離 >>");
    int L = new java.util.Scanner(System.in).nextInt();
//    int L = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("必要回数："+((D/L)+(D%L)));
  }
}
