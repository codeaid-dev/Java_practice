public class Ex17 {
  public static void main(String[] args) {
    int[] nums = new int[7];
    for (int i=0; i<nums.length; i++) {
      nums[i] = new java.util.Random().nextInt(9)+1;
    }
    System.out.println(java.util.Arrays.toString(nums));
    System.out.print("削除する値: ");
    int del = new java.util.Scanner(System.in).nextInt();
//    int del = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    int count = 0;
    for (int n : nums) {
      if (del == n) {
        count++;
      }
    }
    int[] result = new int[nums.length - count];
    int i = 0;
    for (int n : nums) {
      if (n != del) {
        result[i] = n;
        i++;
      }
    }
    System.out.println(java.util.Arrays.toString(result));
  }
}
