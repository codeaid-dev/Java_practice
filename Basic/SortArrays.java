public class SortArrays {
  public static void main(String[] args) {
    int[] nums1 = {3,1,5,2,4};
    double[] nums2 = {58.7,60.3,60.1,59.5,58.3};
    Integer[] nums3 = {3,1,5,2,4};
    Double[] nums4 = {58.7,60.3,60.1,59.5,58.3};
    java.util.Arrays.sort(nums1);
    System.out.println(java.util.Arrays.toString(nums1));
    java.util.Arrays.sort(nums2);
    System.out.println(java.util.Arrays.toString(nums2));
    java.util.Arrays.sort(nums3);
    System.out.println(java.util.Arrays.toString(nums3));
    java.util.Arrays.sort(nums3,java.util.Comparator.reverseOrder());
    System.out.println(java.util.Arrays.toString(nums3));
    java.util.Arrays.sort(nums4,java.util.Comparator.reverseOrder());
    System.out.println(java.util.Arrays.toString(nums4));
  }
}
