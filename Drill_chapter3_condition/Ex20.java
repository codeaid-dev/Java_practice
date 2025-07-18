public class Ex20 {
  public static void main(String[] args) {
    System.out.print("行数 >>");
    int row = new java.util.Scanner(System.in).nextInt();
//    int row = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("列数 >>");
    int col = new java.util.Scanner(System.in).nextInt();
//    int col = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    String res = "";
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        res += "●";
      }
      res += "\n";
    }
    System.out.print(res);
  }
}
