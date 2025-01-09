public class Ex38 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String[] s = new java.util.Scanner(System.in).nextLine().split(",");
    System.out.println(s[0].substring(0,s[0].length()/2)+s[1]+s[0].substring(s[0].length()/2));
  }
}
