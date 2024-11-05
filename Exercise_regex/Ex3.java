public class Ex3 {
  public static void main(String[] args) {
    String source = """
    <p>Thank you!</p>
    <p>Good bye</p>""";
    String[] lines = source.split("[\r\n]{1,2}");
    System.out.println(java.util.Arrays.toString(lines));
    for (int i=0; i<lines.length; i++) {
//      System.out.println(i+1 + "行目：" + lines[i].matches("^<.*>$"));
      System.out.println(i+1 + "行目：" + lines[i].matches("<.*>"));
    }
  }
}
