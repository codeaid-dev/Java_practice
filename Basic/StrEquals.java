public class StrEquals {
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println(str.equals("hello")); // false
    System.out.println(str.equalsIgnoreCase("hello")); // true
    String str1 = "Good morning";
    String str2 = "Good ";
    System.out.println(str1 == str2 + "morning"); // false
    System.out.println(str1.equals(str2 + "morning")); // true
  }
}
