public class Ex25 {
  public static void main(String[] args) {
    System.out.println("結果：" + isAlphabet("I am Yamada."));
    System.out.println("結果：" + isAlphabet("I am 山田."));
  }
  public static boolean isAlphabet(String str) {
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ' || c == '.') {
        continue;
      } else {
        return false;
      }
    }
    return true;
  }
}
