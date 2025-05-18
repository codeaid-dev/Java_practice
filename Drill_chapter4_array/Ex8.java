public class Ex8 {
  public static void main(String[] args) {
    int[] nums = new int[7];
    String result = "奇数: ";
    for (int i = 0; i < nums.length; i++) {
      nums[i] = new java.util.Random().nextInt(9)+1;
      if (nums[i] % 2 != 0) {
        result += nums[i] + " ";
      }
    }
    System.out.println(java.util.Arrays.toString(nums));
    System.out.println(result);
  }
}
