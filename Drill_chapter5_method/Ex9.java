public class Ex9 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 9, 5};
    System.out.println("結果：" + findMax(nums));
  }
  public static int findMax(int[] array) {
    int max = array[0];
    for (int num : array) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }
}
