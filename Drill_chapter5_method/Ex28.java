public class Ex28 {
  public static void main(String[] args) {
    System.out.print("英文を入力: ");
    String sentence = new java.util.Scanner(System.in).nextLine();
//    String sentence = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.println(title(sentence));
  }
  public static String title(String str) {
    String[] words = str.split(" ");
    String result = "";
//    StringBuilder result = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty()) {
        result += Character.toUpperCase(word.charAt(0));
        result += word.substring(1).toLowerCase() + " ";
//        result.append(Character.toUpperCase(word.charAt(0)));
//        result.append(word.substring(1).toLowerCase()).append(" ");
      }
    }
    return result.trim();
//    return result.toString().trim();
  }
}
