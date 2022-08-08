public class Ex48 {
  public static void main(String[] args) {
    String[] number = {"one", "two", "three", "four", "five", "six", "seven"};
    String[] res1 = new String[3];
    String[] res2 = new String[3];
    System.arraycopy(number, 0, res1, 0, res1.length);
    System.out.println(java.util.Arrays.toString(res1));
    System.arraycopy(number, 2, res2, 0, res2.length);
    System.out.println(java.util.Arrays.toString(res2));
  }
}
