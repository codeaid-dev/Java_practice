public class Ex30 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8};
    System.out.println(java.util.Arrays.toString(nums));
    System.out.println(java.util.Arrays.toString(powNums(nums, 2)));
  }
  public static int[] powNums(int[] nums, int power) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      for (int cnt = 0; cnt < power-1; cnt++) {
        num *= nums[i];
      }
      result[i] = num;
    }
    return result;
  }
}
