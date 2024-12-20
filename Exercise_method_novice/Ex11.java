public class Ex11 {
  public static void main(String[] args) {
    int[] nums = {2, 3, 6, 8};
    System.out.println("結果：" + calculateAverage(nums));
  }
  public static double calculateAverage(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return (double) sum / array.length;
  }
}
