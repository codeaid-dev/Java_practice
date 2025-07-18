public class Practice2 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (s.equals("雨")) {
      System.out.println("傘をさす");
    } else if (s.equals("晴れ")) {
      System.out.println("帽子を被る");
    } else {
      System.out.println("何もしない");
    }
  }
}
