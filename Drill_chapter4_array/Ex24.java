public class Ex24 {
  public static void main(String[] args) {
    int[] nums = new int[7];
    for (int i=0; i<nums.length; i++) {
      nums[i] = new java.util.Random().nextInt(50)+10;
    }
    System.out.println(java.util.Arrays.toString(nums));
    int min = nums[0];
    int max = nums[0];
    for (int n : nums) {
      if (n < min) min = n;
      if (n > max) max = n;
    }
    System.out.println("最大値: "+max);
    System.out.println("最小値: "+min);
    System.out.println("差: "+(max - min));
  }
}
