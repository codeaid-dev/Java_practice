public class Ex49 {
  public static void main(String[] args) {
    Integer[] nums = {56,102,83,7,25,110};
    java.util.Arrays.sort(nums);
    System.out.println(java.util.Arrays.toString(nums));
    java.util.Arrays.sort(nums,java.util.Collections.reverseOrder());
    System.out.println(java.util.Arrays.toString(nums));

  }
}
