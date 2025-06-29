public class Ex17 {
  public static void main(String[] args) {
    System.out.print("文字列を入力: ");
    String word = new java.util.Scanner(System.in).nextLine();
//    String word = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String result = numString(word);
    if (result.length() == 0) {
      System.out.println("数字は含まれていません。");
    } else {
      System.out.println(result);
    }
  }
  public static String numString(String str) {
    char[] letter = str.toCharArray();
    String result = "";
    for (char c : letter) {
      if (Character.isDigit(c)) {
        result += c;
      }
    }
    return result;
  }
}
