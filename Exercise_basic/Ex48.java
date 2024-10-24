public class Ex48 {
  public static void main(String[] args) {
    String[] number = {"one", "two", "three", "four", "five", "six", "seven"};
    String[] res1 = new String[3];
    String[] res2 = new String[3];
    res1[0] = number[0];
    res1[1] = number[1];
    res1[2] = number[2];
    res2[0] = number[2];
    res2[1] = number[3];
    res2[2] = number[4];
    System.out.println(java.util.Arrays.toString(res1));
    System.out.println(java.util.Arrays.toString(res2));
    /*
    System.arraycopy(number, 0, res1, 0, res1.length);
    System.out.println(java.util.Arrays.toString(res1));
    System.arraycopy(number, 2, res2, 0, res2.length);
    System.out.println(java.util.Arrays.toString(res2));
    */
  }
}
