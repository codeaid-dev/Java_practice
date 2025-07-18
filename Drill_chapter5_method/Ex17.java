public class Ex17 {
  public static void main(String[] args) {
    System.out.print("文字列を入力: ");
    String word = new java.util.Scanner(System.in).nextLine();
//    String word = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    int result = numTotalString(word);
    System.out.println("合計："+result);
  }
  public static int numTotalString(String str) {
    char[] letter = str.toCharArray();
    int total = 0;
    for (char c : letter) {
      if (Character.isDigit(c)) {
        total += Character.getNumericValue(c);
      }
    }
    return total;
  }
}
