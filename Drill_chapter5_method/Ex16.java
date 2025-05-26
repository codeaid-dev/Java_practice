public class Ex16 {
  public static void main(String[] args) {
    System.out.print("文字列を入力: ");
    String str = new java.util.Scanner(System.in).nextLine();
    if (isParindrome(str)) {
      System.out.println("回文です");
    } else {
      System.out.println("回文ではありません");
    }
  }
  public static boolean isParindrome(String str) {
    int left_pos = 0;
    int right_pos = str.length() - 1;
    char[] words = str.toCharArray();
    while (right_pos >= left_pos) {
      if (words[left_pos] != words[right_pos]) return false;
      left_pos += 1;
      right_pos -= 1;
    }
    return true;
  }
}
