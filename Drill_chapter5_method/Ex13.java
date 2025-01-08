public class Ex13 {
  public static void main(String[] args) {
    System.out.println("結果：" + countChar("hello world", 'l'));
    System.out.println("結果：" + countChar("たけやぶやけた", 'け'));
  }
  public static int countChar(String str, char c) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }
}
