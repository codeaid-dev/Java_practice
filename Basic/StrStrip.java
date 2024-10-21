public class StrStrip {
  public static void main(String[] args) {
    String str = "    あいうabcde  fghiえお　　   \n";
    System.out.println(str);
    System.out.println(str.strip());
    System.out.println(str.stripLeading());
    System.out.println(str.stripTrailing());
  }
}
