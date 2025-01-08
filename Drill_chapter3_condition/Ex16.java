package Exercise_condition_novice;

public class Ex16 {
  public static void main(String[] args) {
    System.out.print("行数 >>");
    int row = new java.util.Scanner(System.in).nextInt();
    System.out.print("列数 >>");
    int col = new java.util.Scanner(System.in).nextInt();
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
