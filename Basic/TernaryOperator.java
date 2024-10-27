public class TernaryOperator {
  public static void main(String[] args) {
    int val = 0;
    String str;
    if (val == 0) {
      str = "Morning, ";
    } else {
      str = "Goobye, ";
    }
    System.out.println(str+"everyone.");

    str = val == 0 ? "Morning, " : "Goodbye, ";
    System.out.println(str+"friends.");
  }
}
