public class Ex24 {
  public static void main(String[] args) {
    System.out.print("メール>>");
    String s = new java.util.Scanner(System.in).nextLine();
    int index = s.indexOf("@");
    if (index != -1) {
      String check = s.substring(index);
      if (check.indexOf(".") == -1) {
        System.out.println("無効なメールアドレス");
      } else {
        System.out.println("有効なメールアドレス");
      }
    }
  }
}
