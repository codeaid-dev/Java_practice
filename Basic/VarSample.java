public class VarSample {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = num1;
    num2 *= 2;
    System.out.println(num1);
    System.out.println(num2);
    String[] strs1 = {"あ","い","う","え","お"};
    String[] strs2 = strs1;
    strs2[0] = "か";
    System.out.println(java.util.Arrays.toString(strs1));
    System.out.println(java.util.Arrays.toString(strs2));
  }
}
