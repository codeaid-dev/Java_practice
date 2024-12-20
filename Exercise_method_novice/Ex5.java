public class Ex5 {
  public static void main(String[] args) {
    int[] nums = {2, 4, 6, 8, 10};
    System.out.println("結果：" + sumArray(nums));
  }
  public static int sumArray(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum;
  }
}
