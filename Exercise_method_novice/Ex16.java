import java.util.Arrays;

public class Ex16 {
  public static void main(String[] args) {
//    int[] nums = {1, 2, 3, 4, 5};
    int[] nums = {8, 12, 5, 27, 3, 15, 33, 45};
    int[] copied = reverse(nums);
    System.out.println("元配列：" + Arrays.toString(nums));
    System.out.println("結果：" + Arrays.toString(copied));
  }
  public static int[] reverse(int[] arr) {
    int[] copy = new int[arr.length];
    int i = 0;
    for (int j = arr.length-1; j >= 0; j--) {
      copy[i] = arr[j];
      i++;
    }
    return copy;
  }
}
