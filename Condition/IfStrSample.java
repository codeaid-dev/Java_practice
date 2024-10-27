public class IfStrSample {
  public static void main(String[] args) {
    String str = "Hello";
    if (str.equals("hello")) {
      System.out.println("equals()で比較し同じ");
    } else if (str.equalsIgnoreCase("hello")) {
      System.out.println("equalsIgnoreCase()で比較し同じ");
    }
    String str1 = "Good morning";
    String str2 = "Good ";
    if (str1 == str2 + "morning") {
      System.out.println("==で比較し同じ");
    } else if (str1.equals(str2 + "morning")) {
      System.out.println("equals()で比較し同じ");
    }
  }
}
