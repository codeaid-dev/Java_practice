public class Ex17 {
  public static void main(String[] args) {
    System.out.print("文字列を入力: ");
    String word = new java.util.Scanner(System.in).nextLine();
    System.out.println(reverseString(word));
  }
  public static String reverseString(String str) {
    char[] letter = str.toCharArray();
    String result = "";
    for (int i = letter.length-1; i >= 0; i--) {
      result += letter[i];
    }
    return result;
  }
}
