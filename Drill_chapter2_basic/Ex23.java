public class Ex23 {
  public static void main(String[] args) {
    System.out.print("時間(分) >>");
    int m = new java.util.Scanner(System.in).nextInt();
//    int m = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("総フレーム数："+(m*60*60));
  }
}
