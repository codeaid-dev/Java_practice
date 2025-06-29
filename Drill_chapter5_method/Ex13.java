public class Ex13 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String input = new java.util.Scanner(System.in).nextLine();
//    String input = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (containsDigit(input)) {
      System.out.println("数字が含まれています");
    } else {
      System.out.println("数字が含まれていません");
    }
  }
  public static boolean containsDigit(String str) {
    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) return true;
    }
    return false;
  }
}
