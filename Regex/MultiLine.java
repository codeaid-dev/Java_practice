public class MultiLine {
  public static void main(String[] args) {
    String str = "1ABCd\r\n2EFGh\n3IJKl";
    String[] lines = str.split("[\r\n]{1,2}");
    System.out.println(java.util.Arrays.toString(lines));
    for (String line : lines) {
      System.out.println(line.matches("^\\d.*[a-z]$"));
    }
  }
}
