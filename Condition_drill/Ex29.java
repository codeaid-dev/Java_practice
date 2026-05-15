public class Ex29 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] words = s.split(",");
    String shortest = words[0];
    String longest = words[0];
    for (String word : words) {
      if (longest.length() <= word.length()) {
        longest = word;
      }
      if (shortest.length() >= word.length()) {
        shortest = word;
      }
    }
    System.out.println("最短："+shortest+"、最長："+longest);
  }
}
