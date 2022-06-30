public class Practice5 {
  public static void main(String[] args) {
    System.out.print("文字列入力 >>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("数える文字列 >>");
    String s2 = new java.util.Scanner(System.in).nextLine();
    int count = 0;
    int res = s1.indexOf(s2);
    while (res != -1) {
      count += 1;
      s1 = s1.substring(res+s2.length());
      res = s1.indexOf(s2);
    }
    System.out.println(s2+"の文字数は"+count+"です");
  }
}
