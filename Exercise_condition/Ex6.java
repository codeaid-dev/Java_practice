public class Ex6 {
  public static void main(String[] args) {
    System.out.print("所持金 >>");
    int m = new java.util.Scanner(System.in).nextInt();
    System.out.print("借りられる金額 >>");
    int f = new java.util.Scanner(System.in).nextInt();
    System.out.print("本の値段 >>");
    int b = new java.util.Scanner(System.in).nextInt();
    if (m+f < b) {
      System.out.println("購入できません");
    } else if (m >= b) {
      System.out.println("0円です");
    } else {
      System.out.println((b-m)+"円です");
    }
  }
}
