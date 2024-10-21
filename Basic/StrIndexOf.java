public class StrIndexOf {
  public static void main(String[] args) {
    String str = "たてかけかけたてをかけた";
    System.out.println(str.indexOf("かけ")); // 2
    System.out.println(str.indexOf("かけ", 4)); // 4
    System.out.println(str.lastIndexOf("かけ")); // 9
    System.out.println(str.lastIndexOf("かけ", 6)); // 4
  }
}
