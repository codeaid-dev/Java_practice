public class Practice3 {
  public static void main(String[] args) {
    System.out.print("入力1 >>");
    String s1 = new java.util.Scanner(System.in).nextLine();
//    String s1 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
//    s1 = s1.toUpperCase();
    System.out.print("入力2 >>");
    String s2 = new java.util.Scanner(System.in).nextLine();
//    String s2 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
//    s2 = s2.toUpperCase();
    if (s1.toUpperCase().equals(s2.toUpperCase())) {
//    if (s1.equalsIgnoreCase(s2)) {
      System.out.println("同じです");
    } else {
      System.out.println("違います");
    }
  }
}
