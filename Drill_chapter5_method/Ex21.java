import java.util.Arrays;

public class Ex21 {
  public static void main(String[] args) {
    int[] nums = {8, 12, 5, 27, 3, 15, 33, 45};
    reverse(nums);
    System.out.println("結果：" + Arrays.toString(nums));
  }
  public static void reverse(int[] arr) {
    int i = 0;
    for (int j = arr.length-1; j >= arr.length/2; j--) {
      int n = arr[i];
      arr[i] = arr[j];
      arr[j] = n;
      i++;
    }
  }
}
