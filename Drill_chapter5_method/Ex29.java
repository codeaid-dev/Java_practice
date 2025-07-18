public class Ex29 {
  public static void main(String[] args) {
    System.out.print("文字列を入力: ");
    String str = new java.util.Scanner(System.in).nextLine();
//    String str = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.println(swapCase(str));
  }
  public static String swapCase(String str) {
    char[] letter = str.toCharArray();
    String result = "";
    for (char moji : letter) {
      if (Character.isUpperCase(moji)) {
        result += Character.toLowerCase(moji);
      } else if (Character.isLowerCase(moji)) {
        result += Character.toUpperCase(moji);
      } else {
        result += moji;
      }
    }
    return result;
  }
}
