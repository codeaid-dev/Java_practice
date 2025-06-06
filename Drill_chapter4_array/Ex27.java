public class Ex27 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] words = s.split(",");
    String shortest = "";
    String longest = "";
    for (String word : words) {
      if (longest.length() <= word.length()) {
        longest = word;
      }
      if (shortest.length() >= word.length() || shortest.length() == 0) {
        shortest = word;
      }
    }
    System.out.println("最短："+shortest+"、最長："+longest);
  }
}
