public class Ex5 {
  public static void main(String[] args) {
    System.out.print("入力1 >>");
    String s1 = new java.util.Scanner(System.in).nextLine();
//    String s1 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("入力2 >>");
    String s2 = new java.util.Scanner(System.in).nextLine();
//    String s2 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (s1.equalsIgnoreCase(s2)) {
      System.out.println("同じです");
    } else {
      System.out.println("違います");
    }

    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    if (s1.equals(s2)) {
      System.out.println("同じです");
    } else {
      System.out.println("違います");
    }
  }
}
