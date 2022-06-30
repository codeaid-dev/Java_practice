public class Practice1 {
  public static void main(String[] args) {
    System.out.println("数字を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num % 2 == 0) {
      System.out.println("偶数です");
    } else {
      System.out.println("奇数です");
    }
  }
}