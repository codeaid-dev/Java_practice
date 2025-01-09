public class Ex61 {
  public static void main(String[] args) {
    int[][] nums = {{1,2,3,2},{4,5,6,1},{7,8,9,5}};
    int len1 = nums.length;
    int len2 = nums[0].length;
    int[] result = {0,0,0,0};
    for (int i=0; i<len1; i++) {
      for (int j=0; j<len2; j++) {
        result[j] += nums[i][j];
      }
    }
    System.out.println(java.util.Arrays.toString(result));
  }
}
