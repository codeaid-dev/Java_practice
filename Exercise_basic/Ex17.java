public class Ex17 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    System.out.print("オフセット >>");
    int n = new java.util.Scanner(System.in).nextInt();
    System.out.println(s);
    System.out.println(s.substring(n));
  }
}
