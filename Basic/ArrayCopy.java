public class ArrayCopy {
  public static void main(String[] args) {
    int[] num1 = {1,2,3,4,5};
    int[] num2 = new int[5];
    System.arraycopy(num1, 0, num2, 0, num2.length);
    num2[4] = 8;
    System.out.println(java.util.Arrays.toString(num1));
    System.out.println(java.util.Arrays.toString(num2));
  }
}
