public class Ex33 {
  public static void main(String[] args) {
    System.out.print("文字列1>>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("文字列2>>");
    String s2 = new java.util.Scanner(System.in).nextLine();
    boolean flag = false;
    for (int i=0; i<s1.length(); i++) {
      char c = s1.charAt(i);
      long s1_cnt = s1.chars().filter(ch -> ch == c).count();
      long s2_cnt = s2.chars().filter(ch -> ch == c).count();
      if (s1_cnt != s2_cnt) {
        flag = true;
      }
    }
    if (flag) {
        System.out.println("No");
    } else {
        System.out.println("Yes");
    }
  }
}
