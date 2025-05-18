import java.util.Arrays;

public class Ex17 {
  public static void main(String[] args) {
    int[] array1 = {3,6,9,12,15,18,21};
    int[] array2 = {4,8,12,16,20,24,28};
    int[] array3 = new int[7];
    for (int i = 0; i < array3.length; i++) {
      if (i % 2 == 1) {
        array3[i] = array1[i];
      } else {
        array3[i] = array2[i];
      }
    }
    System.out.println(Arrays.toString(array3));
  }
}
