public class Practice8 {
  public static void main(String[] args) {
    System.out.print("行列数 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] rc = s.split(",");
    String res = "";
    for (int i=0; i<Integer.parseInt(rc[0]); i++) {
      for (int j=0; j<Integer.parseInt(rc[1]); j++) {
        res += "●";
      }
      res += "\n";
    }
    System.out.print(res);
  }
}
