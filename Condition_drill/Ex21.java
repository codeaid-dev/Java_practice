public class Ex21 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i=0; i<nums.length; i++) {
      nums[i] = new java.util.Random().nextInt(10);
    }
    System.out.println(java.util.Arrays.toString(nums));
    int[] counts = new int[10];
    for (int n : nums) {
      counts[n]++;
    }
    System.out.println("重複している値:");
    for (int i=0; i<counts.length; i++) {
      if (counts[i] > 1) {
        System.out.println(i + "は" + counts[i] + "回出現している");
      }
    }
  }
}
