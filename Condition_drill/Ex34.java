public class Ex34 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    long total = 0;
    for (int i=1; i<10; i++) {
      char c = (char)('0'+i);
      total += i * s.chars().filter(ch -> ch == c).count();
    }
    System.out.println(total);
  }
}
