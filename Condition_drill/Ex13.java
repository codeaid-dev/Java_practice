public class Ex13 {
  public static void main(String[] args) {
    System.out.print("入力1>>");
    String s1 = new java.util.Scanner(System.in).nextLine();
//    String s1 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("入力2>>");
    String s2 = new java.util.Scanner(System.in).nextLine();
//    String s2 = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); for Windows
    int cnt=0;
    for (int i=0; i<s1.length(); i++) {
      if (s1.charAt(i) == s2.charAt(i)) {
        cnt++;
      }
    }
    System.out.println("同じ文字は："+cnt+"個");
  }
}
