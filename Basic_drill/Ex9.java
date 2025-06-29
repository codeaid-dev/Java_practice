public class Ex9 {
  public static void main(String[] args) {
    System.out.print("底辺 >>");
    int bottom = new java.util.Scanner(System.in).nextInt();
//    int bottom = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("高さ >>");
    int height = new java.util.Scanner(System.in).nextInt();
//    int height = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("底辺"+bottom+"cmで高さ"+height+"cmの三角形の面積は"+bottom*height/2+"平方cmです");
  }
}
